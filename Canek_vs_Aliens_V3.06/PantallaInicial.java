import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla inicial que "saluda" al jugador
 * 
 * @author Antonio
 * @version 11/05/2022
 */
public class PantallaInicial extends World
{   
    /**
     * Musica
     */
     protected GreenfootSound backgroundMusic = new GreenfootSound("pantallainicio.mp3");
     /**
      * entero que guarda la x
      */
     private int x = getWidth();
     /**
      * entero que guarda la y
      */
     private int y = getHeight();
    /**
     * Crea un fondo nuevo, le añade el logo, y el texto para continuar. 
     * Reproduce la musica de fondo
     */
    public PantallaInicial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new LogoPrincipal(), x/2, y/2);
    }
    /**
     * Cuando Presionas la tecla espacio nos lleva al menu principal.
     */
    public void act(){
        backgroundMusic.play();
        if (Greenfoot.isKeyDown("SPACE")) {
            Greenfoot.setWorld(new Menu());
            backgroundMusic.stop();
        }
        
    }
}
