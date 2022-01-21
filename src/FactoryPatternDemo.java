public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape s1 = sf.getShape("rectangle");
        Shape s2 = sf.getShape("square");
        Shape s3 = sf.getShape("circle");

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
