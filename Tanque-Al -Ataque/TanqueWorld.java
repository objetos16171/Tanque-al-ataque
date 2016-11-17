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
    private Tanque T1 = new Tanque();
    private Bala B = new Bala();
    private LinkedList <GreenfootImage> imagenes;
    private Button Start,Salir,Help;
    /**
     * Constructor for objects of class TanqueWorld.
     * 
     */
    public TanqueWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
<<<<<<< HEAD
        imagenes = new LinkedList();

=======
         imagenes = new LinkedList();
         Soldado soldado = new Soldado();
        addObject(soldado,400,300);
        
>>>>>>> origin/master
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
        removeObjects(getObjects(null));
        setBackground(getImagen(0));
        addObject(Start, 200, 100);
        addObject(Salir, 400, 100);
        addObject(Help, 600, 100);
        Greenfoot.setSpeed(40);

    }
    public void act()
    {
       
        super.act();
        seleccionar();
    }
    
    /**
     * Metodo encargado de crear el nivel 1 con
     * el fondo determinado y el actor principal
     * y el escenario
     */
    public void level1()
    {
        setBackground(getImagen(4));
        addObject(T1,390,550);
        prepare();
        
        /*if()
        {
            level2();
        }*/
    }
    
     /**
     * Metodo encargado de crear el nivel 2 con
     * el fondo determinado y el actor principal
     * y el escenario
     */
    
    public void level2()
    {
        setBackground(getImagen(4));
        addObject(T1,390,550); 
        escenario1();
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
            level2();
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
        B.setLocation(T1.getX(),T1.getY()-100);
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
    private void prepare()
    {
        
        Palmera palmera = new Palmera();
        addObject(palmera,658,199);
        Palmera palmera2 = new Palmera();
        addObject(palmera2,673,461);
        palmera2.setLocation(667,459);
        Casa1 casa1 = new Casa1();
        addObject(casa1,670,337);
        Casa1 casa12 = new Casa1();
        addObject(casa12,751,343);
        casa12.setLocation(751,336);
        Casa1 casa13 = new Casa1();
        addObject(casa13,595,344);
        casa13.setLocation(600,340);
        arbusto arbusto = new arbusto();
        addObject(arbusto,510,282);
        arbusto arbusto2 = new arbusto();
        addObject(arbusto2,518,480);
        arbusto arbusto3 = new arbusto();
        addObject(arbusto3,514,96);
        Casa2 casa2 = new Casa2();
        addObject(casa2,635,106);
        Casa2 casa22 = new Casa2();
        addObject(casa22,724,110);
        casa2.setLocation(613,108);
        casa22.setLocation(721,109);
        Casa2 casa23 = new Casa2();
        addObject(casa23,730,568);
        Casa2 casa24 = new Casa2();
        addObject(casa24,637,578);
        casa24.setLocation(637,572);
        casa1.setLocation(675,338);
        casa13.setLocation(593,341);
        casa1.setLocation(670,338);
        casa24.setLocation(626,566);
        casa23.setLocation(727,561);
        casa24.setLocation(621,559);
        arbusto arbusto4 = new arbusto();
        addObject(arbusto4,256,187);
        arbusto4.setLocation(266,190);
        arbusto4.setLocation(260,188);
        arbusto arbusto5 = new arbusto();
        addObject(arbusto5,274,421);
        Palmera palmera3 = new Palmera();
        addObject(palmera3,259,301);
        Palmera palmera4 = new Palmera();
        addObject(palmera4,86,106);
        Palmera palmera5 = new Palmera();
        addObject(palmera5,90,532);
        Casa2 casa25 = new Casa2();
        addObject(casa25,181,447);
        Casa2 casa26 = new Casa2();
        addObject(casa26,63,402);
        Casa1 casa14 = new Casa1();
        addObject(casa14,66,308);
        Casa1 casa15 = new Casa1();
        addObject(casa15,152,364);
        Casa1 casa16 = new Casa1();
        addObject(casa16,164,218);
        casa16.setLocation(148,210);
        Casa1 casa17 = new Casa1();
        addObject(casa17,208,103);
        arbusto5.setLocation(248,510);
        palmera3.setLocation(235,291);
        arbusto4.setLocation(246,186);
        palmera3.setLocation(242,294);
        arbusto5.setLocation(242,517);
        arbusto.setLocation(509,282);
        arbusto.setLocation(517,280);
        removeObject(arbusto);
        Palmera palmera6 = new Palmera();
        addObject(palmera6,519,231);
        Palmera palmera7 = new Palmera();
        addObject(palmera7,526,375);
        palmera.setLocation(710,193);
        casa13.setLocation(605,331);
        casa13.setLocation(614,235);
        casa1.setLocation(616,347);
        casa12.setLocation(696,297);
        Casa2 casa27 = new Casa2();
        addObject(casa27,715,382);
        casa2.setLocation(613,105);
        casa2.setLocation(616,125);
        casa22.setLocation(703,84);
        Casa2 casa28 = new Casa2();
        addObject(casa28,67,209);
        Soldado soldado = new Soldado();
        addObject(soldado,606,420);
        Soldado soldado2 = new Soldado();
        addObject(soldado2,581,172);
        Soldado soldado3 = new Soldado();
        addObject(soldado3,754,270);
        Torreta torreta = new Torreta();
        addObject(torreta,83,467);
        torreta.setLocation(146,282);
        Torreta torreta2 = new Torreta();
        addObject(torreta2,187,575);
        torreta2.setLocation(68,460);
        Torreta torreta3 = new Torreta();
        addObject(torreta3,74,161);
        casa28.setLocation(39,59);
        palmera4.setLocation(75,124);
        torreta3.setLocation(61,202);
        torreta.setLocation(139,63);
        torreta3.setLocation(143,281);
        palmera4.setLocation(67,168);
        casa28.setLocation(55,75);
        
    }
    
    private void escenario1()
    {
        Soldado soldado = new Soldado();
        addObject(soldado,606,420);
    }    
}
    

