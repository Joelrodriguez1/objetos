import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaInicial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaInicial extends World
{
    public GreenfootSound backgroundMusic = new GreenfootSound("pantallainicio.mp3");
    
    public PantallaInicial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Presiona ESPACIO para continuar", 300, 300);
        addObject(new LogoPrincipal(), 300, 200);
        if(backgroundMusic.isPlaying()) { backgroundMusic.stop();} 
    }
    
    public void act(){ 
        backgroundMusic.play();
        if (Greenfoot.isKeyDown("SPACE")) {
            backgroundMusic.stop();
            Greenfoot.setWorld(new Menu());
        }
        
    }
}
