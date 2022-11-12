package uno;
import java.util.scanner;
class prueba {
    public static void ,public static void main(String[] args) {
        
    }

String numeros [] = {"0","1","2","3","4","7","8","9",};
String pal [] = {"bloqueo","retroseso"};
String baralla [][] = new String[numeros.length][pal.length]; //Array bidimensional.
 
public void crearCartes(){
 
for(int i = 0; i < pal.length ; i++){
for(int j = 0; j < numeros.length; j++){
 
baralla[j][i] = numeros[j];
 
}
}
}

 
public void getCarta(int arg0, int arg1){
 
System.out.println(numeros[arg0] + " de " + pal[arg1]);
 
}
}
//Crear las combinaciones del uno
 
for(int p = 0; p < pal.length; p++){
 
    for(int n = 0; n < numeros.length; n++){

        //Crea las cartas de uno

        cartas.carta[n] = numeros[n]+" "+pal[p];

package jocdecartes;
//Clase de la baraja de uno

public class TBaralla{

TCarta cartas;

}

package jocdecartes;
//Clase de la carta de uno

public class TCarta{

String carta[];

}
//palos
public enum Palos {
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    reversa,
    bloqueo,


 }

//la clase cartas de uno
public class Cartas {


 public int numero;
 public cartas carta;
 public int valor;


 public Cartas(cartas carta, int numero, int valor) {
    this.uno = carta;
    this.numero = numero;
    this.valor = valor;
 }



 public String toString() {
    return numero + " de " + carta;
 }

 public int getValor() {
    return valor;
 }
}



//la clase mazo
public class Mazo {
 public  boolean mano=true;
 private Cartas[] cartas = new Cartas[40];
 public static int cartaActual = 0;
 public Mazo() {
    [] carta = new cartas[4];
    palos = cartas.values();
    int carta = 0;
    for(int cartas = 0; carta < cartas.length; carta ++) {
       for(int valor = 1; valor <= 12; valor ++) {
          if (!(valor==8 || valor==9 )){
          cartas[carta++] = new Cartas(cartas[carta],
                valor,
                getFigura(valor));
       }
    }
    }
    mezclar();

 }

 private int getFigura(int valor) {
    int respuesta = 0;
    switch(valor) {
    case 1: respuesta=1;
    break;
    case 2: respuesta=2;
    break;
    case 3: respuesta=3;
    break;
    case 4: respuesta=4;
    break;
    case 5: respuesta=5;
    break;
    case 6: respuesta=6;
    break;
    case 7: respuesta=7;
    break;
    case 10:
       respuesta = 8;
       break;
    case 11:
       respuesta = 9;
       break;
    case 12:
       respuesta = 10;
       break;
    }
    return respuesta;
 }

 public void mezclar() {
    Random r = new Random();
    for(int i = 0; i < cartas.length; i ++) {
       int pos = r.nextInt(40);
       Cartas aux = cartas;
       cartas = cartas[pos];
       cartas[pos] = aux;
    }
    cartaActual = 0;
 }

 public Cartas getCarta() {
    Cartas c=null;
    if (cartaActual >= cartas.length) {
       System.out.println("No hay mas cartas");
    }else {
       c= cartas[cartaActual ++];

 }

    return c;
}

//El metodo para repartir las cartas a los jugadores de la clase juego

 public void repartirJugadores() {
      // Paso 1. Repartir cartas a jugadores
    for (int i = 0; i < 3; i++) {
       for (Jugador j: jugadores) {
          j.agregarCarta(mazoCarta.getCarta());

       }

    }



 }
}