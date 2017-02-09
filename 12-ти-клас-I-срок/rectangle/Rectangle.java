package rectangle;

public class Rectangle {
    
        private Point p1;
        private Point p2;


    public Rectangle(Point p1, Point p2){
                    if(p1.getX()==p2.getX() || p1.getY()==p2.getY()){
        throw new IllegalArgumentException("Identicle points.");
            }
        else{
        this.p1=p1;
        this.p2=p2;
        }
    }

    public Rectangle(int x1, int y1, int x2, int y2){

        this(new Point(x1,y1), new Point(x2,y2));
    }

    public Rectangle(){
        this(new Point(),new Point());
    }
    
    public double perimeter(){
        double sideA = Math.abs(this.p1.getX()-this.p2.getX());
        double sideB = Math.abs(this.p1.getY()-this.p2.getY());
        return 2*(sideA+sideB);
    }
    
    public double diagonal(){
        return Math.sqrt(Math.abs(p1.getX()-p2.getX()+p1.getY()-p2.getY()));
    }
    
    public double area(){
        return Math.abs(p1.getX()-p2.getX()*p1.getY()-p2.getX());
        }

    @Override
    public String toString(){
        String message="Point 1: ("+p1.getX()+";"+p1.getY()+") Point 2: ("+p2.getX()+";"+p2.getY()+")";
        return message;
    }
}
