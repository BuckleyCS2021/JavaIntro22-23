package Practice;

public class UpperSchoolStudent extends SchoolSuperClass{

    public static void main(String[] args){

        UpperSchoolStudent Mg = new UpperSchoolStudent();
        Mg.schoolid = "G5757577854";
        Mg.room_num = 306;
        Mg.FirstName = "Miles";
        Mg.LastName = "Goldsmith";

        System.out.println(Mg.FirstName + " " + Mg.LastName);
        System.out.println("G Card Id is " + Mg.schoolid + ". Room number is " + Mg.room_num + ".");
        Mg.street_adress();
    }

}
