import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seleccionar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seleccionar extends Actor
{
    
    public void act() 
    {// Esta clase representa la imagen en la selección de rondas para comenzar a jugar.
        setImage(new GreenfootImage(450, 50));
        GreenfootImage img = getImage();
        Font font = img.getFont();
        img.setFont(font.deriveFont(30.0F));
        img.setColor(Color.WHITE);
        img.drawString("Haz click aquí en la opción deseada",1,18);
    }    
    
}
