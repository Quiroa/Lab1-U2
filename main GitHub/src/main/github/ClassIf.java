/*
Nombre: José Alejandro Quiroa Martínez
Fecha: 29/8/2019
Carnet: 5090-18-2169
 */
package main.github;

public class ClassIf {
    

    public class clsif {

    }
    Integer num1 = 0, num2 = 0;
    int tmp, i, c = 1;
    double rx, ry;
    boolean t = false;

    public void setI(int x, int y) {
        this.num1 = x;
        this.num2 = y;
        if (num1 == num2) {//Esta linea nos devuelve una exprecion booleana es decir true o false
            System.out.println("Los numeos son iguales");
        } else {
            System.out.println("Los numeros son distintos");
        }
    }

    //Este es un metodo para valorar mayores
    public void setM(int x, int y) {
        this.num1 = x;
        this.num2 = y;
        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor");
        } else {
            System.out.println("El numero " + num2 + " es mayor");
        }
    }

    //Este es un metodo para valorar menores
    public void setm(int x, int y) {
        this.num1 = x;
        this.num2 = y;
        if (num1 < num2) {
            System.out.println("El numero " + num1 + " es menor");
        } else {
            System.out.println("El numero " + num2 + " es menor");
        }
    }

    public void setMax(int x, int y) {
        num1 = x;
        num2 = y;
        if (num1 < num2) {
            tmp = num1;
        } else {
            tmp = num2;
        }
        for (i = 2; i <= tmp; i++) {
            if (num1 % i == 0 && num2 % i == 0 && num1 != 1 && num2 != 1) {
                num1 = num1 / i;
                num2 = num2 / i;
                c = c * i;
                i = 2;
                t = true;
            }
        }
        if (t) {
            System.out.println("El maximo comun divisor es: " + c);
        } else {
            System.out.println("No existe un maximo comun divisor");
        }
    }

    public void setMin(int x, int y) {
        c = 1;
        i = 2;
        num1 = x;
        num2 = y;
        if (num1 < num2) {
            tmp = num2;
        } else {
            tmp = num1;
        }
        do {
            if ((num1 % i == 0 || num2 % i == 0) && (num1 != 1 || num2 != 1)) {
                if (num1 % i == 0 && num1 != 1) {
                    num1 = num1 / i;
                }
                if (num2 % i == 0 && num2 != 1) {
                    num2 = num2 / i;
                }
                c = c * i;
                i = 2;
                t = true;
            } else {
                i++;
            }
        } while (num1 != 1 || num2 != 1);
        if (t) {
            System.out.println("El minimo comun multiplo es: " + c);
        } else {
            System.out.println("No existe un minimo comun multiplo");
        }
    }

    public void setRz(int x, int y) {
        rx = Math.sqrt(x);
        ry = Math.sqrt(y);
        System.out.println("La raiz cuadrada de " + x + " es " + rx);
        System.out.println("La raiz cuadrada de " + y + " es " + ry);
    }

    public void setFcuad(int a, int b, int c) {
        rx = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        ry = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("Para: "+a+"x^2 + "+b+"x + "+c+" = 0");
        System.out.println("\t X1 = " + rx);
        System.out.println("\t X2 = " + ry);
    }

    public void setRes(int x, int y) {
        num1 = x;
        num2 = y;
        if (num1 < num2) {
            tmp = num2 - num1;
            System.out.println(num2 + "-" + num1 + "=" + tmp);
        } else {
            tmp = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + tmp);
        }
    }

    public void setMul(int x, int y) {
        tmp = x * y;
        System.out.println(x + "*" + y + "=" + tmp);
    }

    public void setDiv(int x, int y) {
        num1 = x;
        num2 = y;
        if (num1 < num2) {
            rx = num2 / num1;
            System.out.println(num2 + "/" + num1 + "=" + rx);
        } else {
            rx = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + rx);
        }
    }

    public void setAnd(boolean a, boolean b) {
        System.out.println(a + " && " + b + " = " + (a && b));
    }

    public void setOr(boolean a, boolean b) {
        System.out.println(a + " || " + b + " = " + (a || b));
    }

    public void setNot(boolean a, boolean b) {
        System.out.println("La negacion de " + a + " es: " + !a);
        System.out.println("La negacion de " + b + " es: " + !b);
    }
}
