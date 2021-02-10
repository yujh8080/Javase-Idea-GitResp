package Date;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: yujh
 * @Date: 2020/7/5 - 07 - 05 - 17:08
 * @Description: cn.sjxy
 * @version: 1.0
 */
//窗体类
public class StartGame {
    public static void main(String[] args) {
        //创建一个窗体
        JFrame jf=new JFrame();
        //窗体的标题
        jf.setTitle("贪吃蛇小游戏");
        //获取屏幕的宽度
        int width= Toolkit.getDefaultToolkit().getScreenSize().width;
        //获取屏幕的高度
        int height=Toolkit.getDefaultToolkit().getScreenSize().height;
        //设置窗体的位置
        jf.setBounds((width-800)/2,(height-800)/2,800,800);
        //在关闭窗体的时候程序也要停止
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //进行设置让窗体大小不可变
        jf.setResizable(false);
        //创建一个面板
         GamePanel gp=new GamePanel();
        //将面板放入窗体中
        jf.add(gp);
        //将窗体展现出来，（必须放在最后）
        jf.setVisible(true);
    }
}
