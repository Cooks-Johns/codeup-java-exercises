package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



//   -----------===================                 NOTESS

//public Movie(String name, String category) {
//    this.name = name;
//    this.category = category;
//}
//
//public String toString() {  /// overRide
//    return name + ", Category: " + category;
//}
//
//public boolean isInCategory(String category) {
//    return this.category.equals(category);
//}
//
//
//
//
}
