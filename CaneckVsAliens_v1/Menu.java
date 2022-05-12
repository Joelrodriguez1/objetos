import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    Flecha flecha= new Flecha();
    private int opcion=0;
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        hacerMundo();
    }
    
    private void hacerMundo(){
        //setBackground("crumpled-paper");
        addObject(new Jugar(),400,250);
        addObject(new Salir(),400,350);
        addObject(flecha,275,250);
    }
    

    public void act(){
        /* Inicio, seleccionar jugar o salir */
        if (Greenfoot.isKeyDown("UP") &&opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") &&opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(275,250 +(opcion*100));
        
        /* CODIGO DE SELECCION */ 
        if (Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:
                    /* COMIENZA EL NIVEL 1 */
                    Greenfoot.setWorld(new NivelUno());
                    
                    
                    break;
                case 1:
                    Greenfoot.setWorld(new PantallaInicial());
                    break;
            }
        }
        
        
    }
    
}