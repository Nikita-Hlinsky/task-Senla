package tasks;

import models.Line;
import models.Point;

public class LineIntersectionTask implements Task {
    @Override
    public void run() {
        System.out.println("Enter 2 lines: ");
        int a1, a2, b1, b2, c1, c2, d1, d2;
        a1 = in.nextInt();
        a2 = in.nextInt();
        c1 = in.nextInt();
        c2 = in.nextInt();
        b1 = in.nextInt();
        b2 = in.nextInt();
        d1 = in.nextInt();
        d2 = in.nextInt();
        models.Point point1 = new models.Point(a1, a2);
        models.Point point2 = new models.Point(b1, b2);
        models.Point point3 = new models.Point(c1, c2);
        models.Point point4 = new models.Point(d1, d2);
        CheckIntersection(point1, point2, point3, point4); //первые 4 точки, это первая линия и тд


        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 2);
        Point p3 = new Point(8, 2);
        Point p4 = new Point(3, 4);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p1, p3);

        boolean res = intersection(l1, l2);
        System.out.println(res);

    }

    @Override
    public void printDescription() {
        System.out.println(

        );
    }


    private boolean intersection(Line first, Line second) {
        int v11y = first.point1.y;
        int v12y = first.point2.y;
        int v21x = second.point1.x;
        int v22x = second.point2.x;
        int v11x = first.point1.x;
        int v12x = first.point2.x;
        int v21y = second.point1.y;
        int v22y = second.point2.y;

        return ((v11y - v12y) * v21x - (v11x - v12x) * v21y + v11x * v12y - v12x * v11y > 0
                != (v11y - v12y) * v22x - (v11x - v12x) * v22y + v11x * v12y - v12x * v11y > 0)
                && ((v21y - v22y) * v11x - (v21x - v22x) * v11y + v21x * v22y - v22x * v21y > 0
                != (v21y - v22y) * v12x - (v21x - v22x) * v22y + v21x * v22y - v22x * v21y > 0);

    }
//    static boolean CheckIntersection(models.Point d1, models.Point d2, models.Point d3, models.Point d4) {
//        if(d1.X < d2.X){
//            models.Point temp = d1;
//            d1 = d2;
//        }
//        if(d1.X < d2.X){
//            models.Point temp = d1;
//            d1 = d2;
//        }
//        if(d2.X < d3.X){
//            return false;
//        }
//        if ((d1.X - d2.X == 0) && (d3.X - d4.X == 0)){
//            if (d3.X == d1.X){
//                if (!((Math.max(d1.Y, d2.Y) < Math.min(d3.Y, d4.Y)) ||
//                        (Math.min(d1.Y, d2.Y) > Math.max(d3.Y, d4.Y)))) {
//
//                    return true;
//                }
//            }
//
//            return false;
//        }
//        if (d1.X - d2.X == 0) {
//
//            //найдём Xa, Ya - точки пересечения двух прямых
//            double Xa = d1.X;
//            double A2 = (d3.Y - d4.Y) / (d3.X - d4.X);
//            double b2 = d3.Y - A2 * d3.X;
//            double Ya = A2 * Xa + b2;
//
//            if (d3.X <= Xa && d4.X >= Xa && Math.min(d1.Y, d2.Y) <= Ya &&
//                    Math.max(d1.Y, d2.Y) >= Ya) {
//
//                return true;
//            }
//
//            return false;
//        }
//        if (d3.X - d4.X == 0) {
//
//            //найдём Xa, Ya - точки пересечения двух прямых
//            double Xa = d3.X;
//            double A1 = (d1.Y - d2.Y) / (d1.X - d2.X);
//            double b1 = d1.Y - A1 * d1.X;
//            double Ya = A1 * Xa + b1;
//
//            if (d1.X <= Xa && d2.X >= Xa && Math.min(d3.Y, d4.Y) <= Ya &&
//                    Math.max(d3.Y, d4.Y) >= Ya) {
//
//                return true;
//            }
//
//            return false;
//        }
//
//        double A1 = (d1.Y - d2.Y) / (d1.X - d2.X);
//        double A2 = (d3.Y - d4.Y) / (d3.X - d4.X);
//        double b1 = d1.Y - A1 * d1.X;
//        double b2 = d3.Y - A2 * d3.X;
//
//        if (A1 == A2) {
//            return false;
//        }
//
//        double Xa = (b2 - b1) / (A1 - A2);
//
//        if ((Xa < Math.max(d1.X, d3.X)) || (Xa > Math.min( d2.X, d4.X))) {
//            return false;
//        }
//        else {
//            return true;
//        }
//    }
}
