import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        int a[]={10,13,12,17,9,11,15,7};
        int k;

        System.out.println("冒泡排序，从小到大：");
        for (int i = 0;i <= 7;i++){
            for (int j = 7;j > i;j--){
                if(a[j-1] > a[j]){
                    k = a[j-1];a[j-1] = a[j];a[j]=k;
                }
            }
        }
        for (int i = 0;i <= 7;i++){
            System.out.print(a[i]+" ");
        }


        System.out.println(" ");
        System.out.println("选择排序，从大到小");
        for (int i = 0;i <= 7;i++){
            k = i;
            for (int j = i;j <= 7;j++){
                if(a[j]>a[k]){
                    k = j;
                }
            }
            if(k != i){
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
        for (int i = 0;i <= 7;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println(" ");
        System.out.println("插入排序：");
        System.out.println("请输入一个要插入的数字");

        Scanner in = new Scanner(System.in);
        int chaRu = in.nextInt();//读取插入数字

        System.out.println("插入数字"+chaRu+"之后的数组为：");

        int[] a2=java.util.Arrays.copyOf(a,9);
        int weiZhi = 0;//标记插入数字的位置

        for (int i = 0;i <= 7;i++){

            if(a[i]<chaRu){
                weiZhi=i;
                break;
            }
            weiZhi = 8;

        }//标记位置

        for (int i = 8;i > weiZhi;i--){
            a2[i] = a2[i-1];
        }//数组后移，插入位置

        a2[weiZhi] = chaRu;
        for (int i = 0;i <= 8;i++){
            System.out.print(a2[i]+" ");
        }
    }
}
