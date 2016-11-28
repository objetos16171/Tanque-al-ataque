import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class itemVida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class itemVida extends Actor
{
    /**
     * Act - do whatever the itemVida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          if(Greenfoot.isKeyDown("up")){
        setLocation(getX(),getY()+5);}
       
    }    
}
