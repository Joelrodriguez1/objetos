import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Proyectil que dispara el jugador.
 * 
 * @author Antonio, Joel
 * @version 15/05/2022
 */
public class Disparo extends Mover
{
    /**
    * Si la bala toca a un enemigo:
    *  La puntuacion se incrementa, 
    *  el enemigo y la bala desaparecen
     */
    public void act()
    {
        move(10.0);
        
        /* Si la bala toca a un enemigo:
         *  La puntuacion se incrementa
         *  El enemigo y la bala desaparecen
         */
        Actor enemigo = getOneObjectAtOffset(0,0,Enemigo.class);
        if(enemigo!=null){
            Nivel mundo = (Nivel)getWorld();
            getWorld().removeObject(enemigo);
            mundo.puntos.incrementar();
            getWorld().removeObject(this);
        } else {
            if (isTouching(Plataforma.class) || isAtEdge()){
                getWorld().removeObject(this);
            }            
        }
    }
}
