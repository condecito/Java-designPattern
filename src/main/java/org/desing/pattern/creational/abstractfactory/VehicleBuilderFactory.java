package org.desing.pattern.creational.abstractfactory;

import org.jetbrains.annotations.NotNull;

public class VehicleBuilderFactory {

    //clase creadora de FABRICA de fabricas
    public static IVehicle makeVehicle(final @NotNull IMakeVehicle factory) {
        System.out.println("\tinicianlizando la fabrica de fabricas ");
        IVehicle vehicle= factory.makeVehicle();

        return  vehicle;
    }
}
