package empresa.empleados;

public class Temporal extends Empleado {

    public Temporal(String id, String nombres, String apellidos, String fechaDeContrato, double sueldoNeto, double promedioProductividad, int numeroDeActividades) {
        super(id, nombres, apellidos, fechaDeContrato, sueldoNeto, promedioProductividad, numeroDeActividades);
    }
//
    @Override
    public double calcularSalario() {
        if(promedioProductividad > 90){
            return sueldoNeto + (sueldoNeto * 10 / 100);
        }
        else {
            return sueldoNeto;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }


}
