package by.boldysh.creational.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super();
        if (target != null) {
            this.radius = target.radius;
        }
    }

    //Вариант без реализации интерфейса Cloneable в родителе
    //    @Override
    //    public Shape clone() {
    //        return new Circle(this);
    // }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
