        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Contiene lo escencial para crear los niveles del juego.
 * 
 * @author Antonio, Carlos y Joel 
 * @version 30/05/2022
 */
public class Nivel extends World
{
    /**
     * timer para meter al contador
     */
    public SimpleTimer tim = new SimpleTimer();
    /**
     * contador de tiempo
     */
    public Counter contadorT = new Counter();
    /**
     * guarda la inicializacion de start
     */
    public int start = 0;
    /**
     * guarda la inicializacion de tiempof
     */
    public int tiempof = 0;
    
    /* Puntos del nivel */
    /**
     * Tablero que mostrara los puntos
     */
    public Tablero puntos;
    /**
     * Tablero que mostrara las vidas
     */
    public Tablero vidas;
    
    /* Variable para el tiempo en que aparecen los enemigos */
    /**
     *  Variable para el tiempo en que aparecen los enemigos
     */
    public long lastAdded = System.currentTimeMillis(); 
    /**
     *Crea un mundo y le añade el contador de tiempo, el de puntos y
     *las vidas del jugador
     * 
     */
    public Nivel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setPaintOrder(Tablero.class,Enemigo.class,Player.class);
        //addObject(new Player(), 400, 500);
        
        addObject(contadorT, 700, 30);
        
        contadorT.setValue(300);
        puntos = new Tablero(0,"Puntaje:");
        vidas = new Tablero(100,"Vidas:");
        addObject(puntos,150,85);
        addObject(vidas,350,85);
        
        //start=1;

    }
    
    /**
     * CREATE ENEMYS:
     *  Crea un arreglo de enemigos que van a ir saliendo con el tiempo 
     *  personalizable
     */
        
    
    /* Crea los enemigos */
    /**
     * Crea los enemigos para el juego dependiendo del nivel
     * 
     * @param int tiempo
     * @param int tipo
     */
    public void creaEnemigos(int tiempo, int tipo){
        switch(tipo){
            case 1:
                /* crea arreglo de enemigos del tipo 1*/ 
                EnemigoUno[] etipo1 = new EnemigoUno[1];
                
                /* Aparece a los enemigos en el mapa */
                for(int i=0; i<etipo1.length; i++)
                {
                    etipo1[i] = new EnemigoUno();
                    int eX = Greenfoot.getRandomNumber(getWidth());
                    int eY = Greenfoot.getRandomNumber(getHeight()- 70);
                    long curTime  = System.currentTimeMillis();
                    if (curTime >= lastAdded + (tiempo*1000)) //1000ms = 1s
                    {
                        addObject(etipo1[i], eX, eY);
                        lastAdded  = curTime;
                    }
                
                }
                break;
                
            case 2:
                /* crea arreglo de enemigos del tipo 2*/ 
                EnemigoDos[] etipo2 = new EnemigoDos[1];
                
                /* Aparece a los enemigos en el mapa */
                for(int i=0; i<etipo2.length; i++)
                {
                    etipo2[i] = new EnemigoDos();
                    int eX = Greenfoot.getRandomNumber(getWidth());
                    int eY = Greenfoot.getRandomNumber(getHeight()- 70);
                    long curTime  = System.currentTimeMillis();
                    if (curTime >= lastAdded + (tiempo*1000)) //1000ms = 1s
                    {
                        addObject(etipo2[i], eX, eY);
                        lastAdded  = curTime;
                    }
                
                }
                break;
                
            case 3: 
                /* crea arreglo de enemigos del tipo 2*/ 
                EnemigoFinal[] e3 = new EnemigoFinal[1];
                
                /* Aparece a los enemigos en el mapa */
                for(int i=0; i<e3.length; i++)
                {
                    e3[i] = new EnemigoFinal();
                    int eX = Greenfoot.getRandomNumber(getWidth());
                    int eY = Greenfoot.getRandomNumber(getHeight()- 70);
                    long curTime  = System.currentTimeMillis();
                    if (curTime >= lastAdded + (tiempo*1000)) //1000ms = 1s
                    {
                        BossPower poder = new BossPower();
                        addObject(poder, eX, eY);
                        addObject(e3[i], eX, eY);
                        lastAdded  = curTime;
                    }
                
                }
        }
    }
}
