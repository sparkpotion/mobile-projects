public class WuJiaoXing
{
    public static void main(String[] args){
        int shang = 6;//上六行
        int xia = 25 ;//剩余部分
        int kuan =50;//宽度
        for (int i = 1;i <= shang + xia;i++){
            for(int j = 1;j <= kuan;j++){
                if (i <= shang) {
                    if(j >= (kuan/2+1)+1 - i && j <= (kuan/2+1)-1 + i){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }

                if (i > shang && i <= xia){
                    if(j >= 28 - i && j <= kuan - 3*(i-shang)){
                        System.out.print("*"); // 一个三角
                    }
                    else if(j < kuan-27 + i && j >= 3*(i-shang)){
                        System.out.print("*"); //另一个三角
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println(" ");
        }
    }

}
