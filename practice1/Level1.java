public class Level1 {
    public static void main(String[] args) {
        int i, j;
        System.out.println("乘法口诀表：");
        for (i = 1; i <= 9; i++) {
            for (j = 1;j <= i;j++) {
                System.out.print(j + "*" + i + "=" + (j * i)+" ");
            }
            System.out.println();//每输出一行，换行
        }
    }
}
