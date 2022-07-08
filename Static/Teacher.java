public class Teacher {
    public String name;
    // if you don't initialize your static variable, the default value of it is 0.
    public static int cnt = 0;
    private static int privateCnt = 0;

    public Teacher() {
        this.name = "Tom";
    }

    public Teacher(String name) {
        this.name = name;
    }

    public class TeacherPet {
        public int sticks;
        TeacherPet() {
            this.sticks = 4;
        }
    }
}