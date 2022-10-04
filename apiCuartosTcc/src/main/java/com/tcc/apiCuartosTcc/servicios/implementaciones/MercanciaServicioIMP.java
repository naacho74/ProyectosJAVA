package com.tcc.apiCuartosTcc.servicios.implementaciones;


import com.tcc.apiCuartosTcc.entidades.Mercancia;
import com.tcc.apiCuartosTcc.entidades.Zona;
import com.tcc.apiCuartosTcc.repocitorios.MercanciaRepocitorio;
import com.tcc.apiCuartosTcc.servicios.ServicioGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MercanciaServicioIMP implements ServicioGenerico<Mercancia>  {

    @Autowired
    MercanciaRepocitorio mercanciaRepocitorio;

    @Override
    public List<Mercancia> buscarTodos() throws Exception {
        try{

            List<Mercancia> mercancias=mercanciaRepocitorio.findAll();
            return mercancias;

        } catch (Exception error){

            throw  new Exception(error.getMessage());
        }

    }





    @Override
    public Mercancia buscarPoRId(Integer id) throws Exception {
        try{
            Optional<Mercancia> mercancia=mercanciaRepocitorio.findById(id);
            return  mercancia.get();

        }catch(Exception error){
            throw  new Exception(error.getMessage());
        }



    }

    @Override
    public Mercancia registrar(Mercancia tabla) throws Exception {

        try{
            tabla=mercanciaRepocitorio.save(tabla);

            return  tabla;

        }catch(Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    @Override
    public Mercancia actualizar(Integer id, Mercancia tabla) throws Exception {
        try{
            Optional<Mercancia> mercanciaBuscar=mercanciaRepocitorio.findById(id);
            Mercancia mercancia=mercanciaBuscar.get();

            mercancia=mercanciaRepocitorio.save(tabla);

            return  mercancia;

        }catch(Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    @Override
    public Boolean borrar(Integer id) throws Exception {
        try{

            if(mercanciaRepocitorio.existsById(id)){
                mercanciaRepocitorio.deleteById(id);
                return true;
            } else{

                throw  new Exception();
            }

        }catch(Exception error){
            throw  new Exception(error.getMessage());
        }
    }
}
