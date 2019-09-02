
package classDemo;

/**
 *
 * @author Garrik Hoyt
 */
public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licNum;
    private int minsParked;
    
    public ParkedCar(String ma, String mo, String c, String li)
    {
        make = ma;
        model = mo;
        color = c;
        licNum = li;
        minsParked = 0;
    }
    public ParkedCar(String ma, String mo, String c, String li, int m)
    {
        make = ma;
        model = mo;
        color = c;
        licNum = li;
        minsParked = m;
    }
    public void setMinutesParked(int min)
    {
        minsParked = min;
    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public String getColor()
    {
        return color;
    }
    public String getLic()
    {
        return licNum;
    }
    public int getMinParked()
    {
        return minsParked;
    }
}
