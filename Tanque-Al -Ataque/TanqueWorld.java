import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TanqueWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TanqueWorld extends World
{
    private int x=0;
    private int y=0;
    private int j;
    private int i=0;
    private Tanque T1 = new Tanque();
    private Bala B = new Bala();
    /**
     * Constructor for objects of class TanqueWorld.
     * 
     */
    public TanqueWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
       
        
       addObject(T1,390,550);
       
        
    }
    
    public void DisparaT()
    {
        
       B.setLocation(T1.getX(),T1.getY()-100);
        addObject(B,T1.getX(),T1.getY()-100);
    }
    public void Rotation1()
   { 
       i=1;
       returnJ();
       B.setRotation(45);
       B.setLocation(T1.getX()+65,T1.getY()-65);
       
   }
    public void Rotation2()
   {
       i=2;
       returnJ();
       B.setRotation(-45);
       B.setLocation(T1.getX()-65,T1.getY()-65);
   }
    public void Rotation3()
   {
       i=3;
       returnJ();
       
       B.setRotation(0);
       B.setLocation(T1.getX()-2,T1.getY()-95);
       
   }
   
   public int returnJ()
   {
     int j=0;
     j=j+i;
     return j;
   }    
}
    

