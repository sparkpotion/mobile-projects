import javax.swing.*;
import java.util.Scanner;
public class Level4 {
    public static void main(String[] args) {
        CaiPin caiDan[] = new CaiPin[5];
        caiDan[0] = new CaiPin(1,"辣子鸡丁",38);
        caiDan[1] = new CaiPin(2,"水煮肉片",22);
        caiDan[2] = new CaiPin(3,"糖醋里脊",18);
        caiDan[3] = new CaiPin(4,"干锅牛肉",38);
        caiDan[4] = new CaiPin(5,"干锅排骨",29);

        CanTing canTing[] = new CanTing[1];
        canTing[0] = new CanTing("国众饭店");

        System.out.println(canTing[0].huanYin());//欢迎

        for(CaiPin e:caiDan)//输出菜单
        System.out.println(e.getbianHao()+"."+e.getcaiMing()+" "+e.getjiaGe()+"元");
        System.out.println("请输入想要点的菜的序号");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();



        System.out.println("你一共选择了：");
        System.out.println(caiDan[a-1].getcaiMing()+" "+caiDan[a-1].getjiaGe()+"元");
        System.out.println("总计"+caiDan[a-1].getjiaGe()+"元");

        System.out.println("还有需要点的菜吗");
        for(CaiPin e:caiDan)//输出菜单
            System.out.println(e.getbianHao()+"."+e.getcaiMing()+" "+e.getjiaGe()+"元");
        System.out.println("请输入想要点的菜的序号");

        int b = in.nextInt();
        System.out.println("你一共选择了：");
        System.out.println(caiDan[a-1].getcaiMing()+" "+caiDan[a-1].getjiaGe()+"元");
        System.out.println(caiDan[b-1].getcaiMing()+" "+caiDan[b-1].getjiaGe()+"元");
        System.out.println("总计"+(caiDan[a-1].getjiaGe()+caiDan[b-1].getjiaGe())+"元");

        System.out.println("请选择付款方式");
        System.out.println("1.支付宝");
        System.out.println("2.微信");
        System.out.println("3.人脸识别");
        int c = in.nextInt();
        System.out.println(canTing[0].fuKuan(c));
    }
}

class CaiPin{
    private String caiMing;
    private int jiaGe;
    private int bianHao;

    public CaiPin(int bh,String cm,int jg){
        caiMing = cm;
        jiaGe = jg;
        bianHao = bh;
    }

    public int getjiaGe(){
        return jiaGe;
    }
    public int getbianHao(){
        return bianHao;
    }
    public String getcaiMing(){
        return caiMing;
    }

}

class CanTing{
    private String name;

    public CanTing(String n){
        name = n;
    }

    public String huanYin(){
        return "欢迎来到"+name+"，这是今天的菜单：";
    }

    public String fuKuan(int n){
        String tishi = "";
        switch (n) {
            case 1:tishi="请用支付宝扫码";break;
            case 2:tishi="请用微信扫码";break;
            case 3:tishi="请正脸面对摄像头";
        }
        return tishi;
    }

}
