 public class Shape implements Drawable, Framable{
     private String name = "Shape";
     private double x;
     private double y;
     private double width;
     private double height;

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {

         return name;
     }

     public double getSquare() {

         return 0;
     }

     public double getPerimeter() {
         return 0;
     }




     @Override
     public double getX() {
         return x;
     }

     @Override
     public double getY() {
         return y;
     }

     @Override
     public double getWidth() {
         return width;
     }

     @Override
     public double getHeight() {
         return height;
     }



 }


class GetName {
    public static void main(String[] args) {
        Shape square = new Square();
        System.out.println(square.getName());
        Filler filler =new Filler("black");

        Shape circle = new Circle();
        System.out.println(circle.getName());

        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getName());

        Shape triangle = new Triangle();
        System.out.println(triangle.getName());

        Shape rhombus = new Rhombus();
        System.out.println(rhombus.getName());

    }
}