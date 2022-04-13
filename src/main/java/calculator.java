import java.util.*;

public class calculator {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double UsersInput = 0;
        double UsersInput1 = 0;
        String Operator = " ";
        boolean rightnumber = true;
        boolean rightnumber1 = true;
        boolean rightop = true;

        while(rightnumber) {
            System.out.print("First Number: ");
            try {
                UsersInput = Double.parseDouble(scanner.nextLine());
                rightnumber = false;
            } catch (NumberFormatException e) {}
        }
        while(rightnumber1) {
            System.out.print("Second Number: ");
            try {
                UsersInput1 = Double.parseDouble(scanner.nextLine());
                rightnumber1 = false;
            } catch (NumberFormatException e) {}
        }

        System.out.println(UsersInput + " + " + UsersInput1 + " = " + add(UsersInput,UsersInput1));
        System.out.println(UsersInput + " - " + UsersInput1 + " = " + minus(UsersInput,UsersInput1));
        System.out.println(UsersInput + " / " + UsersInput1 + " = " + divide(UsersInput,UsersInput1));
        System.out.println(UsersInput + " * " + UsersInput1 + " = " + multiply(UsersInput,UsersInput1));
    }

    public static double add(double UsersInput, double UsersInput1){
        return UsersInput + UsersInput1;
    }
    public static double minus(double UsersInput, double UsersInput1){
        return UsersInput - UsersInput1;
    }
    public static double divide(double UsersInput, double UsersInput1){
        return UsersInput / UsersInput1;
    }
    public static double multiply(double UsersInput, double UsersInput1){
        return UsersInput * UsersInput1;
    }
}
