package com.tcc.apitcc.repositorio;


import com.tcc.apitcc.entidades.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercanciaRepositorio extends JpaRepository <Mercancia,Integer> {


}
