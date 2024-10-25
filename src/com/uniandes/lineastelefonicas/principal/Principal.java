package com.uniandes.lineastelefonicas.principal;

import java.util.Scanner;

import com.uniandes.lineastelefonicas.modelos.Empresa;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();

        empresa.agregarLlamadaLocalLinea1(15);
        empresa.agregarLlamadaLocalLinea1(20);
        empresa.agregarLlamadaLocalLinea1(2);
        empresa.agregarLlamadaLocalLinea1(11);
        empresa.agregarLlamadaLocalLinea1(8);
        System.out.println(empresa.darTotalNumeroLlamadasDesdeLineasNoAlternativas());

        while (true) {
            System.out.println("********SISTEMA LINEAS TELEFONICAS**********");
            System.out.println("""
                    Escoge la linea por la que deseas realizar la llamada
                    1. Lineas Alternativas
                    2. Lineas No Alternativas
                    0. Salir
                    """);
            int opcion = sc.nextInt();
            if(opcion == 0){
                break;
            }
            switch (opcion) {
                case 1:
                    System.out.println("""
                            1.Linea Telefonica 1
                            2.Linea Telefonica 2
                            3.Linea Telefonica 3
                            """);
                            int valor = sc.nextInt();
                            if(valor == 1){
                                System.out.println("Tipo de Llamada");
                                System.out.println("""
                                        1.Local
                                        2.Larga Distancia
                                        3.Celular
                                        """);
                                int num = sc.nextInt();
                                switch (num) {
                                    case 1:
                                        System.out.println("Cuantos minutos su llamada");
                                        int min = sc.nextInt();
                                        empresa.agregarLlamadaLocalLinea1(min);
                                        break;
                                    case 2:
                                        System.out.println("Cuantos minutos su llamada");
                                        int minu = sc.nextInt();
                                        empresa.agregarLlamadaLargaDistanciaLinea1(minu);
                                        break;
                                    case 3:
                                        System.out.println("Cuantos minutos su llamada");
                                        int n = sc.nextInt();
                                        empresa.agregarLlamadaCelularLinea1(n);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            else if(valor == 2){
                                System.out.println("Tipo de Llamada");
                                    System.out.println("""
                                            1.Local
                                            2.Larga Distancia
                                            3.Celular
                                            """);
                                    int num = sc.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Cuantos minutos su llamada");
                                            int min = sc.nextInt();
                                            empresa.agregarLlamadaLocalLinea2(min);
                                            break;
                                        case 2:
                                            System.out.println("Cuantos minutos su llamada");
                                            int minu = sc.nextInt();
                                            empresa.agregarLlamadaLargaDistanciaLinea2(minu);
                                            break;
                                        case 3:
                                            System.out.println("Cuantos minutos su llamada");
                                            int n = sc.nextInt();
                                            empresa.agregarLlamadaCelularLinea2(n);
                                            break;
                                        default:
                                            break;
                                    }
                                
                            }
                            else if(valor == 3){
                                System.out.println("Tipo de Llamada");
                                    System.out.println("""
                                            1.Local
                                            2.Larga Distancia
                                            3.Celular
                                            """);
                                    int num = sc.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Cuantos minutos su llamada");
                                            int min = sc.nextInt();
                                            empresa.agregarLlamadaLocalLinea3(min);
                                            break;
                                        case 2:
                                            System.out.println("Cuantos minutos su llamada");
                                            int minu = sc.nextInt();
                                            empresa.agregarLlamadaLargaDistanciaLinea3(minu);
                                            break;
                                        case 3:
                                            System.out.println("Cuantos minutos su llamada");
                                            int n = sc.nextInt();
                                            empresa.agregarLlamadaCelularLinea3(n);
                                            break;
                                        default:
                                            break;
                                    }
                                
                            }
                    break;
                case 2:
                    System.out.println("LLamadas por Lineas alternativas");        
                    System.out.println("""
                            1.Local
                            2.Celular
                            """);
                    int a = sc.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("Cuantos minutos de su llamada");
                            int amin = sc.nextInt();
                            empresa.agregarLlamadaLocalLineaCelular1(amin);
                            break;
                        case 2:
                            System.out.println("Cuantos minutos de su llamada");
                            int b = sc.nextInt();
                            empresa.agregarLlamadaCelularLineaCelular(b);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("Saliendo del sistema...........");
                    break;
            }
            System.out.println("-----------------INFORMACION DE SUS LLAMADAS---------------------");
            System.out.println("Total de llamadas Lineas No ALternativas: " + empresa.darTotalNumeroLlamadasDesdeLineasNoAlternativas());
            System.out.println("Total de minutos Lineas No Alternativas: "+ empresa.darTotalNumeroMinutosDesdeLineasNoAlternativas());
            System.out.println("Total Costo de llamadas Lineas No Alternativas: "+ empresa.darTotalCostoLlamadasDesdeLineasNoAlternativas());
        }
        sc.close();
        
    }

}
