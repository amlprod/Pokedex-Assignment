package com.example.aaron.pokedexv2;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aaron on 11/10/2016.
 */
public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    public static class PokemonViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView pokeID;
        TextView pokeName;
        TextView pokeWeight;
        TextView pokeHeight;
        ImageView pokePic;
        TextView pokeType;

        public PokemonViewHolder(View itemView) {
            super(itemView);
            //cv =  (CardView)itemView.findViewById(R.id.cv);
            pokePic = (ImageView)itemView.findViewById(R.id.pokemon_photo);
            pokeName = (TextView)itemView.findViewById(R.id.name);
            pokeType = (TextView)itemView.findViewById(R.id.type);
            pokeWeight = (TextView)itemView.findViewById(R.id.weight);
            pokeHeight = (TextView)itemView.findViewById(R.id.height);
        }
    }

    List<Pokemon> pokemonList;

    PokemonAdapter(List<Pokemon> pokemonList) { this.pokemonList = pokemonList;}

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PokemonAdapter.PokemonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pokemon_list, viewGroup, false);
        PokemonViewHolder pvh = new PokemonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PokemonAdapter.PokemonViewHolder holder, int i) {
        holder.pokePic.setImageResource(pokemonList.get(i).photoURL);
        holder.pokeName.setText(pokemonList.get(i).name);
        holder.pokeType.setText(pokemonList.get(i).type);
        holder.pokeWeight.setText(pokemonList.get(i).weight);
        holder.pokeHeight.setText(pokemonList.get(i).height);
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}
