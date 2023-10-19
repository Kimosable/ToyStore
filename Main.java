import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // добавить игрушку
        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);

        // указваем вес игрушки
        store.setToyWeight(2, 30);

        // розыгрыш
        store.play();

        // выигрыш
        try {
            store.getPrizeToy();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}