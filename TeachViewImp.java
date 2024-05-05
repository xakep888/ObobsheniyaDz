public class TeachViewImp implements TeacherView {
    @Override
    public void displayTeacherInfo(String name, int age, String subject) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
