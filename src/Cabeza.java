/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ch.aplu.turtle.*;
/**
 *
 * @author gfd
 */
public class Cabeza extends Thread{
    private Turtle turtle;
    
    Cabeza(Turtle turtle){
        this.turtle=turtle;
    }
    
    public void run(){
        turtle.speed(500);
        turtle.penUp();
        turtle.setPos(0,165);
        turtle.right(180);
        turtle.forward(20);
        turtle.penDown();
        turtle.left(90);
        turtle.forward(40);
        turtle.right(90);
        turtle.forward(30);
        turtle.right(90);
        turtle.forward(80);
        turtle.right(90);
        turtle.forward(30);
        turtle.right(90);
        turtle.forward(40);
        turtle.setPos(-20, 140);
        segment(turtle);
        turtle.setPos(20, 140);
        segment(turtle);
        turtle.setPos(-20, 125);
        turtle.forward(40);
        turtle.right(90);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(40);
        turtle.right(90);
        turtle.forward(10);
        turtle.setPos(30, 115);
        turtle.right(180);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(60);
        turtle.right(90);
        turtle.forward(10);
        turtle.setPos(-200, -200);
    }
    private void segment(Turtle t){
        for (int i = 0;i<360;i++){
            t.forward(5*0.0174);
            t.right(1);
        }
    }
    
    
}
