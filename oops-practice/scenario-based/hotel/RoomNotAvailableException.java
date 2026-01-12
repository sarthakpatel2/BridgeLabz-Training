package hotel;

class RoomNotAvailableException extends Exception {
    RoomNotAvailableException(String msg) {
        super(msg);
    }
}
