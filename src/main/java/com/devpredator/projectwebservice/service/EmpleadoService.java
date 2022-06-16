package com.devpredator.projectwebservice.service;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectwebservice.entity.Empleado;

public class EmpleadoService {

	
	public Empleado consultarId(String id) {
		
		
		return this.consultar();
	}
	
	
	public Empleado consultar() {
		
		Empleado empleado = new Empleado();
		empleado.setId(1);
		empleado.setNombre("julio");
		empleado.setApellidos("azocar");
		empleado.setEdad(42);
		
		return empleado;
	}
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		empleado.setId(1);
		empleado.setNombre("julio");
		empleado.setApellidos("azocar");
		empleado.setEdad(42);
		
		Empleado empleado2 = new Empleado();
		empleado2.setId(1);
		empleado2.setNombre("julio2");
		empleado2.setApellidos("azocar2");
		empleado2.setEdad(42);
		
		empleados.add(empleado);
		empleados.add(empleado2);
		
		return empleados;
		
	}
	
	
}
