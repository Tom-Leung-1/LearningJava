public class Orange extends Fruit {
    public boolean juicy;
    

    Orange(int price, int weight, boolean juicy) {
        super(price, weight);
        this.juicy = juicy;
    }

    public void printJuicy() {
        if (juicy)  {
            System.out.println("very juicy");
        }
        else {
            System.out.println("not juicy");
        }
    }
}
