package org.apache.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class Promocion {
    //atributos
    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private HashSet<Imagen> promoImagen  = new HashSet<>();
    private HashSet<Articulo> promociones  = new HashSet<>();

}

