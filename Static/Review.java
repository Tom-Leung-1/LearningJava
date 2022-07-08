public class Review { // your file name must match with the class name if public keyword is used. Otherwise, you can just remove the public keyword and choose another file name (see https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class#:~:text=yes%2C%20you%20can%20choose%20any,which%20the%20main%20method%20exist.)
    
    // access modifiers: public, private, protected, <No keyword>
    // public : everywhere
    // private : within class
    // protected : ?
    // <No keyword> : ?

    public static int staticOne = 1;
    public int one = 1;

    class InnerClassOne {
        public int cnt = 0;
        InnerClassOne() {
            System.out.println(one);
        }
    }

    static class InnerClassTwo { // static nested class only has access to static members of the outer class. (the main difference between non-static inner class and static nested class)
        public int cnt = 0;
        InnerClassTwo() {
            // System.out.println(one); // error 
            System.out.println(staticOne); // OK
        }
    }

    public static void main(String[] args) {
        // you can create the object of a class inside the same class itself
        Review review = new Review();
        // to create the inner class object of another class, use the syntax below
        InnerClassOne c1 = review.new InnerClassOne();
        // you can also create the inner class object if you add static keword into the inner class. It is also called static nested class
        InnerClassTwo c2 = new InnerClassTwo();
        // you can also create an object of a class by: 
        //  1.  adding another java file into the same directory
        //  2.  create an instance in the main method 
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Kevin");

        staticMethod();
        review.method();

        // cnt is the public static variable. It can be modified everywhere and every instance of Teacher class share the same static variable 
        t1.cnt = 3;
        System.out.println(t2.cnt);
        
        // we cannot modify the private variable in another class. 
        // t1.privateCnt = 3; // error

        

    }

    // static method = class method -> we don't need to specifically create an instance to call this method
    public static void staticMethod() {
        System.out.println("call method 1");
    }

    public void method() {
        System.out.println("call method 2");
    }

}

