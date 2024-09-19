package com.app.lab4_20197122_gtics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class FloresHasColorId implements java.io.Serializable {
    private static final long serialVersionUID = -696973503554847820L;
    @Column(name = "flores_idflores", nullable = false)
    private Integer floresIdflores;

    @Column(name = "color_idcolor", nullable = false)
    private Integer colorIdcolor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FloresHasColorId entity = (FloresHasColorId) o;
        return Objects.equals(this.colorIdcolor, entity.colorIdcolor) &&
                Objects.equals(this.floresIdflores, entity.floresIdflores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorIdcolor, floresIdflores);
    }

}