package proyecto1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;

import Calculadora;

public class CalculadoraTest{

private Calculadora calculadora2;
private double num1;
private double num2;
private  double resultado;

@Before

public void initTest (){

    calculadora2= new Calculadora ();
    num1=10;
    num2=0;

}

@After

public void afterTest(){

    calculadora2=null;
    
}

@Test 

public void testSuma (){

    resultado=calculadora2.suma (num1, num2);
    assertEquals (new double (num1), new double (resultado));

}

@Test 

public void testResta (){

    resultado=calculadora2.resta (num1, num2);
    assertEquals (new double (num1), new double (resultado));

}

@Test

public void testMultiplicacion (){

    resultado=calculadora2.multiplicacion (num1, num2);
    assertEquals (new double (num2), new double (resultado));


}

@Test (expected=ArithmeticException.class)
public void testDivision (){

    calculator.division (8,0);

}

}