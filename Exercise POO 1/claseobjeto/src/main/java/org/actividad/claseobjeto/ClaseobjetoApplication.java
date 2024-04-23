package org.actividad.claseobjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClaseobjetoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClaseobjetoApplication.class, args);
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("La caza","Andrew Fukuda",20.00,50);
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getPrecio());
        libro1.setTitulo("Cambio titulo");
        libro1.setAutor("Teesting");
        System.out.println("######");
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getAutor());


    }




}
