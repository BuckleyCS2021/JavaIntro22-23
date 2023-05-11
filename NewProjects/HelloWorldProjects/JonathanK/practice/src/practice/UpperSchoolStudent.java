package practice;

public class UpperSchoolStudent extends SchoolSuperClass {
    public static void main(String[] args){

        UpperSchoolStudent jk = new UpperSchoolStudent();
        jk.schoolid = "G456";
        jk.buildingnum = 1;
        jk.FirstName = "Jonathan";
        jk.LastName = "Karp";

        System.out.println(jk.FirstName +" " + jk.LastName);
        System.out.println("His G-Card is " + jk.schoolid + ". His room is " + jk.buildingnum+ ".");


    }

}
