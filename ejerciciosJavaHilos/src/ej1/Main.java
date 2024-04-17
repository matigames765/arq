package ej1;

/*
Creacion de un thread por herencia
 */
public class Main {
    public static void main(String[] args) {
        PingPong t1 =new PingPong("PING",33);
        PingPong t2= new PingPong("PONG",10);
// Activación
        t1.start();
        t2.start();
// Espera 2 segundos
        try{ Thread.sleep(5000);
        }catch (InterruptedException e){};
// Finaliza la ejecución de los threads
        t1.interrupt();
        t2.interrupt();
    }
    }
