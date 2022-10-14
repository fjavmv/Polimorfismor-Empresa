package empresa.empleados;
public abstract class Empleado {
    private String id;
    private String nombres;
    private String apellidos;
    private String fechaDeContrato;
    protected double sueldoNeto;
    protected double promedioProductividad;
    protected int numeroDeActividades;

    public Empleado(String id, String nombres, String apellidos, String fechaDeContrato, double sueldoNeto, double promedioProductividad, int numeroDeActividades) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeContrato = fechaDeContrato;
        this.sueldoNeto = sueldoNeto;
        this.promedioProductividad = promedioProductividad;
        this.numeroDeActividades = numeroDeActividades;
    }
//
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return  id + " " +nombres + " " + apellidos  + " " + sueldoNeto + " " + fechaDeContrato + " " + sueldoNeto;
    }
}
