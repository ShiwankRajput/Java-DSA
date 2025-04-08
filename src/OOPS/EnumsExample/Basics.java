package OOPS.EnumsExample;

public class Basics {

    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;

        //these are enums constant
        //public, static and final
        //since its final you can create child enums
        //type is Week

        Week(){
            System.out.println("Constructed has been called for " + this);
        }
    }

    enum Months implements A{
        Jan,Feb,March,April,May,June,July,August,September,October,November,December;

        Months(){
            System.out.println("Constructed Called for " + this);
        }

        @Override
        public void showMessage() {
            System.out.println("welcome to months calender");
        }
    }


    public static void main(String[] args) {

        Week week2 = Week.Tuesday;
        System.out.println(week2);
        System.out.println(week2.ordinal());  //ordinal basically means index

        for (Week day : Week.values()){
            System.out.println(day);
        }

        Week week3 = Week.Tuesday;


        // ---------------------------------------------------------- //


        Months month1 = Months.Jan;
        month1.showMessage();

    }
}
