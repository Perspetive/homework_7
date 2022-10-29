public class Airplane extends Transport {
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void describe(){
        meet();
        System.out.println(" Моя цель - " + purpose);
    }
    @Override
    public void meet(){
        System.out.print("Привет, я " + name + ". Я работаю на " + fuel + " топливе и моя максимальная скорость " + speed + " км/ч.");
    }
}
