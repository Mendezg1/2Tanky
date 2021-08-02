import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu2 extends World
{
    bo5 b5 = new bo5();
    bo3 b3 = new bo3();
    public Menu2()
    {    
        super(1083, 600, 1); 
        prepare();
    }
    private void prepare(){
        addObject(b3,170,440);
        addObject(b5,370,440);
        Seleccionar sec = new Seleccionar();
        addObject(sec, 270, 340);
    }
    public void act(){// Se utilizan imágenes para obtener el número de rondas deseadas
        if(Greenfoot.mouseClicked(b3)){
            Greenfoot.setWorld(new mapa(3));
        }
        else if(Greenfoot.mouseClicked(b5)){
            Greenfoot.setWorld(new mapa(5));
        }
    }
}
