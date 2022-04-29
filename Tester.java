
/**
 * Display 9 Taylor Swift albums, and specifications of each, including
 * an average song duration that uses data from the other specification fields.
 * Specs are song count and album duration.
 *
 * @author Madeline Vande Hey
 * @version 2/4/22
 * 
 * 
 */
public class Tester
{
    public static void main(String[] args) {
        // album specs
        String name1 = "Taylor Swift (Bonus Track Version)";
        int songCount1 = 15;
        int albumDur1 = 53;
        
        String name2 = "Fearless (Taylor's Version)";
        int songCount2 = 26;
        int albumDur2 = 107;
        
        String name3 = "Speak Now (Deluxe Edition)";
        int songCount3 = 20;
        int albumDur3 = 92;
        
        String name4 = "Red (Taylor's Version)";
        int songCount4 = 31;
        int albumDur4 = 131;
        
        String name5 = "1989 (Deluxe Edition)";
        int songCount5 = 19;
        int albumDur5 = 69;
        
        String name6 = "reputation";
        int songCount6 = 15;
        int albumDur6 = 56;
        
        String name7 = "Lover";
        int songCount7 = 18;
        int albumDur7 = 62;
        
        String name8 = "folklore (deluxe version)";
        int songCount8 = 17;
        int albumDur8 = 67;
        
        String name9 = "evermore (deluxe version)";
        int songCount9 = 17;
        int albumDur9 = 69;
        
        // new object
        Album [] albums = {new Album(name1, songCount1, albumDur1), new Album(name2, songCount2, albumDur2), new Album(name3, songCount3, albumDur3),
                            new Album(name4, songCount4, albumDur4),new Album(name5, songCount5, albumDur5), new Album(name6, songCount6, albumDur6),
                            new Album(name7, songCount7, albumDur7),new Album(name8, songCount8, albumDur8),new Album(name9, songCount9, albumDur9)};
        
        
        // printing
        System.out.println();
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.printf("%s %40s %30s %40s", "Album Name", "# of Songs", "Album Duration (minutes)", "Average Song Duration (minutes) \n");
        System.out.println("*************************************************************************************************************************");
        // print array of album objects
        for(Album a : albums) {
            System.out.println(a);
        }
        System.out.println("*************************************************************************************************************************");
        System.out.println("_________________________________________________________________________________________________________________________");
    }
}
