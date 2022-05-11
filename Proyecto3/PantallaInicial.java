import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaInicial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaInicial extends World
{

    /**
     * Constructor for objects of class PantallaInicial.
     * 
     */
    public PantallaInicial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Presiona ESPACIO para continuar", 300, 300);
        addObject(new LogoPrincipal(), 400, 150);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("SPACE")) {Greenfoot.setWorld(new Menu());};
        
    }
}
