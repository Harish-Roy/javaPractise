import java.util.HashMap;
import java.util.Scanner;
public class oneee
{
    public static void main(String[] args){
Scanner Sc=new Scanner(System.in);

    HashMap<Integer,String> data = new HashMap<>();
    for(int i=0; i<=5;i++){
    data.put(Sc.nextInt(),Sc.next());}
    
    System.out.println(data.get(2));
}
}