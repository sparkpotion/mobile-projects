import java.util.Random;
import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//阶数
        int[][] a1;
        int[][] a2;
        a1 = new int[n][n];
        a2 = new int[n][n];
        //给两个数组赋值,范围-100 - 100
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                Random r = new Random();
                a1[i][j]= r.nextInt(200)-100;
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                Random r = new Random();
                a2[i][j]= r.nextInt(200)-100;
            }
        }

        System.out.println("数组1：");//输出两个数组
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int shuChu = a1[i][j];
                System.out.printf("%4d",shuChu);
            }
            System.out.println();
        }
        System.out.println("数组2：");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n;j++) {
                int shuChu = a2[i][j];
                System.out.printf("%4d",shuChu);
            }
            System.out.println();
        }

        System.out.println("两矩阵相乘：");//计算矩阵乘法
        int [][] sum;
        sum = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                for(int k = 0;k < n;k++) {
                    sum[i][j]=a1[i][k]*a2[k][j];
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n;j++) {
                int shuChu = sum[i][j];
                System.out.printf("%8d",shuChu);
            }
            System.out.println();
        }

        System.out.println("对角线和：");//计算对角线和
        int sum2 = 0;
        for (int i=0; i<n; i++) {
            sum2 = sum2 + sum[i][i];
        }
        System.out.println(sum2);
    }
}
