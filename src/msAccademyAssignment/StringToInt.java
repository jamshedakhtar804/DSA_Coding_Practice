package msAccademyAssignment;

public class StringToInt {

    public static void main(String[] args) {
        String str = "1234";
        
        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
