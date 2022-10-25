package dayten.encapsulation;

class Books {
    private int pgno;
    public void setPgno(int x){
        if(x >= 0) {
            pgno = x;
        }
        else System.out.println("Invalid input");
    }
    public int getPgno(){
        return pgno;
    }
}

public class LaunchEncap {
    public static void main(String[] args) {
        Books b = new Books();
        b.setPgno(100);
        System.out.println(b.getPgno());
    }

}
