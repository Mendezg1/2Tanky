import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapa4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapa4 extends World
{
    Victorias cont = new Victorias();
    public Tank1 tanquev = new Tank1();
    public Tank2 tanquea = new Tank2();
    public mapa4(int verde, int azul, int rondas, int rondasf)
    {
        super(1300, 700, 1); 
        Actor cont1 = new VV(verde);
        addObject(cont1, 1250, 100);
        Actor cont2 = new VA(azul);
        addObject(cont2, 1250, 150);
        addObject(cont, 1250, 50);
        prepare();
        cont.rondas(rondas);
        cont.obtenerverde(verde);
        cont.obtenerazul(azul);
        cont.obtenerrondasf(rondasf);
    }

    
    private void prepare()
    {
        barriba barriba = new barriba();
        addObject(barriba,675,5);
        barriba.setLocation(675,2);
        barriba barriba2 = new barriba();
        addObject(barriba2,545,694);
        barriba2.setLocation(556,696);
        bderecha bderecha = new bderecha();
        addObject(bderecha,4,227);
        bderecha bderecha2 = new bderecha();
        addObject(bderecha2,1296,227);
        linea linea = new linea();
        addObject(linea,1293,502);
        linea.setLocation(1300,511);
        linea.setLocation(1292,519);
        linea linea2 = new linea();
        addObject(linea2,0,494);
        linea2.setLocation(6,499);
        linea linea3 = new linea();
        addObject(linea3,211,212);
        linea3.setLocation(212,283);
        bcentro bcentro = new bcentro();
        addObject(bcentro,763,331);
        linea linea4 = new linea();
        addObject(linea4,1165,363);
        bcentro bcentro2 = new bcentro();
        addObject(bcentro2,523,144);
        bcentro bcentro3 = new bcentro();
        addObject(bcentro3,802,565);
        bcentro.setLocation(840,335);
        linea4.setLocation(1144,353);
        bcentro3.setLocation(1168,562);
        linea3.setLocation(210,184);
        bcentro3.setLocation(697,516);
        linea.setLocation(1296,547);
        bcentro3.setLocation(715,614);
        bcentro.setLocation(847,332);
        linea4.setLocation(1177,456);
        bcentro3.setLocation(1121,591);
        linea4.setLocation(1086,413);
        bcentro3.setLocation(1078,563);
        linea3.setLocation(160,375);
        bcentro3.setLocation(1108,557);
        bcentro.setLocation(892,345);
        linea4.setLocation(1108,413);
        bcentro.setLocation(1089,350);
        bcentro2.setLocation(237,152);
        linea4.setLocation(853,316);
        linea4.setLocation(396,619);
        linea3.setLocation(158,312);
        Tank1 tank1 = new Tank1();
        addObject(tank1,75,88);
        Tank2 tank2 = new Tank2();
        addObject(tank2,1224,621);
    }

    public void act(){
        if(this.getObjects(explosion.class).size() != 0){
            if(this.getObjects(Tank1.class).size() != 0){
                cont.masverde();
                cont.masrondas();
                int verde, azul, rondas, rondasf;
                boolean ganador;
                verde = cont.darverde();
                azul = cont.darazul();
                rondas = cont.darrondas();
                rondasf = cont.darrondasf();
                ganador = cont.verifrondas();
                if (ganador){
                    Greenfoot.setWorld(new FinalV());
                }
                else {
                    
                }
            }
            else {
                cont.masazul();
                cont.masrondas();
                int verde, azul, rondas, rondasf;
                boolean ganador;
                ganador = cont.verifrondas();
                azul = cont.darazul();
                verde = cont.darverde();
                rondas = cont.darrondas();
                rondasf = cont.darrondasf();
                if (ganador){
                    Greenfoot.setWorld(new FinalA());
                }
                else {
                    
                }
            }
        }
    }
}
