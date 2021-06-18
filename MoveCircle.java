public class MoveCircle implements Movable,Cloneable,Comparable<MoveCircle>{
    int radius;
    MovablePoint centre;
   MoveCircle(int x,int y, int xSpeed, int ySpeed,int radius){
       this.radius = radius;
       this.centre = new MovablePoint(x,y,xSpeed,ySpeed);
   }

    public void setCentre(MovablePoint centre) {
        this.centre = centre;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCentre() {
        return centre;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void moveUp() {
       centre.y = centre.y + centre.ySpeed;
        System.out.println(centre.y);


    }

    @Override
    public void moveDown() {
       centre.y = centre.y - centre.ySpeed;
        System.out.println(centre.y);

    }

    @Override
    public void moveLeft() {
       centre.x = centre.x - centre.xSpeed;
        System.out.println(centre.x);

    }

    @Override
    public void moveRight() {
       centre.x = centre.x + centre.xSpeed;
        System.out.println(centre.x);
    }
    @Override
    public String toString(){
       return "("+centre.x+","+centre.y+"),"+"Speed("+centre.xSpeed
               +","+centre.ySpeed+"),"
               +"Radius="+radius;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }

    @Override
    public int compareTo(MoveCircle o) {

       return this.radius - o.radius;
    }
}
