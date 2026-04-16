package Demo20260402;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static boolean isGet = false;
    public static void main(String[] args) throws InterruptedException{
        JFrame jf = new JFrame();
        jf.addKeyListener(new MyListener());
        jf.setVisible(true);
        System.out.println(3);
        Thread.sleep(1000);
        System.out.println(2);
        Thread.sleep(1000);
        System.out.println(1);
        Thread.sleep(1000);
        System.out.println("go");
        while(!isGet){

        }
    }
}



class MyListener implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e) {
        if((e.getKeyCode() == KeyEvent.VK_Q) && !Main.isGet){
            synchronized (new Object()){
                Main.isGet = true;
                System.out.println("q");
            }
        }

        if((e.getKeyCode() == KeyEvent.VK_W) && !Main.isGet){
            synchronized (new Object()){
                Main.isGet = true;
                System.out.println("w");
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void get(){

    }
}
