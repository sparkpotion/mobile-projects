public class Level0 {
    public static void main(String[] args) {
        BingXiang aBingXiang = new BingXiang("一个冰箱");
        KaoXiang aKaoXiang = new KaoXiang("一个烤箱");
        YiGui aYiGui = new YiGui("一个衣柜");
        XiYiJi aXiYiJi = new XiYiJi("一个洗衣机");
        DongWu houzi = new DongWu("猴子");
        DongWu daxiang = new DongWu("大象");
        DongWu laohu = new DongWu("老虎");

        System.out.println("1");
        aBingXiang.kaiMen();
        daxiang.jinRu();
        aBingXiang.guanMen();

        System.out.println("2");
        aKaoXiang.kaiMen();
        laohu.jinRu();
        aKaoXiang.guanMen();

        System.out.println("3");
        aYiGui.kaiMen();
        houzi.jinRu();
        aYiGui.guanMen();

        System.out.println("4");
        aKaoXiang.kaiMen();
        houzi.jinRu();
        aKaoXiang.shaoKao(houzi.getName());

        System.out.println("5");
        aXiYiJi.kaiMen();
        laohu.jinRu();
        aXiYiJi.xi(laohu.getName());

    }


}

class XiangZi{
    int kuan;
    int gao;
    String name;

    public XiangZi(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGao() {
        return gao;
    }

    public int getKuan() {
        return kuan;
    }

    public void kaiMen(){
        System.out.println("打开"+name);
    }

    public void guanMen(){
        System.out.println("关闭"+name);
    }
}

class BingXiang extends XiangZi{

    private int wenDu;
    public BingXiang(String name){
        this.name =name;
    }
    public void setWenDu(int wenDu) {
        this.wenDu = wenDu;
    }

    public int getWenDu() {
        return wenDu;
    }


}//冰箱

class KaoXiang extends XiangZi{
    public  KaoXiang(String name){
        this.name=name;
    }
    private int wenDu;

    public void shaoKao(String dw){
        System.out.println("用"+name+"烤"+dw);
    }

}//烤箱

class YiGui extends XiangZi{


    public YiGui(String name){
        this.name =name;
    }

}//衣柜

class XiYiJi extends XiangZi{
    public  XiYiJi(String name){
        this.name=name;
    }

    public void xi(String dw){
        System.out.println("用"+name+"洗"+dw);
    }

}//洗衣机

class DongWu{
    private int gao;
    private int kuan;
    private int tiZhong;
    private String name;
    public DongWu(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getgao() {
        return gao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKuan() {
        return kuan;
    }

    public int getTiZhong() {
        return tiZhong;
    }

    public void jinRu(){
        System.out.println("把"+name+"放进去");
    }
}//动物