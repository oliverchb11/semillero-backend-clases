import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Oliver Fernando Charry Benavides");
        int number = 3;
        System.out.println("Numero: " + number);
        //primitivos
        //.1 tipos de datos numericos enteros
        //byte -> 8 bits -> rango 128 a 127
        byte byteNumer = 127; 
        //short guarda 32 bits -> rango -32468 a +32467
        short shortNumer = 356;
        //int -> 64 bits -> rango
        int intNumer = 5714321;
        //long
        long longNumer = 145263321489621L;

        //2. tipos de datos numericos flotantes
        //float -> 32 bits
        float floatNumber = 2.3F;

        double doubleNumber = 45.6;

        //3. tipo chart tipos de datos caracteres que es unicode
        char charCaracter = 'a';
        //4. boolean true o false
        boolean isHidden = true;

        //5 String son inmutables
        String text = "aaaa dsds asas fdfd sds";

        //OPERADORES
        //arigmeticos
        float a = 5.6F;
        double b = 10;
        double suma = a + b;
        int ar = 5;
        int br = 10;
        int resta = ar - br;
        int am = 5;
        int bm = 10;
        int multiplicacion = am * bm;
        int ad = 5;
        int bd = 10;
        int division = ad / bd;
        // int modulo = a%b;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        // System.out.println("El modulo es: " + modulo);
        //asignacion
        // = , +=, -=, /=, %=
        int numero;
        numero = 58;
        System.out.println(numero);
        numero += 5;
        System.out.println(numero);
        numero -= 5;
        System.out.println(numero);
        numero /= 5;
        System.out.println(numero);
        numero *= 5;
        System.out.println(numero);
        numero %= 5;
        System.out.println(numero);
        //operacion de comparacion
        // == != < > >= <=
        int number1 = 5;
        int number2 = 10;
        boolean esDiferente = number != number2;
        System.out.println(esDiferente);
        //logicos
        //  AND
        boolean esMayor = false;
        boolean esEstudiante = true;
        boolean puedeIngresar = esEstudiante && esMayor;
        System.out.println(puedeIngresar);
        // OR
        boolean puedeVotar = esEstudiante || esMayor;
        System.out.println(puedeVotar);
        //NOT
    }
}
