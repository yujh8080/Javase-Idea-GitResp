package cn.sjxy;

import java.awt.*;

/**
 * @Auther: yujh
 * @Date: 2021/1/26 - 01 - 26 - 10:30
 * @Description: cn.sjxy
 * @version: 1.0
 */
//坦克的实体类
public class Tank {
    private int x,y;//初始位置
    private Dir dir=Dir.DOWN;//初始方向
    private static final int SPEED=5;//速度

    public  static int WIDTH=ResourceMgr.tankD.getWidth();
    public  static int HEIGHT=ResourceMgr.tankD.getHeight();

    private boolean moving=false;//开始定义为静止状态

    private TankFrame tf=null;
    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }
    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public Tank(int x, int y, Dir dir,TankFrame tf) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf=tf;
    }
    //画坦克的方法
    //画坦克的时候确定是否需要移动
    public void paint(Graphics g) {
        switch (dir){
            case LEFT:
                g.drawImage(ResourceMgr.tankL,x,y,null);
                break;
            case UP:
                g.drawImage(ResourceMgr.tankU,x,y,null);
            break;
            case RIGHT:
                g.drawImage(ResourceMgr.tankR,x,y,null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.tankD,x,y,null);
                break;
        }

      //  g.drawImage(ResourceMgr.tankL,x,y,null);
        move();

    }
    //移动的方法
    private void move() {
        //如果moving是false就静止
        if(!moving) return;
        //否则就查看是哪一个方向
        switch (dir){
            case  LEFT:
                x-=SPEED;
                break;
            case  UP:
                y-=SPEED;
                break;
            case  RIGHT:
                x+=SPEED;
                break;
            case  DOWN:
                y+=SPEED;
                break;
        }


    }

    public void fire() {
         int bX=this.x+Tank.WIDTH/2-Bullet.WIDTH;
         int bY=this.y+Tank.HEIGHT/2-Bullet.HEIGHT/2;
        tf.bullets.add(new Bullet(bX,bY,this.dir,this.tf));
    }
}
