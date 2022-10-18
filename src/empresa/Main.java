package empresa;

import empresa.empleados.Definitivo;
import empresa.empleados.Empleado;
import empresa.empleados.Honorarios;
import empresa.empleados.Temporal;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        Empresa empresa = new Empresa();
        empresa.setEmpleadoPorHonorarios(new Honorarios("111","Maria","Perez","18/01/1995",10000,90,5));
        empresa.setEmpleadoTemporal(new Temporal("112","Mariana","Perez","18/01/1995",10000,70,10));
        empresa.setEmpleadoDefinitivo(new Definitivo("113","Matilde","Perez","18/01/1995",10000,90,5));
        empresa.setEmpleadoPorHonorarios(new Honorarios("114","Mario","Perez","18/01/1995",10000,80,5));
        empresa.setEmpleadoTemporal(new Temporal("115","Manuel","Perez","18/01/1995",10000,90,16));
        empresa.setEmpleadoDefinitivo(new Definitivo("115","Matias","Perez","18/01/1995",10000,90,15));

        ArrayList<Empleado> list = new ArrayList<>(){};
        list.add(new Temporal("112","Mariana","Perez","18/01/1995",10000,70,1));
        list.add(new Honorarios("112","Mariana","Perez","18/01/1995",10000,70,1));
        list.add(new Definitivo("112","Mariana","Perez","18/01/1995",10000,70,1));

        empresa.setEmpleados(list);



        for (Definitivo def: empresa.getEmpleadoDefinitivo()) {
            System.out.println( "Nombre de clase: " + def.getClass().getName()+ " : " + def);
            System.out.println( "Salario empleado: " + def.calcularSalario());
//
        }
        for (Temporal tem: empresa.getEmpleadoTemporal()) {
            System.out.println( "Nombre de clase: " + tem.getClass().getName()+ " : " + tem);
            System.out.println( "Salario empleado: " + tem.calcularSalario());
        }
        for (Honorarios hon: empresa.getEmpleadoPorHonorarios()) {
            System.out.println( "Nombre de clase: " + hon.getClass().getName()+ " : " + hon);
            System.out.println( "Salario empleado: " + hon.calcularSalario());
        }
    }
}
