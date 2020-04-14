public class TestStaticMethod {

    public static void main(String[] args) {
        Student.change();

        Student st1 =new Student(111,"Hoang");
        Student st2 =new Student(112,"Thuong");
        Student st3 =new Student(113,"Gia");
        Student st4 =new Student(114,"Lam");

        st1.display();
        st2.display();
        st3.display();
        st4.display();
    }
}
