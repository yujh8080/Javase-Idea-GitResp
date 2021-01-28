package cn.sjxy;


import java.awt.*;

/**
 * @Auther: yujh
 * @Date: 2021/1/28 - 01 - 28 - 19:01
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class Bullet {
    private static final int SPEED=10;

    private int x,y;
    private  Dir dir;
    private static int WIDTH=30,HEIGHT=30;

    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        Color c=g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x,y,WIDTH,HEIGHT);
        move();

    }
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
    }
}
