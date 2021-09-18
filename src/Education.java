public enum Education {
    SECONDARY("Среднее"),
    HIGHER("Высшее"),
    UNEDUCATED("Не образованный");

    private final String education;

    Education(String education){
        this.education = education;
    }

    public String getEducation(){
        return this.education;
    }
}
