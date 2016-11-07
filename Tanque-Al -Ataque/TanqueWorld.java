import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TanqueWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TanqueWorld extends World
{

    /**
     * Constructor for objects of class TanqueWorld.
     * 
     */
    public TanqueWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        Tanque T1 = new Tanque();
        
        Casa_1 c= new Casa_1();
        Casa_1 c2= new Casa_1();
        Casa_1 c3= new Casa_1();
        
        addObject(c,50,50);
        addObject(c2,50+50,50);
        addObject(c3,50+100,50);
       
        addObject(T1,390,550);
        
    }
}
