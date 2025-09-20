package com.example.demo.model;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;
public class Pedido {

@NotBlank
private String cliente;

@NotEmpty
    private List<String> itens;

@Min(0)
    private long quantidadeTotal;

@DecimalMin ("0.0")
    private BigDecimal total;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public long getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(long quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
