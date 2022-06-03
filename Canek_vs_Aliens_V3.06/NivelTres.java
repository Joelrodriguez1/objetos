import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nivel 3 del juego.
 * 
 * @author Antonio, Carlos y Joel 
 * @version 2/06/2022
 */
public class NivelTres extends Nivel
{
/* Musica de Fondo */
    /**
     * musica del nivel
     */
    private GreenfootSound backgroundMusic = new GreenfootSound("Nivel 3_Musica.mp3");
    /**
     * tablero del nivel
     */
    public Tablero nivel;
    /**
     * Enemigo final
     */
    public EnemigoFinal boss = new EnemigoFinal();
    /**
     * Jugador
     */
    Player jugador = new Player();
    /**
     *  Crea el fondo para nivel 3, añade el suelo, el jugador y contadores
     *
     */
    public NivelTres()
    {   
        addObject(new Player(), 400, 500);
        nivel = new Tablero(3, "Nivel: ");
        addObject(nivel,550,85);
        
        backgroundMusic.stop();
        
    }
    /**
     * Reproduce la musica de fondo.
     * Llama a las funcines pausarJuego(),
     * creaEnemigos() (que en este nivel nos permite crear enemigos de los 3 tipos) para poder usarlas en el nivel.
     * Si el tiempo acaba termina el juego
     */
    public void act(){
        backgroundMusic.playLoop();
        
        if(puntos.obtenerValor()<=10){
            creaEnemigos(1, 1);
        } else if(puntos.obtenerValor()<=19){
            creaEnemigos(1, 2);
        }else if(puntos.obtenerValor()>=20){
            creaEnemigos(1, 3);
        } 
        
        if(puntos.obtenerValor()==60){
            Greenfoot.setWorld(new Ganaste());
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
