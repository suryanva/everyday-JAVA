package dayeight;

public class Launch6 {
    public static void main(String[] args) {
        String s1 = "Telusko";//SCP
        String s2 = "Ineuron";//SCP
        String s3 = "Telusko" + "Ineuron";//SCP
        String s4 =  s1 + s2;//MAIN HEAP AREA
        String s5 = s1 + "Ineuron";//MAIN HEAP AREA
        System.out.println(s3==s4);//False as memory is allocated in main area bcoz of references
    }
}
