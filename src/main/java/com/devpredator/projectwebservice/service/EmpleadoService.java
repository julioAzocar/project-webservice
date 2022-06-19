package com.devpredator.projectwebservice.service;

import java.time.LocalDateTime;
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
		empleado.setFechaCreacion(LocalDateTime.now());
		
		return empleado;
	}
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		empleado.setId(1);
		empleado.setNombre("julio");
		empleado.setApellidos("azocar");
		empleado.setEdad(42);
		empleado.setFechaCreacion(LocalDateTime.now());
		
		Empleado empleado2 = new Empleado();
		empleado2.setId(1);
		empleado2.setNombre("julio2");
		empleado2.setApellidos("azocar2");
		empleado2.setEdad(42);
		empleado2.setFechaCreacion(LocalDateTime.now());
		
		empleados.add(empleado);
		empleados.add(empleado2);
		
		return empleados;
		
	}
	
	
}
