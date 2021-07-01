
import java.util.Random;
import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        // Ej 1. Introduce un número y que el programa te diga si es par.
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        int a = teclado.nextInt();
        
        if (a%2 == 0){
            System.out.println("El número introducido es par\n");
        }
        else {
            System.out.println("El número introducido es impar\n");
        }
        
        
        /* 
        * Ej 2. Haz un programa que te diga dos números (pueden ser generados de forma aleatoria) 
        * y te pida que introduzcas el resultado de la multiplicación. 
        * Si el resultado es correcto te felicitará.
        */
        Random r = new Random();
        int b = r.nextInt(10)+1;
        int c = r.nextInt(10)+1;
        
        System.out.println("Escribe el resultado de " + b + "*" + c);
        int i = teclado.nextInt();
        
        if (i == b*c){
            System.out.println("Bien, ese es el resultado\n");   
        }else {
            System.out.println("Mal, ese no es el resultado");
            System.out.println("El resultado es " + (b*c) + '\n');
        }
        
        
        /* 
        * Ej 3. Introduce un valor de la tabla ASCII y que el programa responda 
        * si se corresponde con una letra. Si es así que la muestre. 
        */
        System.out.println("Introduzca un valor de la tabla ASCII que corresponda con una letra");
        int ascii = teclado.nextInt();
        
        if ((ascii>64 &&  ascii<91) || (ascii>96 && ascii<123)){
            System.out.println("El código corresponde con la letra " + (char)ascii + '\n');
        }else if ((ascii>=0 && ascii<256)){
            System.out.println("El código introducido no corresponde con una letra");
            System.out.println("Corresponde con el carácter " + (char)ascii + '\n');
        }else{
            System.out.println("El número introducido no pertenece al rango de códigos ASCII");
            System.out.println("Debe estar comprendido entre el 0 y el 255\n");
        }
        
        
        /* 
        * Ej 4. El programa tiene registrada una contraseña. Pide al usuario que introduzca la contraseña. 
        * Si falla, muestra el mensaje usuario no registrado. Cuidado con las mayúsculas. 
        */
        String password = "poniente";
        System.out.println("Introduzca contraseña de usuario");
        String contraseña = teclado.next();
        
        //Si queremos que funcione independientemente de mayúsculas o minúsculas añadimos:
        //contraseña = contraseña.toLowerCase();
        if(!contraseña.equals(password)){
            System.out.println("Usuario no registrado\n");    
        }else{
            System.out.println("Bienvenido\n");
        }
        
        
        // Ej 5.
        System.out.println("Introduzca nombre de usuario");
        String nom = teclado.next();
        System.out.println("Introduzca salario base");
        int salario = teclado.nextInt();
        System.out.println("¿Quiere aplicar suplemento de destino? S / N");
        char letra = teclado.next().toUpperCase().charAt(0);
        
        if(letra=='S'){
            salario += 500;
        }
        System.out.println("Nombre: " + nom + "\tSalario: " + salario );
    }
    
}