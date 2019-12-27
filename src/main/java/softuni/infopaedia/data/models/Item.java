package softuni.infopaedia.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "items")
@Getter
@Setter
@NoArgsConstructor
public class Item extends BaseEntity {
    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "items_categories",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<PropertyValue> propertyValues;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<DependencyLink> dependencyLinks;
}
