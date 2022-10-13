import java.security.acl.LastOwnerException;
import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
       
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();
        method8();
        method9();
        method10();
    }
    
    static void method1(){
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();

        if (lastTwoDigits % 2 == 0) {
            System.out.println("EVEN");

        } else {
            System.out.println("ODD");
        }


    }
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)
    
    static void method2() {

            System.out.println("\n2. PRIME or COMPOSITE number");
            System.out.print("Enter the last digit of your student number: ");
            int lastDigit = scan.nextInt();
            
            if (isPrime(lastDigit)) {
                System.out.println(" PRIME ");
            } else if (lastDigit == 0|| lastDigit == 1) {
                System.out.println("NEITHER");
            } else {
                System.out.println("COMPOSITE");
            }
        }
        static boolean isPrime(int inVal) {
            if (inVal <= 1) {
                return false;
            }
            for (int i = 2; i <= inVal / 2; i++) {
                if ((inVal % i) == 0)
                    return false;
            }
            return true;
        }
        
        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
    
    static void method3() {    
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        firstName.length();
        surName.length();

        System.out.println(firstName.length() + surName.length());

    }    

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.
    
    static void method4() {
        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        int grtr = Math.max(firstNumber, secondNumber);
        int grtst = grtr;
        int x = Math.max(grtst, thirdNumber);
        System.out.println("\nThe largest number is " + x);


    }
        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
    
    static void method5() {
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        System.out.println(studentNumber - 2022000000);

    }
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
   
    static void method6() {
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        if (studentNumber == 2022101382) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
    static void method7() {
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();

        if (firstName == firstName.toUpperCase()){
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        if (surName == surName.toLowerCase()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

    }

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
    static void method8() {

            System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();
            
            if (course.equals("BSIT")){
                System.out.print("Are you taking MWAA or MAA?: ");
                String specialization1 = scan.next();
            if (specialization1.equals("MWAA")){
                System.out.println("You are a BSIT student with specialization in MWAA");
            } else {
            System.out.println("You are a BSIT student with specialization in MAA");
            }
            }else if (course.equals("BSCS")){
                System.out.print("Are you taking DF or ML?: ");
                String specialization2 = scan.next();
            if (specialization2.equals("DF")){
                System.out.println("You are a BSCS student with specialization in DF");
            } else{
                System.out.println("You are a BSCS student with specialization in ML");
            }
            } else{
                System.out.println("Enter a valid course");
            }
        }
        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME
        static void method9() {

            System.out.println("9. Selection");
            System.out.println("STEM");
            System.out.println("ICT");
            System.out.println("HUMSS");
            System.out.println("HOME ECONOMICS");
            System.out.println("ARTS AND DESIGN");
            System.out.println("TVL MARITIME");
            System.out.print("Enter your SHS strand: ");
            String strand = scan.next();
    
            switch (strand) {

            case "STEM":
            System.out.println("Your strand is valid." + "\n");
            break;

            case "ICT":
            System.out.println("Your strand is valid." + "\n");
            break;

            case "HUMSS":
            System.out.println("Your strand is valid." + "\n");
            break;

            case "HOME ECONOMICS":
            System.out.println("Your strand is valid." + "\n");
            break;

            case "ARTS AND DESIGN":
            System.out.println("Your strand is valid." + "\n");
            break;

            case "TVL MARITIME":
            System.out.println("Your strand is valid." + "\n");
            break;

            default:
                System.out.println("Your strand is INVALID!!" + "\n");
            }
        }
        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
    static void method10() {
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        
        if (studentEmailAddress.contains("pastranaap") && studentEmailAddress.contains("@students.national-u.edu.ph")) {
            System.out.println("Your email address is valid.");
        } else {
            System.out.println("Your email address is INVALID!");
        }
    }
        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3
    static void method11() {
        System.out.println("11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        scan.close();
    }
}
