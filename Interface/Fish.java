public class Fish implements Prey, Predator{ // we can implement multiple interfaces

    // once a class implments a interface, it must define the methods (non static) listed inside the interface.
    public void hunt() {
        System.out.println("fish is hunting");
    }

    // variable inside a interface is predefined
    public int poop() {
        System.out.printf("fish is pooping %d poops\n", poops);
        return 1;
    }
    
    // static method in interface can be omitted. However, it is not inherited (i.e. you cannot call fish.flee() without defining it first) 
    public void flee() {
        System.out.println("ready to flee");
        Prey.flee(); // call static method in interface (other method without static keyword in interface cannot be called)
    }
    
}
