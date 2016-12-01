import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Object;

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Bala extends Actor
{
   private GreenfootImage SimaB= new GreenfootImage("tiburon.png");
   
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
       
      if(isTouching(Item.class)){
        cambiaImagen();
         removeTouching(Item.class);
        }

       if(getY()==0)

       {setLocation(800,0);}

       
        
       if(getY()==0)
       {
           
        setLocation(800,0);
        removeTouching(Bala.class);
      }

    }
   
    public void Mata()
    {
         if(isTouching(JefeFinal.class))
        {
           removeTouching(JefeFinal.class);
        }
       if(isTouching(Soldado.class))
        {
            
            removeTouching(Soldado.class);
            
        }
        else{ 
        if(isTouching(Torreta.class)){
        
            removeTouching(Torreta.class);
            }
            else
            { 
               if(isTouching(TanquEnemigo.class)){
        
                 removeTouching(TanquEnemigo.class); 
             }
             
    
            }
        }
    }
    
    
           
    
    public void cambiaImagen()
    {
       setImage(SimaB);
    }
}
       
 
    
 


   
