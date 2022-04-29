
/**
 * Set and get album specs, create album object.
 *
 * @author Madeline Vande Hey
 * @version 2/4/22
 */
public class Album
{
    // instance variables
    private String name;
    private int songCount;
    private int albumDur;
    
    // constructor
   public Album(String name, int songCount, int albumDur) {
       this.name = name;
       this.songCount = songCount;
       this.albumDur = albumDur;
   }
   
   // getter and setter methods
   public void setName(String name) {
       this.name = name;
   }
   public void setAlbumDur(int albumDur) {
       this.albumDur = albumDur;
   }
   public void setSongCount(int songCount) {
       this.songCount = songCount;
   }
   public String getName() {
       return name;
   }
   public int getAlbumDur() {
       return albumDur;
   }
   public int getSongCount() {
       return songCount;
   }
   
   // get average song duration per album
   public double getAvgSongDur() {
       double avgSongDur = (double)albumDur / (double)songCount;
       return avgSongDur;
   }
   
   // to String method
   public String toString() {
        return String.format("%-44s %-23d %-30d %-40.2f", getName(), getSongCount(), getAlbumDur(), getAvgSongDur()); 
    }
}