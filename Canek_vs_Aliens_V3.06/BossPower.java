import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Proyectil que pertenece al enemigo final
 * 
 * @author Antonio 
 * @version 5/06/2022
 */
public class BossPower extends Enemigo
{
    /**
     * Solo le pone la velocidad de movimiento y llama a atackPlayer() y killPlayer().
     */
    public void act()
    {
        setVelMovimiento(3);
        atackPlayer();
        killPlayer();
    }
}
