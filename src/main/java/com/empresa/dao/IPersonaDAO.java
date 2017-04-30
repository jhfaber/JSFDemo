package com.empresa.dao;

import java.util.List;

import com.empresa.model.Persona;

public interface IPersonaDAO {
	public void agregar(Persona Persona) throws Exception;

	public void eliminar(int PersonaId) throws Exception;

	public void actualizar(Persona Persona) throws Exception;

	public List<Persona> listarTodos() throws Exception;

	public Persona listarPorId(int id) throws Exception;
}
