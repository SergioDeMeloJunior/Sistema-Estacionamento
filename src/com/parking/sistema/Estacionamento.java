package com.parking.sistema;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Carro> carrosEstacionados;
    private int capacidade;

    public Estacionamento(int capacidade) {
        this.carrosEstacionados = new ArrayList<>();
        this.capacidade = capacidade;
    }

    public boolean estacionarCarro(Carro carro) {
        if (carrosEstacionados.size() < capacidade) {
            carrosEstacionados.add(carro);
            return true;
        } else {
            return false;
        }
    }

    public boolean removerCarro(String placa) {
        for (Carro carro : carrosEstacionados) {
            if (carro.getPlaca().equals(placa)) {
                carrosEstacionados.remove(carro);
                return true;
            }
        }
        return false;
    }

    public void exibirCarrosEstacionados() {
        System.out.println("Carros estacionados:");
        for (Carro carro : carrosEstacionados) {
            System.out.println("Placa: " + carro.getPlaca() + ", Modelo: " + carro.getModelo());
        }
    }
}
