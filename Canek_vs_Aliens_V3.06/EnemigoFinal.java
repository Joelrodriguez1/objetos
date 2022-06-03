import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo de tipo 3 para el juego.
 * 
 * @author Joel 
 * @version 2/06/2022
 */
public class EnemigoFinal extends Enemigo
{
      /**
     * Le pone la velocidad de movimiento y la vida al enemigo.
     * Llama a las otras funciones principales de enemigo
     * (killPlayer())
     */
    public void act()
    {      
        setVida(4);
        setVelMovimiento(0);
        killPlayer();
    }
}
