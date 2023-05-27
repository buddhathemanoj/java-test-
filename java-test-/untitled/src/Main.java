public class Main {
    String x = "my name is";

    public void mymethod() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.mymethod();

        for (int i = 0; i <= 10; i++) {
            System.out.println(obj.x + " " + "naresh");
        }
    }
}
