public enum Education {
    SECONDARY("Среднее"),
    HIGHER("Высшее");

    private final String education;

    Education(String education){
        this.education = education;
    }

    public String getEducation(){
        return this.education;
    }
}
