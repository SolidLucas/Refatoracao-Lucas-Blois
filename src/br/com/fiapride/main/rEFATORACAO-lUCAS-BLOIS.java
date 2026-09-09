package br.com.fiapride.main;

import br.com.fiapride.model.veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

       
        veiculo v1 = new veiculo("Carlos", "ABC-1234");

      
        v1.setNivelCombustivel(-10);   

        
        v1.abastecer(50);

        
        v1.consumir(100);

        
        v1.consumir(30);

        System.out.println("Dono: " + v1.getDono()
                + " | Placa: " + v1.getPlaca()
                + " | Combustivel: " + v1.getNivelCombustivel() + "L");
    }
}