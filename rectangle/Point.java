package rectangle;

public class Point {
    
    private int x;
    private int y;
    
    
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public Point(){
        this(0,0);
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }

    public double distance(Point a){
        if(this.x==a.getX() || this.y==a.getY()){
            throw new IllegalArgumentException("Identicle points.");
        }
        else{
        double deltaX = this.x-a.getX();
        double deltaY = this.y-a.getY();
        return Math.sqrt(deltaX*deltaX+deltaY*deltaY);
        }
    }
    
    @Override
    public String toString(){
        return ("X="+this.x+" Y="+this.y);
    }
}
