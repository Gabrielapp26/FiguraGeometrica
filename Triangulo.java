public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (base*altura)/2;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Triangulo";
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return ladoA+ladoB+ladoC;
    }
}
