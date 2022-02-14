package Server;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pokedex {

    private List<String> pokemons;
    private File file;

    public Pokedex(String filename) {
        this.pokemons = new ArrayList<>();
        this.file = new File("src/main/Server/" + filename);
        load();
    }

    private void load() {
        try {
            //File file = new File(filename);
            Scanner scanner = new Scanner(this.file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                 this.pokemons.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
