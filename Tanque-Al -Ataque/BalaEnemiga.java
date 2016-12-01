import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaEnemiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaEnemiga extends Enemigos
{
   int Per;
    /**
     * Act - do whatever the BalaEnemiga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BalaEnemiga(int per)
    {
        Per=per;
    }
    public void act() 
    {
        TanqueWorld mundo = (TanqueWorld) getWorld();
        Dispara(Per);
        if(isTouching(Tanque.class))
        {
            removeTouching(BalaEnemiga.class);
        }
    }    
    public void Dispara(int Disp)
    {
        if(Disp==0)
        {
           setLocation(getX()-3,getY()+3);
        }
        if(Disp==1)
        setLocation(getX()+3,getY()+3);
    }    
}
