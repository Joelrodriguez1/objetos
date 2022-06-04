import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;
/**
 * Tablero que nos permite mostrar los datos del juego.
 * 
 * @author Antonio, Carlos y Joel 
 * @version 3/06/2022
 */
public class Tablero extends Actor
{
    /**
     * imagen para el tablero
     */
    public GreenfootImage imagen;
    /**
     * contador para el tablero
     */
    public int cont;
    /**
     * Mensaje del tablero
     */
    public String mensaje;
    /**
     * Nos permite crear el Tablero recibiendo el contenido y el mensaje a mostrar
     * 
     * @param int c
     * @param String msj
     */
    public Tablero(int c, String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",true,false,24));
        dibuja();
        
    }
    /**
     * Dibuja el tablero en le mundo
     */
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    /**
     * Decrementa la informacion del tablero
     */
    public void decrementar()
    {
        cont--;
        dibuja();
    }
    /**
     * Incrementa la informacion del tablero
     */
     public void incrementar()
    {
        cont++;
        dibuja();
    }
    /**
     * Obtiene el valor del contenido del contador.
     */
    public int obtenerValor() { return cont; }
}
