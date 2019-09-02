
package classDemo;

/**
 *
 * @author Garrik Hoyt
 */
public class PoliceOfficer {
    private String officerName;
    private int badgeNum;
    
    public PoliceOfficer(String n, int b)
    {
        officerName = n;
        badgeNum = b;
    }
    public String getName()
    {
        return officerName;
    }
    public int getBadge()
    {
        return badgeNum;
    }
    public boolean isExpired(ParkedCar c, ParkingMeter m)
    {
        int minLeft = m.getMinMeter() - c.getMinParked();
        return minLeft < 0;
    }
    public void issueTicket(ParkedCar car, ParkingMeter meter)
    {
        if(isExpired(car, meter))
        {
            ParkingTicket ticket = new ParkingTicket(car, meter);
            System.out.println(ticket.getTicket(this));
        }
        else
        {
            System.out.println("No ticket to issue. Don't be a crooked cop!");
        }
    }
    
}
