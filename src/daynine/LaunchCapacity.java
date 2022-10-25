package daynine;

public class LaunchCapacity {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        sb1.append("abcdefghijklmnopq");
        System.out.println(sb1.capacity());//New capacity = (currentcapacity+1)*2
    }
}
