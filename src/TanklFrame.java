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

    Tank myTank=new Tank(200,200,Dir.DOWN);


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
        myTank.paint(g);

    }


    //写一个内部类  重写方法
    class MyKeyListener extends KeyAdapter {

        boolean bL=false;
        boolean bR=false;
        boolean bU=false;
        boolean bD=false;


        @Override
        public void keyPressed(KeyEvent e) {


            int key=e.getKeyCode();//获取被按下键的值
            switch(key){
                case KeyEvent.VK_LEFT:
                    bL=true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR=true;
                    break;
                case KeyEvent.VK_UP:
                    bU=true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD=true;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }



        @Override
        public void keyReleased(KeyEvent e) {

            int key=e.getKeyCode();
            switch(key){
                case KeyEvent.VK_LEFT:
                    bL=false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR=false;
                    break;
                case KeyEvent.VK_UP:
                    bU=false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD=false;
                    break;
                default:
                    break;
            }


            setMainTankDir();


        }

        private void setMainTankDir() {
            if(bL) myTank.setDir(Dir.LEFT) ;
            if(bR) myTank.setDir(Dir.RIGHT) ;
            if(bU) myTank.setDir(Dir.UP) ;
            if(bD) myTank.setDir(Dir.DOWN) ;
        }




    }



}
