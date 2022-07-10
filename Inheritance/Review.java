public class Review {
    public static void main (String args[]) {
        Fruit fruit = new Fruit(10, 1);
        Orange orange = new Orange(20, 2, true);
        orange.printWeight();
        orange.printJuicy();
        fruit.printWeight();
    }

}
