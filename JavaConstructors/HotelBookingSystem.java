public class HotelBookingSystem{
    //Attribute
    String guestName;
    String roomType;
    int nights ;
    //default constructor
    HotelBookingSystem(){
        guestName = "aditya";
        roomType = "AC";
        nights = 2;
    }
    //parameterized constructore
    HotelBookingSystem(String guestName , String roomType , int nights){
        this.guestName= guestName;
        this.roomType = roomType;
        this.nights= nights;
    }
    //copy cunstructore
    HotelBookingSystem(HotelBookingSystem copy){
        this.guestName=copy.guestName;
        this.roomType=copy.roomType;
        this.nights=copy.nights;
    }
    // method to print details
    /**
     * 
     */
    public void display(){
        System.out.println("Guest name ="+ guestName "Room type = "+ roomType "nights= "+ nights);
    }
    public static void main(String[] args){
        // defining objects
        HotelBookingSystem hotelBookingSystem1 = new HotelBookingSystem();
        HotelBookingSystem hotelBookingSystem2 = new HotelBookingSystem("rahul" , "Ac", 3);
        HotelBookingSystem hotelBookingSystem3 = new HotelBookingSystem(hotelBookingSystem2);
        //Calling method
        hotelBookingSystem1.display();
        hotelBookingSystem2.display();
        hotelBookingSystem3.display();
    }
}
