import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 

/**
 * Write a description of class Tanque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tanque extends Actor
{
    
    private int i=0;
    public int Vidas=3;
    /**
     * Act - do whatever the Tanque wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Muevete();
        Dispara();
    }   
    
    /**
     * Este metodo hace mover al Tanque al igual que lo hace rotar
     */
    public void Muevete()
    {
        TanqueWorld mundo = (TanqueWorld) getWorld();
        if(Greenfoot.isKeyDown("left")){
          setRotation(-45);
          
          i=2;
          setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("right")){
           setRotation(45);
           i=1;
           setLocation(getX()+3,getY());
        } 
        if(Greenfoot.isKeyDown("up")){
           setRotation(0);
           i=3;
           //setLocation(getX(),getY()-3);
        }
        
        cambiabala();
        
    }
    /**
     * este metodo es el encargado de hacer dipoarar el metodo
     */
    public int Dispara()
    {
        int dead=0;
         TanqueWorld mundo = (TanqueWorld) getWorld();
         Bala B= new Bala();
        if(Greenfoot.isKeyDown("z")){
            
            mundo.DisparaT();
          
            
            //Greenfoot.playSound("eating.wav");
            
            
            switch (i)
            {
                case 1: mundo.Rotation1();
                break;
                case 2: mundo.Rotation2();
                break;
                case 3: mundo.Rotation3();
            }

          }
          return dead;
    }
    public int recibeDaño(int vida,boolean ex)
    {
        int i;
        i=vida;
        if(ex)
        {
        if(isTouching(BalaEnemiga.class))
        {
            i= vida - 1;
        }
        
        if(isTouching(itemVida.class))
        {
            i= vida+1;
            removeTouching(itemVida.class);
        }
        
      }
        
        return i;
    }
     public void cambiabala()
    {
      Bala B = new Bala();
      if(isTouching(Item.class)){
        B.cambiaImagen();
         removeTouching(Item.class);
        }
    }
}
