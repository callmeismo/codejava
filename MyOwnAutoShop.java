public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(110,220000,"Red",23);
        Sedan sedan2 = new Sedan(150,470000,"Green",15);

        Ford ford1 = new Ford(150,250000,"Black",2023,1500);
        Ford ford2 = new Ford(200,540000,"White",2024,3400);

        Truck truck1 = new Truck(220,440000,"Brown",1001);
        Truck truck2 = new Truck(270,550000,"Pink",2101);

        Car [] cars = {sedan1,sedan2,ford1,ford2,truck1,truck2};

        for (Car car : cars) {
            System.out.println("Sale Price: $" +car.getSalePrice());
        }

    }
}
