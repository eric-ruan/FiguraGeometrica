import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println(q.getNomeFigura());
        System.out.println("Digite um lado");
        q.setLado(sc.nextDouble());
        System.out.println("Área: " + q.getArea());
        System.out.println("Perimetro: " + q.getPerimetro());

        System.out.println("---------------------------");

        System.out.println(t.getNomeFigura());
        System.out.println("Digite a base...");
        t.setBase(sc.nextDouble());
        System.out.println("Digite a altura...");
        t.setAltura(sc.nextDouble());
        System.out.println("Digite o lado A...");
        t.setLadoA(sc.nextDouble());
        System.out.println("Digite o lado B...");
        t.setLadoB(sc.nextDouble());
        System.out.println("Digite o lado C...");
        t.setLadoC(sc.nextDouble());
        System.out.println("Área: " + t.getArea());
        System.out.println("Perimetro: " + t.getPerimetro());

        sc.close();
        
    }
}
