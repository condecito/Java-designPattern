package org.desing.pattern.structural.adapter;

public class Main {
    private static String title = "----Adapter Pattern----";
    private static String description = "Descripcion: Este patron nos permite la colaboración entre objetos con " +
            "interfaces incompatibles. ";
    private static String aplication = "Utilizacion: Utiliza la clase adaptadora cuando quieras usar una clase " +
            "existente, pero cuya interfaz;" +
            " no sea compatible con el resto del código, Codigo Legancy";

    public static void main(String[] arg) {
        System.out.println(title + "\n" + description + "\n" + aplication);

        /*
         creamos objetos  del tipo ILightableObject computer y lampara ambos son compatibles con la interfaz
         ILightableObject
        */
        ILightableObject computer = new ImpLightableObjectComputer();
        ILightableObject lamp = new ImpLightableObjectLamp();
        System.out.println("\tComputer is ON:" + computer.isOn());
        System.out.println("\tLamp is ON:" + lamp.isOn());
        System.out.println("Turn ON ILightableObject ");
        switchILightableObject(computer);
        switchILightableObject(lamp);
        System.out.println("\tComputer is ON now:" + computer.isOn());
        System.out.println("\tLamp is ON now:" + lamp.isOn());

        /*
         * ahora supongamos que necesitamos ejecutar un codigo siguiendo la misma logica
         * aca es donde aplicamos el patron Adapter.
         * esta clase adapter nos permite conectar el objecto no compatible( legancy)
         * */

        ILightableObject adapterObjectWithIlightableObject = new AdapterILightableObjectWithNonCompatibleClass();
        System.out.println("\tAdapterObjectWithIlightableObject is  ON:" + adapterObjectWithIlightableObject.isOn());

        /* el adaptador nos permite seguir usando la misma logica de:
         llamar al metodo switchILightableObject enviandole como parametro objetos del tipo ILightableObject para
         ejecutar metodos propios de la interfaz
         */
        System.out.println("Turn ON AdapterObjectWithIlightableObject ");
        switchILightableObject(adapterObjectWithIlightableObject);
        System.out.println("\tAdapterObjectWithIlightableObject is ON now:" + adapterObjectWithIlightableObject.isOn());



    }

    /*
     * * Este metodo se encarga de encender todos los objetos del tipo ILightableObject (interfaz)
     * */
    public static void switchILightableObject(ILightableObject ilightableObject) {
        ilightableObject.switchOnOff();

    }

}
