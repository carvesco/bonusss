
import ch.aplu.turtle.*;
import com.sun.javafx.font.FontConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gfd
 */
public class Cuerpo extends Thread{
    private Turtle turtle;


    Cuerpo(Turtle turtle){
        this.turtle=turtle;
    }
    public void run(){
        turtle.speed(1000);
        turtle.right(90);
        turtle.setPos(-50, 105);
        turtle.forward(100);
        turtle.right(90);
        turtle.forward(150);
        turtle.right(90);
        turtle.forward(100);
        turtle.right(90);
        turtle.forward(150);
        turtle.setPos(-40, 85);
        turtle.right(90);
        turtle.forward(80);
        turtle.right(90);
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(80);
        turtle.right(90);
        turtle.forward(20);
        turtle.setPos(-30, 73);
        turtle.right(30);
        triangle(turtle);
        turtle.setPos(-10,73);
        turtle.right(120);
        triangle(turtle);
        turtle.setPos(10, 73);
        turtle.right(120);
        triangle(turtle);
        turtle.setPos(30,73);
        turtle.right(120);
        triangle(turtle);
        turtle.right(90);
        turtle.setPos(-20, -20);
        segment(turtle);
        turtle.setPos(0, -20);
        segment(turtle);
        turtle.setPos(20, -20);
        segment(turtle);
        turtle.setPos(-200, -200);
    }
    private void segment(Turtle t)
 {
     for (int i = 0;i<360;i++){
            t.forward(3*0.0174);
            t.right(1);
     }
 }
    private void triangle(Turtle t){
        
        turtle.forward(7);
        turtle.right(120);
        turtle.forward(7);
        turtle.right(120);
        turtle.forward(7);
    }
    

}