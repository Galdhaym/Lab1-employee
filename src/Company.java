import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    Company(){

    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public int size() {
        return employees.size();
    }

    public static void printEmployeeData(Company company){
        System.out.println("Все работники с возрастом > 30 и без высшего образования");
        int i = 0;
        for(Employee employee: company.employees){
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
