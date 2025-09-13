public abstract class User {

    //Class fields
    private String name;
    private int age;

    //Class constructor
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter to make the fields readable
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //Setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Abstract method
        public abstract String getRole();


}
