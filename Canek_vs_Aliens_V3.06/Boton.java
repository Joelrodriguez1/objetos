import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos permite hacer botones
 * 
 * @author Carlos 
 * @version 25/05/2022
 */
public class Boton extends Actor
{
    /**
     * Mundo donde se pondra el boton
     */
    private World link;
    /**
     * Crea el boton y recibe la imagen que quiere y el mundo donde estara
     * 
     * @param String image
     * @param Worl link
     */
    public Boton(String image, World link)
    {
        setImage(new GreenfootImage(image));
        this.link=link;
    }
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(this.link);
        }
    }
}

