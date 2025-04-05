public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight){
        super(speed,regularPrice,color);
        this.weight = weight;
    }
    @Override
    double getSalePrice(){
        if (this.weight > 2000)
            return regularPrice * 0.9;
        
        return regularPrice * 0.8;
    }
}
