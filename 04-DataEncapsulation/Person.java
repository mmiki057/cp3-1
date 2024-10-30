public class Person {
    private String name;
    private Integer age;

    public String getName(){
        return name;

    }

    public Integer age(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void isAdult(){
        if (age >= 18) {
            return True
        } else {
            return False
        }
    }
    }
}