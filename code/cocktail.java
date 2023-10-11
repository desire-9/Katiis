package code;

import java.util.Arrays;
import java.util.Scanner;

public class cocktail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        //输入数组
        int[] a = new int[m];
        for (int i = 0 ; i < m; i++){
            a[i] = sc.nextInt();
        }
        //排序
        Arrays.sort(a);

        //开始比较
        int flag = 0;
        for(int i = m - 1; i > 0 ; i--){
            if (a[i]-(i * n) <= 0){
                System.out.println("NO");
                break;
            }
            flag = 1;
        }

        if (flag == 1){
            System.out.println("YES");
        }

    }
}
