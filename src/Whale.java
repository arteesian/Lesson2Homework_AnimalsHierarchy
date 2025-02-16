public class Whale extends Mammal implements  Water{
    public Whale(String name, int age, int weight, String spineDescription) {
        super(name, age, weight, spineDescription);
    }

    @Override
    public void splash(){
        System.out.println("От кита расходятся огромные волны");
    }

    @Override
    public String toString() {
        return "Это кит. " + super.toString();
    }
}
