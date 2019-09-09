/*
Nombre: José Alejandro Quiroa Martínez
Fecha: 29/8/2019
Carnet: 5090-18-2169
 */
package main.github;

import java.util.Scanner;

public class MainGitHub { //Clase prinsipal

    public static void main(String[] args) { //Funcion principal
        boolean a = true, b = true; //Variables de uso booleano para las opciones 11-13
        int tmp, x, y, z; //Varialbes para la seleccion de opciones e ingresos de datos
        String t; //Varialbe utilizada para marcar una pausa en la ejecucion del programa
        Scanner sc = new Scanner(System.in); //Objeto implementado para la lectorua de datos desde el teclado
        ClassIf ci = new ClassIf(); //Objeto utilizado para hacer el respectivo llamado a las funciones solicitadas
        do { //Inicia el siclo Do...While
            System.out.println("Seleccione una opcion\n"); //Inicia precentacion del menu principal
            System.out.println("1 - Igualdad");
            System.out.println("2 - Dato mayor");
            System.out.println("3 - Dato menor");
            System.out.println("4 - Maximo Comun Divisor");
            System.out.println("5 - minimo comun multiplo");
            System.out.println("6 - Raiz cuadrada");
            System.out.println("7 - Funcion cuadratica (Se requiere el ingreso de 3 datos)");
            System.out.println("8 - Resta");
            System.out.println("9 - Multiplicacion");
            System.out.println("10 - Divicion");
            System.out.println("11 - And (datos booleanos)");
            System.out.println("12 - Or (datos booleanos)");
            System.out.println("13 - Not (datos booleanos)");
            System.out.println("14 - Salir del programa"); //Finaliza la presentacion del menu principal
            System.out.print("Opcion: "); //Solicitud de seleccion
            tmp = sc.nextInt(); //Ingreso de seleccion
            switch (tmp) { //Inicia condicional switch para las 14 posibles opciones
                case 1: //Caso 1: Igualdad de numeros
                    System.out.print("Ingrese un numero: "); //Solicitud del primer dato
                    x = sc.nextInt(); //Ingreso del dato 1
                    System.out.print("Ingrese un segudo dumenro: "); //Solicitud del segundo dato
                    y = sc.nextInt(); //Ingreso del dato 2
                    ci.setI(x, y); //Llamado a la funcion que comparara los datos, Identidad
                    break; //Finaliza el caso 1
                case 2: //Caso 2: Dato mayor
                    System.out.print("Ingrese un numero: "); //Solicitud del primer dato
                    x = sc.nextInt(); //Ingreso del dato 1
                    System.out.print("Ingrese un segudo dumenro: "); //Solicitud del segundo dato
                    y = sc.nextInt(); //Ingreso del dato 2
                    ci.setM(x, y); //Llamado a la funcion que comprarara los datos, Dato mayor
                    break; //Finaliza el caso 2
                case 3: //Caso 3: Dato menor
                    System.out.print("Ingrese un numero: "); //Solicitud del primer dato
                    x = sc.nextInt(); //Ingreso del dato 1
                    System.out.print("Ingrese un segudo dumenro: "); //Solicitud del segundo dato
                    y = sc.nextInt(); //Ingreso del dato 2
                    ci.setm(x, y); //Llamado a la funcion que comparara los datos, Dato menor
                    break; //Finaliza el caso 3
                case 4: //Caso 4: Maximo Comun Divisor
                    do { //Ciclo Do...While... que verifica el ingreso de un numero mayor a 1 para el dato 1
                        System.out.print("Ingrese un numero positivo mayor a 1: "); //Solicitud del dato 1
                        x = sc.nextInt(); //Ingreso del dato 1
                        if (x < 1) { //Condicional que verifica que el numero ingresado sea mayor a 1
                            System.out.println(x + " no es un numero positivo mayor a 1"); //Mensaje de alerta
                        } //Finaliza el condicional previamente mencionado
                    } while (x < 1); //Finalizara el condicional Do...While... asta que el dato ingresado sea mayor a 1
                    do { //Cilco Do...While... que verifica el ingreso de un numero mayor a 1 para el dato 2
                        System.out.print("Ingrese otro numero positivo mayor a 1: "); //Solicitud del dato 2
                        y = sc.nextInt(); //Ingreso del dato 2
                        if (y < 1) { //Condicional que verifica que el numero ingresado sea mayor a 1
                            System.out.println(y + " no es un numero positivo mayor a 1"); //Mensaje de alerta
                        } //Finaliza el condicional previamente mencionado
                    } while (y < 1); //Finalizara el condicional Do...While... asta que el dato ingresado sea mayor a 1
                    ci.setMax(x, y); //Llamado a la funcion que buscara el M.C.D.
                    break; //Finaliza el caso 4
                case 5: //Caso 5: minimo comun multiplo
                    do { //Ciclo Do...While... que verifica el ingreso de un numero mayor a 1 para el dato 1
                        System.out.print("Ingrese un numero positivo mayor a 1: "); //Solicitud del dato 1
                        x = sc.nextInt(); //Ingreso del dato 1
                        if (x < 1) { //Condicional que verifica que el numero ingresado sea mayor a 1
                            System.out.println(x + " no es un numero positivo mayor a 1"); //Mensaje de alerta
                        } //Finaliza el condicional previamente mencionado
                    } while (x < 1); //Finalizara el condicional Do...While... asta que el usuario ingrese un numero mayor a 1
                    do { //Cilo Do...While... que verifica el ingreso de un numero mayor a 1 para el dato 2
                        System.out.print("Ingrese otro numero positivo mayor a 1: "); //Solicitud del dato 2
                        y = sc.nextInt(); //Ingreso del dato 2
                        if (y < 1) { //Condicional que verifica que el numero ingresado sea mayor a 1
                            System.out.println(y + " no es un numero positivo mayor a 1"); //Mensaje de alerta
                        } //Finaliza el condicional previamente mencionado
                    } while (y < 1); //Finalizara el siclo Do...While... asta que el usuario ingrese un dato mayor a 1
                    ci.setMin(x, y); //Llamado a la funcion que buscara el m.c.m.
                    break; //Finaliza el caso 5
                case 6: //Caso 6: Raiz Cuadrada
                    do { //Ciclo Do...While... que verifica el ingreso de un dato positivo igual o mayor a 0
                        System.out.print("Ingrese un numero positivo igual o mayor a 0 (x>=0): "); //Solicitud del ingreos del dato en cuestion
                        x = sc.nextInt(); //Ingreso del dato en cuestion
                        if (x < 0) { //Condicional que verifica que se ingrese un dato positivo igual o mayor a 0
                            System.out.println(x + " no es un numero positivo igual o mayor a 0 (x>=0)"); //Mensaje de alerta
                        } //Finaliza el condicional previamente mencionado
                    } while (x < 0); //Finalizara el ciclo Do...While... asta que el usuario ingrese un dato igual o mayor a 0
                    ci.setRz(x); //Llamado a la funcion que buscara la raiz cuadrada del dato en cuestion
                    break; //Finaliza el caso 6
                case 7: //Caso 7: Funcion Cuadratica
                    System.out.print("Ingrese un numero (a): "); //Solicitud del ingreso del dato 1
                    x = sc.nextInt(); //Ingreso del dato 1
                    System.out.print("Ingrese un segudo dumenro (b): "); //Solicitud del ingreso del dato 2
                    y = sc.nextInt(); //Ingres del dato 2
                    System.out.print("Ingrese un tercer numero (c): "); //Solicitud del ingreso del dato 3
                    z = sc.nextInt(); //Ingreso del dato 3
                    ci.setFcuad(x, y, z); //Llamado a la funcion que calculara los valores de "X1" y "X2"
                    break; //Finaliza el caso 7
                case 8: //Caso 8: Resta
                    System.out.print("Ingrese un numero: "); //Solicitud del ingreso del dato 1
                    x = sc.nextInt(); //Ingreso del dato 1
                    System.out.print("Ingrese un segudo dumenro: "); //Solicitud del ingreso del dato 2
                    y = sc.nextInt(); //Ingreso del dato 2
                    ci.setRes(x, y); //Llamado a la funcion que calculara la resta entre el dato 1 y el dato 2
                    break; //Finaliza el caso 8
                case 9: //Caso 9: Multiplicacion
                    System.out.print("Ingrese un numero: "); //Solicitud del intgreso del dato 1
                    x = sc.nextInt(); //Ingres del dato 1
                    System.out.print("Ingrese un segudo dumenro: "); //Solicitud del ingreso del dato 2
                    y = sc.nextInt(); //Ingreso del dato 2
                    ci.setMul(x, y); //Llamando a la funcion que multiplica el dato 1 con el dato 2
                    break;
                case 10: //Caso 10: Divicion
                    System.out.print("Ingrese un numero: "); //Solicitud del ingreso del dato 1
                    x = sc.nextInt(); //Ingreso del dato 1
                    do { //Ciclo Do...While... que verifica que el usuario no ingrese 0 en el divisor 
                        System.out.print("Ingrese un segudo dumenro: "); //Solicitud del ingreso del dato 2
                        y = sc.nextInt(); //Ingreso del dato 2
                        if (y == 0) { //Condicional que verifica que no se ingrese 0 en el divisor
                            System.out.println("¡ERROR!"); //Mensaje de alerta
                            System.out.println("No se puede dividir ningun numero entre 0"); //Mensaje de alerta
                        } //Finaliza el condicional previamente mencionado
                    } while (y == 0); //Finalizara el ciclo Do...While... asta que el usuario ingrese un numero distinto a 0 en el divisor
                    ci.setDiv(x, y); //Llamado a la funcion que divide el dato 1 entre el dato 2
                    break; //Finaliza el caso 10
                case 11: //Caso 11: And
                    do { //Ciclo Do...While... que verifica la seleecion de una opcion valida
                        System.out.println("Seleccione un valor booleano para \"a\": "); //Solicitud de un valor para la variable "a"
                        System.out.println("1 - True (Verdadero)"); //Opcion 1 para la variable "a"
                        System.out.println("2 - False (Falso)\n"); //Opcion 2 para la variable "a"
                        System.out.print("Opcion: "); //Solicitud de seleccion de una opcion
                        x = sc.nextInt(); //Seleccion de una opcion
                        if (x < 1 || x > 2) { //Concicional que verifica que se seleccione una opcion valida (Caso verdadero: El usuario escogio una opcion invalida)
                            System.out.println(x + " no es un valor valido"); //Mensaje de alerta
                        } else { //Caso contrario: El usuario NO escogio una opcion invalida
                            if (x == 1) { //Condicional que analiza la opcion seleccionada por el usuario (Caso verdadero: El usuario escogio "TRUE")
                                a = true; //Asignacion del valor "TRUE" para la variable "a"
                            } else { //Caso contrario: El usuario NO escogio el valor "TRUE" para la variable "a"
                                a = false; //Asignacion del valor "FALSE" para la variable "a"
                            } //Finaliza el condicional previamente mencionado
                        } //Finaliza el condicional que analiza la opcion seleccionalda por el usuario
                    } while (x < 1 || x > 2); //Finalizara el ciclo Do...While... asta que se seleccione una opcion valida (1 o 2)
                    do { //Ciclo Do...While... que verifica la seleccion de una opcion valida
                        System.out.println("Seleccione un valor booleano para \"b\": "); // Soliciud de un valor para la varialbe "b"
                        System.out.println("1 - True (Verdadero)"); //Opcion 1 para la variable "b"
                        System.out.println("2 - False (Falso)\n"); //Opcion 2 para la variable "b"
                        System.out.println("Opcion: "); //Solicitud de seleccion de una opcion
                        y = sc.nextInt(); //Seleccion de una opcion
                        if (y < 1 || y > 2) { //Condicional que verifica que se seleccione una opcion valida (Caso verdadero: El usuario escogio una opcion invalida)
                            System.out.println(y + " no es un valor valido"); //Mensaje de alerta
                        } else { //Caso contrario: El usuario NO escogio una opcion invalida
                            if (y == 1) { //Condicional que analiza la opcion seleccionada por el usuario (Caso verdadero: El usuario escogio "TRUE")
                                b = true; //Asignacion dle valor "TRUE" para la variable "b"
                            } else { //Caso contrario: El usuario NO escogio el valor "TRUE" para la variable "b"
                                b = false; //Asignacion del valor "FALSE" para la variable "b"
                            } //Finaliza el condicional previamente mencionado
                        } //Finaliza el condicional que analiza la opcion seleccionada por el usuario
                    } while (y < 1 || y > 2); //Finalizara el ciclo Do...While... asta que se seleccione una opcion valida (1 o 2)
                    ci.setAnd(a, b); //Llamado a la funcion que valuara las variables "a" y "b" con el conector "&&" (and/y)
                    break; //Finaliza el caso 11
                case 12: //Caso 12: Or
                    do { //Ciclo Do...While... que verifica que el usuario seleccione un valor para la variable "a"
                        System.out.println("Seleccione un valor booleano para \"a\": "); //Solicitud de seleccion de valor para la variable "a"
                        System.out.println("1 - True (Verdadero)"); //Opcion 1 para la variable "a"
                        System.out.println("2 - False (Falso)\n"); //Opcion 2 para la variable "a"
                        System.out.print("Opcion: "); //Solicitud de seleccion de una opcion
                        x = sc.nextInt(); //Seleccion de una opcion
                        if (x < 1 || x > 2) { //Condicional que verifica que se seleccione una opcion valida (Caso verdadero: El usuario escogio una opcion incorrecta)
                            System.out.println(x + " no es un valor valido"); //Mensaje de alerta
                        } else { // //Caso contrario: El usuario NO escogio una opcion incorrecta
                            if (x == 1) { //Condicional que analiza la opcion seleccionada por el usuario (Caso verdadero: El usuario escogio el valor "TRUE" para la varialbe "a")
                                a = true; //Asignaicon del valor "TRUE" para la variable "a"
                            } else { //Caso contrario: El usuario NO selecciono el valor "TRUE" para la varialbe "a"
                                a = false; //Asignacion del valor "FALSE" para la variable "a"
                            } //Finaliza el condicional previamente mencionado
                        } //Finaliza el condicional que verifica que el usuario no seleecione una opcion invalida
                    } while (x < 1 || x > 2); //Finalizara el siclo Do...While... asta que se seleccione un 1 o un 2
                    do { //Ciclo Do...While... que verifica que el usuario seleccione un valor para la variable "b"
                        System.out.println("Seleccione un valor booleano para \"b\": "); //Solicitud de seleccion de valor para la variable "b"
                        System.out.println("1 - True (Verdadero)"); //Opcion 1 para la variable "b"
                        System.out.println("2 - False (Falso)\n"); //Opcion 2 para la varialbe "b"
                        System.out.print("Opcion: "); //Solicitud de seleccion de una opcion
                        y = sc.nextInt(); //Seleccion de una opcion
                        if (y < 1 || y > 2) { //Condicional que verifica que se seleccione una opcion valida (Caso verdadero: El usuario escogio una opcion incorrecta)
                            System.out.println(y + " no es un valor valido"); //Mensaje de alerta
                        } else { //Caso contrario: El usuario NO escogio una opcion incorrecta
                            if (y == 1) { //Condicional que analiza la opcion seleccionada por el usuario
                                b = true; //Asignacion dle valor "TRUE" para la variable "b"
                            } else { //Caso contrario: El usuario NO selecciono el valor "TRUE" para la variable "b"
                                b = false; //Asignaicon dle valor "FALSE" para la variable "b"
                            } //Finaliza el condicional previamente mencionado
                        } //Finaliza el condicional que verifica que el usuario no seleccione una opcion invalida
                    } while (y < 1 || y > 2); //Finalizara el siclo Do...While... asta que se seleccione un 1 o un 2
                    ci.setOr(a, b); //Llamado a la funcion que valuara las variables "a" y "b" con el conector "||" (Or/o)
                    break; //Finaliza el caso 12
                case 13: //Caso 13: Not
                    do { //Ciclo Do...While... que se repite asta que se seleccione una opcion valida
                        System.out.println("Seleccione un valor booleano para \"a\": "); //Solicitud de un valor para lavarialbe "a"
                        System.out.println("1 - True (Verdadero)"); //Opcion 1
                        System.out.println("2 - False (Falso)\n"); //Opcion 2
                        System.out.print("Opcion: "); //Solicitud de seleccion de una opcion
                        x = sc.nextInt(); //Seleccion de una opcion
                        if (x < 1 || x > 2) { //Condicional que verifica que el usuario seleccione una opcion valida (Caso verdadero: El usuario selecciono una opcion invalida)
                            System.out.println(x + " no es un valor valido"); //Mensaje de alerta
                        } else { //Caso contrario: El usuario NO selecciono una opcion invalida
                            if (x == 1) { //Condicional que analiza la opcion seleccionada por el usuario (Caso verdadero: El usuario selecciono "TRUE")
                                a = true; //Asignacion del valor "TRUE" para la variable "a"
                            } else { //Caso contrario: El usuario NO selecciono el valor "TRUE"
                                a = false; //Asignacion del valor "FALSE" para la varialbe "a"
                            } //Finaliza el condicional previamente mencionado
                        } //Finaliza el condicional que veirifca que el usuario seleccione una opcion valida
                    } while (x < 1 || x > 2); //Finalizara el siclo Do...While... asta que se seleccione 1 o 2
                    do { //Ciclo Do...While... que se repite asta que se seleccione una opcion valida
                        System.out.println("Seleccione un valor booleano para \"b\": "); //Solicitud de un valorpara la variable "b"
                        System.out.println("1 - True (Verdadero)"); //Opcion 1
                        System.out.println("2 - False (Falso)\n"); //Opcion 2
                        System.out.print("Opcion: "); //Solicitud de seleccion de una opcion
                        y = sc.nextInt(); //Seleccion de una opcion
                        if (y < 1 || y > 2) { //Condicional que verifica que el usuario seleccione una opcion valida (Caso verdadero: El usuario selecciono una opcion invalida)
                            System.out.println(y + " no es un valor valido"); //Mensaje de alerta
                        } else { //Caso contrario: El usuario NO selecciono una opcion invalida
                            if (y == 1) { //Condicional que analiza la opcion seleccionada por el usuario (Caso verdadero: El usuario selecciono el valor "TRUE" para la variable "b"
                                b = true; //Asignacion del valor "TRUE" a la variapble "b"
                            } else { //Caso contrario: El usuario NO selecciono el valor "TRUE" para la variable "b"
                                b = false; //Asignacion del valor "FALSE" a la variable "b"
                            } //Finaliza el condicional previamente mencionado
                        } //Finaliza el condicional que verifica que el usuario seleccione una opcion valida
                    } while (y < 1 || y > 2); //Finalizara el sico Do...While... asta que se seleecione un 1 o un 2
                    ci.setNot(a, b); //Llamado a la funcion que calculara la negacion (!) de los valoresde "a" y "b"
                    break; //Finaliza el caso 13
                case 14: //Caso 14: Salir del programa
                    break; //Finaliza el caso 14
                default: //Caso se seleccion invalida
                    System.out.println("Opcion invalida."); //Mensaje de alerta
                    System.out.println("Porfavor seleccione otra opcion"); //Mensaje de alerta
                    break; //Finaliza el caso de seleccion invalida
            } //Finaliza el condicional switch
            System.out.print("Precione enter para continuar..."); //Instrucciones para continuar el proseso de ejecucion
            t = sc.nextLine(); //Varialbe utilizada para pausar el programa temporalmente
            for (int i = 0; i < 5; i++) { //Ciclo For utilizado para separar (dejar varias lineas de por medio) entre la ultima operacion realizada y a nueva operacion a realizar
                System.out.println(""); //Espacios de linea
            } //Finaliza el siclo For
        } while (tmp
                != 14); //Finalizara el Ciclo Do...While... que posee al menu principal asta que se seleccione la opcion salir (Opcion 14)
        System.out.println(
                "\n\nGracias por visitarnos,"); //Mensaje de despedida
        System.out.println(
                "Esperamos que vuelva pronto.\n\n"); //Mensaje de despedida
        System.out.print(
                "Precione enter para continuar..."); //Pause del programa
        t = sc.nextLine(); //Pausa del programa

        System.exit(
                0); //Cierre del programa
    } //Finaliza el main
} //Finaliza la clase MainGitHub
