import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int date;

        System.out.print("Dogum yilinizi giriniz: ");
        date=input.nextInt();

        if (date%12==0){
            System.out.print("Cin zodyagi burcunuz:Maymun");
        }else if (date%12==1){
            System.out.print("Cin zodyagi burcunuz:Horoz");
        }else if (date%12==2){
            System.out.print("Cin zodyagi burcunuz:Kopek");
        }else if (date%12==3){
            System.out.print("Cin zodyagi burcunuz:Domuz");
        }else if (date%12==4){
            System.out.print("Cin zodyagi burcunuz:Fare");
        }else if (date%12==5){
            System.out.print("Cin zodyagi burcunuz:Okuz");
        }else if (date%12==6){
            System.out.print("Cin zodyagi burcunuz:Kaplan");
        }else if (date%12==7){
            System.out.print("Cin zodyagi burcunuz:Tavsan");
        }else if (date%12==8){
            System.out.print("Cin zodyagi burcunuz:Ejderha");
        }else if (date%12==9){
            System.out.print("Cin zodyagi burcunuz:Yilan");
        }else if (date%12==10){
            System.out.print("Cin zodyagi burcunuz:At");
        }else if (date%12==11){
            System.out.print("Cin zodyagi burcunuz:Koyun");
        }else {
            System.out.print("Yanlis veri girdiniz!");
        }

    }

}
