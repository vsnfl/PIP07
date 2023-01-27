public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Monika Kruk";
        System.out.println(student1.name + "\n");

        Student student2 = new Student();
        student2.name = "Biszkopt Miedziszyński";
        System.out.println(student2.name + "\n");

        Student numerStudenta1 = new Student();
        numerStudenta1.number = 26687;
        System.out.println(numerStudenta1.number + "\n");

        Student numerStudenta2 = new Student();
        numerStudenta2.number = 314159265;
        System.out.println(numerStudenta2.number + "\n");

        SecretStudent tajnyAgent = new SecretStudent();
        System.out.println(tajnyAgent.getName());
        System.out.println(tajnyAgent.getLastName());
        System.out.println(tajnyAgent.getNumber());

        tajnyAgent.setName("John Nash\n");
        System.out.println(tajnyAgent.getName());

        tajnyAgent.readFromScanner();
        tajnyAgent.print();

    }

}