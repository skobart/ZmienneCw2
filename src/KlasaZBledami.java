/**
 * Created by Bartłomiej Skorowski on 09.03.2020.
 */
public class KlasaZBledami {
    class Stats {
        public static void main(String[] args) {
            final String url = "http://javastart.pl";
            url = "https://javastart.pl";
            System.out.print("Strona, z której uczę się Javy to: ");
            System.out.println(url);

            byte kevinYear = 1990;
            System.out.print("Film Kevin sam w domu został wydany w roku: ");
            System.out.println(kevinYear);

            var voterTurnout = 58;
            voterTurnout = 61.1;
            System.out.print("Procentowa frekwencja podczas ostatnich wyborów wyniosła: ");
            System.out.println(voterTurnout);
        }
    }
}
