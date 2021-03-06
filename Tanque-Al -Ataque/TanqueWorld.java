import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;//Crea una lista Enlazada
import java.lang.Class;
import java.util.ArrayList;
import java.lang.Object;
/**
 * Write a description of class TanqueWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TanqueWorld extends World
{
    
    private int y=0;
    private int j;
    private int i=0,vida = 5;
    private int vJefe = 1;
    private int l=0;
    private boolean existe = true;
    public Tanque T1 = new Tanque();
    private int cont=1;
    private int c =0;
    private int contM1=0;
    private int cont2=1;
    private int contM2=0;
    private int contM4 =0;
    private int cont3=0;
    private int contM3=0;
    public Bala B = new Bala();
    private Vidas v = new Vidas();
    public itemVida ITvida = new itemVida();
    public Item it = new Item();
    JefeFinal jefe = new JefeFinal();
    private LinkedList <GreenfootImage> imagenes;
    private Button Start,Creditos,Help;
    private SimpleTimer tiempo = new SimpleTimer();
    private GreenfootSound Sonido= new GreenfootSound("intro.mp3");
    private GreenfootSound Son= new GreenfootSound("war.mp3");
    
    /**
     * Constructor for objects of class TanqueWorld.
     * 
     */
    public TanqueWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 650, 1); 

        imagenes = new LinkedList();
        
        imagenes.add(new GreenfootImage("Menu.png"));      //0
        imagenes.add(new GreenfootImage("Help.png"));      //1
        imagenes.add(new GreenfootImage("Start.png")); //2
        imagenes.add(new GreenfootImage("Cred.png"));   //3
        imagenes.add(new GreenfootImage("corkboard.jpg")); //4

        imagenes.add(new GreenfootImage("News.png"));//5
        imagenes.add(new GreenfootImage("GO.jpg")); //6
        imagenes.add(new GreenfootImage("Win.jpg")); //7

        imagenes.add(new GreenfootImage("aiuda.png")); //8
        imagenes.add(new GreenfootImage("Creditos.png")); //9
        
        
        
        Start = new Button(getImagen(2));
        Help = new Button(getImagen(1));
        Creditos = new Button(getImagen(3));

        menu();

    }
    
    public void menu()
    {
        //removeObjects(getObjects(null));
        setBackground(getImagen(0));
        addObject(Start, 200, 100);
        addObject(Creditos, 400, 100);
        addObject(Help, 600, 100);
        Greenfoot.setSpeed(47);

    }
   
    public void act()
    {
        ArrayList<Soldado> ArraySold = new ArrayList();
        super.act();
        seleccionar(); 
        
       
       
        switch(l)
        {
            case 1:
              if(tiempo.millisElapsed()> 6000)
               {
                  
               if(cont<=11){
                   Soldado sold = new Soldado(cont);
                   
                   ArraySold.add(sold); 
                   cont++;
                }
                 
                
                for(Soldado s: ArraySold)
                {
                    addObject(s,500+Greenfoot.getRandomNumber(200),150);
                    
                }    
               
                juego();
                  contM1++; 
               tiempo.mark();
               
               
                }
              
                if(contM1==12)
                {
                  level2();
                  //LEVELFINAL();
                }
                
                
                if(contM1==3||contM1 ==9)
                {
                 addObject(ITvida,250+Greenfoot.getRandomNumber(250),0);
                }
                
                
                     break;
              

                 case 2:
                       if(tiempo.millisElapsed()> 3500)
                       {
                  
                         if(cont2<=20){
                           Soldado sold2 = new Soldado(cont2); 
                           Torreta Torr= new Torreta();
                           ArraySold.add(sold2); 
                           if(c/2==0)
                        {
                           
                            addObject(Torr,Greenfoot.getRandomNumber(80),Greenfoot.getRandomNumber(200));
                           tiempo.mark();
                        }
                           cont2++;
                           c++;
                        }
                
                 
                          for(Soldado s2: ArraySold)
                          {
                            addObject(s2,500+Greenfoot.getRandomNumber(200),150);
                    
                          }    
               
                           juego();
                           contM2++;
                           tiempo.mark();
                      }
                      

                      
                      if(contM2==15)
                      {
                        level3();
                      }
                
                      if(contM2==8||contM2 ==16)
                      {
                        addObject(ITvida,250+Greenfoot.getRandomNumber(250),0);
                      }
                      
                      if(contM2==5)
                {
                 addObject(it,250+Greenfoot.getRandomNumber(760),0);
                }
                       break;
               
               case 3:
                if(tiempo.millisElapsed()> 4000)
                       {
                  
                         if(cont3<=15){
                           Soldado sold2 = new Soldado(cont2);
                           Torreta Torr= new Torreta();
                           addObject(Torr,Greenfoot.getRandomNumber(80),Greenfoot.getRandomNumber(200));
                           TanquEnemigo tan1 = new TanquEnemigo();
                           addObject(tan1,200+Greenfoot.getRandomNumber(250),Greenfoot.getRandomNumber(400));                          
                           ArraySold.add(sold2);                   
                           cont3++;
                        }
                
                 
                          for(Soldado s3: ArraySold)
                          {
                            addObject(s3,500+Greenfoot.getRandomNumber(200),150);
                    
                          }    
               
                           juego();
                           contM3++;
                           tiempo.mark();
                      }
                      if(contM3==8||contM3 ==16)
                      {
                        addObject(ITvida,250+Greenfoot.getRandomNumber(250),0);
                      }


                       if(contM3==15)
                      {
                        LEVELFINAL();

                        }


                       


                        break;
                        
                        case 4:                         
                        
                        juego();
                        tiempo.mark();                   
                     
                        break;
                    

                              
            
         }
            if(vida==0)
            {
                removeObjects(getObjects(null));
                setBackground(getImagen(6));
                Greenfoot.stop();
            }            
             
            if(B.JFinal)
            {
               removeObjects(getObjects(null));
               setBackground(getImagen(7));
                Greenfoot.stop(); 
            }
    }
        
    public void juego()
       {
        v.eligeVida(vida);
        showText("Vida: " + vida, 50, 50);
        showText("Nivel: " + l, 50, 20);
        vida = T1.recibeDaño(vida,T1Existe());        

          
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
        removeObjects(getObjects(null));

        
        setBackground(getImagen(4));
        addObject(T1,390,490);
       
        
        escenario2();
        l=2;
    }
    public void level3()
    {
        removeObjects(getObjects(null));

        
        setBackground(getImagen(4));
        addObject(T1,390,490);
       
        
        escenario3();
        l=3;
        
    }
    
    public void LEVELFINAL()
    {
        removeObjects(getObjects(null));
        addObject(T1,390,490);        
        addObject(jefe,400,100);
        escenarioJ();
        l=4;
        //vJefe = jefe.RDaño(vJefe, jefeExiste());
    }  
    
    
    
    /**
     *Metodo encargado de controlar los eventos de 
     *los botones que se encuentran en la pantalla de menu 
     *se crean los botones con los personajes para cuando sean seleccionado 
     *cambie la imagen de nuestros personajes
     */
    public void seleccionar()
    {
        
        if(Greenfoot.mouseClicked(Creditos)) {
            removeObjects(getObjects(null));
            setBackground(getImagen(9));
            addObject(Start, 650, 50);
           
        }
        
        if(Greenfoot.mouseClicked(Start)) {
            removeObjects(getObjects(null));
            Sonido.stop();
            Son.playLoop();
            tiempo.mark();
            level1();
            
            
             
        }
        
         if(Greenfoot.mouseClicked(Help)) {
            removeObjects(getObjects(null));
            setBackground(getImagen(8));
            addObject(Start, 200, 50);
            
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
        addObject(palmera,600+Greenfoot.getRandomNumber(200),
        Greenfoot.getRandomNumber(200));
        
       
       Casa1 casa12 = new Casa1();
        addObject(casa12,751,343);

        arbusto arbusto = new arbusto();
        addObject(arbusto,Greenfoot.getRandomNumber(600),
        Greenfoot.getRandomNumber(200));
        

        Casa2 casa = new Casa2();
        addObject(casa,635,106);
        
         
        
    } 
    private void escenario2()
    {
      Palmera palmera = new Palmera();
        addObject(palmera,600+Greenfoot.getRandomNumber(200),
        Greenfoot.getRandomNumber(200));
        
       
       Casa1 casa12 = new Casa1();
        addObject(casa12,751,343);

        arbusto arbusto = new arbusto();
        addObject(arbusto,Greenfoot.getRandomNumber(600),
        Greenfoot.getRandomNumber(200));
        

        Casa2 casa = new Casa2();
        addObject(casa,635,106);
    }  
    private void escenario3()
    {
      
        Palmera palmera = new Palmera();
        addObject(palmera,600+Greenfoot.getRandomNumber(200),
        Greenfoot.getRandomNumber(200));
        
       
       Casa1 casa12 = new Casa1();
        addObject(casa12,751,343);

        arbusto arbusto = new arbusto();
        addObject(arbusto,Greenfoot.getRandomNumber(600),
        Greenfoot.getRandomNumber(200));
        

        Casa2 casa = new Casa2();
        addObject(casa,635,106);
    }  
     
    public void escenarioJ()
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
      
     public boolean T1Existe()
    {
        return existe;
    }
     public boolean jefeExiste()
    {
        return existe;
    }
    
    public void started()
    {
      Sonido.play();
      
    }
    public void stop()
    {
        Son.stop();
        
    }
}
