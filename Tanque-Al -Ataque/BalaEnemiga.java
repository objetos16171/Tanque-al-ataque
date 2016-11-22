import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaEnemiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaEnemiga extends Enemigos
{
    /**
     * Act - do whatever the BalaEnemiga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        TanqueWorld mundo = (TanqueWorld) getWorld();
        setLocation(getX()-3,getY()+3);
        
        if(isTouching(Tanque.class))
        {
            removeTouching(BalaEnemiga.class);
        }
    }    
}
