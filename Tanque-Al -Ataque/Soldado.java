import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldado extends Enemigos
{
    
    
    /**
     * Act - do whatever the Soldado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     if(Greenfoot.isKeyDown("up")){
        setLocation(getX(),getY()+5);
        
    }
        
    if( getY()== 799 )
    {
      setLocation(550 + Greenfoot.getRandomNumber(250),0);
      removeTouching(Soldado.class);
    }  
    
    
  
    
    
    }
}
