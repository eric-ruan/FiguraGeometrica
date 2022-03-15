public class Quadrado implements FiguraGeometrica{
    private double lado;
    

    public double getLado() {
        return lado;
    }public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return lado * lado;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return this.lado * 4;
    }
    
}
