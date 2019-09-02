
package classDemo;

import java.lang.Math;

/**
 *
 * @author Garrik Hoyt
 */
public class ParkingTicket {
    private String make;
    private String model;
    private String color;
    private String licNum;
    private int minParked;
    private int minPurchased;
    private int fineAmt;
    private static int tNum = 1;
    
    public ParkingTicket(ParkedCar c, ParkingMeter m)
    {
        make = c.getMake();
        model = c.getModel();
        color = c.getColor();
        licNum = c.getLic();
        minParked = c.getMinParked();
        minPurchased = m.getMinMeter();
        
        int minutesOver = minParked - minPurchased;
        int fine = 0;
        if(minutesOver > 0)
        {
            if(minutesOver <= 60)
            {
                fine = 25;
            }
            else
            {
                fine = 25 + (int)(10 * (Math.ceil(minParked / 60.0) -1) );
            }
        }
        fineAmt = fine;
    }
    
    public int getFineAmt()
    {
        return fineAmt;
    }
    public String getTicket(PoliceOfficer cop)
    {
        String ticketInfo = "\n***** Ticket Number: " + tNum + " *****"
                            + "\nMake: " + make + ", Model: " + model + ", Color: "
                            + color + "\nLicence Plate Number: " + licNum
                            + "\nFine: $" + fineAmt + "\nIssuing Officer: "
                            + cop.getName() + " " + cop.getBadge() 
                            + "\nMinutes Parked: " + minParked
                            + "\nMinutes Purchased: " + minPurchased + "\n";
        tNum += 1;
        return ticketInfo;
    }
    
    
}
