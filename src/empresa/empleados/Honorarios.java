package empresa.empleados;

public class Honorarios extends Empleado {

    public Honorarios(String id, String nombres, String apellidos, String fechaDeContrato, double sueldoNeto, double promedioProductividad, int numeroDeActividades) {
        super(id, nombres, apellidos, fechaDeContrato, sueldoNeto, promedioProductividad, numeroDeActividades);
    }

    @Override
    public double calcularSalario() {
        if (promedioProductividad > 80){
            double incentivo = sueldoNeto * 2 / 100;
            return sueldoNeto + (incentivo * numeroDeActividades);
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
