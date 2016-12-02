/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import ch.aplu.turtle.*;
/**
 *
 * @author gfd
 */
public class Main extends TurtleFrame{

    public void simular(){
        Turtle hilo1 = new Turtle(this);
        Turtle hilo2 = new Turtle(this, Color.red);
        Turtle hilo3 = new Turtle(this, Color.green);
        Turtle hilo4 = new Turtle(this, Color.yellow);
        Turtle hilo5 = new Turtle(this, Color.BLACK);
                
        hilo1.setPos(-5, 170);
        hilo5.setPos(-5, 170);
        hilo1.setPenColor(Color.red);
        hilo2.setPenColor(Color.BLUE);
        hilo3.setPenColor(Color.GREEN);
        hilo4.setPenColor(Color.ORANGE);
        hilo5.setPenColor(Color.cyan);
        
        
        new Cabeza(hilo1).start();
        new Cuerpo(hilo2).start();
        new Pierna(hilo3).start();
        new Brazos(hilo4).start();
        new Antena(hilo5).start();
        
        
        
    }
    public static void main(String[] args) {
        Main tablero = new Main();
        tablero.simular();
    }
    
}
