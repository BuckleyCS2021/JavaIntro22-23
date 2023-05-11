package Practice;

public class LowerSchoolStudent extends SchoolSuperClass{

    public static void main(String[] args){

        LowerSchoolStudent pj = new LowerSchoolStudent();
        pj.schoolid = "G123";
        pj.buildingnum = 1;
        pj.FirstName = "Paul";
        pj.LastName = "Barker";

        System.out.println(pj.FirstName + " " + pj.LastName);
        System.out.println("His g card is " + pj.schoolid + ". His room is " + pj.buildingnum + ".");

        pj.street_address();
    }
}
