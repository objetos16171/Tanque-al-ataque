import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tanque extends Actor
{
    /**
     * Act - do whatever the Tanque wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Muevete();
    }   
    
    public void Muevete()
    {
        
        if(Greenfoot.isKeyDown("left")){
           
          move(-3);
          
        }
        if(Greenfoot.isKeyDown("right")){
           
           move(3);
        } 
        if(Greenfoot.isKeyDown("up")){
            
           setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown("down")){
            
           setLocation(getX(),getY()+3);
        }
    }
}
