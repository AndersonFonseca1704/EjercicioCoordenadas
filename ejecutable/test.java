package ejecutable;
import modelo.*;
public class test 
{
    
public static void main(String[] args) 
{
    Coordenada ca = new Coordenada(0,0);
    ca.setX(2);
    ca.setY(10);
    System.out.println("Las Coordendas son : \n");
    System.out.println("X = " + ca.getX());
    System.out.println("Y = " + ca.getY());
    System.out.println(ca);

    Coordenada cb = new Coordenada(1.3,5.3);
    System.out.println("Las Coordendas son : \n");
    System.out.println("X = " + cb.getX());
    System.out.println("Y = " + cb.getY());
    System.out.println(cb);

    Coordenada cc = new Coordenada(ca);
    System.out.println("Las Coordendas son : \n");
    System.out.println(cc);

    Coordenada cd = new Coordenada(cb);
    System.out.println("Las Coordendas son : \n");
    System.out.println(cd);

    if(ca.equals(cb)) 
    {
        System.out.println("Coordenada igual");
    }
    else
    {
        System.out.println("Coordenada diferente");
    }
    
    Coordenada otra = new Coordenada();
    otra.setX(2);
    otra.setY(10);
    System.out.println("Las Coordendas son : \n");
    System.out.println("X = " + otra.getX());
    System.out.println("Y = " + otra.getY());
    System.out.println(otra);
    System.out.println("Las distancia total entre la coordenada: " + otra + " es : " + otra.getDistancia() );

   

}

}
