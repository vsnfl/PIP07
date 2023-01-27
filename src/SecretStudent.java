import java.util.Scanner;

public class SecretStudent {
    private String name = "Thomas A.";
    private String lastName = "Anderson";
    private int number = 1123581321;
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getNumber(){
        return number;
    }

    public void setName(String name) {
        if (this.name.isEmpty()) {
            return;
        }
        this.name = name;
    }

    public void readFromScanner(){
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Give me your name now!");
        this.name = skanuj.nextLine();
        System.out.println("Give me your LAST name now!");
        this.lastName = skanuj.nextLine();
        System.out.println("Give me your STUDENT NUMBER now!");
        this.number = skanuj.nextInt();
    }

    public void print(){
        System.out.println(name + " " + lastName + " " + number);
    }
}
