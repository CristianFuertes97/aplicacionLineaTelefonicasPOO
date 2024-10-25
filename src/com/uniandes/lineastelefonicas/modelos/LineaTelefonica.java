package com.uniandes.lineastelefonicas.modelos;

public class LineaTelefonica {
    // atributos
    protected int numeroLlamadas;
    protected int numeroMinutos;
    private double costoLlamadas;

    // constructor
    public LineaTelefonica() {
        numeroLlamadas = 0;
        numeroMinutos = 0;
        costoLlamadas = 0;
    }

    // getters and setters
    public int getNumeroLlamadas() {
        return this.numeroLlamadas;
    }

    public void setNumeroLlamadas(int numeroLlamadas) {
        this.numeroLlamadas = numeroLlamadas;
    }

    public int getNumeroMinutos() {
        return this.numeroMinutos;
    }

    public void setNumeroMinutos(int numeroMinutos) {
        this.numeroMinutos = numeroMinutos;
    }

    public double getCostoLlamadas() {
        return this.costoLlamadas;
    }

    public void setCostoLlamadas(double costoLlamadas) {
        this.costoLlamadas = costoLlamadas;
    }

// metodos   
    public void reiniciar(){
        this.numeroLlamadas = 0;
        this.numeroMinutos = 0;
        this.costoLlamadas = 0;
    }

    public void modificarCostoLlamada(double costoLlamadas){
        this.costoLlamadas = costoLlamadas;
    }

    public void agregarLlamadaLocal(int minutos){
        this.numeroMinutos = minutos;
        this.costoLlamadas += (this.numeroMinutos * 35);
        this.numeroLlamadas++;
    }

    public void agregarLlamadaLargaDistancia(int minutos){
        this.numeroMinutos = minutos;
        this.costoLlamadas += (this.numeroMinutos * 380);
        this.numeroLlamadas++;
    }

    public void agregarLlamadaCelular(int minutos){
        this.numeroMinutos = minutos;
        this.costoLlamadas += (this.numeroMinutos * 999);
        this.numeroLlamadas++;
    }


    @Override
    public String toString() {
        return "{" +
            " numeroLlamadas='" + getNumeroLlamadas() + "'" +
            ", numeroMinutos='" + getNumeroMinutos() + "'" +
            ", costoLlamadas='" + getCostoLlamadas() + "'" +
            "}";
    }

}
