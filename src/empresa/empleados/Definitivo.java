package empresa.empleados;

public class Definitivo extends Empleado {

    public Definitivo(String id, String nombres, String apellidos, String fechaDeContrato, double sueldoNeto, double promedioProductividad, int numeroDeActividades) {
        super(id, nombres, apellidos, fechaDeContrato, sueldoNeto, promedioProductividad, numeroDeActividades);
    }
//
    @Override
    public double calcularSalario() {
        if (promedioProductividad > 80){
            return sueldoNeto + (sueldoNeto * 8 / 100);
        }
        else
        {
            return sueldoNeto;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
