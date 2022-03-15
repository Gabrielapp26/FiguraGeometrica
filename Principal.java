import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira figura: "+q.getNomeFigura());
        System.out.println("Digite um lado para o Quadrado: ");
        q.setLado(sc.nextDouble());
        System.out.println("Lado do quadrado: "+q.getLado());
        System.out.println("Área do quadrado: "+q.getArea());
        System.out.println("Perímetro do quadrado: "+q.getPerimetro());
        System.out.println(" ");


        System.out.println("Segunda figura: "+t.getNomeFigura());
        System.out.println("Digite o lado A para o Triangulo: ");
        System.out.println("Digite o lado B para o Triangulo: ");
        System.out.println("Digite o lado C para o Triangulo: ");
        System.out.println("Digite um dos número para ser a base do Triangulo: ");
        System.out.println("Digite um dos número para ser a altura do Triangulo: ");
        t.setLadoA(sc.nextDouble());
        t.setLadoB(sc.nextDouble());
        t.setLadoC(sc.nextDouble());
        t.setBase(sc.nextDouble());
        t.setAltura(sc.nextDouble());
        System.out.println("Lados do Triangulo: lado A "+t.getLadoA()+" ,lado B "+t.getLadoB()+" e lado C "+t.getLadoC());
        System.out.println("Área do triangulo: "+t.getArea());
        System.out.println("Perímetro do triangulo: "+t.getPerimetro());

        sc.close();
    }
}
