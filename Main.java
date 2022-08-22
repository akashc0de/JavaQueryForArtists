package com.hellowworld;

import java.util.List;

public class Main {
    public static void main (String[]args){

        Datasource datasource=new Datasource();
        if(!datasource.open()){
            System.out.println("can't open datasource");
            return;
        }
         List<Artist> artists=datasource.queryArtist();
        if(artists==null){
            System.out.println("No artist !");
        }
        for(Artist artist :artists){
            System.out.println("ID = "+artist.getId()+", Name = "+artist.getName());
        }
         datasource.close();
    }

}
