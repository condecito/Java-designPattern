package org.desing.pattern.creational.abstractfactory;

public class Main {

    private static String title = "----Abstract Factory  Pattern----";
    private static String description = "Descripcion: Abstract Factory es un patrón de diseño creacional que nos permite producir " +
            "familias de objetos relacionados sin especificar sus clases concretas.";
    private static String aplication = "Utilizacion: Factory Method define un método que debe utilizarse para crear " +
            "objetos, en lugar de una llamada directa al constructor  Las subclases pueden sobrescribir " +
            "este método para cambiar las clases de los objetos que se crearán y se aplican cuando : \n"
            + "Un sistema debe ser independiente de como sus objetos son creados.\n" +
            "Un sistema debe ser ‘configurado’ con una cierta familia de productos.\n" +
            "Se necesita reforzar la noción de dependencia mutua entre ciertos objetos.";
    private static String direfencia = "La diferencia : principal es que Factory Method se encarga de la creación de o" +
            "bjetos únicos; es decir, se crea un objeto de varias posibles clases candidatas. En el caso de " +
            "Abstract Factory, lo que queremos es crear familias de objetos que mantengan una relación entre ellos";

    public static void main(String[] arg) {
        System.out.println(title + "\n" + description + "\n" + direfencia + "\n" + aplication+"\n");
       // System.out.println("Inicializando las fabrica de bus y taxi");
        IMakeVehicle busBuilder = new BusBuilder();
        IMakeVehicle taxiBuilder = new TaxisBuilder();

      //  System.out.println("creando fabrica de fabricas de taxi y bus");
        /*
        Se crea la fabria y esta a su vez nos retorna el vehiculo seleccionado
         */
        IVehicle bus = VehicleBuilderFactory.makeVehicle(busBuilder);
        IVehicle taxi = VehicleBuilderFactory.makeVehicle(taxiBuilder);

        System.out.println("\tAcciones de los Vehiculos");
        System.out.println("\t->Bus");
        bus.vehicleDNI();
        bus.vehicleVIN();
        System.out.println("\t->Taxi");
        taxi.vehicleDNI();
        taxi.vehicleVIN();

    }
}
