package Office;
public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иванов","Александр","Андреевич","Инженер-программист",33,150000,89143532629L);
        workers[1] = new Worker("Петров","Александр","Витальевич","Инженер-аналитик",45,160000,89053532666L);
        workers[2]  = new Worker("Сидоов","Евгений","Николаевич","Аналитик",50,100000,89057512266L);
        workers[3]  = new Worker("Климов","Павел","Андреевич","Тестировщик",44,100000,89057511958L);
        workers[4]  = new Worker("Калашников","Николай","Анатольевич","Проектировщик",48,120000,89997511198L);

        workers[4].Who_Is();

        //Upgrade_Salary(workers,45, 5000);
        Worker.Upgrade_Salary_In_Class(workers,45,5000);
        Show_Workers(workers);
        Worker.Average_Age_And_Salary(workers);

    }
    public static void Upgrade_Salary(Worker[] workers,int age,int bargain){
        for (int i=0;i<workers.length;i++){
            if (workers[i].Get_Age() >= 45) workers[i].Set_Salary(workers[i].Get_Salary()+bargain);
        }
    }

    private static void Show_Workers(Worker[] workers){
        System.out.println("======================================================================");
        for (int i=0;i<workers.length;i++){
            workers[i].Who_Is();
        }
        System.out.println("======================================================================");
    }
}