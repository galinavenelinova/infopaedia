package softuni.infopaedia.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity {
    @Column
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Item> items;

    @ManyToMany
    @JoinTable(
            name = "categories_properties",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "property_id"))
    private List<Property> properties;

    @ManyToMany
    @JoinTable(
            name = "categories_dependencies",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "dependency_id"))
    private List<Dependency> dependencies;
}
