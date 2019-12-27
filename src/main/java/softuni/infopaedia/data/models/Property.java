package softuni.infopaedia.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "properties")
@Getter
@Setter
@NoArgsConstructor
public class Property extends BaseEntity {
    @Column
    private String name;

    @Column
    private UnitType unitType;

    @OneToOne
    private Unit defaultUnit;

    @ManyToMany(mappedBy = "properties")
    private List<Category> categories;
}
