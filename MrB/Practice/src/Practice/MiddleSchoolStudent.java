package Practice;

public class MiddleSchoolStudent extends SchoolSuperClass{

    public static void main(String[] args){

        MiddleSchoolStudent pj = new MiddleSchoolStudent();
        pj.schoolid = "G123";
        pj.buildingnum = 201;
        pj.FirstName = "Paul";
        pj.LastName = "Barker";

        System.out.println(pj.FirstName + " " + pj.LastName);
        System.out.println("His g card is " + pj.schoolid + ". His room is " + pj.buildingnum + ".");

        pj.street_address();
    }
}
