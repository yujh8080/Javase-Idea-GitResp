package cn.sjxy;


import java.awt.*;

/**
 * @Auther: yujh
 * @Date: 2021/1/28 - 01 - 28 - 19:01
 * @Description: cn.sjxy
 * @version: 1.0
 */
//子弹的实体类
public class Bullet {
    private static final int SPEED=10;//速度

    private int x,y;//初始位置
    private  Dir dir;//方向
    private static int WIDTH=30,HEIGHT=30;//大小
    private boolean live=true;
    TankFrame tf=null;

    public Bullet(int x, int y, Dir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf=tf;
    }

    //子弹画自己的方法
    public void paint(Graphics g) {
        if(!live){
           tf.bullets.remove(this);
        }
        Color c=g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x,y,WIDTH,HEIGHT);
        move();

    }
    //移动的方法（这里没有静止的判断）
    private void move() {
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
        if(x<0||y<0||x>TankFrame.GAME_WIDTH||y>TankFrame.GAME_HEIGHT) live=false;

    }
}
