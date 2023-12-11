package cervantes.rh.servicio;

import cervantes.rh.modelo.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {


    @Override
    public List<Empleado> listarEmpleados() {
        return null;
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        return null;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return null;
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {

    }

}
