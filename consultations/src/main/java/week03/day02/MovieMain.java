package week03.day02;

public class MovieMain {

    public static void main(String[] args) {

        Actor actor = new Actor("Leonardo DiCaprio",1974);
        Actor actor2 = new Actor("Kate Winslet",1975);
        Actor actor3 = new Actor("Billy Zane",1966);

        Movie movie = new Movie("Titanic",1997);

        movie.addActor(actor);
        movie.addActor(actor2);
        movie.addActor(actor3);

        System.out.println(movie.getActors().indexOf(actor));

//        movie.addActor(new Actor("Jane",1987));
//
//        movie.getActors().get(0).setName("Leo");
//
//        for (Actor actual : movie.getActors()){
//            System.out.println(actual.getName());
//        }

    }
}
