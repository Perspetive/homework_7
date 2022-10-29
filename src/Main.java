public class Main {
    public static void main(String[] args) {

        SportCar sportCar = new SportCar();
        Airplane airplane = new Airplane();
        Truck truck = new Truck();

        sportCar.setName("Спортивная машина");
        airplane.setName("Самолет");
        truck.setName("Грузовик");

        sportCar.setFuel(110);
        airplane.setFuel(70);
        truck.setFuel(95);

        sportCar.setSpeed(300);
        airplane.setSpeed(500);
        truck.setSpeed(100);

        sportCar.setPurpose("учавстовать в гонках и побеждать!");
        airplane.setPurpose("это перевозка пассажиров на дальние дистанции!");
        truck.setPurpose("перевозить тяжелые грузы на большие дситанции!");

        sportCar.describe();
        airplane.describe();
        truck.describe();
    }
}