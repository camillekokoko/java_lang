//Build Playlist.java with the best possible playlist of music using a Java ArrayList

import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("song1");
    desertIslandPlaylist.add("song2");
    desertIslandPlaylist.add("song3");
    desertIslandPlaylist.add("song4");
    desertIslandPlaylist.add("song5");
    desertIslandPlaylist.add("song6");

    System.out.println("Original playlist: " + desertIslandPlaylist);

    if (desertIslandPlaylist.size() > 5) {
      desertIslandPlaylist.remove(0);
    }

    System.out.println("Updated playlist: " + desertIslandPlaylist);

    // Swap Songs using indexOf
    String songToSwap1 = "song3";
    String songToSwap2 = "song5";

    int index1 = desertIslandPlaylist.indexOf(songToSwap1);
    int index2 = desertIslandPlaylist.indexOf(songToSwap2);

    if (index1 != -1 && index2 != -1) {
      // Songs found, perform the swap
      String temp = desertIslandPlaylist.get(index1);
      desertIslandPlaylist.set(index1, desertIslandPlaylist.get(index2));
      desertIslandPlaylist.set(index2, temp);
    } else {
      System.out.println("One or both songs not found in the playlist.");
    }

    System.out.println("Playlist after swapping: " + desertIslandPlaylist);
  }
}
