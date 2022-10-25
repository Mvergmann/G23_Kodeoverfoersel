package Feltspil;

public class TileList {


        private Tile [] liste;



        public TileList() {
            liste = new Tile[12];
            liste[0] = new Tile("Guldmine", "Du finder guld!", 360);


        }
        public int getValue(int i){
            return liste[i].getValue();
        }

    }

