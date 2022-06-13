package com.sena.microservicesEdwin.sv.repositorio;

import com.sena.microservicesEdwin.sv.modelos.Mascotas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceMascotas extends CrudRepository<Mascotas, Integer> {

}
