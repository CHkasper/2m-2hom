public class Main {
    public static void main(String[] args) {
        createObject("Car").print();
        System.out.println("---------------------");
        createObject("Computer").print();
        System.out.println("---------------------");
        createObject("Phone").print();

    }
    public static Technics createObject(String className){
        switch (className) {
            case "Car":
                return new Car(2002, "Mercedes", "AMG", 5, "Sedan");
            case "Computer":
                return new Computer(2022, "BENQ", "AOC", "intel core i9 9800", "RTX 3070 ti", 64);
            case "Phone":
                return new Phone(2021, "Poco Phone", "X3 PRO", "Android 11", 128);
            default:
                return null;

        }
    }
}