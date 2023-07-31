package Office;

public class Boss extends Worker{
    public Boss(String lastname, String name, String soname, String job_title, int age, int salary, long phone_number) {
        super(lastname, name, soname, job_title, age, salary, phone_number);

    }

    public static void Upgrade_Salary_In_Class(Worker[] workers,int age,int bargain){
        for (int i=0;i<workers.length;i++){
            if (workers[i].Get_Age() >= 45 && workers[i].Get_Job_Title().equals("Boss")) workers[i].Set_Salary(workers[i].Get_Salary()+bargain);
        }
    }
}
