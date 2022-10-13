package empresa;

import empresa.empleados.Definitivo;
import empresa.empleados.Honorarios;
import empresa.empleados.Temporal;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Temporal> empleadoTemporal;
    private ArrayList<Honorarios> empleadoPorHonorarios;
    private ArrayList<Definitivo> empleadoDefinitivo;

    public Empresa(){
        empleadoTemporal = new ArrayList<>();
        empleadoPorHonorarios = new ArrayList<>();
        empleadoDefinitivo = new ArrayList<>();
    }

    public void setEmpleadoTemporal(Temporal temporal) {
        this.empleadoTemporal.add(temporal);
    }

    public void setEmpleadoPorHonorarios(Honorarios honorarios) {
        this.empleadoPorHonorarios.add(honorarios);
    }
    public void setEmpleadoDefinitivo(Definitivo definitivo){
        this.empleadoDefinitivo.add(definitivo);
    }

    public ArrayList<Temporal> getEmpleadoTemporal() {
        return empleadoTemporal;
    }

    public ArrayList<Honorarios> getEmpleadoPorHonorarios() {
        return empleadoPorHonorarios;
    }

    public ArrayList<Definitivo> getEmpleadoDefinitivo() {
        return empleadoDefinitivo;
    }
}
