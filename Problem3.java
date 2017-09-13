 
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
        travelPerimeter();
        closeWindows();
    }
    public void travelPerimeter() {
        while (!nextToABeeper()) {
            
        }
    }
}

