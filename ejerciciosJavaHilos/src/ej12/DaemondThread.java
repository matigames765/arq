package ej12;

public class DaemondThread implements Runnable{

    public void run(){
        System.out.println("Comienza run()");
        try{
            while (true){
                try{Thread.sleep(500);
                }catch (InterruptedException e){};
                System.out.println("run() ha despertado");
            }
        }finally {
            System.out.println("Termina run()");
        }     }
}
