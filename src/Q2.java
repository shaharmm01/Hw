import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int round1=0, round2=0, round3=0;
        int series = 0;
        double avg = 0;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the 1st throw:");
        round1 = s.nextInt();
        System.out.println("enter the 2nd throw:");
        round2 = s.nextInt();
        System.out.println("enter the 3rd throw:");
        round3 = s.nextInt();

        series = round1 + round2 + round3;
        System.out.println("the sum of  all throws is:"+series);

        avg = (double)series / 3;
        System.out.println("the average is:"+avg);

    }
}
