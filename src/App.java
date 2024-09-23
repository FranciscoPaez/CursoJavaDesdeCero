import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        


        //Variables
        //Tipos de variables...
        //Primitivas: Almacenan valores bàsicos
        //Referencia: Almacenan direeciones de memoria que apuntan a objetos
        int numero = 5;
        double decimales = 5.123324523;
        char letra = 'F';
        boolean v = true;
        boolean f = false;
        String cadena = "Cadena de texto";


        

        System.out.println(numero);
        System.out.println(decimales);
        System.out.println(letra);
        System.out.println(v);
        System.out.println(f);
        System.out.println(cadena);

        //Trabajamos con strings
        String texto = "Este es un texto asignado a una variable String";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud);

        char caracter = texto.charAt(3);
        System.out.println(caracter);

        String subString = texto.substring(5, 25);
        System.out.println(subString);

        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        int indice = texto.indexOf("variable");
        System.out.println(indice);

        String reemplazar = texto.replace("texto", "parrafo");
        System.out.println(reemplazar);

        boolean contiene = texto.contains("texto");
        System.out.println(contiene);



        //Operadores
        //Aritmeticos:

        double a = 7;
        double b = 3;
        double c =  a + b;
        double d =  a - b;
        double e =  a / b;
        double g =  a * b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);

        int y = 12;
        int z = y % 2;

        System.out.println(z); //Si el resto da 0 es par y si da 1 es impar


        //Asignacion
        int l = 8;
        l=9; //Queda el ultimo valor asignado
        l+=10; //Le sumo al ultimo valor asignado
        l-=2; //Le resto al ultimo valor asignado
        l++; //Incrementar 
        l--; //Decrementar

        System.out.println(l);

        //Comparacion

        int t = 3;
        int m = 4;

        boolean esMayor = t > m;
        boolean esMenor = t < m;
        boolean esIgual = t == m;
        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esIgual);

        //Logica

        boolean condicionUno = true;
        boolean condicionDos = false;

        boolean resultadoAND = condicionUno && condicionDos; //Ambos deben ser positivos para que de true
        boolean resultadoOr = condicionUno || condicionDos; //Uno de los dos debe ser positivo
        boolean resultadoNOT = !condicionUno; //Lo opuesto a lo que tenga asignado previamente

       System.out.println(resultadoAND);
       System.out.println(resultadoOr);
       System.out.println(resultadoNOT);   


       //Condicionales 

       int edad = 18;

       if (edad > 18) {
            System.out.println("Puedes entrar a la disco");
       }
       else if (edad == 18) {
            System.out.println("Tienes la edad justa para ingresar");
       } 
       else {
            System.out.println("No tienes edad suficiente para entar a la disco");
       }
       


        //Calse Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora de perfumes");
        System.out.println("1 - Dior");
        System.out.println("2 - Bvlgari ");
        System.out.println("3 - YSL");
 
        int opcion = scanner.nextInt();

       //Switch
       

       switch (opcion) {
        case 1:
        System.out.println("Buena elecion");
            break;
        case 2:
        System.out.println("Gran elecion");
            break;
        case 3:
        System.out.println("Lo recomiendo");
            break;
        default:
        System.out.println("No elegiste ningun perfume");
            break;
       }

       if (opcion < 4) {
          System.out.println("Disfruta tu perfume");
       }

       scanner.close();


       //Bucle For(inicializacio, condicion, actualizacion)
       
       //for ( int i = 1; i <= 3; i++){
            //for (int j= 1; j <= 3; j++){
            //System.out.println(" i:");
            // System.out.println(i);
       //   }
       //}

     //While

    int contadorWhile = 1;

     while (contadorWhile <= 5) {
        System.out.println(contadorWhile);
        contadorWhile++;
     }

     System.out.println(contadorWhile); //Agrega uno a ciclo pero no sigue el bucle porque no cumple con la condicion inicial

     //Do While

     int contadorDo = 1;

     do{
          
        System.out.println("Esto sucede antes de la condicion");
        System.out.println(contadorDo);

        contadorDo++;

     } while (contadorDo <=3);

        System.out.println(contadorDo);
     
    //Break, continue, return

    int i;

    for ( i = 1; i <= 10; i++) {

        System.out.println(i);
        if (i == 5) {
            break;
        }
        System.out.println(i);
    }

    //Arreglos matrices vectores

    int[] numerosArray = new int[5]; 
    numerosArray[0] = 10;
    numerosArray[1] = 20;
    numerosArray[3] = 30;
    numerosArray[4] = 40;

    System.out.println(numerosArray[0]);
    System.out.println(numerosArray[1]);
    System.out.println(numerosArray[2]);//Como no esta definido el array 2 entoces le asigna el valor 0
    System.out.println(numerosArray[3]);
    System.out.println(numerosArray[4]);
   
    for (int index = 0; index < numerosArray.length; index++) {
        System.out.println(numerosArray[index]);
    }
    //Hacemos lo mismo con for each
    for (int numeroArray : numerosArray) {
        System.out.println(numeroArray);
    }

      
    }
}

//Comentarios de una sola linea

/*
 * Comentarios
 *          de
 *             varias lienas
*/


