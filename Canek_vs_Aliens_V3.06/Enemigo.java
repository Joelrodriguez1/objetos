import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Contiene todo lo necesario para crear, mover, atacar al jugador y matar los enemigos
 * 
 * @author Antonio, Carlos y Joel 
 * @version 1/06/2022
 */
public class Enemigo extends Actor
{
    /**
     * Musica de perdedor
     */
    protected GreenfootSound LoserSound = new GreenfootSound("game-over-sonido.mp3");
    /*
     * Suelo para el enemigo
    //protected Suelo ground = new Suelo();
    */
    /**
     * Valor final de la gravedad
     */
    private final int GRAVITY = 1;
    /**
     * Aqui se guardara la velocidad de los enemigos
     */
    public int velocity;
    
    /**
     *  para guardar la posicion en x
     */
    public int posX;
    
    /**
     *  para guardar la posicion en 
     */
    public int posY;
    //public int points = 0;
    /**
     * Vida del enemigo
     */
    public int vida;
    /**
     * A que velocidad se movera el enemigo
     */
    public int velMovimiento;
    
    /**
     * Me dice la vida del enemigo
     * 
     * @return vida
     */
    public int dameVida(){ return vida; }
    /**
     * Le pone la vida al enemigo
     * 
     * 
     * @param int life
     * 
     */
    public void setVida(int life){ vida = life; }
    
    /**
     * Baja la vida del enemigo
     */
    public void bajaVida(){ vida--; }
    
    /**
     * Le pone la velocidad de movimiento al enemigo
     * 
     * @param int velocidad
     */
    public void setVelMovimiento(int velocidad){
        velMovimiento = velocidad;
    }
    
    /**
     * Le pone "gravedad" al enemigo
     */
    public void fall() 
    {
        setLocation(getX(), getY() + velocity);      
        if(getY() > getWorld().getHeight() - 90) velocity = 0;
        else velocity += GRAVITY;
    }
    
    //El enemigo sigue al jugador para atacarlo
    /**
     * Si tiene al jugador cerca lo sigue para atacarlo.
     */
    public void atackPlayer()
    {
        if(!getObjectsInRange(1000, Player.class).isEmpty())
        {
             Actor player = (Actor) getObjectsInRange(1000, Player.class).get(0); 
             if(player != null)
                 followPlayer(player);
        }
    }
        //this is the code for the enemy to follow the player
    
    /**
     * Nos permite que el enemigo siga al jugador.
     */
    public void followPlayer(Actor player)
    {
        turnTowards(player.getX(), player.getY());
        move(velMovimiento);
        setRotation(0);
    }
    
    
    //  SI EL ENEMIGO TOCA AL JUGADOR, PIERDE UNA VIDA 
    //  SI EL JUGADOR PIERDE LAS 3 VIDAS, ES GAME OVER 
    /**
     * Si el enemigo toca al jugador pierde una vida.
     * Si el jugador pierde las 3 vidas Game over.
     */
    public void killPlayer(){
        Actor jugador = getOneObjectAtOffset(0,0,Player.class);
        if(jugador!=null){
            Nivel mundo=(Nivel)getWorld();
            getWorld().removeObject(jugador);
            mundo.vidas.decrementar();
            getWorld().addObject(new Player(), 400, 500);
            if(mundo.vidas.obtenerValor()==0){
                LoserSound.play();
                Greenfoot.setWorld(new FinDelJuego());
            }
        }
    }
    
}