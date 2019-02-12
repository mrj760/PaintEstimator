package mjohnson.cs134.miracosta.edu.Model;


/**
    The <code>InteriorRoom</code> class calculates the amount of paint needed
    to re-coat a room

    @author: Micah Johnson
    @version: 1.0
 */

public class InteriorRoom {

    private int mDoors;
    private int mWindows;

    private double mHeight;
    private double mWidth;
    private double mLength;





    /**
     Standard door area (3 feet x 7 feet)
     */
    public static final double DOOR_AREA = 21.0;
    /**
        The avg area for windows is prob like 4x4 ft
     */
    public static final double WINDOW_AREA = 16.0;
    /**
        How many sq feet each gallon will cover
     */
    public static final double SQ_FT_PER_GALLON = 275.5;


    /**
     * Instantiates a new <code>InteriorRoom</code> provided with the number of doors,
     *         windows and its dimensions: width, height, and length
     * @param doors     num. of doors
     * @param windows   num. of windows
     * @param height    height of wall in feet
     * @param width     width of room in feet
     * @param length    length of room in feet
     */
    public InteriorRoom(int doors, int windows, double height, double width, double length) {
        mDoors = doors;
        mWindows = windows;
        mHeight = height;
        mWidth = width;
        mLength = length;
    }


    public int getDoors() {
        return mDoors;
    }

    public void setDoors(int doors) {
        mDoors = doors;
    }

    public int getWindows() {
        return mWindows;
    }

    public void setWindows(int windows) {
        mWindows = windows;
    }

    public double getHeight() {
        return mHeight;
    }

    public void setHeight(double height) {
        this.mHeight = height;
    }

    public double getWidth() {
        return mWidth;
    }

    public void setWidth(double width) {
        mWidth = width;
    }

    public double getLength() {
        return mLength;
    }

    public void setLength(double length) {
        mLength = length;
    }

    @Override
    public String toString() {
        return "InteriorRoom{" +
                "mDoors=" + mDoors +
                ", mWindows=" + mWindows +
                ", mHeight=" + mHeight +
                ", mWidth=" + mWidth +
                ", mLength=" + mLength +
                '}';
    }


    /**
     * take num of doors and windows and mult. them by their respective area values
     * we'll subtract this from first calculated area of room
     * @return  total area of all doors and windows in room
     */
    public double doorAndWindowArea() {
        return mDoors * DOOR_AREA + mWindows * WINDOW_AREA;
    }

    /**
     * get surface area of walls without accounting for doors and windows
     * @return -
     */
    public double totalSurfaceArea() {
        return (2*mWidth*mHeight) + (2*mLength*mHeight);
    }

    /**
     * subtract the total door and window area amount from the total wall surface area
     * @return  actual surface area to paint
     */
    public double wallSurfaceArea() {
        return totalSurfaceArea() - doorAndWindowArea();
    }

    public double gallonsOfPaintRequired() {
        return wallSurfaceArea()/275.0;
    }


}
