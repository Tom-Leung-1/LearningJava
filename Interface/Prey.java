public interface Prey {
    int poops = 3;
    static void flee() { // static method defined in interface cannot be overrided later
        System.out.println("the animal is fleeing");
    };
    int poop();
}
