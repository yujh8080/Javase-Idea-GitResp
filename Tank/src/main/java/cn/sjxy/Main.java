package cn.sjxy;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: yujh
 * @Date: 2021/1/25 - 01 - 25 - 17:08
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
       TankFrame tf=new TankFrame();
       while(true){
           Thread.sleep(50);
           tf.repaint();
       }

    }
}
