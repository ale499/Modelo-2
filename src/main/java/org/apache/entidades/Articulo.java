package org.apache.entidades;

import java.util.HashSet;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class Articulo {
    //atributos
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private UnidadMedida unidadMedidas;
}
