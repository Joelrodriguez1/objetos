import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pausa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pausa extends World
{

    /**
     * Constructor for objects of class Pausa.
     * 
     */
    public Pausa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Boton PlayBoton= new Boton("Pausa.png", new Menu());
        addObject(PlayBoton,300,200);
        
    }
    public void act()
    {
     if (Greenfoot.isKeyDown("o"))
        {
            Greenfoot.setWorld(new NivelUno());
        }
        
    }
}
