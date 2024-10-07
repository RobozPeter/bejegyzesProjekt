import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    Feladatok f = new Feladatok();
    f.Beolvas("bejegyzesek.csv");
    f.bejegyzesek.add(new Bejegyzes("Tarka Jenő","Tegnap lementem a boltba"));
    f.bejegyzesek.add(new Bejegyzes("Kiss János","vasárnap bodzát szedtem"));
        System.out.println("1.feladat");
        System.out.print("Adjon meg egy számot");
        int numba = s.nextInt();
        if(numba<-1)
        {
            System.out.println("Ez nem egy természetes szám");
        }
        else{
            for (int i = 0; i < numba; i++) {
                f.bejegyzesek.add(new Bejegyzes("John Doe","Valami"));

            }
        }
        //
        Random r = new Random();
        for (int i = 0; i < (f.bejegyzesek.size()*20); i++) {
            f.bejegyzesek.get(r.nextInt(0,(f.bejegyzesek.size()-1))).like();
        }
        System.out.println("2.feladat");
        System.out.print("Írja meg a módosítás tartalmástt");
        String modositas = s.nextLine();
        f.bejegyzesek.get(1).setTartalom(modositas);
        System.out.println("3.feladat");
    for (Bejegyzes i:f.bejegyzesek){
        System.out.println(i);
    }
        System.out.println("4.feladat");
    int legtobbLike = 0;
    for (Bejegyzes i:f.bejegyzesek){
        if (i.getLikeok()>legtobbLike){
            legtobbLike = i.getLikeok();
        }

    }
    System.out.println(legtobbLike);
        System.out.println("4.feladat");
boolean ifLike35ormore = false;
    for (Bejegyzes i:f.bejegyzesek){
        if (i.getLikeok()>35){
            ifLike35ormore = true;
        }
    }
    if (ifLike35ormore){
        System.out.println("Van olyan bejegyzés amin több mint 35 like van");
    }
    else {
        System.out.println("Nincs olyan bejegyzés amin több mint 35 like van");
    }
        System.out.println("5.feladat");
    int kevesebbMintTizenotLike = 0;
        for (Bejegyzes i:f.bejegyzesek){
            if (i.getLikeok()<15){
                kevesebbMintTizenotLike++;
            }
        }
        System.out.println("Ennyi poszt nem érte el a 15 lájkot: "+kevesebbMintTizenotLike);

        System.out.println("6.feladat");
        Collections.sort(f.bejegyzesek, new Comparator<Bejegyzes>() {
            public int compare(Bejegyzes c1, Bejegyzes c2) {
                if (c1.getLikeok() > c2.getLikeok()) return -1;
                if (c1.getLikeok() < c2.getLikeok()) return 1;
                return 0;
            }});
        for (Bejegyzes i :f.bejegyzesek){
            System.out.println(i);
        }
        try {
            BufferedWriter helpinWriter = new BufferedWriter(new FileWriter("bejegyzesek_rendezett.txt"));
            for (Bejegyzes i:f.bejegyzesek){
                helpinWriter.write(String.valueOf(i));
            }
            helpinWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");

}}}