package com.devpredator.projectwebservice.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.devpredator.projectwebservice.entity.Empleado;
import com.devpredator.projectwebservice.service.EmpleadoService;

//web service generado con jersey

@Path("empleadosWS") //url nombre para acceder a ws
public class EmpleadosWS {

	private EmpleadoService empleadoService = new EmpleadoService();
	
	@GET
	@Path("test") // http://localhost:8080/project-webservice/devpredator/empleadosWS/test
	public String test() {
		return "test1 jersey ws rest";
	}
	
	//objeto json
	@GET
	@Path("buscarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado buscarEmpleado() {
		
		return this.empleadoService.consultar();
		
	}
	
	// http://localhost:8080/project-webservice/devpredator/empleadosWS/buscarEmpleado
	// {"id":1,"nombre":"julio","edad":42,"apellidos":"azocar"}
	
	//objeto json
	@GET
	@Path("consultarEmpleados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Empleado> consultarEmpleados() {
		
		return this.empleadoService.consultarEmpleados();
		//return {"id":1,"nombre":"julio","edad":42,"apellidos":"azocar"}
	}
	
	// 20220615193437
	// http://localhost:8080/project-webservice/devpredator/empleadosWS/consultarEmpleados

//	[
//	  {
//	    "id": 1,
//	    "nombre": "julio",
//	    "edad": 42,
//	    "apellidos": "azocar"
//	  },
//	  {
//	    "id": 1,
//	    "nombre": "julio2",
//	    "edad": 42,
//	    "apellidos": "azocar2"
//	  }
//	]
			
	
	//objeto json con parametro
	@GET
	@Path("buscarEmpleadoPorId/{numemp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado buscarEmpleadoPorId(@PathParam ("numemp")String numempleado) {
		
		return this.empleadoService.consultarId(numempleado);
		
	}
	
//	// http://localhost:8080/project-webservice/devpredator/empleadosWS/buscarEmpleadoPorId/1
//
//	{
//	  "id": 1,
//	  "nombre": "julio",
//	  "edad": 42,
//	  "apellidos": "azocar"
//	}
	
	
	//objeto json con parametro response 
	@GET
	@Path("buscarResponse/{numemp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response buscarResponse(@PathParam ("numemp")String numempleado) {
		
		Empleado empleado = this.empleadoService.consultarId(numempleado);
		
		if (empleado == null) {
			return Response.noContent().build();
		}else {
			
			GenericEntity<Empleado> emplGenerico = new GenericEntity<Empleado>(empleado , Empleado.class);
			return Response.ok(emplGenerico).build();
		}
	}
	
	// http://localhost:8080/project-webservice/devpredator/empleadosWS/buscarResponse/1
//	{
//		  "id": 1,
//		  "nombre": "julio",
//		  "apellidos": "azocar",
//		  "edad": 42
//		}
	
//    con postman
//    tipo; get
//    ur: http://localhost:8080/project-webservice/devpredator/empleadosWS/buscarResponse/1
//    body: option raw
//    text: json 
//    send 
    
	//post guardar 
	@POST
	@Path("guardar")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response guardar(Empleado empleado) {
		
		if (empleado == null) {
			return Response.status(400).entity("Sin informacion, no se ingresara").build();
		}else {
			
			GenericEntity<Empleado> emplGenerico = new GenericEntity<Empleado>(empleado , Empleado.class);
			return Response.ok(emplGenerico).build();
		}
	}
	
//    con postman
//    tipo; post
//    ur: http://localhost:8080/project-webservice/devpredator/empleadosWS/guardar
//    body: option raw
//    text: json 
//        //	{
//        //		  "id": 1,
//        //		  "nombre": "julio",
//        //		  "apellidos": "azocar",
//        //		  "edad": 42
//        //		}
//    send 
	
	
	
	
	
	
	
	
}
