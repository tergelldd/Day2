public class Employee {
    double bonus;
    double sal;
    int rate;

    void Bonus(double salary){
        if(salary >= 0 && salary <=400){
            rate = 15;
            bonus = (salary * rate) / 100;
            sal = salary + bonus;
        }
        else if(salary <= 800){
            rate = 12;
            bonus = (salary * rate) / 100;
            sal = salary + bonus;
        }
        else if(salary <= 1200){
            rate = 10;
            bonus = (salary * rate) / 100;
            sal = salary + bonus;
        }
        else if(salary <= 2000){
            rate = 7;
            bonus = (salary * rate) / 100;
            sal = salary + bonus;
        }
        else if(salary > 2000){
            rate = 4;
            bonus = (salary * rate) / 100;
            sal = salary + bonus;
        }
        else {
            rate = 0;
            sal = salary;
        }
    }
    void Display() {
        System.out.printf("Novo salario: %.2f\n", sal);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.printf("Em percentual: %d %%\n", rate); 
    }
}