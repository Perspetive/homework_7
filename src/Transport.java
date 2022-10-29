public class Transport {
    protected int fuel;
    protected String name;

    protected String purpose;
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void meet(){
        System.out.println("Привет, я " + name + ". Я работаю на " + fuel + " топливе");
    }
}
