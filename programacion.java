import java.util.Scanner; //importa la clase Scanner para poder leer datos desde el teclado
// text = sc.nextLine(); //lee una linea de texto desde el teclado y le asigna el valor a la variable text
class programacion
{
public static void main (String[] args)
    {        
    //para compilar el programa se debe ejecutar el siguiente comando en la terminal: javac --release 8 programacion.java
    //despues de compilar el programa se debe ejecutar el siguiente comando en la terminal: java programacion
    //--release 8 es para que el programa sea compatible con versiones anteriores de Java

    Scanner sc = new Scanner(System.in); //crea un objeto de la clase Scanner para poder leer datos desde el teclado
    //para utilizar el Scanner se utiliza el comando sc.nextLine() para leer una linea de texto desde el
    // teclado y le asigna el valor a la variable que se quiera utilizar
    sc.close(); //cierra el objeto Scanner para liberar recursos
        
    //ejemplo de uso del Scanner
        //String nuevavar;
        //nuevavar = sc.nextLine();

    //variables
        int num1 = 5; //variable de tipo entero
        double num2 = 3.14; //variable de tipo decimal/real
        boolean bool1 = true; //variable de tipo booleano (true o false)
        char char1 = 'A'; //variable de tipo caracter

    //strings

        String str1 =" Hola Mundo "; //variable de tipo texto
        String str2 = new String("que tal?");
        String str3 = new String(str1); //toma el valor del str1

        System.out.println("str1: " + str1); //para mostrar en pantalla el texto
        System.out.println("concatenacion: " + str3.concat(str2));

        //comparacion de strings
        String st1 = "Hola";
        String st2 = "hola";
        String st3 = "Adios";

        System.out.println("Comparacion: " + st1.compareTo(st2)); //compara las palabras apoyandose en el valor de la tabla ASCII
        System.out.println("Comparacion: " + st1.compareTo(st3)); //busca en orden la primera letra que sea diferente y la compara con el valor de la tabla ASCII
        System.out.println("Comparacion: " + st2.compareToIgnoreCase(st2)); //ignora mayusculas y minusculas
        
        System.out.println("Trim: " + str1.trim()); //elimina los espacios en blanco al inicio y al final de la cadena
        System.out.println("Longitud: " + str1.length()); //muestra la cantidad de caracteres que tiene la cadena
        
        //MAYUSCULAS y minusculas
        System.out.println("Minusculas: " + str1.toLowerCase()); //convierte la cadena a minusculas
        System.out.println("Mayusculas: " + str1.toUpperCase()); //convierte la cadena a mayusculas

    //Math
        System.out.println("PI: " + Math.PI); //constante de pi
        System.out.println("Valor absoluto: " + Math.abs(-5)); //valor absoluto
        System.out.println("Potencia: " + Math.pow(2,3)); //potencia
        System.out.println("Raiz cuadrada: " + Math.sqrt(9)); //raiz cuadrada

    //Fechas y horas
        System.out.println("hora: " + java.time.LocalTime.now()); //hora actual
        System.out.println("fecha: " + java.time.LocalDate.now()); //fecha actual
    }
}