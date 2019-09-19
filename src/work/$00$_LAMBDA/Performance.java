package work.$00$_LAMBDA;

import java.util.stream.Stream;

public interface Performance {

    public String getName();

    public Stream<Artist> getMusiciansStream();

//     TODO: test
//    public default Stream<Artist> getAllMusicians() {
//        return getMusiciansStream().flatMap(artist -> {
//            return concat(Stream.of(artist), artist.getMembers());
//        });
//    }
}
