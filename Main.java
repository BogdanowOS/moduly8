public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        Quad quad = new Quad("Quad", 4, 6);

        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printName(circle);
        shapePrinter.printName(quad);
    }
}
