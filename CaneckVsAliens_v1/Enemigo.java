import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemigo extends Actor
{
   Suelo ground = new Suelo();
    private final int GRAVITY = 1;
    private int velocity;
    int posX;
    int posY;
    
   
    public void act()
    {
        fall();
        
        posX = getX();
        posY = getY();
        
        //setLocation(posX+2, posY+2);
        atackPlayer();
        if(isTouching(Disparo.class))
        { 
            getWorld().removeObject(this);
            die();
        }
     
    }
    
    public boolean die()
    {
        return true;
    }
    
    
      public void fall(){
        setLocation(getX(), getY() + velocity);      
        if(getY() > getWorld().getHeight() - 90) velocity = 0;
        else velocity += GRAVITY;
    }
    
    //to attack player if he´s somewhere around the enemy
 public void atackPlayer()
    {
        
        if(!getObjectsInRange(1000, Player.class).isEmpty())
        {
             Actor player = (Actor) getObjectsInRange(1000, Player.class).get(0); 
             if(player != null)
             {
                 followPlayer(player);
                 /*if(esp.vidas.obtenerValor()==0)
                 {
                     GameOver t=new GameOver();
                     getWorld().addObject(t,((getWorld().getWith()/2)+30),((getWold().getHeight()/2)+150));
                     
                 }
                 */
             }
        }
    }
    //this is the code for the enemy to follow the player 
   public void followPlayer(Actor player)
   {
    {
        turnTowards(player.getX(), player.getY());
        move(1);
        setRotation(0);
        //if (intersects(player)) getWorld().removeObject(player);
    }
      }
}
