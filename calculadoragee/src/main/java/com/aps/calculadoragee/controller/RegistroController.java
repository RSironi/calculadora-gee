package com.aps.calculadoragee.controller;

import com.aps.calculadoragee.model.Registro;
import com.aps.calculadoragee.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/api")
@CrossOrigin(origins = "*")
public class RegistroController {
    @Autowired
    private RegistroService registroService;

    @PostMapping
    Registro saveRegistro(@RequestParam Long quantidade,@RequestParam UUID uuid){
        return registroService.saveRegistro(quantidade, uuid);
    }

    @GetMapping
    List<Registro> findByUUID(@RequestParam UUID uuid){
        return registroService.findRegistroByUUID(uuid);
    }

    @GetMapping(path = "getUUID")
    UUID generateUUID(){
        return registroService.generateUUID();
    }
}
