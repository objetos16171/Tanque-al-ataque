import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arbusto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arbusto extends Objeto
{
    /**
     * Act - do whatever the arbusto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     if(Greenfoot.isKeyDown("up")){
        setLocation(getX(),getY()+5);}
       
     if( getY()== 649 )
        {
            setLocation(Greenfoot.getRandomNumber(800),0);
            removeTouching(arbusto.class);
        
    }    
   }
}
