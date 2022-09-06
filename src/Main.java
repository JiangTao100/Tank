/**
 * @Author:JT
 * @Date:
 * @Description:
 * @version:1.0
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Frame f=new Frame();
//        f.setSize(800,600);
//
//        f.setResizable(true);
//        f.setTitle("Tank war");
//        f.setVisible(true);
//
//        //window监听器，点击关闭按钮，实现关闭功能
//                             //匿名内部类，重写
//        f.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {//点击关闭按钮，会发生Closing
//               // super.windowClosing(e);
//                System.exit(0);
//            }
//        });

        TanklFrame tRF=new TanklFrame();


        while (true){

            Thread.sleep(50);//可能会发生异常，不做处理扔给上一层
            tRF.repaint();
        }










    }

}
