package cn.sjxy;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: yujh
 * @Date: 2021/1/25 - 01 - 25 - 17:19
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class TankFrame extends Frame {
    Tank myTank=new Tank(200,200,Dir.DOWN);//坦克对象
    Bullet b=new Bullet(300,300,Dir.DOWN);//子弹对象
    //初始化界面
    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);
    //添加对键盘的监听器
        this.addKeyListener(new MyKeyListener());
        //匿名内部类
        //实现点击叉号就退出的功能
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //画出坦克和子弹
    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
        b.paint(g);
    }

    //处理对键盘的监听
    class MyKeyListener extends KeyAdapter {
     //方向默认都是false
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;


        //一个键被按下去的时候调用
        //把方向设置为true
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            //这个方法用来设置主战坦克的方向
            setMainTankDir();

        }

        //一个键被抬起的时候调用
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                default:
                    break;

            }
            setMainTankDir();

        }

        //设置方向
        private void setMainTankDir() {
            //如果方向都没有被按下就静止
            if(!bL&&!bU&&!bR&&!bD)  myTank.setMoving(false);
            else {
                myTank.setMoving(true);
                if (bL) myTank.setDir(Dir.LEFT);
                if (bU) myTank.setDir(Dir.UP);
                if (bR) myTank.setDir(Dir.RIGHT);
                if (bD) myTank.setDir(Dir.DOWN);
            }
        }
    }

}
