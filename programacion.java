//orientado a objetos
import java.util.Scanner; //importa la clase Scanner para poder leer datos desde el teclado

public class programacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //crea un objeto de la clase Scanner para poder leer datos desde el teclado
        // String text = sc.nextLine(); //lee una línea de texto desde el teclado y le asigna el valor a la variable text
        sc.close();

        //strings
        String str1 = " Hola Mundo "; //variable de tipo texto
        String str2 = new String("qué tal?");
        String str3 = new String(str1); //toma el valor del str1

        System.out.println("str1: " + str1); //para mostrar en pantalla el texto
        System.out.println(str1.concat(str2));
        System.out.println("concatenación: " + str1.concat(str2));

        //comparacion de strings
        String st1 = "Hola";
        String st2 = "hola";
        String st3 = "Adios";

        System.out.println("Comparación: " + st1.compareTo(st2)); //compara las palabras apoyándose en el valor de la tabla ASCII
        System.out.println("Comparación: " + st1.compareTo(st3)); //busca en orden la primera letra que sea diferente y la compara con el valor de la tabla ASCII
        System.out.println("Comparación: " + st2.compareToIgnoreCase(st2)); //ignora mayúsculas y minúsculas

        System.out.println("Trim: " + str1.trim()); //elimina los espacios en blanco al inicio y al final de la cadena
        System.out.println("Longitud: " + str1.length()); //muestra la cantidad de caracteres que tiene la cadena

        //MAYUSCULAS y minusculas
        System.out.println("Minúsculas: " + str1.toLowerCase()); //convierte la cadena a minúsculas
        System.out.println("Mayúsculas: " + str1.toUpperCase()); //convierte la cadena a mayúsculas

        //Math
        System.out.println("PI: " + Math.PI); //constante de pi
        System.out.println("Valor absoluto: " + Math.abs(-5)); //valor absoluto
        System.out.println("Potencia: " + Math.pow(2, 3)); //potencia
        System.out.println("Raíz cuadrada: " + Math.sqrt(9)); //raíz cuadrada

        //Fechas y horas
        System.out.println("hora: " + java.time.LocalTime.now()); //hora actual
        System.out.println("fecha: " + java.time.LocalDate.now()); //fecha actual

        //especiales
        // \n // significa salto de línea
        // \t // significa tabulación

        //ejemplo:
        System.out.println("Hola \n Mundo"); //muestra Hola y Mundo en dos líneas
        //ejemplo:
        System.out.println("Hola \t Mundo"); //muestra Hola y Mundo con una tabulación entre ellos

        //bits de cada tipo de dato
        byte b = 1; //8 bits
        short sh = 2; //16 bits
        int i = 4; //32 bits
        long l = 8L; //64 bits

        //reserva de bytes de memoria para cada tipo de dato
        var num=(short)2; //reserva de memoria para un short
        var num2=4L; //reserva de memoria para un long

        System.out.println("byte: " + b + " | short: " + sh + " | int: " + i + " | long: " + l);

        //tipos de variables
        int entero = 10; //variable de tipo entero
        double decimal = 10.5; //variable de tipo decimal
        char caracter = 'A'; //variable de tipo carácter
        boolean logico = true; //variable de tipo lógico
        float flotante = 10.5f; //variable de tipo flotante
        //float es un tipo de dato que ocupa menos memoria que double, pero tiene menos precisión

        char ca=97; //variable de tipo carácter que almacena el valor 97, que corresponde a la letra 'a' en la tabla ASCII
        char cb=0x0061; //variable de tipo carácter que almacena el valor 0x0061, que corresponde a la letra 'a' en la tabla ASCII en hexadecimal
        char cc='\u0061'; //variable de tipo carácter que almacena el valor '\u0061', que corresponde a la letra 'a' en la tabla ASCII en Unicode
        char cd='\141'; //variable de tipo carácter que almacena el valor '141', que corresponde a la letra 'a' en la tabla ASCII en octal
        //unicode es un estándar de codificación de caracteres que permite representar caracteres de diferentes idiomas y símbolos.
    }
}