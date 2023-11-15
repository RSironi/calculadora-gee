package com.aps.calculadoragee.service;

import com.aps.calculadoragee.model.Registro;
import com.aps.calculadoragee.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegistroService {
    @Autowired
    private RegistroRepository registroRepository;

    public Registro saveRegistro(Long quantidade, UUID uuid){
        var registro = new Registro(quantidade, uuid);
        return registroRepository.save(registro);
    }

    public List<Registro> findRegistroByUUID(UUID uuid){
        return registroRepository.findByuuid(uuid);
    }

    public UUID generateUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
}
