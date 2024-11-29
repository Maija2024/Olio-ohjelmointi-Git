public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto();
  auto1.merkki = "Kia";
  auto1.malli = "Stonic";
  auto1.bensanMaara = 5;

  System.out.println("Auton tiedot:");
  auto1.NaytaTiedot();

  auto1.Kiihdyta();

  System.out.println("Auton tiedot kiihdytyksen jälkeen:");
  auto1.NaytaTiedot();
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
//Lisätään ehto "jos bensan määrä enemmän kuin 0, auto kiihtyy"
  public void Kiihdyta() {
    if (bensanMaara > 0) {
    System.out.println("Auto kiihtyy");
    bensanMaara = bensanMaara -1;
}}
 public void NaytaTiedot()
{
    System.out.println("Auton merkki on: " + merkki);
    System.out.println("Auton malli on: " + malli);
    System.out.println("Bensan määrä on: " + bensanMaara);
}

//Kohta 6. tankkaa -metodi

public void tankkaa(int maara) {
  System.out.println("Tankissa bensaa: " + bensanMaara);
  System.out.println("Tankkaus: " + maara);
  bensanMaara += maara; 
  System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);

  
  // Kohta. 4 luodaan ensin Olio auto1, tulostetaan tiedot, kiihdytetään ja tulostetaan uudestaan.

//  Auto auto1 = new Auto();
//   auto1.merkki = "Kia";
//   auto1.malli = "Stonic";
//   auto1.bensanMaara = 5;

//   System.out.println("Auton tiedot:");
//   auto1.NaytaTiedot();

//   auto1.Kiihdyta();

//   System.out.println("Auton tiedot kiihdytyksen jälkeen:");
//   auto1.NaytaTiedot();



}}
  