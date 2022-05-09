import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Mover
{
    private int vida = Greenfoot.getRandomNumber(10) + 10;
    
    public void act()
    {
        move(10.0);
        vida--;
        if (vida == 0){
            getWorld().removeObject(this);
        }
    }
}
