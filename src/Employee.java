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
        if(lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
        else{
            throw new Error("lastName must not be empty.");
        }
    }

    public void setAge(int age) {
        if(age > 0 && age < 120) {
            this.age = age;
        }
        else{
            throw new Error("age must be more than 0 and less than 120.");
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
                    throw new Error("education must be one of two values: 'среднее', 'высшее'.");
            }
    }

    public void setPosition(String position) {
        if(position != null && !position.isEmpty()) {
            this.position = position;
        }
        else{
            throw new Error("position must not be empty.");
        }
    }

}
