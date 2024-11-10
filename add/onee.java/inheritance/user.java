package inheritance;

public class user {
    public static void main(String[]args){
        guest g=new guest();
        g.read();
        developer d=new developer();
        d.read();
        admin a=new admin();
        a.read();
    }
    
}
