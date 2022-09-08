public class Student {
   
    String surname;
    String firstname;
    char middleInitial;
    String dateOfBirth;
    int studentnumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
        System.out.println(" StudentNumber: " + studentnumber); 

    }

    public void sayMyEmailAddress() {
        System.out.println(" StudentEmailAddress: " + studentEmailAddress); 

    }

    public void sayIAmAwesome() {
        System.out.println(" IAmAwesome: " + iAmAwesome); 

    }

    public Student(String snm, String fnm, char mil, String bday, int stdntnm, String stdntemad, boolean awesome) {
        surname = snm;
        firstname = fnm;
        middleInitial = mil;
        dateOfBirth = bday;
        studentnumber = stdntnm;
        studentEmailAddress = stdntemad;
        iAmAwesome = awesome;    
    }
}    
