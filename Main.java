import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MovablePoint p = new MovablePoint(3,4,7,8);
        MovablePoint p1 = new MovablePoint(6,9,10,17);
        MovablePoint p2 = new MovablePoint(4,5,10,3);
        MovablePoint p3 = new MovablePoint(7,5,9,13);
        p.moveUp();
        p3.moveDown();
        p1.moveLeft();
        Object p5 = p.clone();
        System.out.println(p);
        System.out.println(p5);
        List<MovablePoint> movablePoints = Arrays.asList(p,p1,p2,p3);
        System.out.println(movablePoints);
        System.out.println("Sorted Points --------");
        movablePoints.sort((o1, o2) -> o1.compareTo(o2) );
        System.out.println(movablePoints);

        System.out.println("+++++++");
        MoveCircle c1 = new MoveCircle(2,4,5,7,8);
        MoveCircle c2 = new MoveCircle(3,7,9,10,12);
        MoveCircle c3 = new MoveCircle(5,10,27,7,37);
        MoveCircle c4 = new MoveCircle(4,8,7,9,11);
        MoveCircle c5 = new MoveCircle(7,7,27,17,37);
        Object c7 =c3.clone();
        System.out.println(c7);
        c2.moveRight();
        c3.moveLeft();
        c5.moveDown();
        List<MoveCircle> moveCircles = Arrays.asList(c1,c2,c3,c4,c5);
        System.out.println(moveCircles);
        System.out.println("Sorted Circle+++++");
        moveCircles.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(moveCircles);




    }




}
