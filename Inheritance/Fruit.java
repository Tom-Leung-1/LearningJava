public class Fruit {
    public int price;
    public int weight;

    Fruit(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public void printWeight() {
        System.out.println(this.weight);
    }
}
