import java.util.Scanner;

public class Q2b {
    public static void main(String[] args) {

        System.out.print("Please Enter Module Code: ");

        Scanner input = new Scanner(System.in);
        String course = input.nextLine().toUpperCase();

        switch(course)
        {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC2902":
                System.out.println("Career and Professional Development");
                break;
            default:
                System.out.println("Invaild Module Code");
                break;
        }
        input.close();
    }
}
