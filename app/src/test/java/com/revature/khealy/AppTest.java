/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.revature.khealy;

import java.lang.System;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void DexServiceTest() {
             System.out.println("Hello world!");

             Assertions.assertEquals(1,1);
             //Assertions.assertArrayEquals()

        /** Test data
         *    //ID,Number,Name,Type1,Type2,Total,HP,Atk,Def,SpAtk,SpDef,Spd,Species,Height,Wei
         7,006,Charizard,Fire,Flying,534,78,84,78,109,85,100,Flame Pokémon,1.7 m,90.5 kg
         8,006,Charizard(Mega Charizard X),Fire,Dragon,634,78,130,111,130,85,100,Flame Pokémon,1.7 m,110.5 kg
         9,006,Charizard(Mega Charizard Y),Fire,Flying,634,78,104,78,159,115,100,Flame Pokémon,1.7 m,100.5 kg

        Pokemon tempPokemon1 = new Pokemon.Builder().setID(7).setNumber("006").setName("Charizard").setType1("Fire").setType2("Flying")
                .setTotal(534).setHP(78).setAtk(84).setDef(78).setSpAtk(109).setSpDef(85).setSpDef(100)
                .setSpecies("Flame Pokémon").setHeight("1.7 m").setWeight("90.5 kg").build();
        Pokemon tempPokemon2 = new Pokemon.Builder().setID(8).setNumber("006").setName("Charizard(Mega Charizard X)").setType1("Fire").setType2("Dragon")
                .setTotal(634).setHP(78).setAtk(130).setDef(111).setSpAtk(130).setSpDef(85).setSpDef(100)
                .setSpecies("Flame Pokémon").setHeight("1.7 m").setWeight("110.5 kg").build();
        Pokemon tempPokemon3 = new Pokemon.Builder().setID(9).setNumber("006").setName("Charizard(Mega Charizard Y)").setType1("Fire").setType2("Flying")
                .setTotal(634).setHP(78).setAtk(104).setDef(78).setSpAtk(159).setSpDef(115).setSpDef(100)
                .setSpecies("Flame Pokémon").setHeight("1.7 m").setWeight("100.5 kg").build();

        System.out.println(tempPokemon1.toString());
        System.out.println(tempPokemon2.toString());
        System.out.println(tempPokemon3.toString());
        */
        //Assertions.assertEquals(tempPokemon1.equals("7,006,Charizard,Fire,Flying,534,78,84,78,109,85,100,Flame Pokémon,1.7 m,90.5 kg"), true);
    }
}
