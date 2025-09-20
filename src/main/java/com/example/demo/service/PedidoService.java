package com.example.demo.service;

import com.example.demo.model.Pedido;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final RabbitTemplate rabbitTemplate;

    @Value("${app.rabbit.exchange}")
    private String exchangeName;

    @Value("${app.rabbit.routingKey}")
    private String routingKey;

    public PedidoService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarPedido(Pedido pedido) {
        rabbitTemplate.convertAndSend(exchangeName, routingKey, pedido);
    } }