import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo de tipo 1 para el juego.
 * 
 * @author Joel 
 * @version 2/06/2022
 */
public class EnemigoUno extends Enemigo
{
    
       
    /**
     * Le pone la velocidad de movimiento y la vida al enemigo.
     * Llama a las otras funciones principales de enemigo
     * (fall(), attackPlayer(), killPlayer())
     */
    public void act()
    {
        setVelMovimiento(1);
        setVida(1);
        fall();
        atackPlayer();
        killPlayer();
    }
}
