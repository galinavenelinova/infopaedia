package softuni.infopaedia.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "filters")
@Getter
@Setter
@NoArgsConstructor
public class Filter extends BaseEntity {
    @OneToMany
    private List<Category> categories;

    @OneToMany
    private List<Property> properties;

    @OneToMany
    private List<Dependency> dependencies;
}
