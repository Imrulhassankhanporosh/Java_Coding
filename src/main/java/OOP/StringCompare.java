package OOP;

public class StringCompare {
    public static void main (String[] args){
        String str1 = "welcome"; //Placed in SCP
        String str2 = "welcome"; //Refers to same Constant created earlier in SCP

//        Here str1 and str2 - address refers to same String Constant "Welcome" in the SCP.
//
//                So str1==str2 --> checks for the address reference and it returns boolean value true.
//
//                And str1.equals(str2) --> checks for the value "Welcome" and it returns boolean value true

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String s1 = new String("Swaroop"); //Creates new String Object in the Heap Memory

        String s2 = new String("Swaroop"); //Creates another new String Object in the Heap Memory


        //        Here s1 and s2 - address refers to different String Objects in the Heap Memory.
//
//                So s1==s2 --> checks for the address references in the Memory and it returns boolean value false.
//
//                And s1.equals(s2) --> checks for the value "Swaroop" and it returns boolean value true

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));



        String str3 = "Welcome"; //Created in SCP

        String str4 = new String("Welcome"); //Created in Heap memory - outside SCP



//        Here str1 refers to Constant in SCP and str2 refers to String Object in the Heap Memory.
//
//                So str1==str2 --> checks for the address references in the Memory and it returns boolean value false.
//
//                And s1.equals(s2) --> checks for the value "Welcome" and it returns boolean value true


        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));


        String ss1 = "Welcome"; // Placed in the SCP

        String ss2 = new String("Welcome"); //Heap Memory object

        String ss3 = ss2; //Refers to Heap memory object - s2



//        Here s1 refers to Constant in SCP, s2 refers to String Object in the Heap Memory and s3 refers to the same Object s2 in the Heap Memory.
//
//        So s1==s3 --> checks for the address references in the Memory and it returns boolean value false.
//
//                And s1.equals(s3) --> checks for the value "Welcome" and it returns boolean value true
//
//        And s2==s3 --> checks for the address references in the Memory and it returns boolean value true.
//
//                And s2.equals(s3) --> checks for the value "Welcome" and it returns boolean value true


        System.out.println(ss1==ss3);
        System.out.println(ss1.equals(ss3));
        System.out.println(ss2==ss3);
        System.out.println(ss2.equals(ss3));



    }
}
