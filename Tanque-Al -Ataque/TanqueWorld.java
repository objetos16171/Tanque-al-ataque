import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;//Crea una lista Enlazada
import java.lang.Class;
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
    private int l=0;
    private Tanque T1 = new Tanque();
    private Bala B = new Bala();
    private LinkedList <GreenfootImage> imagenes;
    private Button Start,Salir,Help;
    private SimpleTimer tiempo = new SimpleTimer();
    /**
     * Constructor for objects of class TanqueWorld.
     * 
     */
    public TanqueWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 

        imagenes = new LinkedList();

        
        
        imagenes.add(new GreenfootImage("Menu.jpg"));      //0
        imagenes.add(new GreenfootImage("Help.png"));      //1
        imagenes.add(new GreenfootImage("Start.png")); //2
        imagenes.add(new GreenfootImage("Salir.png"));   //3
        imagenes.add(new GreenfootImage("corkboard.jpg")); //4

        Start = new Button(getImagen(2));
        Help = new Button(getImagen(1));
        Salir = new Button(getImagen(3));

        menu();

    }
    
    public void menu()
    {
        //removeObjects(getObjects(null));
        setBackground(getImagen(0));
        addObject(Start, 200, 100);
        addObject(Salir, 400, 100);
        addObject(Help, 600, 100);
        Greenfoot.setSpeed(47);

    }
    public void act()
    {
       
        super.act();
        seleccionar();
        
        switch(l)
        {
            case 1:
              if(tiempo.millisElapsed()> 4000)
               {
                   Soldado sold = new Soldado();
                   addObject(sold,500+Greenfoot.getRandomNumber(200),150);
                   BalaEnemiga BE=new BalaEnemiga();
                   addObject(BE,sold.getX(),sold.getY());
                   tiempo.mark();
               }
               break;
               
        }
        
        
    }
    
    /**
     * Metodo encargado de crear el nivel 1 con
     * el fondo determinado y el actor principal
     * y el escenario
     */
    public void level1()
    {
        setBackground(getImagen(4));
        addObject(T1,390,490);
        
      
        escenario1();
       l=1;
    }
    
     /**
     * Metodo encargado de crear el nivel 2 con
     * el fondo determinado y el actor principal
     * y el escenario
     */
    
    public void level2()
    {
        setBackground(getImagen(4));
        addObject(T1,390,500); 
        escenario2();
    }
    
     public void Help()
    {
        removeObjects(getObjects(null));
        GreenfootImage bag = new GreenfootImage(getImagen(4));
    }
    
    /**
     *Metodo encargado de controlar los eventos de 
     *los botones que se encuentran en la pantalla de menu 
     *se crean los botones con los personajes para cuando sean seleccionado 
     *cambie la imagen de nuestros personajes
     */
    public void seleccionar()
    {
        
        if(Greenfoot.mouseClicked(Salir)) {
            removeObjects(getObjects(null));
            menu();
        }
        
        if(Greenfoot.mouseClicked(Start)) {
            removeObjects(getObjects(null));
            tiempo.mark();
            level1();
             
        }
        
         if(Greenfoot.mouseClicked(Help)) {
            removeObjects(getObjects(null));
            Help();
        }
    }
    
        /**
     * Metodo que devolvera una imagen (tipo GreenfootImage)
     * que contiene nuestra lista de imagenes y sera asignada
     * a los distintos objetos del escenario.
     * 
     * @param int Valor de la posición de la imágen que se
     * desea obtener.
     * @return GreenfootImage - Imágen contenida en la Lista
     * en la posición especificada.
     */
    public GreenfootImage getImagen(int n)
    {
        return imagenes.get(n);
    }
    
    /**
     * Este método regresa un objeto en especifico de la clase Boton.
     * 
     * @return Boton - Objeto jugar de la clase Boton.
     */
    public Button getJugar()
    {
        return Start;
        
    }

    /**
     * Este método regresa un objeto en especifico de la clase Boton.
     * 
     * @return Boton - Objeto record de la clase Boton.
     */
    public Button getAyuda()
    {
        return Help;
    }

   /**
    * este metodo es el encargado de hacer dinparar al tanque
    */
    
    public void DisparaT()
    {
        addObject(B,T1.getX(),T1.getY()-100);
    }
   /**
    * los metodos rotation hacen rotar la bala con forme la rotation del 
    * tanque
    */
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void escenario1()
    {
        Palmera palmera = new Palmera();
        addObject(palmera,Greenfoot.getRandomNumber(800),
        Greenfoot.getRandomNumber(600));
        
       
        
        
        

        Casa1 casa12 = new Casa1();
        addObject(casa12,751,343);

        arbusto arbusto = new arbusto();
        addObject(arbusto,Greenfoot.getRandomNumber(800),
        Greenfoot.getRandomNumber(600));
        

        Casa2 casa = new Casa2();
        addObject(casa,635,106);

        
    } 
    
     
    
    private void escenario2()
    {
        //Soldado soldado = new Soldado();
        //addObject(soldado,606,420);
    }    
}
