
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Problem1
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        checkLeft();
    }
    public void checkLeft() {
        while (!nextToABeeper()) {
            turnLeft();
            if (frontIsClear() == false) {
             putBeeper();
             turnRight();
             if (frontIsClear() == true) {
                 move();
                }
                    else{
                      turnRight();
                      move();
                    }
            }
                else{
                 move();
                 turnLeft();
                 move();
                }
        }
    }
}

