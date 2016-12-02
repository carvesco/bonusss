
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
public class Brazos extends Thread{
    private Turtle turtle;

    public Brazos(Turtle turtle) {
        this.turtle = turtle;
    }
    
    
    public void run(){
        turtle.speed(1000);
        turtle.setPos(-50, 100);
        turtle.left(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.forward(5);
        turtle.left(90);
        turtle.forward(10);
        turtle.right(90);
        turtle.setPos(-60, 97.5);
        segment(turtle);
        turtle.setPos(-75, 87.5);
        turtle.left(90);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(7);
        turtle.right(90);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(7);
        turtle.setPos(-80, 80.5);
        turtle.right(90);
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(70);
        turtle.right(90);
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(70);
        turtle.setPos(-73, 10.5);
        turtle.right(90);
        turtle.forward(6);
        turtle.right(90);
        turtle.forward(5);
        turtle.right(90);
        turtle.forward(6);
        turtle.right(90);
        turtle.forward(5);
        turtle.setPos(-70,5.5);
        turtle.right(90);
        segment2(turtle);
        turtle.setPos(-65, 2.5);
        dedo(turtle);
        turtle.setPos(-80, 2.5);
        turtle.right(90);
        dedo(turtle);
        turtle.setPos(0, 0);
        turtle.setPos(-65, 97.5);
        turtle.right(180);
        segment2(turtle);
        
        turtle.left(180);
        
        turtle.setPos(50, 100);
        turtle.right(90);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(5);
        turtle.right(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.setPos(80, 97.5);
        segment(turtle);
        turtle.setPos(75, 87.5);
        turtle.right(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.forward(7);
        turtle.left(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.forward(7);
        turtle.setPos(80, 80.5);
        turtle.left(90);
        turtle.forward(20);
        turtle.left(90);
        turtle.forward(70);
        turtle.left(90);
        turtle.forward(20);
        turtle.left(90);
        turtle.forward(70);
        turtle.setPos(73, 10.5);
        turtle.left(90);
        turtle.forward(6);
        turtle.left(90);
        turtle.forward(5);
        turtle.left(90);
        turtle.forward(6);
        turtle.left(90);
        turtle.forward(5);
        turtle.setPos(70,-5.5);
        turtle.left(90);
        segment2(turtle);
        turtle.setPos(65, 2.5);
        dedo2(turtle);
        turtle.setPos(80, 2.5);
        turtle.left(90);
        dedo2(turtle);
        turtle.setPos(75, 97.5);
        turtle.left(180);
        segment2(turtle);
        turtle.setPos(-200, -200);
    }
    
    private void segment(Turtle t)
 {
     for (int i = 0;i<360;i++){
            t.forward(10*0.0174);
            t.right(1);
     }
 }
      private void segment2(Turtle t)
 {
     for (int i = 0;i<360;i++){
            t.forward(5*0.0174);
            t.right(1);
     }
 }
      private void dedo(Turtle t){
          turtle.forward(5);
        turtle.right(90);
        turtle.forward(10);
        turtle.right(90);
        turtle.forward(5);
        turtle.right(90);
        turtle.forward(10);
      }
      private void dedo2(Turtle t){
          turtle.forward(5);
        turtle.left(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.forward(5);
        turtle.left(90);
        turtle.forward(10);
      }
}
