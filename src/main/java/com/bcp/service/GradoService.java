package com.bcp.service;

import java.util.List;
import java.util.Optional;

import com.bcp.entity.Grado;

public interface GradoService {

	public abstract List<Grado> listaGrado();
	public abstract Grado insertaActualizaGrado(Grado obj);
	public abstract void eliminaGradoPorId(int id);
	public abstract Optional<Grado> buscaGradoPorId(int id);
	
}
