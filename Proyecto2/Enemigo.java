import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo del tipo 1 del juego
 * 
 * @author (your name) 
 * @version 9/5
 */
public class Enemigo extends Actor
{
   Suelo ground = new Suelo();
    private final int GRAVITY = 1;
    private int velocity;
    int posX;
    int posY;
   
    public void act()
    {
        fall();
        
        posX = getX();
        posY = getY();
        
        setLocation(posX+2, posY+2);
     
    }
    
      public void fall(){
        setLocation(getX(), getY() + velocity);      
        if(getY() > getWorld().getHeight() - 90) velocity = 0;
        else velocity += GRAVITY;
    }
}
