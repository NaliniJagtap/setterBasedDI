package setterBasedDI;

public class Movie {
	private int id;  
    private String movieName;  
    private String director;  
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getMovieName() {  
        return movieName;  
    }  
    public void setMovieName(String movieName) {  
        this.movieName = movieName;  
    }  
    public String getDirector() {  
        return director;  
    }  
    public void setDirector(String director) {  
        this.director = director;  
    }  
    void display(){  
        System.out.println(id+" "+movieName+" "+director);  
    }  

}
