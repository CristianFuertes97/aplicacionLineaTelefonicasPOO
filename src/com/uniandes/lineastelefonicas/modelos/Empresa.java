package com.uniandes.lineastelefonicas.modelos;

public class Empresa {
    // atributos
    private LineaTelefonica linea1 = new LineaTelefonica();
    private LineaTelefonica linea2 = new LineaTelefonica();
    private LineaTelefonica linea3 = new LineaTelefonica();
    private LineaCelular celular = new LineaCelular();

    
    // Constructor vacio
    public Empresa() {
    }
    
    // getters and setters
    public LineaTelefonica getLinea1() {
        return this.linea1;
    }
    
    public void setLinea1(LineaTelefonica linea1) {
        this.linea1 = linea1;
    }
    
    public LineaTelefonica getLinea2() {
        return this.linea2;
    }
    
    public void setLinea2(LineaTelefonica linea2) {
        this.linea2 = linea2;
    }
    
    public LineaTelefonica getLinea3() {
        return this.linea3;
    }
    
    public void setLinea3(LineaTelefonica linea3) {
        this.linea3 = linea3;
    }

    public LineaCelular getCelular() {
        return this.celular;
    }

    // metodos
    public void agregarLlamadaLocalLinea1(int minutos){
       getLinea1().agregarLlamadaLocal(minutos);
    }

    public void agregarLlamadaLocalLinea2(int minutos){
       getLinea2().agregarLlamadaLocal(minutos);
    }

    public void agregarLlamadaLocalLinea3(int minutos){
       getLinea3().agregarLlamadaLocal(minutos);
    }

    public void agregarLlamadaLocalLineaCelular1(int minutos){
        getCelular().agregarLlamadaLocal(minutos);
    }

    public void agregarLlamadaLargaDistanciaLinea1(int minutos ){
        getLinea1().agregarLlamadaLargaDistancia(minutos);
    }

    public void agregarLlamadaLargaDistanciaLinea2(int minutos ){
        getLinea2().agregarLlamadaLargaDistancia(minutos);
    }

    public void agregarLlamadaLargaDistanciaLinea3(int minutos ){
        getLinea3().agregarLlamadaLargaDistancia(minutos);
    }

    public void agregarLlamadaCelularLinea1(int minutos){
        getLinea1().agregarLlamadaCelular(minutos);
    }

    public void agregarLlamadaCelularLinea2(int minutos){
        getLinea2().agregarLlamadaCelular(minutos);
    }

    public void agregarLlamadaCelularLinea3(int minutos){
        getLinea3().agregarLlamadaCelular(minutos);
    }

    public void agregarLlamadaCelularLineaCelular(int minutos){
        getCelular().agregarLlamadaCelular(minutos);
    }

    public int darTotalNumeroLlamadasDesdeLineasNoAlternativas(){
        int total = getLinea1().getNumeroLlamadas() + getLinea2().getNumeroLlamadas() + getLinea3().getNumeroLlamadas();
        return total;
    }

    public int darTotalNumeroLlamadasDesdeLineasAlternativas(){
        return getCelular().getNumeroLlamadas();
    }

    public int darTotalNumeroMinutosDesdeLineasNoAlternativas(){
        int total = getLinea1().getNumeroMinutos() + getLinea2().getNumeroMinutos() + getLinea3().getNumeroMinutos();
        return total;
    }

    public int darTotalNumeroMinutosDesdeLineasAlternativas(){
        return getCelular().getNumeroMinutos();
    }

    public double darTotalCostoLlamadasDesdeLineasNoAlternativas(){
        double total = getLinea1().getCostoLlamadas() + getLinea2().getCostoLlamadas() + getLinea3().getCostoLlamadas();
        return total;
    }

    public double darTotalCostoLlamadasDesdeLineasAlternativas(){
        return getCelular().getCostoLlamadas();
    }

    public double darCostoPromedioMinutoDesdeLineasNoAlternativas(){
        double total = darTotalCostoLlamadasDesdeLineasNoAlternativas() / darTotalNumeroMinutosDesdeLineasNoAlternativas();
        return total;
    }

    public double darCostoPromedioMinutoDesdeLineasAlternativas(){
        return darTotalCostoLlamadasDesdeLineasAlternativas() / darTotalNumeroMinutosDesdeLineasAlternativas();
    }

    public void reiniciarLineasNoALternativas(){
        linea1.reiniciar();
        linea2.reiniciar();
        linea3.reiniciar();
    }

    public void reiniciarLineasAlternativas(){
        celular.reiniciar();
    }

}
