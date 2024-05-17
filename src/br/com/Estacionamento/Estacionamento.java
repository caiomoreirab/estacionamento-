package br.com.Estacionamento;
import java.util.ArrayList;
import java.util.Scanner;


 class Estacionamento {
  private ArrayList<Veiculo> veiculos;

  public Estacionamento() {
   this.veiculos = new ArrayList<>();
  }

  public ArrayList<Veiculo> getVeiculos() {
   return veiculos;
  }

  public void adicionarVeiculo(Veiculo veiculo) {
   veiculos.add(veiculo);
  }

  public void listarVeiculos() {
   for (Veiculo veiculo : veiculos) {
    System.out.println(veiculo);
   }
  }

  public Veiculo buscarVeiculoPlaca(String placa) {
   for (Veiculo veiculo : veiculos) {
    if (veiculo.getPlaca().equals(placa)) {
     return veiculo;
    } else {
     return null;
    }
   }
  }
 }