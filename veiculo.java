package br.com.fiapride.model;

/**
 * Representa um veículo da frota do FiapRide.
 * Atributos são privados: só podem ser alterados por métodos que validam os dados.
 */
public class veiculo {

    // Encapsulamento: atributos privados, ninguém mexe direto de fora
    private String dono;
    private String placa;
    private double nivelCombustivel;

    // Construtor: obriga a nascer com dono e placa; tanque começa em zero
    public veiculo(String dono, String placa) {
        this.dono = dono;
        this.placa = placa;
        this.nivelCombustivel = 0.0;
    }

    // Abastecer só aceita valores positivos
    public void abastecer(double litros) {
        if (litros <= 0) {
            System.out.println("Erro: a quantidade abastecida deve ser positiva.");
            return;
        }
        this.nivelCombustivel += litros;
    }

    // Consumir não pode gastar mais do que existe no tanque
    public void consumir(double litros) {
        if (litros <= 0) {
            System.out.println("Erro: a quantidade consumida deve ser positiva.");
            return;
        }
        if (litros > this.nivelCombustivel) {
            System.out.println("Erro: combustivel insuficiente. Disponivel: "
                    + this.nivelCombustivel + "L");
            return;
        }
        this.nivelCombustivel -= litros;
    }

    // --- Getters e Setters (com validação onde faz sentido) ---

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        if (dono == null || dono.isBlank()) {
            System.out.println("Erro: o dono nao pode ser vazio.");
            return;
        }
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            System.out.println("Erro: a placa nao pode ser vazia.");
            return;
        }
        this.placa = placa;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    // Aqui está a "blindagem" contra o -10 da prova
    public void setNivelCombustivel(double nivelCombustivel) {
        if (nivelCombustivel < 0) {
            System.out.println("Erro: o nivel de combustivel nao pode ser negativo.");
            return;
        }
        this.nivelCombustivel = nivelCombustivel;
    }
}