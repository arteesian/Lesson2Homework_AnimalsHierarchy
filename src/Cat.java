public class Cat extends Mammal implements Fur{
    public String specie;

    public Cat(String name, String specie, int age, int weight, String spineDescription) {
        super(name, age, weight, spineDescription);
        this.specie = specie;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public void describeFur(){
        System.out.println("Шерсть у котов обычно гладкая, средней длины");
    }

    @Override
    public String toString() {
        return "Это кошка. " + super.toString() +
                ", порода: " + specie;
        }
}
