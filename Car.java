public abstract class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    abstract double getSalePrice();
}
