package hotel;

abstract class Room{
    int roomNo;
    boolean available =true;

    Room(int roomNo){
        this.roomNo =roomNo;
    }
    abstract double getBasePrice();
}
