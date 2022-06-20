package org.desing.pattern.creational.factorymethod;

public class Main {


    private static String title = "----Factory Method  Pattern----";
    private static String description = "Descripcion: Factory Method es un patrón de diseño creacional que proporciona una interfaz " +
            "para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que" +
            " se crearán.";
    private static String aplication = "Utilizacion: Factory Method define un método que debe utilizarse para crear " +
            "objetos, en lugar de una llamada directa al constructor  Las subclases pueden sobrescribir " +
            "este método para cambiar las clases de los objetos que se crearán";

    public static void main(String[] arg) {
        System.out.println(title + "\n" + description + "\n" + aplication);
        System.out.println("Creando  Shape a traves de la Factoria");
        IShape ciculo=new ShapeFactory().getShape(ShapeEnum.CIRCLE.toString());//la fabrica nos crea el tipo de fgura que le pidamos
        ciculo.draw();
        ciculo.type();
        IShape cuadrado=new ShapeFactory().getShape(ShapeEnum.SQUARE.toString());
        //la fabrica nos crea el tipo de fgura que le pidamos
        cuadrado.draw();
        cuadrado.type();
    }
}
