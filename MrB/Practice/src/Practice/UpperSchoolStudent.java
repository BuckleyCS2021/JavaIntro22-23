package Practice;

public class UpperSchoolStudent extends SchoolSuperClass {

    public static void main(String[] args){

        UpperSchoolStudent pj = new UpperSchoolStudent();
        pj.schoolid = "G123";
        pj.buildingnum = 304;
        pj.FirstName = "Paul";
        pj.LastName = "Barker";

        System.out.println(pj.FirstName + " " + pj.LastName);
        System.out.println("His g card is " + pj.schoolid + ". His room is " + pj.buildingnum + ".");

        pj.street_address();
    }
}
