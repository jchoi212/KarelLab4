 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem2
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        turnLeft();
        move();
        travelPerimeter();
    }
    public void travelPerimeter() {
        while (!nextToABeeper()) {
            if (frontIsClear() == true) {
                turnRight();
                closeWindows();
            }   
                else{
                 if (frontIsClear() == false) {
                     turnLeft();
                    }
                }
        }
    }
    public void closeWindows() {
        if (frontIsClear() == true) {
                putBeeper();
                turnLeft();
                move();
            }
                else{
                    turnLeft();
                    move();
                }
        }
    }

