/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ch.aplu.turtle.*;
import java.awt.Color;
/**
 *
 * @author gfd
 */
public class Pierna extends Thread{
    private Turtle turtle;

    public Pierna(Turtle turtle) {
        this.turtle = turtle;
    }
    
    
    public void run(){
        turtle.setColor(Color.green) ;
        turtle.right(180);
        turtle.setPos(-40,-45);
        turtle.forward(70);
        turtle.right(180);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(20);
        turtle.right(150);
        turtle.forward(50);
        turtle.left(150);
        turtle.forward(45);
        turtle.left(90);
        turtle.forward(85);
        turtle.right(90);
        turtle.forward(40);
        turtle.right(90);
        turtle.forward(85);
        turtle.left(90);
        turtle.forward(45);
        turtle.left(150);
        turtle.forward(50);
        turtle.right(150);
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(10);
        turtle.right(180);
        turtle.forward(70);
        turtle.setPos(-200, -200);
    }
}
