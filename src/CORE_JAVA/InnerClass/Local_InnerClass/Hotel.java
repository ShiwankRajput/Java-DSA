package CORE_JAVA.InnerClass.Local_InnerClass;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms){
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){

        class ReserveValidator{

            boolean validator(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("guest name cannot be empty");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("please provide number of rooms you want");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Cannot get the number of rooms you want");
                    return false;
                }

                return true;
            }
        }

        ReserveValidator r = new ReserveValidator();

        if(r.validator()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation confirmed for " + guestName + " for " + numOfRooms + " rooms");
        }
        else {
            System.out.println("Reservation failed");
        }

    }

}
