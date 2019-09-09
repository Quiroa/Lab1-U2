/*
Nombre: José Alejandro Quiroa Martínez
Fecha: 29/8/2019
Carnet: 5090-18-2169
 */
package main.github;

public class ClassIf {

    public class clsif { //Constructor

    }
    Integer num1 = 0, num2 = 0; //Variables que toman los valores enviador a la funcion solicitada desde el main
    int tmp, i, c = 1; //Variables: temporal, contador for, contador centinela
    double rx, ry; //Variables de tipo booleano
    boolean t = false; //Variable centinela booleana

    public void setI(int x, int y) { //Funcion de igualdad
        this.num1 = x; //Asignacion del valor "x" a la variable "num1"
        this.num2 = y; //Asignacion del valor "y" a la variable "num2"
        if (num1 == num2) { //Verifica la igualdad entre "num1" y "num2"
            System.out.println("Los numeos son iguales"); //Mensaje
        } else { //Caso contrario: los datos no son iguales
            System.out.println("Los numeros son distintos"); //Mensaje
        } //Finaliza el condicional previamente mencionado
    } //Finaliza la funcion de igualdad

    public void setM(int x, int y) { //Funcion de dato mayor
        this.num1 = x; //Asignacion del valor "x" a la variable "num1"
        this.num2 = y; //Aisgnacion del valor "y" a la variable "num2"
        if (num1 > num2) { //Condicional que califica el dato 1 como el dato mayor
            System.out.println("El numero " + num1 + " es mayor"); //Mensaje
        } else { //Caso contrario
            System.out.println("El numero " + num2 + " es mayor"); //Mensaje
        } //Finaliza el condicional previamente mencionado
    } //Finaliza la funcion de dato mayor

    public void setm(int x, int y) { //Funcion de dato menor
        this.num1 = x; //Asignacion del valor "x" a la variable "num1"
        this.num2 = y; //Asignacion del valor "y" a la variable "num2"
        if (num1 < num2) { //Condicional que califica el dato 1 cmo el dato menor
            System.out.println("El numero " + num1 + " es menor"); //Mensaje
        } else { //Caso contrario
            System.out.println("El numero " + num2 + " es menor"); //Mensaje
        } //Finaliza el condicional previamente mencinado
    } //Finaliza la funcion de dato menor

    public void setMax(int x, int y) { //Funcion de M.C.D.
        c = 1; //Inicializacion del centinela "c" en 1
        num1 = x; //Asignacion del valor "x" en la variable "num1"
        num2 = y; //Asignacion del valor "y" en la variable "num2"
        if (num1 < num2) { //Condicional que califica el dato 1 como dato menor
            tmp = num1; //Asignacion del dato menor a la variable "tmp"
        } else { //Caso contrario
            tmp = num2; //Asignaicon del dato menor a la varialbe "tmp"
        } //Finaliza el condiciona previamente mencionado
        for (i = 2; i <= tmp; i++) { //Ciclo For que se repetira desde 2 asta (dato menor)
            if (num1 % i == 0 && num2 % i == 0 && num1 != 1 && num2 != 1) { //Condicional que califica el dato "i" como divisor de los datos "num1" y "num2"
                num1 = num1 / i; //Reasignacion del valor del dato 1
                num2 = num2 / i; //Reasignacion dle valor del dato 2
                c = c * i; //Contador que ba calculando el M.C.D. de los datos "num1" y "num2"
                i = 1; //Reinicio del contador "i" a 1 para repetir el ciclo "For" con 2 unidades en "i"
                t = true; //Centinela que avisa el echo de aber encontrado un M.C.D. de los numero "num1" y "num2"
            } //Finaliza el condicional previamente mencionado
        } //Finaliza el siclo For
        if (t) { //Condicional que verifica el echo de aber encontrado un M.C.D.
            System.out.println("El maximo comun divisor es: " + c); //Mensaje
        } else { //Caso contrario
            System.out.println("No existe un maximo comun divisor"); //Mensaje
        } //Finaliza el Condicional previamente mencionado
    } //Finaliza la funcion de M.C.D.

    public void setMin(int x, int y) { //Funcion de m.c.m.
        c = 1; //Inicializacion del centinela "c" en 1
        i = 2; //Inicializacion del centinela "i" en 2
        num1 = x; //Asignacion del valor "x" en la variable "num1"
        num2 = y; //Asignaicon del valor "y" en la variable "num2"
        if (num1 < num2) { //Condicional que califica la variable "num2" como dato mayor
            tmp = num2; //Asignacion del dato mayor a la variable "tmp"
        } else { //Caso contrario
            tmp = num1; //Asignacion del dato mayor a la variable "tmp"
        } //Finaliza el condicional previamente mencionado
        do { //Cilco Do...While... que se repetira asta que los datos "num1" y "num2" sean iguales a 1
            if ((num1 % i == 0 || num2 % i == 0) && (num1 != 1 || num2 != 1)) { //condicional que verifica que el valor actual de "i" sea dibisible por lo menos entre uno de los numeros y que a su ves ambos no sean iguales a  1
                if (num1 % i == 0 && num1 != 1) { //Condicional que verifica que el dato "num1" sea divisible entre "i" y que a su ves este no sea igual a 1
                    num1 = num1 / i; //Reasignacion de la variable "num1"
                } //Finalizacion del condicional previamente mencionado
                if (num2 % i == 0 && num2 != 1) { //Condicional que verifia que el dato "num2" sea divisible entre "i" y que a su ves este no sea igual a 1
                    num2 = num2 / i; //Reasignacion de la variable "num2"
                } //Finalizacion del condicional previamente mencionado
                c = c * i; //Centinela que calcula el m.c.m. de los datos "num1" y "num2"
                i = 2; //Reinicio de la variable "i" a 2 unidades
                t = true; //Reasignacio de la varialbe "t" a "TRUE"
            } else { //caso contrario que ningun numero sea divisible entre "i" unidades
                i++; //Ingremento de la variable "i" en 1 unidad
            } //Finaliza el condicional que verifica el echo de poder dividir los datos "num1" y "num2" en "i" unidades
        } while (num1 != 1 || num2 != 1); //Finalizara el siclo Do...While... asta que los datos "num1" y "num2" sean iguales a 1
        if (t) { //Condicional que verifica la existencia de un m.c.m. entre los datos "num1" y "num2"
            System.out.println("El minimo comun multiplo es: " + c); //Mensaje
        } else { //Caso contrario
            System.out.println("No existe un minimo comun multiplo"); //Mensaje
        } //Finaliza en condicional previamente mencionado
    } //Fin de la funcion de m.c.m.

    public void setRz(int x) { //Funcion de Raiz Cuadrada
        rx = Math.sqrt(x); //Asignacion de la variable "rx" con el valor de: la raiz cuadrada de "x"
        System.out.println("La raiz cuadrada de " + x + " es " + rx); //Mensaje
    } //Finaliza la funcion de Raiz Cuadrada

    public void setFcuad(int a, int b, int c) { //Funcion Cuadratica
        rx = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //Calculo de "X1" con la funcion cuadratica y raiz positiva
        ry = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); //Calculo de "X2" con la funcion cuadratica y raiz negativa
        System.out.println("Para: " + a + "x^2 + " + b + "x + " + c + " = 0"); //Mensaje
        System.out.println("\t X1 = " + rx); //Mensaje
        System.out.println("\t X2 = " + ry); //Mensaje
    } //Finaliza la funcion Cuadratica

    public void setRes(int x, int y) { //Funcion Resta
        num1 = x; //Asignacion de la variable "num1" con el valor de "x"
        num2 = y; //Asignacion de la variable "num2" con el valor de "y"
        tmp = num1 - num2; //Asignacion de la variable "tmp" con el valor de "num1 - num2"
        System.out.println(num1+" - "+num2+" = "+tmp); //Mensaje
    } //Finaliza la funcion Resta

    public void setMul(int x, int y) { //Funcin Multiplicacion
        tmp = x * y; //Asignacion de la variable "tmp" con el valor de "x*y" ("x" por "y")
        System.out.println(x + "*" + y + "=" + tmp); //Mensaje
    } //Finaliza la funcion Multiplicacion

    public void setDiv(int x, int y) { //Funcion Divicion
        num1 = x; //Asignacion de la variable "num1" con el valor de "x"
        num2 = y; //Asignacion de la variable "num2" con el valor de "y"
        rx = num1 / num2; //Asignacion de la variable "rx" con el valor de "num1/num2" ("num1" dividido "num2")
    } //Finaliza la funcion Divicion

    public void setAnd(boolean a, boolean b) { //Funcion AND
        System.out.println(a + " ˄ " + b + " = " + (a && b)); //Mensaje y calculo con el conector "&&" (AND) de las variables "a" y "b"
    } //Finaliza la funcion AND

    public void setOr(boolean a, boolean b) { //Funcion OR
        System.out.println(a + " ˅ " + b + " = " + (a || b)); //Mensaje y calculo con el conector "||" (OR) de las variables "a" y "b"
    } //Finaliza la funcion OR

    public void setNot(boolean a, boolean b) { //Funcion NOT
        System.out.println("La negacion de " + a + " (~a) es: " + !a); //Mensaje y calculo de la negacion del valor de la variable "a"
        System.out.println("La negacion de " + b + " (~b) es: " + !b); //Mensaje y calculo de la negacion del valor de la variable "b"
    } //Finaliza la funcio NOT
} //Fin de la clase ClassIf
