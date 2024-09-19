package com.app.lab4_20197122_gtics.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "flores_has_ocasion")
public class FloresHasOcasion {
    @EmbeddedId
    private FloresHasOcasionId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "flores_idflores", nullable = false)
    private Flor floresIdflores;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ocasion_idocasion", nullable = false)
    private Ocasion ocasionIdocasion;

}
