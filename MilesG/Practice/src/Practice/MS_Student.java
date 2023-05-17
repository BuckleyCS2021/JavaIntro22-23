package Practice;

public class MS_Student extends SchoolSuperClass{

    public static void main(String[] args){

        MS_Student Vg = new MS_Student();
        Vg.schoolid = "G65456888";
        Vg.room_num = 105;
        Vg.FirstName = "Violet";
        Vg.LastName = "Goldsmith";

        System.out.println(Vg.FirstName + " " + Vg.LastName);
        System.out.println("G Card Id is " + Vg.schoolid + ". Room number is " + Vg.room_num + ".");
        Vg.street_adress();
    }
}
