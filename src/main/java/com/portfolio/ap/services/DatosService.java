package com.portfolio.ap.services;


import com.portfolio.ap.exception.UserNotFoundException;
import com.portfolio.ap.models.Datos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import com.portfolio.ap.repository.DatosRepo;

@Service
@Transactional
public class DatosService {
    private final DatosRepo datosRepo;


    @Autowired
    public DatosService(DatosRepo datosRepo) {
        this.datosRepo = datosRepo;
    }


    public Datos addUsuarios(Datos usuario){
        return datosRepo.save(usuario);
    }
    public List<Datos> findUsuarios(){
        return datosRepo.findAll();
    }
    public Datos editUsuarios(Datos usuario){
        return datosRepo.save(usuario);
    }
    public void deleteUsuarios(Long id){
        datosRepo.deleteById(id);
    }
    public Datos findUsuariosPorId(Long id){
        return datosRepo.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }

}