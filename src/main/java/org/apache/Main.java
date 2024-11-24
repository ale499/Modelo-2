package org.apache;

import lombok.Builder;
import org.apache.entidades.*;
import org.apache.repositorio.InMemoryRepository;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Promocion> repoPromocion = new InMemoryRepository<Promocion>();
        InMemoryRepository<Imagen> repoImagen = new InMemoryRepository<Imagen>();
        InMemoryRepository<Articulo> repoArticulo = new InMemoryRepository<Articulo>();
        InMemoryRepository<UnidadMedida> repoUnidadMedida = new InMemoryRepository<UnidadMedida>();

        UnidadMedida ochoPorciones = UnidadMedida.builder()
                .denominacion("8 porciones")
                .build();
        repoUnidadMedida.save(ochoPorciones);

        UnidadMedida cuatroPorciones = UnidadMedida.builder()
                .denominacion("4 porciones")
                .build();
        repoUnidadMedida.save(cuatroPorciones);

        UnidadMedida unLitro = UnidadMedida.builder()
                .denominacion(" 1 Litro")
                .build();
        repoUnidadMedida.save(unLitro);

        Imagen imagen1 = Imagen.builder()
                .denominacion("url_to_pizza_grande_hawaiana")
                .build();
        repoImagen.save(imagen1);

        Imagen imagen2 = Imagen.builder()
                .denominacion("url_to_pizza_grande_napolitana")
                .build();
        repoImagen.save(imagen2);

        Imagen imagen3 = Imagen.builder()
                .denominacion("url_to_pizza_grande_muzza")
                .build();
        repoImagen.save(imagen3);

        Imagen imagen4 = Imagen.builder()
                .denominacion("url_to_pizza_chica_hawaiana")
                .build();
        repoImagen.save(imagen4);

        Imagen imagen5 = Imagen.builder()
                .denominacion("url_to_pizza_chica_napolitana")
                .build();
        repoImagen.save(imagen5);

        Imagen imagen6 = Imagen.builder()
                .denominacion("url_to_pizza_chica_muzza")
                .build();
        repoImagen.save(imagen6);

        Imagen imagen7 = Imagen.builder()
                .denominacion("url_to_cerveza_andes")
                .build();
        repoImagen.save(imagen7);

        Imagen imagen8 = Imagen.builder()
                .denominacion("url_to_cerveza_quilmes")
                .build();
        repoImagen.save(imagen8);

        Imagen imahappy1 = Imagen.builder()
                .denominacion("url_to_happy_hour_1")
                .build();
        repoImagen.save(imahappy1);

        Imagen imahappy2 = Imagen.builder()
                .denominacion("url_to_happy_hour_2")
                .build();
        repoImagen.save(imahappy2);

        Imagen verano1 = Imagen.builder()
                .denominacion("url_to_verano_1")
                .build();
        repoImagen.save(verano1);

        Imagen verano2 = Imagen.builder()
                .denominacion("url_to_verano_2")
                .build();
        repoImagen.save(verano2);

        Imagen invierno1 = Imagen.builder()
                .denominacion("url_to_invierno_1")
                .build();
        repoImagen.save(invierno1);

        Imagen invierno2 = Imagen.builder()
                .denominacion("url_to_invierno_2")
                .build();
        repoImagen.save(invierno2);

        Imagen cerveza1 = Imagen.builder()
                .denominacion("url_to_cerveza_1")
                .build();
        repoImagen.save(cerveza1);

        Imagen cerveza2 = Imagen.builder()
                .denominacion("url_to_cerveza_2")
                .build();
        repoImagen.save(cerveza2);

        Articulo pizzaGrandeHawaiana = Articulo.builder()
                .denominacion("Pizza Grande Hawaiana")
                .precioCompra(2000D)
                .precioVenta(3500D)
                .stockActual(200)
                .stockMaximo(250)
                .unidadMedidas(ochoPorciones)
                .build();
        repoArticulo.save(pizzaGrandeHawaiana);

        Articulo pizzaChicaHawaiana = Articulo.builder()
                .denominacion("Pizza Chica Hawaiana")
                .precioCompra(1000D)
                .precioVenta(2500D)
                .stockActual(100)
                .stockMaximo(150)
                .unidadMedidas(cuatroPorciones)
                .build();
        repoArticulo.save(pizzaChicaHawaiana);

        Articulo pizzaGrandeNapolitana = Articulo.builder()
                .denominacion("Pizza Grande Napolitana")
                .precioCompra(2000D)
                .precioVenta(3500D)
                .stockActual(200)
                .stockMaximo(250)
                .unidadMedidas(ochoPorciones)
                .build();
        repoArticulo.save(pizzaGrandeNapolitana);

        Articulo pizzaChicaNapolitana = Articulo.builder()
                .denominacion("Pizza Chica Napolitana")
                .precioCompra(1000D)
                .precioVenta(2500D)
                .stockActual(100)
                .stockMaximo(150)
                .unidadMedidas(cuatroPorciones)
                .build();
        repoArticulo.save(pizzaChicaNapolitana);

        Articulo pizzaGrandeMuzza = Articulo.builder()
                .denominacion("Pizza Grande Muzza")
                .precioCompra(2000D)
                .precioVenta(3500D)
                .stockActual(200)
                .stockMaximo(250)
                .unidadMedidas(ochoPorciones)
                .build();
        repoArticulo.save(pizzaGrandeMuzza);

        Articulo pizzaChicaMuzza = Articulo.builder()
                .denominacion("Pizza Chica Muzza")
                .precioCompra(1000D)
                .precioVenta(2500D)
                .stockActual(100)
                .stockMaximo(150)
                .unidadMedidas(cuatroPorciones)
                .build();
        repoArticulo.save(pizzaChicaMuzza);

        Articulo cervezaAndes = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioCompra(1000D)
                .precioVenta(2000D)
                .stockActual(50)
                .stockMaximo(100)
                .unidadMedidas(unLitro)
                .build();
        repoArticulo.save(cervezaAndes);

        Articulo cervezaQuilmes = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioCompra(1000D)
                .precioVenta(2000D)
                .stockActual(50)
                .stockMaximo(100)
                .unidadMedidas(unLitro)
                .build();
        repoArticulo.save(cervezaQuilmes);

        Promocion happyHour = Promocion.builder()
                .denominacion("Happy Hour")
                .fechaDesde(LocalDate.of(2024,9,1))
                .fechaHasta(LocalDate.of(2024,9,30))
                .horaDesde(LocalTime.of(8,10))
                .horaHasta(LocalTime.of(23,59))
                .descripcionDescuento("1 Pizza Grande Hawaiana, 1 Pizza Grande Muzza, 1 Cerveza Quilmes")
                .precioPromocional(7800D)
                .tipoPromocion(TipoPromocion.happyHour)
                .promoImagen(new HashSet<>(Arrays.asList(imahappy1, imahappy2)))
                .promociones(new HashSet<>(Arrays.asList(pizzaGrandeHawaiana, pizzaGrandeMuzza, cervezaQuilmes)))
                .build();
        repoPromocion.save(happyHour);

        Promocion verano = Promocion.builder()
                .denominacion("verano")
                .fechaDesde(LocalDate.of(2024,9,9))
                .fechaHasta(LocalDate.of(2024,9,15))
                .horaDesde(LocalTime.of(8,10))
                .horaHasta(LocalTime.of(23,59))
                .descripcionDescuento("1 Pizza Chica Hawaiana, 1 Pizza Grande Napolitana, 1 Cerveza Quilmes, 1 Cerveza Andes")
                .precioPromocional(8500D)
                .tipoPromocion(TipoPromocion.verano)
                .promoImagen(new HashSet<>(Arrays.asList(verano1, verano2)))
                .promociones(new HashSet<>(Arrays.asList(pizzaChicaHawaiana, pizzaGrandeNapolitana, cervezaQuilmes, cervezaAndes)))
                .build();
        repoPromocion.save(verano);

        Promocion invierno = Promocion.builder()
                .denominacion("invierno")
                .fechaDesde(LocalDate.of(2024,9,20))
                .fechaHasta(LocalDate.of(2024,9,27))
                .horaDesde(LocalTime.of(8,10))
                .horaHasta(LocalTime.of(23,59))
                .descripcionDescuento("1 Pizza Grande Hawaiana, 1 Pizza Chica Muzza, 1 Cerveza Quilmes")
                .precioPromocional(6800D)
                .tipoPromocion(TipoPromocion.invierno)
                .promoImagen(new HashSet<>(Arrays.asList(invierno1, invierno2)))
                .promociones(new HashSet<>(Arrays.asList(pizzaGrandeHawaiana, pizzaChicaMuzza, cervezaQuilmes)))
                .build();
        repoPromocion.save(invierno);

        System.out.println("Promociones: ");
        List<Promocion> todasLasPromociones = repoPromocion.findAll();
        todasLasPromociones.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Articulos: ");
        List<Articulo> todosLosArticulos = repoArticulo.findAll();
        todosLosArticulos.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Promociones, articulos relacionados y precio de venta: ");
        for (Promocion promocion : todasLasPromociones) {
            System.out.println(promocion);
            for (Articulo articulo : promocion.getPromociones()) {
                System.out.println(articulo);
                System.out.println("Precio de venta:" + articulo.getPrecioVenta());
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Dia y horario promoción verano:");
        List<Promocion> promocionConNombre = repoPromocion.genericFindByField("denominacion", "verano");
        for (Promocion promocion : promocionConNombre) {
            System.out.println("Desde el dia " + promocion.getFechaDesde() + " a las " + promocion.getHoraDesde() + "hs");
            System.out.println("Hasta el dia " + promocion.getFechaHasta() + " a las " + promocion.getHoraHasta() + "hs");
        }

        System.out.println(" ");
        System.out.println("Promoción mas economica: ");
        Optional<Promocion> promoEconomica = repoPromocion.findById(1L);
        Double precioPromoEconomica = promoEconomica.get().getPrecioPromocional();
        String nombrePromoEconomica = "";
        for (Promocion promocion : todasLasPromociones) {
            if (promocion.getPrecioPromocional() < precioPromoEconomica) {
                precioPromoEconomica = promocion.getPrecioPromocional();
            }
            nombrePromoEconomica = promocion.getDenominacion();
        }

        System.out.println("Promocion " + nombrePromoEconomica + ", con un precio de venta: " + precioPromoEconomica);
    }
}