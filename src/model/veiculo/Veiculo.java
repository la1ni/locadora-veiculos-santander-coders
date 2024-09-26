package model.veiculo;

import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {

    protected String placa;
    protected String modelo;
    protected String marca;
    protected Boolean disponivel;
    protected int valor;

    public Veiculo(String placa, String modelo, String marca, int valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.disponivel = true;
        this.valor = valor;
    }

    public static Veiculo buscarPorPlaca(String placa) {
        return null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
