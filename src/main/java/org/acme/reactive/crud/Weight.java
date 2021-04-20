package org.acme.reactive.crud;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weight {

    public Weight() {
    }

    private BigDecimal weight;
    private WeightUnit unit;

    public BigDecimal getWeight() {
        return weight;
    }

    public WeightUnit getUnit() {
        return unit;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setUnit(WeightUnit unit) {
        this.unit = unit;
    }
}
