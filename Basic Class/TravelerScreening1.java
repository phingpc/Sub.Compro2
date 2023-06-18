import java.util.Scanner;

class Traveler {
    public String PassportID;
    public String countryorigin ;
    public String Date ;
    public double Temp ;
    public Traveler (String PassportID,String countryorigin,String Date,double Temp) {
        this.PassportID = PassportID;
        this.countryorigin = countryorigin ;
        this.Date = Date ;
        this.Temp = Temp ;
    }
    public void printInfo () {
        if(countryorigin.equalsIgnoreCase("JAPAN") || Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if(countryorigin.equalsIgnoreCase("GERMANY") || this.Temp > 37.5) {
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if (countryorigin.equalsIgnoreCase("KOREA") || this.Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if (countryorigin.equalsIgnoreCase("CHINA") || this.Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if (countryorigin.equalsIgnoreCase("TAIWAN") || this.Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if(countryorigin.equalsIgnoreCase("FRANCE") || this.Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if(countryorigin.equalsIgnoreCase("SINGAPORE") || this.Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if(countryorigin.equalsIgnoreCase("ITALY") || this.Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if(countryorigin.equalsIgnoreCase("IRAN") || this.Temp > 37.5){
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else if (this.Temp > 37.5) {
            System.out.println(PassportID + " STATE-QUARANTINE");
        } else {
            System.out.println(PassportID + " SELF-QUARANTINE");
        }
    }
}
public class TravelerScreening1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A =scan.nextInt();
        Traveler[] arrTra = new Traveler[A+1];
        for (int i = 1; i <= A; i++) {
            String PassportID = scan.next();
            String countryorigin = scan.next();
            String Date = scan.next();
            double Temp = scan.nextDouble();
            Traveler tra = new Traveler(PassportID, countryorigin, Date, Temp);
            arrTra[i]=tra;
            arrTra[i].printInfo();
        }
    }
}

