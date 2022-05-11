import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    Suelo ground = new Suelo();
    private final int GRAVITY = 1;
    private int velocity;
    
    public Player() {
        velocity = 0;
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("RIGHT")) 
        {
            setLocation​(getX()+1, getY());
            setRotation (getRotation() + 5);
        };
        
        if (Greenfoot.isKeyDown("LEFT")) 
        {
            setLocation​(getX()-1, getY());
            setRotation (getRotation() - 5);
        };
        /* SALTO */ 
        fall();
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 90)jump();
        
        /*Disparo*/
        
        if ("a".equals(Greenfoot.getKey())){
            fire();
        }
    }
    
    public void fall(){
        setLocation(getX(), getY() + velocity);      
        if(getY() > getWorld().getHeight() - 90) velocity = 0;
        else velocity += GRAVITY;
    }
    
    public void jump(){
        velocity = -20;
    }
    
    public void fire(){
        Disparo disp = new Disparo();
        getWorld().addObject(disp, getX(), getY());
        disp.setRotation(getRotation());
        disp.move(40.0);
    }

    }
    

