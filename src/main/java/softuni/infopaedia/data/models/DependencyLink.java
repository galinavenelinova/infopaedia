package softuni.infopaedia.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dependency_links")
@Getter
@Setter
@NoArgsConstructor
public class DependencyLink extends BaseEntity {
    @OneToOne
    private Dependency dependency;

    @ManyToOne
    private Item item;
}
