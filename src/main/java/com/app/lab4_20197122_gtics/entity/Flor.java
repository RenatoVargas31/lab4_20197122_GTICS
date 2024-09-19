package com.app.lab4_20197122_gtics.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "flores")
public class Flor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idflores", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_idtipo", nullable = false)
    private Tipo tipoIdtipo;

    @ColumnDefault("1")
    @Column(name = "is_enable")
    private Byte isEnable;

    @Column(name = "image_url", length = 45)
    private String imageUrl;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "description", length = 45)
    private String description;

    @ManyToMany
    @JoinTable(name = "flores_has_color",
            joinColumns = @JoinColumn(name = "flores_idflores"),
            inverseJoinColumns = @JoinColumn(name = "color_idcolor"))
    private Set<Color> colors = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "flores_has_ocasion",
            joinColumns = @JoinColumn(name = "flores_idflores"),
            inverseJoinColumns = @JoinColumn(name = "ocasion_idocasion"))
    private Set<Ocasion> ocasions = new LinkedHashSet<>();

}
