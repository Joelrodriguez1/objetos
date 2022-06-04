import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nivel 2 del juego.
 * 
 * @author Antonio, Carlos y Joel
 * @version 1/06/2022
 */
public class NivelDos extends Nivel
{
    /* Musica de Fondo */
    /**
     * musica del nivel
     */
    private GreenfootSound backgroundMusic = new GreenfootSound("Nivel 2_Musica.mp3");
    /**
     * Tablero del nivel
     */
    public Tablero nivel;
    /**
     * suelo del nivel
     */
    private SueloEspacio ground = new SueloEspacio();
    /**
     * Plataforma 1
     */
    private Plataforma flat = new Plataforma();
    /**
     * Plataforma 2
     */
    private Plataforma flat2 = new Plataforma();
    /**
     *  Crea el fondo para nivel dos, añade el suelo, plataformas para el jugador, el jugador y contadores
     *, añade la musica de fondo.
     */
    public NivelDos()
    {   
       addObject(new Player(), 400, 500);
        nivel = new Tablero(2, "Nivel: ");
        addObject(nivel,550,85);
        
        
        addObject(ground,400, getHeight()+10);
        addObject(flat, 200, getHeight()-250);
        addObject(flat2, 600, getHeight()-450);
        backgroundMusic.stop();
    }
    
    /**
     * Reproduce la musica de fondo.
     * Llama a las funcines pausarJuego(), creaEnemigos() para poder usarlas en el nivel.
     * Si el tiempo acaba termina el juego
     */
    public void act(){
        backgroundMusic.playLoop();

        
        // Parametros: (tiempo, tipoEnemigo)
        //      Tiempo: segundos q pasan entre un enemigo y otro
        //      TipoEnemigo: tipo 1 o tipo 2 
        creaEnemigos(1, 2);
        
        if(puntos.obtenerValor()==20){
            backgroundMusic.stop();
            Greenfoot.setWorld(new NivelTres());
        }
        
        if(tim.millisElapsed() > 1000)
        {
            contadorT.add(-1);
            tim.mark();
        } 
        // SI EL TIEMPO ACABA, SE TERMINA EL JUEGO
        if(contadorT.getValue() == 0){ Greenfoot.setWorld(new FinDelJuego()); }
        
    }
}
