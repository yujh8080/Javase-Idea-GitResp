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
    Tank myTank=new Tank(200,200,Dir.DOWN,this);//坦克对象
    Bullet b=new Bullet(300,300,Dir.DOWN);//子弹对象
    static final int GAME_WIDTH=800,GAME_HEIGHT=600;
    //初始化界面
    public TankFrame() {
        setSize(GAME_WIDTH, GAME_HEIGHT);
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

    //双缓冲解决画面闪烁问题
    //先把图片画到内存里，再用画笔将内存里的图片全部画到屏幕上
   Image offScreenImage=null;//在内存里定义一张图片

    @Override
    public void update(Graphics g) {
        if(offScreenImage==null){
            offScreenImage=this.createImage(GAME_WIDTH,GAME_HEIGHT);//创建图片
        }
        Graphics gOffScreen=offScreenImage.getGraphics();
        Color c=gOffScreen.getColor();
        gOffScreen.setColor(Color.BLACK);
        gOffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage,0,0,null);
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
                case KeyEvent.VK_CONTROL:
                    myTank.fire();
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
