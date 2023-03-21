/**
*
* Tests BST operations
*
* Run with:
*    $ java CityTest < input_file_name
*/
import java.util.Scanner;
public class CityTest {
   public static void main (String[] args) {
     BST<CityKey, City> cityBST = new BST<CityKey, City>();
     Scanner sc = new Scanner(System.in);
      while (sc.hasNextLine()) {
          String line = sc.nextLine();
          String[] fields = line.split(",");
          String myName = fields[0].trim();
          String myState = fields[1].trim();
          double myLat = Double.parseDouble(fields[2].trim());
          double myLon = Double.parseDouble(fields[3].trim());
          int myPop = Integer.parseInt(fields[4].trim());
          CityKey myKey = new CityKey(myName, myState);
          City myCity = new City(myName, myState, myLat, myLon, myPop);
          cityBST.insert(myKey, myCity);
      }
      sc.close();


      
      CityKey myKey = new CityKey("Addis Ababa", "ET");
      CityKey myKey2 = new CityKey("Hartford", "CT");
      //long start = System.nanoTime();
      if(cityBST.find(myKey)==null){
        System.out.println("City not found");

      }
      else{
        System.out.println(cityBST.find(myKey));
        System.out.println(cityBST.remove(myKey));


      }
      //long end = System.nanoTime();
      //System.out.println("Elapsed Time in nanoseconds: " + (end-start));
      //System.out.println("The height of the BST is: " + cityBST.height());
      if(cityBST.find(myKey2)==null){
        System.out.println("City not found");

      }
      else{
        System.out.println(cityBST.find(myKey2));
        System.out.println(cityBST.remove(myKey2));

      }




      /* Create a BST of city records with search keys */

      /* Read, tokenize, and insert all city records to the BST
         Measure the running time for insert
      */

      /* Measure the running time for various experiements
         (See today's lab for details)
      */
   }
}
