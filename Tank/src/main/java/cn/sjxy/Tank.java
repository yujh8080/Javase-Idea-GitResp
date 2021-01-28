package cn.sjxy;

import java.awt.*;

/**
 * @Auther: yujh
 * @Date: 2021/1/26 - 01 - 26 - 10:30
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class Tank {
    private int x,y;
    private Dir dir=Dir.DOWN;
    private static final int SPEED=5;
    private boolean moving=false;

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Tank(int x, int y, Dir dir) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
        move();

    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    private void move() {
        if(!moving) return;
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
}
