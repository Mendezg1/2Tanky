import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VA extends Actor
{
    public int v = 0;
    public VA(int valor){
        setImage(new GreenfootImage(100, 20));
        GreenfootImage img = getImage();
        Font font = img.getFont();
        img.setFont(font.deriveFont(20.0F));
        v = valor;
        actualizar();
    }
    public void act() 
    {
        actualizar();
    }    
    private void actualizar(){
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("A : "+v,1,18);
    }
}
