package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService producer) {
        this.service = producer;
    }

    @PostMapping
    public ResponseEntity<String> criar(@Valid @RequestBody Pedido pedido) {
        service.enviarPedido(pedido);
        return ResponseEntity.status(200).body("Pedido enviado para fila");


    }
}
