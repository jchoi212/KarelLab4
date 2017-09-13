
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends BeeperBot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        moveToWall();
        followWall();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveToWall() {
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }
    public void followWall() {
        while (frontIsClear()) {
            move();
            checkHole();
        }
        if (frontIsClear() == false) {
             turnLeft();   
             followWall();
        }
    }
    public void checkHole() {
        turnRight();
        if (frontIsClear() == true) {
         move();   
         turnOff();
        }
            else{
             turnLeft();   
            }
    }
    
}


