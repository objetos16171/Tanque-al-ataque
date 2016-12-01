import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TanquEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class TanquEnemigo extends Enemigos
{
    private SimpleTimer tiempo = new SimpleTimer();  
    boolean Obs=true;
    
    /**
     * Act - do whatever the TanquEnemigo wants to do. This method is called whenever
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
            setLocation(50+Greenfoot.getRandomNumber(250),0);
            removeTouching(TanquEnemigo.class);
        }  
         
        
        if(tiempo.millisElapsed()> 3000)
               {
                   BalaEnemiga BE = new BalaEnemiga(3);
                   mundo.addObject(BE,getX(),getY());
                   tiempo.mark();
                }
    }    
}
