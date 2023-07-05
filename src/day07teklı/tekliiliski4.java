package day07tekli;

public class tekliiliski4 {
    public static void main(String[] args) {
        int gradeLevel = 19;

        if ((gradeLevel <= 5) && (gradeLevel >= 1)) {
            System.out.println("Elementary School");
        }
        if ((gradeLevel <= 8) && (gradeLevel >= 6)) {
            System.out.println("Middle School");
        }
        if ((gradeLevel <= 12) && (gradeLevel >= 9)) {
            System.out.println("High School");
        }
        if ((gradeLevel <= 16) && (gradeLevel >= 13)) {
            System.out.println("College");
        }
        if ((gradeLevel == 18) || (gradeLevel == 17)) {
            System.out.println("Grad School");
        } else {
            System.out.println("Enter a grade level between 1-18");
        }
    }
}
