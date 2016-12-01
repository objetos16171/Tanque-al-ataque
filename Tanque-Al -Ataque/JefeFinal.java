import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JefeFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JefeFinal extends Enemigos
{
   private SimpleTimer tiempo = new SimpleTimer();
    Boolean Mov = true;
    /**
     * Act - do whatever the JefeFinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        TanqueWorld mundo = (TanqueWorld) getWorld();
        if(Mov)
        {
            if(getX()<500)
            setLocation(getX()+5,getY());
            else
            Mov=false;
        }
        if(!Mov)
        {
            if(getX()>250)
            {
                setLocation(getX()-5,getY());
            }
            else
            Mov=true;
        }
        if(tiempo.millisElapsed()> 1500)
               {
                   BalaEnemiga BE = new BalaEnemiga(3);
                   mundo.addObject(BE,getX(),getY());
                   tiempo.mark();
                }
    }    
}
