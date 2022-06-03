import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jugador para el nivel 1 del juego
 * 
 * @author Antonio
 * @version 1/06/2022
 */
public class Canek extends Player
{
    /**
     * Mueve al jugador de izquierda a derecha, salta y dispara.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("d")) 
        {
            setLocation​(getX()+5, getY());
            setRotation (getRotation() + 8);
        };
        
        if (Greenfoot.isKeyDown("a")) 
        {
            setLocation​(getX()-5, getY());
            setRotation (getRotation() - 8);
        };
        /* SALTO */ 
        fall();
        if (Greenfoot.isKeyDown("w") ){
            jump();
            //salto.play();
        }
        
        /*Disparo*/
        
        if (Greenfoot.mouseClicked(null)){
            fire();
            shoot.play();
        }
        
    }
}
