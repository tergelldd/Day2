import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double salary;

        Scanner sal = new Scanner(System.in);
        salary = sal.nextDouble();

        Employee employee1 = new Employee();
        employee1.Bonus(salary);
        employee1.Display();
    }
}
