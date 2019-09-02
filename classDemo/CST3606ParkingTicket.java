
package classDemo;

/**
 *
 * @author Garrik Hoyt
 */
public class CST3606ParkingTicket {

    
    public static void main(String[] args) {
        //Car with expired meter
        ParkedCar car1 = new ParkedCar("Mercedes", "190e", "Red", "LKE-32I8", 108);
        ParkingMeter meter1 = new ParkingMeter(42);
        PoliceOfficer off1 = new PoliceOfficer("John Smith", 23023);
        System.out.println("Meter1, Car1 time Expired? " 
                            + off1.isExpired(car1, meter1));
        off1.issueTicket(car1, meter1);
        
        //2nd car with expired meter
        ParkedCar car2 = new ParkedCar("BMW", "540i", "Black", "KEW-392L", 233);
        ParkingMeter meter2 = new ParkingMeter(70);
        PoliceOfficer off2 = new PoliceOfficer("Paul Harris", 38204);
        System.out.println("Meter2, Car2 time Expired? " 
                            + off2.isExpired(car1, meter1));
        off2.issueTicket(car2, meter2);
        
        //car with time left
        ParkedCar car3 = new ParkedCar("VW", "Phaeton", "Blue", "LEP-3K2O", 33);
        ParkingMeter meter3 = new ParkingMeter(70);
        System.out.println("Meter3, Car3 time expired? " 
                            + off1.isExpired(car3, meter3));
        //Try to issue ticket
        off1.issueTicket(car3, meter3);
    }
    
}
