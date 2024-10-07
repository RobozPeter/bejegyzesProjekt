import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Feladatok {
    List<Bejegyzes> bejegyzesek = new ArrayList<>();

    public List<Bejegyzes> getBejegyzesek() {
        return bejegyzesek;
    }

    public void Beolvas(String fajlnev){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fajlnev));
            String sor = bufferedReader.readLine();
            while (sor != null && !sor.isEmpty()){
                String[] adatok = sor.split(";");
                bejegyzesek.add(new Bejegyzes(adatok[0],adatok[1]));
                sor = bufferedReader.readLine();
            }

            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
