package com.app.lab4_20197122_gtics.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "flores_has_color")
public class FloresHasColor {
    @EmbeddedId
    private FloresHasColorId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "flores_idflores", nullable = false)
    private Flor floresIdflores;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "color_idcolor", nullable = false)
    private Color colorIdcolor;

}
