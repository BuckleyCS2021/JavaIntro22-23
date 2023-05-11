package practice;

public class MiddleSchoolStudent extends SchoolSuperClass{
    public static void main(String[] args){

        MiddleSchoolStudent jk = new MiddleSchoolStudent();
        jk.schoolid = "G456";
        jk.buildingnum = 201;
        jk.FirstName = "Jonathan";
        jk.LastName = "Karp";

        System.out.println(jk.FirstName +" " + jk.LastName);
        System.out.println("His G-Card is " + jk.schoolid + ". His room is " + jk.buildingnum+ ".");


    }

}
