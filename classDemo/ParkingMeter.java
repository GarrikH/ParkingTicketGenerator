
package classDemo;

/**
 *
 * @author Garrik Hoyt
 */
public class ParkingMeter {
    private int minPurchased;
    
    public ParkingMeter(int m)
    {
        minPurchased = m;
    }
    public int getMinMeter()
    {
        return minPurchased;
    }
    public void addMins(int min)
    {
        minPurchased += min;
    }
}
