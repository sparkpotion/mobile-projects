import java.util.Scanner;
import java.util.ArrayList;

public class Level3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String>  shuRU = new ArrayList<String>();
        ArrayList<XiaoBin> xb = new ArrayList<XiaoBin>();


        System.out.println("请输入我方英雄属性（名称、生命力、攻击力、防御力）");
        YinXiong yx=new YinXiong(in.next(),in.nextInt(),in.nextInt(),in.nextInt());

        System.out.println("请输入敌方小兵属性（名称、生命力、攻击力、防御力）(输入”end“以结束输入）");
        String x;
        do{
            String xe = in.next();
            x = xe;
            shuRU.add(xe);
        }while(!(x.equals("end")));

        XiaoBin xiaobin[] = new XiaoBin[shuRU.size()/4];
        for(int i=0;i<(shuRU.size()-1)/4;i++) {
            int k = i*4;
            xiaobin[i] = new XiaoBin(i);
            xb.add(xiaobin[i]);

            xiaobin[i].setName(shuRU.get(k));
            xiaobin[i].setHp(shuRU.get(k+1));
            xiaobin[i].setAtk(shuRU.get(k+2));
            xiaobin[i].setDfn(shuRU.get(k+3));
        }//输入小兵----------------------------------------------


        System.out.println("战斗开始了");
        int flag;
        do{
            flag = 0;
            for(int i = 0;i<xb.size();i++){
                if (xb.get(i).huozhe()){flag = 1;}
                if (flag== 0 && i == xb.size()-1){System.out.println(yx.getName()+"战胜了小兵！");}
            }
            if (flag == 1 && !yx.huozhe()){
                System.out.println(yx.getName()+"被小兵打败了！");
            }
            //判断是否存活及输出结果-------------------------------------------------
            for(int i = 0;i<xb.size();i++){
                if (xb.get(i).huozhe()){yx.attack(xb.get(i));break;}
            }
            for(int i = 0;i<xb.size();i++){
                if (xb.get(i).huozhe()){xb.get(i).attack(yx);}
            }

        }while(flag == 1 && yx.huozhe());


    }

}

class YinXiong{//英雄-----------------------------------------------------
    private String name;
    private int hp;
    private int atk;
    private int dfn;
    public YinXiong(String name,int hp,int atk,int dfn){
        this.name=name;
        this.atk=atk;
        this.hp=hp;
        this.dfn=dfn;
    }

    public String getName() {
        return name;
    }
    public int getDfn() {
        return dfn;
    }

    public void addZB(int addAtk, int addhp, int adddfn){
        atk = atk+addAtk;
        dfn = dfn+adddfn;
        hp = hp+addhp;
    }
    public void attack(XiaoBin a){
        Float n = atk/(1+Float.valueOf(a.getDfn())/100);
        System.out.println(name+"对"+a.getName()+"造成了"+Math.round(n)+"点伤害");
        a.beattack(Math.round(n));
    }
    public void beattack(int n){
        hp = hp - n;
    }
    public boolean huozhe(){
        if(hp<=0){return false;}else{return true;}
    }
}

class ZhuangBei{//装备
    private String name;
    private int hp;
    private int atk;
    private int dfn;
    private ZhuangBei(String name,int hp,int atk,int dfn){
        this.name=name;
        this.atk=atk;
        this.hp=hp;
        this.dfn=dfn;
    }

    public int getAtk() {
        return atk;
    }
    public int getDfn() {
        return dfn;
    }
    public int getHp() {
        return hp;
    }
}

class XiaoBin{//小兵-------------------------------------------------------------
    private String name;
    private int hp;
    private int atk;
    private int dfn;
    private int xh;
    public XiaoBin(int xh){
        this.xh=xh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtk(String atk) {
        this.atk = Integer.valueOf(atk);
    }

    public void setDfn(String dfn) {
        this.dfn = Integer.valueOf(dfn);
    }

    public void setHp(String hp) {
        this.hp = Integer.valueOf(hp);
    }

    public String getName() {
        return name;
    }

    public int getDfn() {
        return dfn;
    }

    public int getHp() {
        return hp;
    }

    public void attack(YinXiong b){
        Float n = atk/(1+Float.valueOf(b.getDfn())/100);
        System.out.println(name+"对"+b.getName()+"造成了"+Math.round(n)+"点伤害");
        b.beattack(Math.round(n));
    }
    public void beattack(int n){
        hp = hp - n;
    }
    public boolean huozhe(){
        if(hp<=0){return false;}else{return true;}
    }
}