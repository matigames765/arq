package ej10;

public class PendingInterrupt {
    public static void main(String[] args) {
        if (args.length>0){ Thread.currentThread().interrupt();}
        long tiempoInicial=System.currentTimeMillis();
        try{
            Thread.sleep(2000);
            System.out.println("No es interrumpida");
        }catch (InterruptedException e){
            System.out.println("Es interrumpida");
        }
        System.out.println("Tiempo gastado: "+
                (System.currentTimeMillis()-tiempoInicial));
    }

}
