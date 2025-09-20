# Projeto Produtor e Consumidor - Burguer-Byte

## Integrantes
- Moisés Silva - RA: 01232018 
- Giovanni - RA: *******

---

## Descrição do Projeto
Esta atividade implementa um sistema **Produtor e Consumidor** utilizando **Java Spring** para o produtor e outra stack para o consumidor (ex.: Python, JavaScript).  
A comunicação entre as aplicações é feita via **RabbitMQ**, utilizando qualquer tipo de exchange.

O projeto foi desenvolvido como **Burguer-Byte**.

---

## Como enviar uma mensagem para teste (Produtor)

- **URL do endpoint de publicação:**  
POST http://localhost:8080/messages

- **Método HTTP:** `POST`  
- **Headers:**  
Content-Type: application/json


- **Exemplo de JSON a ser enviado:**  
```json
{
  "cliente": "Moisés",
  "itens": [
    "Hamburguer", "Batata Frita"
  ],
  "quantidadeTotal": 1,
  "total": 30.00
}
