
/*
 * @author Name: Nabil Ahmed
 * Student ID: 18206441
 * Campus: Parramata
 * Tutor Name: Paul Davies
 * Class day: Friday
 * Class Time: 3:00pm-4:00pm & 11:00am-1:00pm
 */

package thePackage;

public class Playlist_18206441 {
  //All the data types and variables
  private int playlistId;
  private String name;
  private int length;
  private double duration;
  private int[] Movies;
  

  /**
   * 
   * @param plId is plalistId
   * @param plName is name
   * @param plnt is length
   * @param pdrt is duration
   * @param pmvies is Movies
   */
  public Playlist_18206441(int plId, String plName, int plnt, double pdrt, int[] pmvies) {

    playlistId = plId;
    name = plName;
    length = plnt;
    duration = pdrt;
    Movies = pmvies;
    

  }
  //its the no-arguement constructor of this class
  public Playlist_18206441(){
    playlistId = 0;
    name = "";
    length = 0;
    duration = 0.0;
    Movies = new int[0];
    
    
  }
  //accessor for playlistI
  public int getplaylistId() {
    return playlistId;
  }

  // mutator for playlistId
  public void setplaylistId(int playlistId) {
    this.playlistId = playlistId;
  }
  //accessor for name
  public String getname(){
    return name;
  }
  //mutator for name
  public void setname(String name){
    this.name = name;
  }
 
  //accessor for length
  public int getlength(){
   return length; 
  }
  //mutator for length
  public void setlength(int length){
    this.length = length;
  }
  //accessor for duration
  public double getduration(){
    return duration;
  }
  
  //mutator for duration
  public void setduration(double duration){
    this.duration = duration;
  }
  
  //accessor for Movies array
  public int[] getMovies(){
    return Movies;
  }
  
  //Mutator for Movies
  public void setMovies(int[] Movies){
    this.Movies = Movies;
    }
  

}
