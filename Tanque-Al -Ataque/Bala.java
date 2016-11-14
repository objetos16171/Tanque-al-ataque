import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Bala extends Actor
{
    
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    
    {   
        TanqueWorld mundo = (TanqueWorld) getWorld();
           switch (mundo.returnJ())
        {
            case 1: setLocation(getX()+5,getY()-5);
            break;
            case 2:setLocation(getX()-5,getY()-5);
            break;
            case 3:setLocation(getX(),getY()-5);
            break;
        }
        
        Mata();
    }
    
    public void Mata()
    {
        
    
         if(isTouching(Soldado.class))
        {
            removeTouching(Bala.class);
            removeTouching(Soldado.class);
        }
        else if(isTouching(Torreta.class))
        {
            removeTouching(Torreta.class);
            
        }
    }   
        
}
    
    
    
