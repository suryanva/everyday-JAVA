package dayeight;

public class LaunchString {
    public static void main(String[] args) {
        String str = "Telusko";//Memory allocated in String Constant Pool which is inside heap area
        System.out.println(str);

        String str1 = new String("Telusko");//Memory allocated in main heap area not in string constant pool
        System.out.println(str);

        String str3 = "Telusko";
        // == is used to compare Strings using reference variables
        // .equals is used to compare String using only Value

        System.out.println(str==str1);// Comparing using reference values
        System.out.println(str.equals(str1));
        System.out.println(str==str3);// Comparing the values inside disregarding the references
    }
}
