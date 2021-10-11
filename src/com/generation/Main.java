package com.generation;

public class Main {

    public static void main(String[] args) {

        //letras
        String nombre = "Paulina Avila";

        //numeros
        byte num1 = 10;
        short numShort1 = num1;
        int nunInt = numShort1;

        short num2 =10;
        int num3 = 10;

        //puede que se pierdan los datos ya que es más grande
        short numInt = numShort1;
        short numShort2 = (short) numInt;
        long num4 = 10;

        // para números decimales agregras f o d al final
        //f float
        float decimal1 = 10.00009f;

        //d para double
        double decimal2 = 20.999990909090d;

        //char valor entre comillas simples
        char caracter = 'f';

        boolean verdadero = true;

        byte numByte1 = 120;
        byte numByte2 = 120;

        //resultado de una suma, se tiene que convertir
        //se declara el valor al que se convierte y se agrupan
        //las variables que queremos sumar
        short suma = (short) (numByte1 + numByte2);

        //System.out.println(nombre);
        //System.out.println(numInt);
        //System.out.println(numShort2);
        //System.out.println(suma);
        int numero1 = 500;
        int numero2 = 150;
        float numero3 = 150;

        int suma1 = numero1 + numero2;
        int resta1 = numero1 - numero2;
        float div1 =  numero1 / numero3;
        int mult1 = numero1 * numero2;

        System.out.println(suma1);
        System.out.println(resta1);
        System.out.println(div1);
        System.out.println(mult1);

    }
}
