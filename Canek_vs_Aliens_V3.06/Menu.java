import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que nos muestra el menu principal y nos deja jugar
 *  o salir a la pantalla inicial
 * @author Antonio, Carlos, Joel.
 * @version 9/05/2022
 */
public class Menu extends World
{
    /**
     * Musica de fondo de el menu.
     */
    protected GreenfootSound backgroundMusic = new GreenfootSound("Nivel 3_Musica.mp3");
    
    /**
     * Flecha para elegir
     */
    protected Flecha flecha= new Flecha();
    private int opcion=0;
    /**
     * Crea un fondo y llama a la funcion -hacerMundo().
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        hacerMundo();
    }
    /**
     * Añade los objetos Jugar y Salir
     * y la flecha para seleccionar alguno.
     */
    private void hacerMundo(){
        addObject(new Controles(),400,300);
        addObject(new Jugar(),400,250);
        addObject(new Salir(),400,350);
        addObject(flecha,275,250);
    }
    
    /**
     *Reproduce la musica de fondo, 
     *nos permite seleccionar que parte del menu queremos utilizar
     *
     */
    public void act(){
        backgroundMusic.play();
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
                    backgroundMusic.stop();
                    
                    
                    break;
                case 1:
                    Greenfoot.setWorld(new PantallaInicial());
                    backgroundMusic.stop();
                    break;
            }
        }
        
        
    }
    
}