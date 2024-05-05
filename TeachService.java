public class TeachService {
    private String name;
    private int age;
    private String subject;

    public TeachService(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        print("Name: " + name);
        print("Age: " + age);
        print("Subject: " + subject);
    }

    public void print(String str){
        System.out.println(str);
    }
}
