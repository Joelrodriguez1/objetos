import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NivelUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NivelUno extends World
{

    /**
     * Constructor for objects of class NivelUno.
     * 
     */
    public NivelUno()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Suelo(), 400, getHeight()-20);
        addObject(new Player(), 400, 500);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("ESC")){
            Greenfoot.setWorld(new NivelUno());
        }
        
    }
}
