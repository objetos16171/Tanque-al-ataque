import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Palmera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palmera extends Objeto
{
    /**
     * Act - do whatever the Palmera wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("up")){
        setLocation(getX(),getY()+5);}
       e1();
    } 
    
    public void e1()
    {
        if( getY()== 799 )
        {
            setLocation(Greenfoot.getRandomNumber(800),0);
            removeTouching(Palmera.class);
        }
    }
}
   

