package day07tekli;

public class homework {
    public static void main(String[] args) {
        double judge1= 2;
        double judge2= 3;
        double judge3= 4;
        double averageScore = ((judge1+judge2+judge3)/3);
        System.out.println("averageScore = " + averageScore);
        double contestant2 = 7;
        double contestant3 = 6;
        if(averageScore>contestant2 && averageScore > contestant3) {
            System.out.println("Congratulations! You earned first place with a score of " + averageScore);
        } else if (averageScore>contestant2 && averageScore < contestant3) {
            System.out.println("Weldone! You earned second place with a score of " + averageScore);
        }else {
            System.out.println("Try again! You earned third place with a score of " + averageScore);
        }
    }

}
