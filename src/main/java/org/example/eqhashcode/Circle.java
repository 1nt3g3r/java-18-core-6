package org.example.eqhashcode;

import java.util.Comparator;
import java.util.Objects;

public class Circle {
    private int radius;
    private int x;
    private int y;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }

        Circle another = (Circle) obj;
        return another.radius == radius && another.x == x && another.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


   public static class RadiusComparator implements Comparator<Circle> {
        @Override
        public int compare(Circle o1, Circle o2) {
            return o1.getRadius() - o2.getRadius();
        }
    };

    public static void main(String[] args) {
        Circle c1 = new Circle(100, 10, 5);
        Circle c2 = new Circle(100, 10, 5);
        Circle c3 = new Circle(100, 20, 10);

        System.out.println("c1.hashCode() = " + c1.hashCode());
        System.out.println("c2.hashCode() = " + c2.hashCode());
        System.out.println("c3.hashCode() = " + c3.hashCode());

        System.out.println("c1.equals(c2) = " + c1.equals(c2));
    }
}
