package modelo;

public class Coordenada 
{
	private double x;
    private double y;
    private double distancia;

    public Coordenada()
    {

    }
    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada ca)
    {
        
        x = ca.getX();
        y = ca.getY();
    }
    public double getX() 
    {
        return x;
    }
    public void setX(double x) 
    {
        this.x = x;
    }
    public double getY() 
    {
        return y;
    }
    public void setY(double y) 
    {
        this.y = y;
    }
    public String toString()
    {
        return "( " + x + "," + y + " )";
    }

    public boolean equals(Object r)
    {
        Coordenada otra = (Coordenada)r;
        return (this.x == otra.x) && (this.y == otra.y);    
    }

    public double getDistancia()
    {
        return distancia;
    }
    public String hallarDistancia(Object r)
    {
        Coordenada otra = (Coordenada)r;
        distancia =  Math.sqrt(Math.pow((x - otra.x),2) + Math.pow((y - otra.y),2));
        return "distancia:" + distancia;
    } 
    
    
    
}