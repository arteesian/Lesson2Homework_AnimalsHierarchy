//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "персидский", 4, 3, "40-46 позвонков в зависимости от длины хвоста");
        System.out.println(cat);
        cat.describeFur();
        cat.setSpecie("британец");
        System.out.println(cat);
        System.out.println();

        Fish fish = new Fish("Фредди", "карп", 0, 0);
        System.out.println(fish);
        fish.splash();
    }
}