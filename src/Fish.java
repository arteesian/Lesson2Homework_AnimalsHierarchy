public class Fish extends Animal implements  Water{
    private String specie;

    public Fish(String name, String specie, int age, int weight) {
        super(name, age, weight);
    }

    public String getFishSpecie() {
        return specie;
    }

    public void setFishSpecie(String fishSpecie) {
        this.specie = fishSpecie;
    }

    @Override
    public void splash(){
        System.out.println("Рыба делает маленький бульк");
    }

    @Override
    public String toString() {
        return "Это рыба. " + super.toString();
    }
}
