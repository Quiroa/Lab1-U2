/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.github;

import java.util.Scanner;

/**
 *
 * @author Jose Alejndro
 */
public class MainGitHub {

    public static void main(String[] args) {
        boolean a = true, b = true, c = false;
        int tmp, x, y, z;
        String t;
        Scanner sc = new Scanner(System.in);
        ClassIf ci = new ClassIf();
        do {
            System.out.println("Seleccione una opcion\n");
            System.out.println("1 - Igualdad");
            System.out.println("2 - Dato mayor");
            System.out.println("3 - Dato menor");
            System.out.println("4 - Maximo comun divisor");
            System.out.println("5 - Minimo comun multiplo");
            System.out.println("6 - Raiz cuadrada");
            System.out.println("7 - Funcion cuadratica (Se requiere el ingreso de 3 datos)");
            System.out.println("8 - Resta");
            System.out.println("9 - Multiplicacion");
            System.out.println("10 - Divicion");
            System.out.println("11 - And (datos booleanos)");
            System.out.println("12 - Or (datos booleanos)");
            System.out.println("13 - Not (datos booleanos)");
            System.out.println("14 - Salir del programa");
            System.out.print("Opcion: ");
            tmp = sc.nextInt();
            if (tmp < 1 || tmp > 14) {
                System.out.println("Opcion invalida.");
                System.out.println("Porfavor seleccione otra opcion");
                System.out.print("Precione enter para continuar...");
                t = sc.nextLine();
            } else {
                switch (tmp) {
                    case 1:
                        System.out.print("Ingrese un numero: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese un segudo dumenro: ");
                        y = sc.nextInt();
                        ci.setI(x, y);
                        break;
                    case 2:
                        System.out.print("Ingrese un numero: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese un segudo dumenro: ");
                        y = sc.nextInt();
                        ci.setM(x, y);
                        break;
                    case 3:
                        System.out.print("Ingrese un numero: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese un segudo dumenro: ");
                        y = sc.nextInt();
                        ci.setm(x, y);
                        break;
                    case 4:
                        do {
                            System.out.print("Ingrese un numero positivo mayor a 1: ");
                            x = sc.nextInt();
                            if (x < 1) {
                                System.out.println(x + " no es un numero positivo mayor a 1");
                            }
                        } while (x < 1);
                        do {
                            System.out.print("Ingrese otro numero positivo mayor a 1: ");
                            y = sc.nextInt();
                            if (y < 1) {
                                System.out.println(y + " no es un numero positivo mayor a 1");
                            }
                        } while (y < 1);
                        ci.setMax(x, y);
                        break;
                    case 5:
                        do {
                            System.out.print("Ingrese un numero positivo mayor a 1: ");
                            x = sc.nextInt();
                            if (x < 1) {
                                System.out.println(x + " no es un numero positivo mayor a 1");
                            }
                        } while (x < 1);
                        do {
                            System.out.print("Ingrese otro numero positivo mayor a 1: ");
                            y = sc.nextInt();
                            if (y < 1) {
                                System.out.println(y + " no es un numero positivo mayor a 1");
                            }
                        } while (y < 1);
                        ci.setMin(x, y);
                        break;
                    case 6:
                        do {
                            System.out.print("Ingrese un numero positivo igual o mayor a 0 (x>=0): ");
                            x = sc.nextInt();
                            if (x < 1) {
                                System.out.println(x + " no es un numero positivo igual o mayor a 0 (x>=0)");
                            }
                        } while (x < 1);
                        do {
                            System.out.print("Ingrese un numero positivo igual o mayor a 0 (y>=0): ");
                            y = sc.nextInt();
                            if (y < 1) {
                                System.out.println(x + " no es un numero positivo igual o mayor a 0 (y>=0)");
                            }
                        } while (y < 1);
                        ci.setRz(4, 100);
                        break;
                    case 7:
                        System.out.print("Ingrese un numero (a): ");
                        x = sc.nextInt();
                        System.out.print("Ingrese un segudo dumenro (b): ");
                        y = sc.nextInt();
                        System.out.print("Ingrese un tercer numero (c): ");
                        z = sc.nextInt();
                        ci.setFcuad(x, y, z);//Envio a,b,c para calcular x
                        break;
                    case 8:
                        System.out.print("Ingrese un numero: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese un segudo dumenro: ");
                        y = sc.nextInt();
                        ci.setRes(x, y);
                        break;
                    case 9:
                        System.out.print("Ingrese un numero: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese un segudo dumenro: ");
                        y = sc.nextInt();
                        ci.setMul(2, 3);
                        break;
                    case 10:
                        System.out.print("Ingrese un numero: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese un segudo dumenro: ");
                        y = sc.nextInt();
                        ci.setDiv(3, 12);
                        break;
                    case 11:
                        do {
                            System.out.println("Seleccione un valor booleano para \"a\": ");
                            System.out.println("1 - True (Verdadero)");
                            System.out.println("2 - False (Falso)\n");
                            System.out.print("Opcion: ");
                            x = sc.nextInt();
                            if (x < 1 || x > 2) {
                                System.out.println(x + " no es un valor valido");
                            } else {
                                if (x == 1) {
                                    a = true;
                                } else {
                                    a = false;
                                }
                            }
                        } while (x < 1 || x > 2);
                        do {
                            System.out.println("Seleccione un valor booleano para \"b\": ");
                            System.out.println("1 - True (Verdadero)");
                            System.out.println("2 - False (Falso)\n");
                            System.out.println("Opcion: ");
                            y = sc.nextInt();
                            if (y < 1 || y > 2) {
                                System.out.println(y + " no es un valor valido");
                            } else {
                                if (y == 1) {
                                    b = true;
                                } else {
                                    b = false;
                                }
                            }
                        } while (y < 1 || y > 2);
                        ci.setAnd(a, b);
                        break;
                    case 12:
                        do {
                            System.out.println("Seleccione un valor booleano para \"a\": ");
                            System.out.println("1 - True (Verdadero)");
                            System.out.println("2 - False (Falso)\n");
                            System.out.print("Opcion: ");
                            x = sc.nextInt();
                            if (x < 1 || x > 2) {
                                System.out.println(x + " no es un valor valido");
                            } else {
                                if (x == 1) {
                                    a = true;
                                } else {
                                    a = false;
                                }
                            }
                        } while (x < 1 || x > 2);
                        do {
                            System.out.println("Seleccione un valor booleano para \"b\": ");
                            System.out.println("1 - True (Verdadero)");
                            System.out.println("2 - False (Falso)\n");
                            System.out.print("Opcion: ");
                            y = sc.nextInt();
                            if (y < 1 || y > 2) {
                                System.out.println(y + " no es un valor valido");
                            } else {
                                if (y == 1) {
                                    b = true;
                                } else {
                                    b = false;
                                }
                            }
                        } while (y < 1 || y > 2);
                        ci.setOr(a, b);
                        break;
                    case 13:
                        do {
                            System.out.println("Seleccione un valor booleano para \"a\": ");
                            System.out.println("1 - True (Verdadero)");
                            System.out.println("2 - False (Falso)\n");
                            System.out.print("Opcion: ");
                            x = sc.nextInt();
                            if (x < 1 || x > 2) {
                                System.out.println(x + " no es un valor valido");
                            } else {
                                if (x == 1) {
                                    a = true;
                                } else {
                                    a = false;
                                }
                            }
                        } while (x < 1 || x > 2);
                        do {
                            System.out.println("Seleccione un valor booleano para \"b\": ");
                            System.out.println("1 - True (Verdadero)");
                            System.out.println("2 - False (Falso)\n");
                            System.out.print("Opcion: ");
                            y = sc.nextInt();
                            if (y < 1 || y > 2) {
                                System.out.println(y + " no es un valor valido");
                            } else {
                                if (y == 1) {
                                    b = true;
                                } else {
                                    b = false;
                                }
                            }
                        } while (y < 1 || y > 2);
                        ci.setNot(a, b);
                        break;
                    case 14:
                        c = false;
                        break;
                }
            }
        } while (!c);
        System.out.println("\n\nGracias por visitarnos,");
        System.out.println("Esperamos que vuelva pronto.\n\n");
    }

}
