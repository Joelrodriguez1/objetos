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
    GreenfootSound backgroundMusic = new GreenfootSound("musica2min.wav");
    Tablero puntos;
    Tablero vidas;
    
    public NivelUno()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setPaintOrder(Tablero.class,Enemigo.class,Player.class);
        addObject(new Suelo(), 400, getHeight()-20);
        addObject(new Player(), 400, 500);
        addObject(contadorT, 700, 30);
        
        contadorT.setValue(300);
        puntos = new Tablero(0,"Puntaje:");
        vidas = new Tablero(3,"Vidas:");
        
        addObject(puntos,150,85);
        addObject(vidas,250,85);
         
        
        //start=1;

    }
    
    public void act(){
       // backgroundMusic.playLoop();
         
        if(Greenfoot.isKeyDown("ESC")){
            Greenfoot.setWorld(new NivelUno());
        }
        if (Greenfoot.isKeyDown("P"))
        {
            Greenfoot.setWorld(new Pausa());
        }
        
     
        if(tim.millisElapsed() > 1000)
        {
            contadorT.add(-1);
            tim.mark();
        }
        
        createEnemys(15);
        
        
        
    }
    
    /* Variable para el tiempo en que aparecen los enemigos */
    long lastAdded = System.currentTimeMillis();
    /* Crea los enemigos */
    private void createEnemys(int cant){
        /* crea arreglo de enemigos */ 
        int cantidad = Greenfoot.getRandomNumber(5) + cant; 
        Enemigo[] etipo1 = new Enemigo[cantidad];
        
        /* Aparece a los enemigos en el mapa */
        for(int i=0; i<etipo1.length; i++)
        {
            etipo1[i] = new Enemigo();
            int eX = Greenfoot.getRandomNumber(getWidth());
            int eY = Greenfoot.getRandomNumber(getHeight()- 70);
            long curTime  = System.currentTimeMillis();
            if (curTime >= lastAdded + 3000) //1000ms = 1s
            {
                addObject(etipo1[i], eX, eY);
                lastAdded  = curTime;
            }
            
            if(etipo1[i].die()){
                puntos.incrementar();
            }
        }
    }
}
