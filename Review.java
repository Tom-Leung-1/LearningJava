public class Review {
    // access modifiers: public, private, protected, <No keyword>
    // public : everywhere
    // private : within class
    // protected : ?
    // <No keyword> : ?


    // you cannot declare a public class inside the class with main method without the static keyword
    public class Student {
        private int cnt = 0;
        public String name;
        public Student() {
            this.name = "Tom";
        }
        public Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        test();
        Student s1 = new Student();
        Student s2 = new Student("Kevin");
        System.out.println(s1.cnt);
        System.out.println(s2.name);
    }

    public static void test() {
        System.out.println("testing");
    }
}

