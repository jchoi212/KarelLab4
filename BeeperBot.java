
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        CollectRow();
        CollectRow();
        CollectRow();
        CollectRow();
        CollectRow();
        CollectRow();
        CollectRow();
        CollectRow();
    }
    public void CollectRow() {
        moveToRow();
        moveToEnd();
        collect();
        reposition();
    }
    public void moveToRow() {
        faceEast();
        while (!nextToABeeper()) {
            move();
        }
        if (nextToABeeper() == true) {
            faceNorth();
        }
    }
    public void moveToEnd() {
        while (nextToABeeper()) {
            move();
        }
        faceSouth();
    }
    public void collect() {
        move();
        while (nextToABeeper()) {
            pickBeeper();
            if (frontIsClear() == true) {
                move();
            }
                else{
                    reposition();
                }
        }
        
    }
    public void reposition() {
        faceEast();
    }
    public void faceNorth() {
        while (!facingNorth()){
            turnLeft();
        }
    }
    public void faceEast() {
        while (!facingEast()){
            turnLeft();
        }
    }
    public void faceSouth() {
        while (!facingSouth()){
            turnLeft();
        }
    }
    public void faceWest() {
        while (!facingWest()){
            turnLeft();
        }
    }
}