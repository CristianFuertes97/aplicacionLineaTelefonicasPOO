package com.uniandes.lineastelefonicas.modelos;

public class LineaCelular extends LineaTelefonica {
    private int numeroMinutosLocal;
    private int numeroMinutosCelular;
    private double saldoDisponibleLocal;

    // constructor

    public LineaCelular() {
        super();
        saldoDisponibleLocal = 0;
        numeroMinutosCelular = 0;
        saldoDisponibleLocal = 0;
    }

    // getters and setters

    public int getNumeroMinutosLocal() {
        return this.numeroMinutosLocal;
    }

    public int getNumeroMinutosCelular() {
        return this.numeroMinutosCelular;
    }

    public double getSaldoDispponibleLocal() {
        return this.saldoDisponibleLocal;
    }

    // metodos
    public double calcularCostoLlamadaLocal(){
        return numeroMinutosLocal * 20;
    }

    public void agregarLlamadaLocal(int minutos){
        numeroLlamadas++;
        numeroMinutos += minutos;
        double nuevoTotalLlamadas = getCostoLlamadas() + (minutos *20);
        modificarCostoLlamada(nuevoTotalLlamadas);

        numeroMinutosLocal += minutos;
        saldoDisponibleLocal -= minutos * 20;

    }

    public void agregarLlamadaCelular(int minutos){
        super.agregarLlamadaCelular(minutos);
        modificarCostoLlamada(getCostoLlamadas() - minutos *989);

        numeroMinutosCelular += minutos;
    }

    public void agregarLlamadaLargaDistancia(int minutos){
    //    sin implementacion

    }

    public void reiniciar(){
        this.numeroLlamadas = 0;
        this.numeroMinutos = 0;
        this.numeroMinutosCelular = 0;
        this.numeroMinutosLocal = 0;
        setCostoLlamadas(0);
    }
}
