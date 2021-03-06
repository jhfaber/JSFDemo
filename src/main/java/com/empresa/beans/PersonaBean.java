package com.empresa.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.empresa.dao.IPersonaDAO;
import com.empresa.dao.PersonaDAOImpl;
import com.empresa.model.Persona;

@ManagedBean(name="personaBean")
@SessionScoped
public class PersonaBean implements Serializable{
	private List<Persona> lista;
	private IPersonaDAO dao;
	private Persona persona;
	
	public PersonaBean(){
		dao= new PersonaDAOImpl();
		persona = new Persona();
		this.listar();
	}
	public void registrar(){
		try{
			if(persona.getId()>0){
				dao.actualizar(persona);
			}else{
				dao.agregar(persona);
			}
			
			this.listar();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void eliminar(Persona per){
		try{
			dao.eliminar(per.getId());
			this.listar();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void listar(){
		try{
			lista=dao.listarTodos();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void listarPorId(Persona per){
		try{
			persona=dao.listarPorId(per.getId());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	//Garbagecollector limpia el objeto anterior, creamos otro
	public void limpiarControles(){
		persona = new Persona();
		System.out.println("Paso por el metodo");
	}
	/**
	 * getter and setter
	 * @return
	 */
	public List<Persona> getLista() {
		return lista;
	}
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
