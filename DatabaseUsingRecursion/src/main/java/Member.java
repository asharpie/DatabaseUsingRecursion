public class Member {
    private String name ="";
    private int age = 0;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Member() {
        name = "";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member: " + "name: " + name  +"\n"+ "         age: " + age+"\n"+"-------------------------------------" ;
    }
}
