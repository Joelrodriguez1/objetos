import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla que nos indica que el juego acabo.
 * 
 * @author Antonio 
 * @version 31/05/22
 */
public class FinDelJuego extends World
{
    /**
     * imagen de game over
     */
    private GameOver go = new GameOver();
    /**
     * Genera un objeto GameOver, lo muestra en pantalla
     * y termina el juego.
     */
    public FinDelJuego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(go, ((getWidth()/2)), (getHeight()/2));
        Greenfoot.stop();
    }
}
