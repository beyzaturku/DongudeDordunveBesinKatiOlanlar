
package girilensayiyakadarolandordunvebesinkatlari;
import java.util.*;
public class GirilenSayiyaKadarOlanDordunveBesinKatlari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = input.nextInt();
        
        for(int i=1; i<=number; i*=4){
            System.out.println("4'ün katı:" + i);
        }
        
        for(int j=1; j<=number; j*=5){
            System.out.println("5'in katı:" +j);
        }
    }
    
}