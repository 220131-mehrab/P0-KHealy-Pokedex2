package Server;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pokedex {
    String[] pokemons = new String[1046];

    public Pokedex(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            int i = 0;
            while(scanner.hasNext()){
                //--//System.out.println(scanner.next());
                pokemons[i]=scanner.next();
                ++i;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
