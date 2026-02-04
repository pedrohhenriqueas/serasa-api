package com.ph.serasa_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serasa")
public class SerasaController {
    
    @PostMapping
    public ResponseEntity<Object> printSerasaAlerts(@RequestBody String payload){
        System.out.println("===== ALERTA RECEBIDO =====");
        System.out.println(payload);
        System.out.println("==========================");        
        return ResponseEntity.ok().build();
    }
}
