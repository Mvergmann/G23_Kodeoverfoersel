package Feltspil;

public class TileList {


        private Tile [] liste;



        public TileList() {
            Language lang = new Language();

            liste = new Tile[11];
            liste[0] = new Tile(lang.title2(), lang.spacetext2(), 360);



        }
        public int getValue(int i){
            return liste[i].getValue();
        }
        public String getTitle(int i){
            return liste[i].getTitle();

        }
        public String getFlavourText(int i){
            return liste[i].getFlavourText();
        }

    }

