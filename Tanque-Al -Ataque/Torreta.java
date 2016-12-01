import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Torreta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torreta extends Enemigos
{
    private SimpleTimer tiempo = new SimpleTimer();
        boolean Obs=true;
    
    /**
     * Act - do whatever the Torreta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setRotation(45);
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
            setLocation(Greenfoot.getRandomNumber(200),0);
            removeTouching(Torreta.class);
        }  
         
        
        if(tiempo.millisElapsed()> 2500)
               {
                   BalaEnemiga BE = new BalaEnemiga(1);
                   mundo.addObject(BE,getX(),getY());
                   tiempo.mark();
                }
    }
    }    

