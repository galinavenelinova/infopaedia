package softuni.infopaedia.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "property_values")
@Getter
@Setter
@NoArgsConstructor
public class PropertyValue extends BaseEntity {
    @OneToOne
    private Property property;

    @Column
    private Double value;

    @ManyToOne
    private Item item;
}
