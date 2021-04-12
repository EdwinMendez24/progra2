/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        class newThreadClass implements Runnable {

            Thread t;

            newThreadClass() {
                t = new Thread(this, "ThreadHijo");
                System.out.println("Thread creado: " + t);
                t.start();
            }

            public void run() {
                try {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(t + "ciclo :" + i);
                        Thread.sleep(200);
                    }
                } catch (InterruptedException obj) {
                    System.out.println("Thread :" + t + "interrumpido");
                }
            }
        }



            newThreadClass obj = new newThreadClass();
            System.out.println(obj.t + "esta vivo ? : " + obj.t.isAlive());
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Main Thread ciclo:" + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Main thread es interrumpido");
                System.out.println(obj.t + "esta vivo ? : " + obj.t.isAlive());
                System.out.println("Main Thread se esta saliendo");

            }
        }

    }
