import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        /* 
        * 1. Declarar dos variables y mostrar el resultado 
        * de suma, resta, multiplicación, división
        * y el resto de la división
        */
        int a = 17;
        int b = 3;
        
        System.out.println("La suma de los numeros es "+ (a+b));
        System.out.println("La resta de los numeros es "+ (a-b));
        System.out.println("La multiplicacion de los numeros es "+ a*b);
        System.out.println("La division de los numeros es "+ a/b);
        System.out.println("El resto de la división es " + a%b);
        System.out.println(" ");
                
        
        /* 
        * 2. Declarar varios enteros y 
        * mostrar el valor de la media
        */ 
        int num1 = 2;
        int num2 = 7;
        int num3 = 8;
        int num4 = 1;
        
        System.out.println("EL valor de la media es " + (num1 + num2 + num3 + num4)/4);
        System.out.println(" ");
        
        /* 
        * 3. Calcular el porcentaje a pagar un cliente al comprar
        * una moto de 5000€ a plazos con un interés mensual progresivo
        * del 5% si tarda 6 meses
        */        
        int precio = 5000;
        int meses = 5;
        int mensualidad = precio/meses;
        float interes =  0.05F;
        
        float intMes1 = mensualidad * interes *1;
        float intMes2 = mensualidad * interes *2;
        float intMes3 = mensualidad * interes *3;
        float intMes4 = mensualidad * interes *4;
        float intMes5 = mensualidad * interes *5;
        
        float intTotal = (float) intMes1 + intMes2 + intMes3 + intMes4 + intMes5;      
        float porcentaje = (float) (intTotal*100)/5000;
        
        
        System.out.println("El precio de la moto se incrementa en " + intTotal + " €");
        System.out.println("El precio final de la moto es de " + (intTotal + precio) + " €");
        System.out.println("El porcentaje total que paga de más es " + porcentaje + " %");
        System.out.println(" ");
        
        // 4. Imprimir el valor numerico de un caracter = 'b'        
        char caracter = 'b';
        int ascii = (int) caracter;
        System.out.println("El valor numérico del caracter 'b' es " + ascii);
        System.out.println(" ");
        
        /* 
        * 5.Declarar un int y un double y mostrar el resultado
        * de la suma y de la resta de las variables
        */        
        int x = 47894;
        double y = (double) 124466732.13789003498;
        
        double resSuma = (double) (x+y);
        double resResta = (double) (x-y);
        
        System.out.println("El entero es " + x);
        System.out.println("El double es " + y);
        System.out.println("El resultado de la suma es " + resSuma);
        System.out.println("El resultado de la resta es " + resResta);
        System.out.println(" ");
        
        
        /* 
        * 6. Buscar como pedir al usuario 
        * que introduzca dos números
        * y mostrar el resultado de su multiplicación
        */
        
        /* 
        * Para el ejercicio hay que poner "import java.util.Scanner;"
        * a continuacion del package (pero no dentro)
        */
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        int numero2 = sc.nextInt();
        
        System.out.println("El resultado de multiplicar ambos números es " + (numero1*numero2));
    }
    
}