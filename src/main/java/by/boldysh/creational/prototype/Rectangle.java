package by.boldysh.creational.prototype;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super();
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }
    //Вариант без реализации интерфейса Cloneable в родителе
    //    @Override
    //    public Shape clone() {
    //        return new Rectangle(this);
    // }

    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
