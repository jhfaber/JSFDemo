package com.empresa.dao;

import java.util.ArrayList;
import java.util.List;

import com.empresa.model.Ubigeo;

public class UbigeoDAOImpl implements IUbigeoDAO{
	List<Ubigeo> lista = new ArrayList<>();
	@Override
	public List<Ubigeo> listarPaises() throws Exception {
		List<Ubigeo> lista = new ArrayList<>();
		lista.add(new Ubigeo(1, "Peru"));
		lista.add(new Ubigeo(2, "Colombia"));
		lista.add(new Ubigeo(3, "Ecuador"));
		lista.add(new Ubigeo(4, "Mexico"));
		return lista;
	}

	@Override
	public List<Ubigeo> listarRegiones(int codPais) throws Exception {
		List<Ubigeo> lista = new ArrayList<>();
		switch (codPais){
		case 1:
			lista.add(new Ubigeo(11,"Lima"));
			lista.add(new Ubigeo(12, "La Libertad"));
			lista.add(new Ubigeo(13,"Lambayegue"));
			break;
		case 2:
			lista.add(new Ubigeo(21,"Bogotá"));
			lista.add(new Ubigeo(22,"Cali"));
			lista.add(new Ubigeo(23,"Medellin"));
			break;
		default:
			break;
		}
		
		
		return lista;
	}

	@Override
	public List<Ubigeo> listarProvincias(int codPais, int codRegion) throws Exception {
		List<Ubigeo> lista = new ArrayList<>();
		switch (codPais) {
		case 1:
			switch (codRegion) {
			case 11:
				lista.add(new Ubigeo(111,"Ciudad de Peru"));
				lista.add(new Ubigeo(121, "Capital Peru"));
				lista.add(new Ubigeo(131,"Costa Peru"));
				break;
			
			default:
				break;
			}
			break;
		case 2:
			lista.add(new Ubigeo(212,"Municipio de Colomgia"));
			lista.add(new Ubigeo(213,"Segundo Municipio"));
			lista.add(new Ubigeo(232,"El altar"));
			break;
		default:
			break;
		}
		return lista;
	}
	

}
