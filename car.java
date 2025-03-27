class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 200);
        myCar.displayInfo();
    }
}

