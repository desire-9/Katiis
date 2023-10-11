package code;
import java.util.Scanner;
//public class Areal {
//    public double newton_sqrt(double num){
//        double guess = num / 2;
//        double e = 0.00000000001;
//        double e0 = e + 1;
//        int count = 0;
//        while(e0 > e){
//            guess = (guess + num  / guess) / 2;
//            e0 = guess * guess - num;
//            count++;
////            System.out.println("times: " + count + " guess: " + guess);
//        }
//        return guess;
//    }

public class Areal {
    public static void main(String[] args) {
        double m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextDouble();
        sc.close();

        //借助别人写好的  无语住了
        double s = Math.sqrt(m);

        System.out.println(s * 4);
    }
}