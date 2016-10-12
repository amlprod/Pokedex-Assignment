package com.example.aaron.pokedexv2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 11/10/2016.
 */
public class Pokemon {
    String pkmID; /*Number in the pokedex*/
    String name;
    int photoURL;
    String weight;
    String height;
    String type;

    Pokemon(String pkmID, String name, int photoURL, String weight, String height, String type){
        this.pkmID = pkmID;
        this.name = name;
        this.photoURL = photoURL;
        this.weight = weight;
        this.height = height;
        this.type = type;
    }



}

