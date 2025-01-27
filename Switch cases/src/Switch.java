import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter employeeID:");
        int empId =input.nextInt();


        switch (empId) {
            case 1:
                System.out.println("Chaitanya");
                break;
            case 2:
                System.out.println("thorfin");
                break;
            case 3:
                System.out.println("eren");
                System.out.print("enter your department:");
                String department = input.next();
                switch (department) {
                    case "management" -> System.out.println("management department");
                    case "it" -> System.out.println("IT department");
                    case "hr" -> System.out.println("HR department");
                    default -> System.out.println("invalid department");
                }
                break;
            default:
                System.out.println("invalid empId");
                break;
        }
    }
}