package sg.edu.tp.clarity3;

public class SongCollection {
    //attributes
    Song[] songs = new Song[5];//array of songs
    //default constructor of this class
    public SongCollection() {
        Song hero = new Song("S1001",
                "Hero",
                "Faouzia",
                "https://p.scdn.co/mp3-preview/d20deb85ec84965c3c4911d598212f0e16c791a5?cid=2afe87a64b0042dabf51f37318616965",
                2.91,
                R.drawable.hero);
        Song tequila = new Song("S1003",
                "Tequila",
                "Dan+Shay",
                "https://p.scdn.co/mp3-preview/fb12ad0f0757edb94b3cbf4911039e526ab1e54c?cid=2afe87a64b0042dabf51f37318616965",
                3.28,
                R.drawable.tequila);
        Song notYourBarbieGirl = new Song("S1006",
                "Not Your Barbie Girl",
                "Ava Max",
                "https://p.scdn.co/mp3-preview/234e17c9b4a693466e63b22c148ce100e7236437?cid=2afe87a64b0042dabf51f37318616965",
                3.11,
                R.drawable.not_your_barbie_girl);
        Song doubleTake = new Song("S1008",
                "double take",
                "dhruv",
                "https://p.scdn.co/mp3-preview/5f6cf85d696b35726841fe6b26d10b921f84e424?cid=2afe87a64b0042dabf51f37318616965",
                2.86,
                R.drawable.double_take_dhruv);
        Song buildABitch = new Song("S1009",
                "Build A Bitch",
                "Bella Poarch",
                "https://p.scdn.co/mp3-preview/9ea1adf65dc7d2d9956f3087f7ee6a3f584526de?cid=2afe87a64b0042dabf51f37318616965",
                2.05,
                R.drawable.build_a_bitch);

        songs[0] = hero;
        songs[1] = tequila;
        songs[2] = notYourBarbieGirl;
        songs[3] = doubleTake;
        songs[4] = buildABitch;
    }//end of constructor
    //used to search a Song object from the array according to the id in the parameter
    public int searchSongById(String id){
        //you need iterate the songs array to find out the song with the same id in the parameter
        for(int index=0; index < songs.length; index++){
            Song tempSong = songs[index];//store the song into a temp variable
            //compare the id with the tempSong's id, if equal, then we found the song with the id
            //.equals to compare strings, please don't use ==
            if(tempSong.getId().equals(id)){
                return index;//return the position of this song in the songs array
            }
        }
        return -1;
    }
    public Song getCurrentSong(int currentSongId){
        return songs[currentSongId] ;
    }//end of getCurrentSong
    public int getPrevSong(int currentSongIndex){
        if (currentSongIndex <= 0){
            return currentSongIndex;
        }
        else{
            return currentSongIndex-1;
        }
    }//end of getPrevSong
    public int getNextSong(int currentSongIndex){
        if (currentSongIndex >= songs.length-1){
            return currentSongIndex;
        }
        else{
            return currentSongIndex +1;
        }
    }// end of getNextSong


}//end of class