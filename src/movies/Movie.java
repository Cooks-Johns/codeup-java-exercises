package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
//
//    public static void showMovies(Movie[] movies, String category) {
//        for(Movie movie: movies) {
//            if (category.equals("all")) {
//                System.out.println(movie.getName() + " " + movie.getCategory());
//            } else {
//                System.out.println(movie.getName() + "" + movie.getCategory());
//
//            }
//        }
//    }
//
//    public static void searchTitle(Movie[] movies, String title) {
//        for(Movie movie: movies) {
//            if(movie.getName().contains(title)) {
//                System.out.println(movie.getName() + " " + movie.getCategory());
//            }
//        }
//    }

//   -----------===================                 NOTESS
//
//public Movie(String name, String category) {
//    this.name = name;
//    this.category = category;
////}

public String toString() {  /// overRide
    return name + ", Category: " + category;
}

public boolean isInCategory(String category) {
    return this.category.equals(category);
}

////
//
//
}
