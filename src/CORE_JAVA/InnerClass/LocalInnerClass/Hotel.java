package CORE_JAVA.InnerClass.LocalInnerClass;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms){
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

     public void reserveRoom(String guestName, int noOfRooms){

        class ReservationValidator{

            boolean validate(){
                if(guestName==null || guestName.isEmpty()){
                    System.out.println("please enter guest name");
                    return false;
                }
                if(noOfRooms<0){
                    System.out.println("Enter positive number of rooms");
                    return false;
                }
                if(reservedRooms+noOfRooms > totalRooms){
                    System.out.println("This number of rooms are not available, try to reduce number of rooms");
                    return false;
                }

                return true;
            }

        }

        ReservationValidator validator = new ReservationValidator();

        if(validator.validate()){
            System.out.println("Reservation confirmed for " + guestName + " for " + noOfRooms + "rooms");
        }
        else{
            System.out.println("Reservation failed");
        }

     }

}
