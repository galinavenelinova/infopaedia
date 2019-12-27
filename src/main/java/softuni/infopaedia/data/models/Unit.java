package softuni.infopaedia.data.models;

import com.digidemic.unitof.UnitOf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.infopaedia.data.models.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "units")
@Getter
@Setter
@NoArgsConstructor
public class Unit extends BaseEntity {
    @Column
    private String name;

    @Column
    private UnitType unitType;

    @Column
    private Double conversionRate;
}
