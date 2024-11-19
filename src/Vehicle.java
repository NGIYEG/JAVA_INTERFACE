public class Vehicle implements Movable {
    String type;
    int speed;
    public Vehicle(String type, int speed){
        this.type=type;
        this.speed=speed;
    }
    public  void move()
    {
     System.out.println("The "  +type+ " is moving at a speed of "  +speed+ "km/h");
    }

}
