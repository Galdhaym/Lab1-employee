import java.util.ArrayList;

public class Employees extends ArrayList<Employee>{

    Employees(){
        super();
    }

    public Employees(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean add(Employee employee) {
        return super.add(employee);
    }

    @Override
    public int size() {
        return super.size();
    }

    public static void printEmployeeData(Employees employees){
        System.out.println("Все работники с возрастом > 30 и без высшего образования");
        int i = 0;
        for(Employee employee: employees){
            int age = employee.getAge();
            Education education = employee.getEducation();
            if(age > 30 && !education.equals(Education.HIGHER)){
                System.out.println("Работник №" + (i+1) + ":");
                System.out.println("Фамилия: " + employee.getLastName());
                System.out.println("Возраст: " + employee.getAge());
                System.out.println("Образование: " + education.getEducation());
                System.out.println("Должность: " + employee.getPosition());
            }
            i++;
        }
    }
}
