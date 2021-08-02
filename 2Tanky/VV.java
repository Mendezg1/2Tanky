import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VV extends Actor
{
    // Esta clase es la imagen que se muestra en los mapas como las victorias del verde
    public int v;
    public VV(int valor){
        setImage(new GreenfootImage(100, 20));
        GreenfootImage img = getImage();
        Font font = img.getFont();
        img.setFont(font.deriveFont(20.0F));
        v += valor;
        actualizar();
    }
    public void act() 
    {
        actualizar();
    }    
    private void actualizar(){
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("V :  "+v,1,18);
    }
}
