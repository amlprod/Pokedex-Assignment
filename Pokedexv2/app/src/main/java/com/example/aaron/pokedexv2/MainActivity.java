package com.example.aaron.pokedexv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Pokemon> pokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        /*LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);*/
        GridLayoutManager glm = new GridLayoutManager(this,3);
        rv.setLayoutManager(glm);
        initializeData();
        PokemonAdapter adapter = new PokemonAdapter(pokemons);
        rv.setAdapter(adapter);




    }



    private void initializeData(){
        pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("001", "Bulbasaur", R.drawable.bulbasaur, "6.9kg", "0.7m", "grass, poison"));
        pokemons.add(new Pokemon("002", "Ivysaur", R.drawable.ivysaur, "13.0kg", "1.0m", "grass, poison"));
        pokemons.add(new Pokemon("003", "Venusaur", R.drawable.venasaur, "100.0kg", "2.0m", "grass, poison"));
        pokemons.add(new Pokemon("004", "Charmander", R.drawable.charmander, "8.5kg", "0.6m", "fire"));
        pokemons.add(new Pokemon("005", "Charmeleon", R.drawable.charmeleon, "19.0kg", "1.1m", "fire"));
        pokemons.add(new Pokemon("006", "Charizard", R.drawable.charizard, "90.5kg", "1.7m", "fire, flying"));
        pokemons.add(new Pokemon("007", "Squirtle", R.drawable.squirtle, "9.0kg", "0.5m", "water"));
        pokemons.add(new Pokemon("008", "Wartortle", R.drawable.wartortle, "22.5kg", "1.0m", "water"));
        pokemons.add(new Pokemon("009", "Blastoise", R.drawable.blastoise, "85.5kg", "1.6m", "water"));
        pokemons.add(new Pokemon("010", "caterpie", R.drawable.caterpie, "2.9kg", "0.3m", "bug"));
        pokemons.add(new Pokemon("011", "metapod", R.drawable.metapod, "9.9kg", "0.7m", "bug"));
        pokemons.add(new Pokemon("012", "butterfree", R.drawable.butterfree, "32.0kg", "1.1m", "bug, flying"));
        pokemons.add(new Pokemon("013", "weedle", R.drawable.weedle, "3.2kg", "0.3m", "bug, poison"));
        pokemons.add(new Pokemon("014", "kakuna", R.drawable.kakuna, "10.0kg", "0.6m", "bug, poison"));
        pokemons.add(new Pokemon("015", "beedrill", R.drawable.beedrill, "29.5kg", "1.0m", "bug, poison"));
        pokemons.add(new Pokemon("016", "pidgey", R.drawable.pidgey, "1.8kg", "0.3m", "normal, flying"));
        pokemons.add(new Pokemon("018", "pidgeotto", R.drawable.pidgeotto, "30.0kg", "1.09m", "normal, flying"));
        pokemons.add(new Pokemon("019", "pidgeot", R.drawable.pidgeot, "39.5kg", "1.5m", "normal, flying"));
        pokemons.add(new Pokemon("020", "rattata", R.drawable.rattata, "3.5kg", "0.3m", "normal"));
        pokemons.add(new Pokemon("021", "raticate", R.drawable.raticate, "18.5kg", "0.7m", "normal"));
        pokemons.add(new Pokemon("022", "spearow", R.drawable.spearow, "2.0kg", "0.3m", "normal, flying"));
        pokemons.add(new Pokemon("023", "fearow", R.drawable.fearow, "38.0kg", "1.2m", "normal, flying"));
        pokemons.add(new Pokemon("024", "ekans", R.drawable.ekans, "6.9kg", "2.0m", "poison"));
        pokemons.add(new Pokemon("025", "arbok", R.drawable.arbok, "65.0kg", "3.5m", "poison"));
        pokemons.add(new Pokemon("026", "pikachu", R.drawable.pikachu, "6.0kg", "0.4m", "electric"));
        pokemons.add(new Pokemon("027", "raichu", R.drawable.raichu, "30.0kg", "0.8m", "electric"));
        pokemons.add(new Pokemon("028", "sandshrew", R.drawable.sandshrew, "12.0kg", "0.6m", "ground"));
        pokemons.add(new Pokemon("029", "sandslash", R.drawable.sandslash, "29.5kg", "1.0m", "ground"));
        pokemons.add(new Pokemon("030", "nidoran-f", R.drawable.nidoranf, "7.0kg", "1.2m", "poison"));
        pokemons.add(new Pokemon("031", "nidorina", R.drawable.nidorina, "20.0kg", "0.4m", "poison"));
        pokemons.add(new Pokemon("032", "nidoqueen", R.drawable.nidoqueen, "60.0kg", "0.8m", "poison, ground"));
        pokemons.add(new Pokemon("033", "nidoran-m", R.drawable.nidoranm, "9.0kg", "1.3m", "poison"));
        pokemons.add(new Pokemon("034", "nidorino", R.drawable.nidorino, "19.5kg", "0.5m", "poison"));
        pokemons.add(new Pokemon("035", "nidoking", R.drawable.nidoking, "62.0kg", "0.9m", "poison, ground"));
        pokemons.add(new Pokemon("036", "clefairy", R.drawable.clefairy, "7.5kg", "1.4m", "normal"));
        pokemons.add(new Pokemon("037", "clefable", R.drawable.clefable, "40.0kg", "0.6m", "normal"));
        pokemons.add(new Pokemon("038", "vulpix", R.drawable.vulpix, "9.9kg", "1.3m", "fire"));
        pokemons.add(new Pokemon("039", "ninetales", R.drawable.ninetales, "19.9kg", "0.6m", "fire"));
        pokemons.add(new Pokemon("040", "jigglypuff", R.drawable.jigglypuff, "5.5kg", "1.1m", "normal"));
        pokemons.add(new Pokemon("041", "wigglytuff", R.drawable.wigglytuff, "12.0kg", "0.5m", "normal"));
        pokemons.add(new Pokemon("042", "zubat", R.drawable.zubat, "7.5kg", "1.0m", "poison, flying"));
        pokemons.add(new Pokemon("043", "golbat", R.drawable.golbat, "55.0kg", "0.8m", "poison, flying"));
        pokemons.add(new Pokemon("044", "oddish", R.drawable.oddish, "5.4kg", "1.6m", "grass, poison"));
        pokemons.add(new Pokemon("045", "gloom", R.drawable.gloom, "8.6kg", "0.5m", "grass, poison"));
        pokemons.add(new Pokemon("046", "vileplume", R.drawable.vileplume, "18.6kg", "0.8m", "grass, poison"));
        pokemons.add(new Pokemon("047", "paras", R.drawable.paras, "5.4kg", "1.2m", "bug, grass"));
        pokemons.add(new Pokemon("048", "parasect", R.drawable.parasect, "29.5kg", "0.3m", "bug, grass"));
        pokemons.add(new Pokemon("049", "venonat", R.drawable.venonat, "30.0kg", "1.0m", "bug, poison"));
        pokemons.add(new Pokemon("050", "venomoth", R.drawable.venomoth, "12.5kg", "1.0m", "bug, poison"));
        pokemons.add(new Pokemon("051", "diglett", R.drawable.diglett, "0.8kg", "1.5m", "ground"));
        pokemons.add(new Pokemon("052", "dugtrio", R.drawable.dugtrio, "33.3kg", "0.2m", "ground"));
        pokemons.add(new Pokemon("053", "meowth", R.drawable.meowth, "4.2kg", "0.7m", "normal"));
        pokemons.add(new Pokemon("054", "persian", R.drawable.persian, "32.0kg", "0.4m", "normal"));
        pokemons.add(new Pokemon("055", "psyduck", R.drawable.psyduck, "19.6kg", "1.0m", "water"));
        pokemons.add(new Pokemon("056", "golduck", R.drawable.golduck, "76.6kg", "0.8m", "water"));
        pokemons.add(new Pokemon("057", "mankey", R.drawable.mankey, "28.0kg", "1.7m", "fight"));
        pokemons.add(new Pokemon("058", "primeape", R.drawable.primeape, "32.0kg", "1.0m", "fight"));
        pokemons.add(new Pokemon("059", "growlithe", R.drawable.growlithe, "19.0kg", "0.7m", "fire"));
        pokemons.add(new Pokemon("060", "arcanine", R.drawable.arcanine, "155.0kg", "1.9m", "fire"));
        pokemons.add(new Pokemon("061", "poliwag", R.drawable.poliwag, "12.4kg", "0.6m", "water"));
        pokemons.add(new Pokemon("062", "poliwhirl", R.drawable.poliwhirl, "20.0kg", "1.0m", "water"));
        pokemons.add(new Pokemon("063", "poliwrath", R.drawable.poliwrath, "54.0kg", "1.3m", "water, fight"));
        pokemons.add(new Pokemon("064", "abra", R.drawable.abra, "19.5kg", "0.9m", "psychic"));
        pokemons.add(new Pokemon("065", "kadabra", R.drawable.kadabra, "56.5kg", "1.3m", "psychic"));
        pokemons.add(new Pokemon("066", "alakazam", R.drawable.alakazam, "48.0kg", "1.5m", "psychic"));
        pokemons.add(new Pokemon("067", "machop", R.drawable.machop, "19.5kg", "0.8m", "fight"));
        pokemons.add(new Pokemon("068", "machoke", R.drawable.machoke, "70.5kg", "1.5m", "fight"));
        pokemons.add(new Pokemon("069", "machamp", R.drawable.machamp, "130.0kg", "1.6m", "fight"));
        pokemons.add(new Pokemon("070", "bellsprout", R.drawable.bellsprout, "4.0kg", "0.7m", "grass, poison"));
        pokemons.add(new Pokemon("071", "weepinbell", R.drawable.weepinbell, "6.4kg", "1.0m", "grass, poison"));
        pokemons.add(new Pokemon("072", "victreebel", R.drawable.victreebel, "15.5kg", "1.7m", "grass, poison"));
        pokemons.add(new Pokemon("073", "tentacool", R.drawable.tentacool, "45.5kg", "0.9m", "water, poison"));
        pokemons.add(new Pokemon("074", "tentacruel", R.drawable.tentacruel, "55.5kg", "1.6m", "water, poison"));
        pokemons.add(new Pokemon("075", "geodude", R.drawable.geodude, "20.0kg", "0.4m", "rock, ground"));
        pokemons.add(new Pokemon("076", "graveler", R.drawable.graveler, "105.0kg", "1.0m", "rock, ground"));
        pokemons.add(new Pokemon("077", "golem", R.drawable.golem, "300.0kg", "1.4m", "rock, ground"));
        pokemons.add(new Pokemon("078", "ponyta", R.drawable.ponyta, "30.0kg", "1.0m", "fire"));
        pokemons.add(new Pokemon("079", "rapidash", R.drawable.rapidash, "95.0kg", "1.7m", "fire"));
        pokemons.add(new Pokemon("080", "slowpoke", R.drawable.slowpoke, "36.0kg", "1.2m", "water, psychic"));
        pokemons.add(new Pokemon("081", "slowbro", R.drawable.slowbro, "78.5kg", "1.6m", "water, psychic"));
        pokemons.add(new Pokemon("082", "magnemite", R.drawable.magnemite, "6.0kg", "0.3m", "electric, steel"));
        pokemons.add(new Pokemon("083", "magneton", R.drawable.magneton, "60.0kg", "1.0m", "electric, steel"));
        pokemons.add(new Pokemon("084", "farfetch'd", R.drawable.farfetchd, "15.0kg", "0.8m", "normal, flying"));
        pokemons.add(new Pokemon("085", "doduo", R.drawable.doduo, "39.2kg", "1.4m", "normal, flying"));
        pokemons.add(new Pokemon("086", "dodrio", R.drawable.dodrio, "85.2kg", "1.8m", "normal, flying"));
        pokemons.add(new Pokemon("087", "seel", R.drawable.seel, "90.0kg", "1.1m", "water"));
        pokemons.add(new Pokemon("088", "dewgong", R.drawable.dewgong, "120.0kg", "1.7m", "water, ice"));
        pokemons.add(new Pokemon("089", "grimer", R.drawable.grimer, "30.0kg", "0.9m", "poison"));
        pokemons.add(new Pokemon("090", "muk", R.drawable.muk, "30.0kg", "1.2m", "poison"));
        pokemons.add(new Pokemon("091", "shellder", R.drawable.shellder, "4.0kg", "0.3m", "water"));
        pokemons.add(new Pokemon("092", "cloyster", R.drawable.cloyster, "132.5kg", "1.5m", "water, ice"));
        pokemons.add(new Pokemon("093", "gastly", R.drawable.gastly, "0.1kg", "1.3m", "ghost, poison"));
        pokemons.add(new Pokemon("094", "haunter", R.drawable.haunter, "0.1kg", "1.6m", "ghost, poison"));
        pokemons.add(new Pokemon("095", "gengar", R.drawable.gengar, "40.5kg", "1.5m", "ghost, poison"));
        pokemons.add(new Pokemon("096", "onix", R.drawable.onix, "210.0kg", "8.8m", "rock, ground"));
        pokemons.add(new Pokemon("097", "drowzee", R.drawable.drowzee, "32.4kg", "1.0m", "psychic"));
        pokemons.add(new Pokemon("098", "hypno", R.drawable.hypno, "75.6kg", "1.6m", "psychic"));
        pokemons.add(new Pokemon("099", "krabby", R.drawable.krabby, "6.5kg", "0.4m", "water"));
        pokemons.add(new Pokemon("100", "kingler", R.drawable.kingler, "60.0kg", "1.3m", "water"));
        pokemons.add(new Pokemon("101", "voltorb", R.drawable.voltorb, "10.4kg", "0.51m", "electric"));
        pokemons.add(new Pokemon("102", "electrode", R.drawable.electrode, "66.6kg", "1.2m", "electric"));
        pokemons.add(new Pokemon("103", "exeggcute", R.drawable.exeggcute, "2.5kg", "0.4m", "grass, psychic"));
        pokemons.add(new Pokemon("104", "exeggutor", R.drawable.exeggutor, "120.0kg", "2.0m", "grass, psychic"));
        pokemons.add(new Pokemon("105", "cubone", R.drawable.cubone, "6.5kg", "0.4m", "ground"));
        pokemons.add(new Pokemon("106", "marowak", R.drawable.marowak, "45.0kg", "1.0m", "ground"));
        pokemons.add(new Pokemon("107", "hitmonlee", R.drawable.hitmonlee, "49.8kg", "1.5m", "fight"));
        pokemons.add(new Pokemon("108", "hitmonchan", R.drawable.hitmonchan, "50.2kg", "1.4m", "fight"));
        pokemons.add(new Pokemon("109", "lickitung", R.drawable.lickitung, "65.5kg", "1.2m", "normal"));
        pokemons.add(new Pokemon("110", "koffing", R.drawable.koffing, "1.0kg", "0.6m", "poison"));
        pokemons.add(new Pokemon("111", "weezing", R.drawable.weezing, "9.5kg", "1.2m", "poison"));
        pokemons.add(new Pokemon("112", "rhyhorn", R.drawable.rhyhorn, "115.0kg", "1.0m", "ground, rock"));
        pokemons.add(new Pokemon("113", "rhydon", R.drawable.rhydon, "120.0kg", "1.9m", "ground, rock"));
        pokemons.add(new Pokemon("114", "chansey", R.drawable.chansey, "34.6kg", "1.1m", "normal"));
        pokemons.add(new Pokemon("115", "tangela", R.drawable.tangela, "35.0kg", "1.0m", "grass"));
        pokemons.add(new Pokemon("116", "kangaskhan", R.drawable.kangaskhan, "80.0kg", "2.2m", "normal"));
        pokemons.add(new Pokemon("117", "horsea", R.drawable.horsea, "8.0kg", "0.4m", "water"));
        pokemons.add(new Pokemon("118", "seadra", R.drawable.seadra, "25.0kg", "1.2m", "water"));
        pokemons.add(new Pokemon("119", "goldeen", R.drawable.goldeen, "15.0kg", "0.6m", "water"));
        pokemons.add(new Pokemon("120", "seaking", R.drawable.seaking, "39.0kg", "1.3m", "water"));
        pokemons.add(new Pokemon("121", "staryu", R.drawable.staryu, "34.5kg", "0.8m", "water"));
        pokemons.add(new Pokemon("122", "starmie", R.drawable.starmie, "80.0kg", "1.1m", "water, psychic"));
        pokemons.add(new Pokemon("123", "mr.mime", R.drawable.mrmime, "54.5kg", "1.3m", "psychic"));
        pokemons.add(new Pokemon("124", "scyther", R.drawable.scyther, "56.0kg", "1.5m", "bug, flying"));
        pokemons.add(new Pokemon("125", "jynx", R.drawable.jynx, "41.4kg", "1.4m", "ice, psychic"));
        pokemons.add(new Pokemon("126", "electabuzz", R.drawable.electabuzz, "30.0kg", "1.3m", "electric"));
        pokemons.add(new Pokemon("127", "magmar", R.drawable.magmar, "44.5kg", "1.3m", "fire"));
        pokemons.add(new Pokemon("128", "pinsir", R.drawable.pinsir, "55.0kg", "1.5m", "bug"));
        pokemons.add(new Pokemon("129", "tauros", R.drawable.tauros, "88.4kg", "1.4m", "normal"));
        pokemons.add(new Pokemon("130", "magikarp", R.drawable.magikarp, "10.0kg", "0.9m", "water"));
        pokemons.add(new Pokemon("131", "gyarados", R.drawable.gyarados, "235.0kg", "6.5m", "water, flying"));
        pokemons.add(new Pokemon("132", "lapras", R.drawable.lapras, "220.0kg", "2.5m", "water, ice"));
        pokemons.add(new Pokemon("133", "ditto", R.drawable.ditto, "4.0kg", "0.3m", "normal"));
        pokemons.add(new Pokemon("134", "eevee", R.drawable.eevee, "6.5kg", "0.3m", "normal"));
        pokemons.add(new Pokemon("135", "vaporeon", R.drawable.vaporeon, "29.0kg", "1.0m", "water"));
        pokemons.add(new Pokemon("136", "jolteon", R.drawable.jolteon, "24.5kg", "0.8m", "electric"));
        pokemons.add(new Pokemon("137", "flareon", R.drawable.flareon, "25.0kg", "0.9m", "fire"));
        pokemons.add(new Pokemon("138", "porygon", R.drawable.porygon, "36.5kg", "0.8m", "normal"));
        pokemons.add(new Pokemon("139", "omanyte", R.drawable.omanyte, "7.5kg", "0.4m", "rock, water"));
        pokemons.add(new Pokemon("140", "omastar", R.drawable.omastar, "35.0kg", "1.0m", "rock, water"));
        pokemons.add(new Pokemon("141", "kabuto", R.drawable.kabuto, "11.5kg", "0.5m", "rock, water"));
        pokemons.add(new Pokemon("142", "kabutops", R.drawable.kabutops, "40.5kg", "1.3m", "rock, water"));
        pokemons.add(new Pokemon("143", "aerodactyl", R.drawable.aerodactyl, "59.0kg", "1.8m", "rock, flying"));
        pokemons.add(new Pokemon("144", "snorlax", R.drawable.snorlax, "460.0kg", "2.1m", "normal"));
        pokemons.add(new Pokemon("145", "articuno", R.drawable.articuno, "55.4kg", "1.7m", "ice, flying"));
        pokemons.add(new Pokemon("146", "zapdos", R.drawable.zapdos, "52.6kg", "1.6m", "electric, flying"));
        pokemons.add(new Pokemon("147", "moltres", R.drawable.moltres, "60.0kg", "2.0m", "fire, flying"));
        pokemons.add(new Pokemon("148", "dratini", R.drawable.dratini, "3.3kg", "1.8m", "dragon"));
        pokemons.add(new Pokemon("149", "dragonair", R.drawable.dragonair, "16.5kg", "4.0m", "dragon"));
        pokemons.add(new Pokemon("150", "dragonite", R.drawable.dragonite, "210.0kg", "2.2m", "dragon, flying"));
        pokemons.add(new Pokemon("151", "mewtwo", R.drawable.mewtwo, "122.0kg", "2.0m", "psychic"));
        pokemons.add(new Pokemon("152", "mew", R.drawable.mew, "4.0kg", "0.4m", "psychic"));
    }



}
