package DSA.S2;

public class Main {
    public static void main(String[] args) {
    Cookie c1 = new Cookie("Green");
    Cookie c2 = new Cookie("blue");

    System.out.println(c1.getColor());
    System.out.println(c2.getColor());

    c2.setColor("Yellow");

    System.out.println(c1.getColor());
    System.out.println(c2.getColor());

    }
}
