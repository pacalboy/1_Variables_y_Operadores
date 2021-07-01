/* 
* Comentario multilinea
* Comentario multilinea
*/
public class HolaMundo {

    public static void main(String[] args) {
        short añoActual;
        añoActual = 2020;
        
        System.out.println("Hello World");
        System.out.println("Feliz año " + añoActual + "\n");
        //System.out.println();
        byte miByte;
        miByte = (byte) 120;
        short miShort;
        miShort = 30000;
        int miInt;
        miInt = 123456789;
        long miLong;
        miLong = 782222568205489l;
       
        System.out.println("Este es un byte "+ miByte);
        System.out.println("Este es un short "+ miShort);
        System.out.println("Este es un int "+ miInt);
        System.out.println("Este es un long "+ miLong);
        
        System.out.println("----------------------------------------------------");
        
        //Usando un solo System.out.println() mostrar un mensaje en tres lineas
        String mensaje = ("Hola \n¿Cómo estás? \n¿Todo bien?\n");
        
        System.out.println (mensaje);
        
        //Cambiar todo el mensaje a mayúsculas y mostrarlo
        System.out.println(mensaje.toUpperCase());
        
        //Añadir una despedida al mensaje
        String despedida = ("Espero verte pronto");
        
        String mensajeCompleto = mensaje.concat(despedida);
        
        System.out.println(mensajeCompleto);
        
        //Obtener la última letra del mensaje y añadirla 5 veces al final
        int longitud = mensajeCompleto.length();
        
        char letra = mensajeCompleto.charAt(longitud-1);
        
        System.out.println(mensajeCompleto + letra + letra + letra + letra + letra);
        
        //Dividir una palabra en dos
        String palabra = "Hola";
      
        System.out.println(palabra.substring(0 , 2));
        
        System.out.println(palabra.substring(2));
        
        //Otra forma
        String larga = "murciélago";
        
        int indice = larga.length()/2;
        
        String corte1 = larga.substring(0, indice);
        String corte2 = larga.substring(indice);
        
        System.out.println(corte1 +"\n"+ corte2);
        
        //Otra forma con split
        String otraForma = "adios";
        int indiceM = otraForma.length()/2;
        char letraM = otraForma.charAt(indiceM);
                
        String[] otraPalabra = otraForma.split(Character.toString(letraM));
        String corte1b = otraPalabra[0] + letraM;
        String corte2b = otraPalabra [1];
        
        System.out.println(corte1b + '\n' + corte2b);
    }
    
}