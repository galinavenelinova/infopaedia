package softuni.infopaedia.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dependencies")
@Getter
@Setter
@NoArgsConstructor
public class Dependency extends BaseEntity {
    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "opposite_dependency_id", referencedColumnName = "id")
    private Dependency opposite_dependency;

    @ManyToMany(mappedBy = "dependencies")
    private List<Category> categories;
}
