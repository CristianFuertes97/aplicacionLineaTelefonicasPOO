package com.uniandes.lineastelefonicas.modelos;

public class LIneaVozIP extends LineaTelefonica {
    private int numeroMinutosLargaDIstancia;
    private int numeroMinutosCelular;
    private int numeroMinutosLocal;
    private double saldoDisponible;

    public LIneaVozIP() {
    }


    public int getNumeroMinutosLocal() {
        return this.numeroMinutosLocal;
    }

    public void setNumeroMinutosLocal(int numeroMinutosLocal) {
        this.numeroMinutosLocal = numeroMinutosLocal;
    }

    public int getNumeroMinutosLargaDIstancia() {
        return this.numeroMinutosLargaDIstancia;
    }

    public void setNumeroMinutosLargaDIstancia(int numeroMinutosLargaDIstancia) {
        this.numeroMinutosLargaDIstancia = numeroMinutosLargaDIstancia;
    }

    public int getNumeroMinutosCelular() {
        return this.numeroMinutosCelular;
    }

    public void setNumeroMinutosCelular(int numeroMinutosCelular) {
        this.numeroMinutosCelular = numeroMinutosCelular;
    }

    public double getSaldoDisponible() {
        return this.saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public double calcularCostoLlamadasLocal(){
        return numeroMinutos * 35;
    }

    public void agregarLlamadaCelular(int minutos){
        super.agregarLlamadaCelular(minutos);
        modificarCostoLlamada(getCostoLlamadas() - minutos *992);

        numeroMinutosCelular += minutos;
    }

    public void agregarLlamadaLocalLineaVozIP(int minutos){
        super.agregarLlamadaLocal(minutos);
        numeroMinutosLocal += minutos;
    }

    public void agregarLlamadaLargaDistancia(int minutos){
        super.agregarLlamadaLargaDistancia(minutos);
        modificarCostoLlamada(getCostoLlamadas() - minutos *300);
        numeroMinutosLargaDIstancia += minutos;
    }

   public void reiniciar(){
    this.numeroLlamadas = 0;
    this.numeroMinutos = 0;
    this.numeroMinutosCelular = 0;
    this.numeroMinutosLargaDIstancia = 0;
    setCostoLlamadas(0);

   }

}
