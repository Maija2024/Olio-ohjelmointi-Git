public class App {
    public static void main(String[] args) throws Exception {
          // Kohta. 4 luodaan ensin Olio auto1, tulostetaan tiedot, kiihdytetään 
          //ja tulostetaan uudestaan.
          // Muokataan kohta 4 mainin yläpuolelle.

  Auto auto1 = new Auto();
  auto1.merkki = "Kia";
  auto1.malli = "Stonic";
  auto1.bensanMaara = 5;

  //Olio auto2 luonti
  Auto auto2 = new Auto("Volkswagen", "Passat", 10);

  
  System.out.println("Auto2 tiedot:");
  auto2.NaytaTiedot();
    
  System.out.println("Auto1 tiedot:");
  auto1.NaytaTiedot();

  auto1.Kiihdyta();

  System.out.println("Auton tiedot kiihdytyksen jälkeen:");
  auto1.NaytaTiedot();

  auto1.tankkaa(10);
    }
}
// Kohdat 1 ja 2. Luodaan Auto-niminen luokka ja määritellään sille attribuutit.
class Auto
{
 public String merkki;
 public String malli;
 public int bensanMaara;

 // Kohta 7. Luodaan parametriton ja parametrillinen muodostin.

 public Auto()
 {
  merkki = "";
  malli = "";
  bensanMaara = 0;
 }
 public Auto (String me, String ma, int bensanMaara)
 {
  merkki = me;
  malli = ma;
  this.bensanMaara = bensanMaara;
 }

// Kohta 3 a-c. Määritellään metodit.
  public void Jarruta()
{
     System.out.println("Auto jarruttaa");
}
//Kohta 5. Lisätään ehto "jos bensan määrä enemmän kuin 0, auto kiihtyy"
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

//Kohta 6. tankkaa -metodi. 
// Muokattu bensanMaara-parametria.

public void tankkaa(int maara) {
  System.out.println("Tankissa bensaa: " + bensanMaara);
  System.out.println("Tankkaus: " + maara);
  bensanMaara = maara+ bensanMaara; 
  System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);





}
}
 

