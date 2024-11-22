public class App {
    public static void main(String[] args) throws Exception {
        
    }
}
// Kohdat 1 ja 2. Luodaan Auto-niminen luokka ja määritellään sille attribuutit.
class Auto
{
 public String merkki;
 public String malli;
 public int bensanMaara;


// Kohta 3 a-c. Määritellään metodit.
  public void Jarruta()
{
     System.out.println("Auto jarruttaa");
}
  public void Kiihdyta()
{
    bensanMaara = bensanMaara -1;
    System.out.println("Auto kiihtyy");
}
 public void NaytaTiedot()
{
    System.out.println("Auton merkki on: " + merkki);
    System.out.println("Auton malli on: " + malli);
    System.out.println("Bensan määrä on: " + bensanMaara);
}
}
 

