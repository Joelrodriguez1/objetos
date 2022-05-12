import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;

public class Tablero extends Actor
{
    GreenfootImage imagen;
    int cont;
    String mensaje;
    public Tablero(int c, String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        //imagen.setColor(new Color(200,200,0,255));
        //imagen.setFont(new Font("Verdana",Font.BOLD,24));
        dibuja();
        
    }
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    public void decrementar()
    {
        cont--;
        dibuja();
    }
     public void incrementar()
    {
        cont++;
        dibuja();
    }
    public int obtenerValor()
    {
        return cont;
    }
    public void act()
    {
        // Add your action code here.
    }
}
