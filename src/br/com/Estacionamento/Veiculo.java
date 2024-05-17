package br.com.Estacionamento;

public class Veiculo {
    private String modelo;
    private String placa;
    private String cor;

    public Veiculo(String modelo, String placa, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + "]";
    }










    public java.lang.String getModelo() {
        return modelo;
    }

    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }

    public java.lang.String getPlaca() {
        return placa;
    }

    public void setPlaca(java.lang.String placa) {
        this.placa = placa;
    }

    public java.lang.String getCor() {
        return cor;
    }

    public void setCor(java.lang.String cor) {
        this.cor = cor;
    }

}


