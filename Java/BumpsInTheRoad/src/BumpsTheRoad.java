//Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle
//about 15 more bumps before it dies totally.
//Unfortunately for you, your drive is very bumpy!
//Given a string showing either flat road ("_") or bumps ("n"), work out if you make it home safely.
//15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".

public class BumpsTheRoad {
    public static void main(String[] args) {
        System.out.println((bumps("n")));
        System.out.println((bumps("_nnnnnnn_n__n______nn__nn_nnn")));
        System.out.println((bumps("______n___n_")));
        System.out.println((bumps("nnnnnnnnnnnnnnnnnnnnn")));
    }
    public static String bumps(final String road) {
        return (road.chars().filter(singleChar -> singleChar == 'n').count() > 15)? "Car Dead" : "Woohoo!";
    }


}
