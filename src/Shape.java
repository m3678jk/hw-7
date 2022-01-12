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

class GetNameOfShape {

    public String getNameOfShape(Shape o) {
        return o.getName();
    }


 }
class GetNameTest {

    public static void main(String[] args) {
        GetNameOfShape h = new GetNameOfShape();
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape rhombus = new Rhombus();
        System.out.println(h.getNameOfShape(triangle));
        Filler filler =new Filler("black");



    }
}
