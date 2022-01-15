package day09_IfStatements;
/*2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18

 */
public class GradeLevel {
    public static void main(String[] args) {
     byte studentGradeLevel=16;//1~18
     boolean elementarySchool = studentGradeLevel>=1&&studentGradeLevel<=5;
        boolean middleSchool = studentGradeLevel>=6&&studentGradeLevel<=8;
        boolean highSchool = studentGradeLevel>=9&&studentGradeLevel<=12;
        boolean college = studentGradeLevel>=13&&studentGradeLevel<=16;
        boolean gradSchool = studentGradeLevel>=17&&studentGradeLevel<=18;

        if(elementarySchool){
            System.out.println("Student is in Elementary school");
        }
        if(middleSchool){
            System.out.println("Student is in Middle school");
        }
        if(highSchool){
            System.out.println("Student is in High school");
        }
        if(college){
            System.out.println("Student is in College");
        }
        if(gradSchool){
            System.out.println("Student is in Grad school");
        }











    }
}
