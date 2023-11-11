package by.boldysh.creational.prototype;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }

    //Вариант без реализации интерфейса Cloneable
    // public abstract Shape clone();

    @Override
    public Shape clone() {
        try {
//            TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
