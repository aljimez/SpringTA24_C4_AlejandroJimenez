package com.aljimez.T23C4.service;

import java.util.List;
import com.aljimez.T23C4.dto.Empleado;
public class IEmpleadoService {
	//Metodos del CRUD
	public List<Empleado> listarEmpleado(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleados);	//Guarda un empleado CREATE
	
	public Empleado empleadosXID(Long id); //Leer datos de un empleado READ
	
	public List<Empleado> listarEmpleadoNomnbre(String nombre);//Listar Empleados por campo nombre
	
	public Empleado actualizarEmpleado(Empleado empleados); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE
}
