public abstract class Mammal extends Animal{
    private int numberOfPaws;
    private String spineDescription;

    public Mammal(String name, int age, int weight, String spineDescription){
        super(name, age, weight);
        this.spineDescription = spineDescription;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public String getSpineDescription() {
        return spineDescription;
    }

    public void setSpineDescription(String spineDescription) {
        this.spineDescription = spineDescription;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", позвоночник: " + spineDescription;
    }
}
