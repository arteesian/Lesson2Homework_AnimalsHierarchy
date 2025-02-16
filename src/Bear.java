public class Bear extends Mammal implements Fur{
    private enum Sex{
        MALE,
        FEMALE
    }
    private Sex sex;

    public Bear(String name, Sex sex, int age, int weight, String spineDescription) {
        super(name, age, weight, spineDescription);
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public void describeFur(){
        System.out.println("Медвежья шерсть жесткая и темная");
    }

    @Override
    public String toString() {
        return "Это медведь. Пол: " + sex +
                ". " + super.toString();
    }
}
