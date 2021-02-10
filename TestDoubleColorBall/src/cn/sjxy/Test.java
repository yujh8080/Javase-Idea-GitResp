package cn.sjxy;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;

/**
 * @Auther: yujh
 * @Date: 2020/7/23 - 07 - 23 - 8:17
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //定义一个数组用来接收数字
        int []balls=new int [7];
        //购买注数
        int count=0;
        //定义一个变量，用来设定是否购买彩票
        boolean isBuy=false;
       while(true){
           //写菜单
           System.out.println("--------欢迎进入双色球彩票系统---------");
           System.out.println("1.购买彩票");
           System.out.println("2.查看开奖");
           System.out.println("3.退出系统");
           System.out.println("请选择你要完成的功能");
           //拿一个扫描器
           Scanner sc=new Scanner(System.in);
           int choice = sc.nextInt();
           switch (choice){
               case 1:
                   System.out.println("双色球系统》》购买彩票");
                   System.out.println("请选择你要购买几注：");
                   count=sc.nextInt();//购买数量

                   for(int i=1;i<=7;i++) {//录入红色球
                       if (i != 7) {
                           System.out.println("请录入第" + i + "个红球");
                           int redBall = sc.nextInt();
                           balls[i - 1] = redBall;
                       }else{  //录入蓝色球
                           System.out.println("请录入一个蓝色球");
                           int blueBall=sc.nextInt();
                           balls[6]=blueBall;
                       }
                   }
                   //提示完整信息
                   System.out.println("您购买了"+count+"注彩票,一共消费了"+count*2+"元钱,您购买的彩票号码为：");
                   //遍历数组
                   for(int num:balls){
                       System.out.print(num+"\t");
                   }
                   System.out.println();
                   //彩票购买了
                   isBuy=true;
                   break;
               case 2:
                   if(isBuy==true){
                       //购买号码

                       //中奖号码
                        int[] luckBall=getLuckBall();

                       //将两组号码比对
                       int level=getLevel(balls,luckBall);
                       switch (level){
                           case 1:
                               System.out.println("恭喜您，中了1等奖，1注奖金500万，您一共获得了："+500*count+"万元");
                               break;
                           case 2:
                               System.out.println("恭喜您，中了2等奖，1注奖金500万，您一共获得了："+100*count+"万元");
                               break;
                           case 3:
                               System.out.println("恭喜您，中了3等奖，1注奖金30万，您一共获得了："+30*count+"万元");
                               break;
                           case 4:
                               System.out.println("恭喜您，中了4等奖，1注奖金5万，您一共获得了："+5*count+"万元");
                               break;
                           case 5:
                               System.out.println("恭喜您，中了5等奖，1注奖金2000元，您一共获得了："+2000*count+"元");
                               break;
                           case 6:
                               System.out.println("恭喜您，中了6等奖，1注奖金5元，您一共获得了："+5*count+"元");
                               break;

                       }
                       System.out.println("双色球系统》》查看开奖");
                   }else {
                       System.out.println("对不起，请先购买彩票");
                   }
                   break;
               case 3:
                   System.out.println("双色球系统》》退出系统");
                  return;
           }
       }
    }

    //定义一个方法用来专门生成中奖号码
    public static int[] getLuckBall(){
        //红球1-33，蓝球1-16
        int [] luckBall=new int[7];
        for(int i=1;i<=7;i++){
            if(i!=7){
                luckBall[i-1]=(int)(Math.random()*33)+1;
            }else{
                luckBall[6]=(int)(Math.random()*16)+1;
            }
        }
        return luckBall;
    }

    //定义一个方法用来比对购买号码和中奖号码
    public static int getLevel(int[] balls,int[] luckBall){
        int level=1;
        //计数器
        int redCount=0;
        int blueCount=0;
        //比对
        for(int i=0;i<=6;i++){
            if(i!=6){
                for(int j=0;j<=5;j++){
                    if(balls[i]==luckBall[j]){
                        redCount++;
                    }
                }
            }else{
                if(balls[6]==luckBall[6]){
                    blueCount++;
                }

            }
        }
        //输出比对结果
        System.out.println("红球有"+redCount+"个相等");
        System.out.println("蓝球有"+blueCount+"个相等");

        //根据红球和篮球的相等数量得到level
        if(redCount==6&&blueCount==1){
            level=1;
        }else if (redCount==6){
            level=2;
        }else if (redCount==5&&blueCount==1){
            level=3;
        }else if(redCount==5||redCount==4&&blueCount==1){
            level=4;
        }else if(redCount==4||redCount==3&&blueCount==1){
            level=5;
        }else {
            level=6;
        }

        return level;
    }

}
