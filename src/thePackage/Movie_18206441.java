/*
 ** @author Name: Nabil Ahmed
 * Student ID: 18206441
 * Campus: Parramata
 * Tutor Name: Paul Davies
 * Class day: Friday
 * Class Time: 3:00pm-4:00pm & 11:00am-1:00pm
 */ 
 

package thePackage;

public class Movie_18206441 {

  //All the data types and variables
  private int Movie_Id;
  private String Movie_Title;
  private String Director;
  private String Writer;
  private double Movie_Duration;
  private String Genre;
  private String Movie_Class;
  private String Movie_Release;
  private double rating;
  
  
  /**
   * 
   * @param Id is Movie_Id
   * @param title is Movie_Title
   * @param direc is Director
   * @param writ is Writer
   * @param duration is Movie_Duration
   * @param gnr is Genre
   * @param mClass is Movie_Class
   * @param mRelease is Movie_Release
   * @param mrating is rating
   */
  public Movie_18206441(int Id, String title, String direc, String writ, double duration, String gnr, String mClass,
      String mRelease, double mrating) {

    Movie_Id = Id;
    Movie_Title = title;
    Director = direc;
    Writer = writ;
    Movie_Duration = duration;
    Genre = gnr;
    Movie_Class = mClass;
    Movie_Release = mRelease;
    rating = mrating;

  }

  //its the no-arguement constructor of this class
  public Movie_18206441() {
    Movie_Id = 0;
    Movie_Title = " ";
    Director = "";
    Writer = "";
    Movie_Duration = 0;
    Genre = "";
    Movie_Class = "";
    Movie_Release = "";
    rating = 0.0;
    

  }

  //accessor for Movie ID
  public int getMovie_Id() {
    return Movie_Id;
  }

  //mutators for Movie ID
  public void setMovie_Id(int Movie_Id) {
    this.Movie_Id = Movie_Id;
  }

  //accessor for Movie Title
  public String getMovie_Title() {
    return Movie_Title;
  }

  // mutator for Movie Title
  public void setMovie_Title(String Movie_Title) {
    this.Movie_Title = Movie_Title;
  }

  //Accessors for Director
  public String getDirector() {
    return Director;
  }

  // mutator for Director
  public void setDirector(String Director) {
    this.Director = Director;
  }

  //Accessor for Writer
  public String getWriter() {
    return Writer;
  }

  // mutator for Writer
  public void setWriter(String Writer) {
    this.Writer = Writer;
  }

  //Accessor for Movie Duration
  public double getMovie_Duration() {
    return Movie_Duration;
  }

  // mutator for Movie Duration
  public void setMovie_Duration(double Movie_Duration) {
    this.Movie_Duration = Movie_Duration;
  }

  //accessor for Genre
  public String getGenre() {
    return Genre;
  }

  // mutator for Genre
  public void setGenre(String Genre) {
    this.Genre = Genre;
  }

  //accessor for Movie Class
  public String getMovie_Class() {
    return Movie_Class;
  }

  // mutator for movie Class
  public void setMovie_Class(String Movie_Class) {
    this.Movie_Class = Movie_Class;
  }

  //accessor for Movie release
  public String getMovie_Release() {
    return Movie_Release;
  }

  // mutator for release
  public void setMovie_Release(String Movie_Release) {
    this.Movie_Release = Movie_Release;
  }

  //accessor for rating
  public double getrating() {
    return rating;
  }

  // mutator for rating
  public void setrating(double rating) {
    this.rating = rating;
  }

  
  
}
