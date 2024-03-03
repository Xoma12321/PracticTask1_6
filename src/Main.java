import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Хомяков Даниил Васильевич\nРИБО-05-22\nВариант №1\nВведите модель автомобиля:");
        Scanner scanner = new Scanner(System.in);
        String model = scanner.next();
        STO sto = new STO();
        Car car = new Car(model);
        System.out.println(car + " --> " + sto.modify(car));
    }
}