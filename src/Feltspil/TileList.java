package Feltspil;

public class TileList {


        private Tile [] liste;



        public TileList() {
            Language lang = new Language();
/**
 * We have decided to do as following, if you wish to change the language of the game, you simply just have to change it in the class "Language"
 * We have done it the way, where we refer to the class "Language" into this class "Tilelist"
 * The reason behind this is to make the programming overlook more simple, on top of that the customer also wanted this is a requirement
 */

            liste = new Tile[11];
            liste[0] = new Tile(lang.title2(), lang.spacetext2(), 250);
            liste[1] = new Tile(lang.title3(), lang.spacetext3(), -100);
            liste[2] = new Tile(lang.title4(), lang.spacetext4(), 100);
            liste[3] = new Tile(lang.title5(), lang.spacetext5(), -20);
            liste[4] = new Tile(lang.title6(), lang.spacetext6(), 180);
            liste[5] = new Tile(lang.title7(), lang.spacetext7(), 0);
            liste[6] = new Tile(lang.title8(), lang.spacetext8(), -70);
            liste[7] = new Tile(lang.title9(), lang.spacetext9(), 60);
            liste[8] = new Tile(lang.title10(), lang.spacetext10(), -80);
            liste[9] = new Tile(lang.title11(), lang.spacetext11(), -50);
            liste[10] = new Tile(lang.title12(), lang.spacetext12(), 650);

        }

        public int getValue(int i){
            return liste[i].getValue();
        }

    }

