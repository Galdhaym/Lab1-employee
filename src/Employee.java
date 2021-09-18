public class Employee {
    private String lastName;
    private int age;
    private Education education;
    private String position;

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Education getEducation() {
        return education;
    }

    public String getPosition() {
        return position;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < 50){
            this.lastName = lastName;
        }
    }

    public void setAge(int age) {
        if(age > 0 && age < 120) {
            this.age = age;
        }
    }

    public void setEducation(String education) {
            switch(education){
                case "среднее":
                    this.education = Education.SECONDARY;
                    break;
                case "высшее":
                    this.education = Education.HIGHER;
                    break;
                default:
                    this.education = Education.UNEDUCATED;
            }
    }

    public void setPosition(String position) {
        if(position.length() > 0) {
            this.position = position;
        }
    }

    public Employee(String lastName, int age, Education education, String position) {
        this.lastName = lastName;
        this.age = age;
        this.education = education;
        this.position = position;
    }

    public Employee(){

    }
}
