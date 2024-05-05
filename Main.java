public class Main {
    public static void main(String[] args){
        Student student1 = new Student(1, "a","A","4");
        Student student2 = new Student(2, "A","A","5");
        Student student13 = new Student(3, "B","B","B");

        studentGroup studentgroup = new studentGroup();
        studentgroup.add(student13);
        studentgroup.add(student1);
        studentgroup.add(student2);

       StudentGroupService service = new StudentGroupService(studentgroup);
        for(Student student: studentgroup){
            System.out.println(student);
        }

        System.out.println();

        for(Student student: service.getSortedStudentGroup()){
            System.out.println(student);
        }
        System.out.println();

        for(Student student: service.getSortedStudentGroupFio()){
            System.out.println(student);
        }

        TeachService teacher = new TeachService("Aleks", 45, "Russia");
        TeachService teacher2 = new TeachService("Masha", 40,"Ukraina");
        teacher.printInfo();
        System.out.println();
        teacher2.printInfo();
        System.out.println();

        TeachViewImp teach = new TeachViewImp();
        teach.displayTeacherInfo("Aleks", 45,"Russia");


    }

}
