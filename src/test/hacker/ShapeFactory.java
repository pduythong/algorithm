package test.hacker;

public class ShapeFactory {
    public void drawShape(String type){
        if("Circle".equals(type)){
            new Circle().drawShape();

        }if("Square".equals(type)){
            new Square().drawShape();

        }if("Rectangle".equals(type)){
            new Rectangle().drawShape();

        }else{
            System.out.println("Drawing " + type + " is not supported");
        }


    }
}
