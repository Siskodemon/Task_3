package Office;

import java.math.BigInteger;

public class Worker {
    private String lastname;
    private String name;
    private String soname;
    private int age;
    private String job_title;
    private int salary;
    private long phone_number;

    public Worker(String lastname, String name, String soname, String job_title, int age, int salary, long phone_number){
        this.lastname = lastname;
        this.name = name;
        this.soname = soname;
        this.job_title = job_title;
        this.age = age;
        this.salary = salary;
        this.phone_number = phone_number;
    }

    public void Who_Is(){
        System.out.printf("Фамилия: %s, Имя: %s, Отчество: %s, Возраст: %d, Должность: %s, Зарплата: %d, Номер телефона: %s;\n",this.lastname,this.name,this.soname,this.age,this.job_title,this.salary,this.phone_number);
    }

    public int Get_Age(){
        return this.age;
    }

    public int Get_Salary(){
        return this.salary;
    }

    public void Set_Salary(int salary){
        this.salary = salary;
    }

    public static void Upgrade_Salary_In_Class(Worker[] workers,int age,int bargain){
        for (int i=0;i<workers.length;i++){
            if (workers[i].Get_Age() >= 45) workers[i].Set_Salary(workers[i].Get_Salary()+bargain);
        }
    }

    public static void Average_Age_And_Salary(Worker[] workers){
        int buff_age = 0;
        int buff_salary = 0;
        for (int i=0;i<workers.length;i++){
            buff_age += workers[i].Get_Age();
            buff_salary += workers[i].Get_Salary();
        }
        System.out.printf("Средний возраст персонала - %d;\n",buff_age/workers.length);
        System.out.printf("Средняя зарплата персонала - %d;\n",buff_salary/workers.length);
    }
}
