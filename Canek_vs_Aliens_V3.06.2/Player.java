import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Contiene todo lo necesario para que el juagador se mueva, salte y dispare
 * 
 * @author Antonio, Carlos y Joel
 * @version 1/06/2022
*/
public class Player extends Actor
{
    /*
     * suelo del jugador
    
    //public Suelo ground = new Suelo();
     */
    /**
     * Gravedad del jugador
     */
    private final int GRAVITY = 1;
    /**
     * velocidad del jugador
     */
    private int velocity;
    /**
     * las vidas que tiene el jugador
     */
    public int vidas = 3;
    
    /**
     * sonido de disparo del jugador
     */
    public GreenfootSound shoot = new GreenfootSound("disparo.mp3");
    /**
     * * sonido de salto del jugador
     */
    public GreenfootSound salto = new GreenfootSound("salto.mp3");
    /**
     * Velocidad inicial del jugador
     */
    public Player() {
        velocity = 0;
    }
 
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
    
    /**
     * Le pone "gravedad" al jugador.
     */
    public void fall(){
        setLocation(getX(), getY() + velocity);      
        if(getY() > getWorld().getHeight() - 90 || isTouching(Plataforma.class)) velocity = 0;
        else velocity += GRAVITY;
    }
    /**
     * hace saltar al jugador
     */
    public void jump(){
        velocity = -10;
    }
    /**
     * Crea un nuevo objeto disparo y lo dispara a donde este señalado con el mouse.
     */
    public void fire(){
        Disparo disp = new Disparo();
        getWorld().addObject(disp, getX(), getY());
        MouseInfo mouse = Greenfoot.getMouseInfo();
        turnTowards(mouse.getX(), mouse.getY());
        //direccion += Greenfoot.getMouseInfo().getY();
        disp.setRotation(getRotation());
        disp.move(40.0);
    }

    }
    

