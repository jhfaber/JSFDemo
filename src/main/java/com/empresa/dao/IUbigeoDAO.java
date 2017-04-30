package com.empresa.dao;

import java.util.List;

import com.empresa.model.Ubigeo;

public interface IUbigeoDAO {
	List<Ubigeo> listarPaises() throws Exception;
	List<Ubigeo> listarRegiones(int codPais) throws Exception;
	List<Ubigeo> listarProvincias(int codPais, int codRegion) throws Exception;
	
}
