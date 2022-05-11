import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NivelUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NivelUno extends World
{
    SimpleTimer tim = new SimpleTimer();
    Counter contadorT = new Counter();
    int start = 0;
    int tiempof = 0;
    /**
     * Constructor for objects of class NivelUno.
     * 
     */
    public NivelUno()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Suelo(), 400, getHeight()-20);
        addObject(new Player(), 400, 500);
        addObject(contadorT, 700, 30);
        contadorT.setValue(300);
        
        prepare();
    }
    
    public void act(){
     
        if(Greenfoot.isKeyDown("ESC")){
            Greenfoot.setWorld(new NivelUno());
        }
        if (Greenfoot.isKeyDown("P"))
        {
            Greenfoot.setWorld(new Pausa());
        }
        
        
    }
    /*
        Crea los enemigos
       */
    private void prepare(){
        
        Enemigo[] etipo1 = new Enemigo[Greenfoot.getRandomNumber(5) + 15];
        for(int i=0; i<etipo1.length; i++)
        {
            etipo1[i] = new Enemigo();
            int eX = Greenfoot.getRandomNumber(getWidth());
            int eY = Greenfoot.getRandomNumber(getHeight()- 70);
            addObject(etipo1[i], eX, eY);
        }
    }
}
