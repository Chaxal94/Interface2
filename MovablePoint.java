import java.util.Comparator;

public class MovablePoint implements Movable, Cloneable, Comparable<MovablePoint> {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int x,int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp() {
        y = y+ySpeed;
        System.out.println(y);

    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
        System.out.println(y);


    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
        System.out.println(x);

    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
        System.out.println(x);

    }
    @Override
    public String toString(){
        return "("+x+","+y+"),"+"Speed("+xSpeed+","+ySpeed+")";
    }
    @Override
    public  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(MovablePoint o) {
        if (this.x == o.x) {
            return  this.y - o.y;
        }

        return this.x - o.x;

    }




}
