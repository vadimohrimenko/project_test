import javax.swing.JFrame;
/**
 *
 * @author v
 */
public class FrameTest {

        public static void main(String[] args){

            JFrame frame = new JFrame();

            frame.setSize(600, 400);
            frame.setTitle("My Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            RectangleComponent comp = new RectangleComponent(150,0);
            SnowmanComponent smc =  new SnowmanComponent(100, 100, 50);
            HouseComponent hc = new HouseComponent(100, 200, 100);
            //frame.add(comp);
            //frame.add(smc);
            frame.add(hc);
            frame.setVisible(true);
        }
}
