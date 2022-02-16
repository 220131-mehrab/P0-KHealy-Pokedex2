package com.revature.khealy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pokedex {

    private List<String> pokemons;
    //private File file;
    private InputStream file;


    public Pokedex(String filename) {
        this.pokemons = new ArrayList<>();

        try {
            //this.file = new FileInputStream("Server/app/src/main/java/Server/" + filename);
            this.file = getClass().getClassLoader().getResourceAsStream(filename);
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        load();
    }

    private void load() {

        //File file = new File(filename);
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            this.pokemons.add(scanner.next());
        }
    }


    public List<String> getPokemons() {
        return pokemons;
    }

    public String getPokemon(String PokeName) {
        boolean found = false;
        String result = "";
        for (String pokemon : this.pokemons){
            if (pokemon.contains(PokeName) && !found){
                result = pokemon;
                found = true;
            }
        }
        return result;
    }
}
