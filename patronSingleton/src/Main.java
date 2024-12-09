public class Main {
    public static void main(String[] args) {
        var auto = AutoBmw.getInstance();
        var auto2 = AutoBmw.getInstance();

        auto.setModel("BMW Z1");
        auto.setYear("2001");

        System.out.println("Modelo auto 1: "+auto.getModel()+"\nAño auto 1: "+auto.getYear());
        System.out.println("***********************");
        System.out.println("Modelo auto 2: "+auto2.getModel()+"\nAño auto 1: "+auto2.getYear());
    }
}
