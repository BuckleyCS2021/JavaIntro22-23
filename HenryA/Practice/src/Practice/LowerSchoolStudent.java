package Practice;

public class LowerSchoolStudent extends SchoolSuperClass{

    public static void main (String[] args) {

        LowerSchoolStudent pj = new LowerSchoolStudent();

        pj.schoolid = "6123";
        pj.buildingnum = 1;
        pj.Firstname = "Paul";
        pj.Lastname = "Janitor";

        System.out.println(pj.Lastname + ", " + pj.Firstname);
        System.out.println(pj.schoolid);
        System.out.println(pj.buildingnum);
        pj.street_address();

    }

}
