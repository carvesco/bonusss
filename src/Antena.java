
import ch.aplu.turtle.Turtle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gfd
 */
public class Antena extends Thread{
    private Turtle turtle;

    public Antena(Turtle turtle) {
        this.turtle = turtle;
    }
    
    public void run(){
        turtle.setPos(-5, 170);
        segment(turtle);
        turtle.setPos(-2, 165);
        turtle.right(90);
        turtle.forward(4);
        turtle.right(90);
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(4);
        turtle.right(90);
        turtle.forward(20);
        turtle.setPos(-200, -200);
        
        
    }
    
    
    private void segment(Turtle t)
 {
     for (int i = 0;i<360;i++){
            t.forward(5*0.0174);
            t.right(1);
     }
 }
    
    
    
}
