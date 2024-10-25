package com.uniandes.lineastelefonicas.principal;

import java.util.Scanner;

import com.uniandes.lineastelefonicas.modelos.Empresa;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();

        while (true) {
            System.out.println("********SISTEMA LINEAS TELEFONICAS**********");
            System.out.println("""
                    Escoge la linea por la que deseas realizar la llamada
                    1. Lineas No Alternativas
                    2. Lineas Alternativas
                    3. Reiniciar Sistema
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
                    System.out.println("""
                            Tipo de llamada de lineas alternativas:
                            1. Linea Celular
                            2. Linea VozIP
                            """);
                    int op = sc.nextInt();
                    if (op == 1) {
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
                    }else if(op == 2){
                        System.out.println("""
                            1.Local
                            2.Larga Distancia
                            3.Celular
                            """);
                        int a = sc.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Cuantos minutos de su llamada");
                                int amin = sc.nextInt();
                                empresa.agregarLlamadaLocalLineaVozIP(amin);
                                break;
                            case 2:
                                System.out.println("Cuantos minutos de su llamada");
                                int b = sc.nextInt();
                                empresa.agregarLlamadaLargaDistanciaLineaVozIP(b);
                                break;
                            case 3:
                                System.out.println("Cuantos minutos de su llamada");
                                int d = sc.nextInt();
                                empresa.agregarLlamadaCelularLineaIP(d);
                            break;    
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Reiniciando el sistema........");
                    empresa.reiniciarLineasAlternativas();
                    empresa.reiniciarLineasNoALternativas();    
                default:
                    System.out.println("Saliendo del sistema...........");
                    break;
            }
            System.out.println("-----------------INFORMACION DE SUS LLAMADAS---------------------");
            System.out.println("LINEAS NO ALTERNATIVAS");
            System.out.println("Total de llamadas: " + empresa.darTotalNumeroLlamadasDesdeLineasNoAlternativas());
            System.out.println("Total de minutos: "+ empresa.darTotalNumeroMinutosDesdeLineasNoAlternativas());
            System.out.println("Total Costo de llamadas: "+ empresa.darTotalCostoLlamadasDesdeLineasNoAlternativas());
            System.out.println("Costo promedio por minuto: "+ empresa.darCostoPromedioMinutoDesdeLineasNoAlternativas());
            System.out.println("*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("LINEAS ALTERNATIVAS");
            System.out.println("Total de llamadas: " + empresa.darTotalNumeroLlamadasDesdeLineasAlternativas());
            System.out.println("Total de minutos: "+ empresa.darTotalNumeroMinutosDesdeLineasAlternativas());
            System.out.println("Total Costo de llamadas: "+ empresa.darTotalCostoLlamadasDesdeLineasAlternativas());
            System.out.println("Costo promedio por minuto: "+ empresa.darCostoPromedioMinutoDesdeLineasAlternativas());
        }
        sc.close();
        
    }

}
