package hotel;

class Reservation {
    Room room;
    Guest guest;
    Reservation(Room r, Guest g) {
        room = r;
        guest = g;
        room.available = false;
    }
}
