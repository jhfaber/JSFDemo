package com.empresa.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.empresa.dao.IUbigeoDAO;
import com.empresa.dao.UbigeoDAOImpl;
import com.empresa.model.Ubigeo;
/* Notaciones Scope de JSF*/
@ManagedBean
@ViewScoped
public class EjemploBean implements Serializable{
	
	
	private String nombre;
	private List<Ubigeo> lstPaises;
	private List<Ubigeo> lstRegiones;
	private List<Ubigeo> lstProvincias;
	private int codigoPais;
	private int codigoRegion;
	private int codigoProvincia;
	private IUbigeoDAO ubigeoDAO;
	String prueba;
	
	/*Necesito iniciar todas las listas y objetos por que si no
	me saldria un null pointer exception, por eso lo hago en el constructor*/
	public EjemploBean() throws Exception{
		lstPaises = new ArrayList();
		lstRegiones = new ArrayList();
		lstProvincias = new ArrayList();
		ubigeoDAO = new UbigeoDAOImpl(); 
		this.listarPaises();		
		
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void listarPaises() throws Exception{
		lstPaises =ubigeoDAO.listarPaises();
	}
	public void listarRegiones() throws Exception{
		lstRegiones = ubigeoDAO.listarRegiones(this.codigoPais);
		
	}
	public void listarProvincias() throws Exception{
		lstProvincias = ubigeoDAO.listarProvincias(codigoPais, codigoRegion);
		
	}
	
	
	
	public String getPrueba() {
		return prueba;
	}
	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
	/**
	 * getters and setters
	 */
	
	public List<Ubigeo> getLstPaises() {
		return lstPaises;
	}
	public void setLstPaises(List<Ubigeo> lstPaises) {
		this.lstPaises = lstPaises;
	}
	public List<Ubigeo> getLstRegiones() {
		return lstRegiones;
	}
	public void setLstRegiones(List<Ubigeo> lstRegiones) {
		this.lstRegiones = lstRegiones;
	}
	public List<Ubigeo> getLstProvincias() {
		return lstProvincias;
	}
	public void setLstProvincias(List<Ubigeo> lstProvincias) {
		this.lstProvincias = lstProvincias;
	}
	public int getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}
	public int getCodigoRegion() {
		return codigoRegion;
	}
	public void setCodigoRegion(int codigoRegion) {
		this.codigoRegion = codigoRegion;
	}
	public int getCodigoProvincia() {
		return codigoProvincia;
	}
	public void setCodigoProvincia(int codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}
}
