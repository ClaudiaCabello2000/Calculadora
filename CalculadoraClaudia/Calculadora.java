package proyecto1;

import CalculadoraTest;
import Botones;

public class Calculadora{

    private DoubleMath integerMath;

    //Creamos los métodos:
    //Suma
    public double suma (double num1, double num2){

        integerMath= (p1,p2) -> p1+p2;
        return integerMath.operacion (num1, num2);

        }   

    //Resta
    public double resta (num1, num2){

        integerMath= (p1,p2) -> p1-p2;
        return integerMath.operacion (num1, num2);

    }

    //Multiplicacion
    public double multiplicacion (num1, num2){

        integerMath= (p1,p2) -> p1*p2;
        return integerMath.operacion (num1, num2);

    }

    //Divison
    public double division (num1, num2){

        if (num2==0){
            throw new ArithmeticException ("Divisible por 0");
        }
        integerMath=(p1,p2) -> p1/p2;
        return integerMath.operation (num1,num2);

    }




}