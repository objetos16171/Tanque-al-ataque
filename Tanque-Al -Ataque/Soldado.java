import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldado extends Enemigos
{
    private SimpleTimer tiempo = new SimpleTimer();
    private int Id;
    boolean Obs;
    
    public Soldado(int x)
    {
       super();
        Id = x; 
    }    
    /**
     * Act - do whatever the Soldado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
      TanqueWorld mundo = (TanqueWorld) getWorld();
        
        if(isTouching(Tanque.class))
        {
            Obs=false;
        }
        else
        {Obs=true;}
        if(Obs)
        {
          if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()+5);
          }
        }
    
        if( getY()== 649 )
        {
            setLocation(550 + Greenfoot.getRandomNumber(250),0);
            removeTouching(Soldado.class);
        }  
         
        
        if(tiempo.millisElapsed()> 800)
               {
                   BalaEnemiga BE = new BalaEnemiga(0);
                   mundo.addObject(BE,getX(),getY());
                   tiempo.mark();
                }
    }
    
    public int GetId()
    {
       return Id; 
    }    
}
