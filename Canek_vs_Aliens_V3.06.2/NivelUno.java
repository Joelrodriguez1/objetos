import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Primer nivel del juego
 * 
 * @author Antonio 
 * @version 1/ 06 /22
 */
public class NivelUno extends Nivel
{
    /* Musica de Fondo */
    /**
     * musica de fondo
     */
    private GreenfootSound backgroundMusic = new GreenfootSound("musica2min.wav");
    /**
     * Tablero del nivel
     */
    public Tablero nivel;
    /**
     * suelo del nivel
     */
    private Suelo ground = new Suelo();
    /**
     * Crea el nivel uno, añade el suelo, jugador y contadores
     *, añade la musica de fondo
     */
    public NivelUno()
    {    
        
        addObject(ground,400, getHeight()-20);
        backgroundMusic.stop();
        addObject(new Canek(), 400, 500);
        
        nivel = new Tablero(1,"Nivel: ");
        addObject(nivel,550,85);
    }
    
    /**
     * Reproduce la musica de fondo.
     * Llama a las funcines pausarJuego(), creaEnemigos() para poder usarlas en el nivel.
     * Si el tiempo acaba termina el juego
     */
    public void act(){
        backgroundMusic.play();

        
        // Parametros: (tiempo, tipoEnemigo)
        //      Tiempo: segundos q pasan entre un enemigo y otro
        //      TipoEnemigo: tipo 1 o tipo 2 
        creaEnemigos(2, 1);
        
        if(puntos.obtenerValor()==10){
            backgroundMusic.stop();
            Greenfoot.setWorld(new NivelDos());
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
