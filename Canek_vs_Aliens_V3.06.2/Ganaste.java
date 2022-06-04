import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla que nos indica que ganaste el juego.
 * 
 * @author Antonio
 * @version 31/05/2022
 */
public class Ganaste extends World
{
    /**
     * Imagen que te dice que ganste
     */
    private Win win = new Win();
    /**
     * Crea un objeto Win, lo muestra en pantalla y termina el juego.
     * 
     */
    public Ganaste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObject(win, ((getWidth()/2)), (getHeight()/2)+80);
        Greenfoot.stop();
    }
}
