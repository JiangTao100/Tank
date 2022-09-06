import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author:JT
 * @Date:
 * @Description:
 * @version:1.0
 */
public class TanklFrame extends Frame {

    int x=200,y=200;



    public TanklFrame(){


        setSize(800,600);
        setResizable(true);
        setTitle("Tank war");
        setVisible(true);

        addKeyListener(new MyKeyListener());

        //window监听器，点击关闭按钮，实现关闭功能
        //匿名内部类，重写
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {//点击关闭按钮，会发生Closing
                // super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){//窗口重新绘制的时候系统自动调用
                                  //Graphics是一只画笔
        System.out.println("paint");
        g.fillRect(x,y,50,50);
        //x+=10;
    }


    //写一个内部类  重写方法
    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            //super.keyPressed(e);
            //x+=50;
            //repaint();//默认调用paint
            //System.out.println("key pressed");

            int key=e.getKeyCode();//获取被按下键的值
            switch(key){
                case KeyEvent.VK_LEFT:
                    x-=10;
                    break;
                case KeyEvent.VK_RIGHT:
                    x+=10;
                    break;
                case KeyEvent.VK_UP:
                    y-=10;
                    break;
                case KeyEvent.VK_DOWN:
                    y+=10;
                    break;

                default:
                    break;
            }


        }

        @Override
        public void keyReleased(KeyEvent e) {
          //  super.keyReleased(e);
            System.out.println("key released ");
        }
    }



}
