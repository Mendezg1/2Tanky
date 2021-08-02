import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Click here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Click extends Actor
{
    
    public void act() 
    {// Esta clase es la imagen en el menú Instrucciones para cambiar al siguiente menú.
        setImage(new GreenfootImage(450, 50));
        GreenfootImage img = getImage();
        Font font = img.getFont();
        img.setFont(font.deriveFont(30.0F));
        img.setColor(Color.WHITE);
        img.drawString("Haz click aquí para continuar",1,18);
    }    
    
}
