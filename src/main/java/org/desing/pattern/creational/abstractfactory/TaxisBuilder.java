package org.desing.pattern.creational.abstractfactory;
//esta fabrica retorna objetos del tipo Vehiculo {Taxi}
public class TaxisBuilder implements  IMakeVehicle{
    @Override
    public IVehicle makeVehicle() {
        IVehicle taxi=new Taxi();
        System.out.println("\tfabricando vehiculo del tipo Taxi");
        return  taxi;
    }
}
