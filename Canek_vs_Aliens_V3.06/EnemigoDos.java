import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo de tipo 2 para el juego.
 * 
 * @author Joel 
 * @version 2/06/2022
 */
public class EnemigoDos extends Enemigo
{
     /**
     * Le pone la velocidad de movimiento y la vida al enemigo.
     * Llama a las otras funciones principales de enemigo
     * (attackPlayer(), killPlayer())
     */
    public void act()
    {
        setVelMovimiento(5);
        setVida(2);
        atackPlayer();
        killPlayer();
    }
}
