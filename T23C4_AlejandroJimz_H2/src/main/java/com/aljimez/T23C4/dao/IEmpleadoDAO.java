package com.aljimez.T23C4.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aljimez.T23C4.dto.Empleado;

/**
 * @author Jose
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar empleados por campo nombre
	public List<Empleado> findByNombre(String nombre);
	
}