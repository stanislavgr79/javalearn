package work.java_learn.$00$_LAMBDA;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        Artist johnColtrane = new Artist("John Coltrane", "US");
        Artist johnLennon = new Artist("John Lennon", "UK");
        Artist paulMcCartney = new Artist("Paul McCartney", "UK");
        Artist georgeHarrison = new Artist("George Harrison", "UK");
        Artist ringoStarr = new Artist("Ringo Starr", "GE");


        List<Artist> membersOfTheBeatles = asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);
        List<Artist> membersOfTheBeatles2 = asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);
        System.out.println("*********");
        List<Artist> mmm = Stream.of(membersOfTheBeatles, membersOfTheBeatles2)
                .flatMap(Collection::stream).collect(toList());
        mmm.forEach(o-> System.out.println(o));
        System.out.println("************");
        Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");


        Album aLoveSupreme = new Album("A Love Supreme",
                asList(Track.getTrack("Acknowledgement", 467),
                        Track.getTrack("Resolution", 242)),
                asList(georgeHarrison));
        Album sampleShortAlbum = new Album("sample Short Album",
                asList(Track.getTrack("short track a", 30)),
                asList(ringoStarr));
        Album manyTrackAlbum = new Album("sample Short Album",
                asList(Track.getTrack("short track 1", 33),
                        Track.getTrack("short track 2", 636),
                        Track.getTrack("short track 3", 453),
                        Track.getTrack("short track 4", 38),
                        Track.getTrack("short track 5", 133)),
                membersOfTheBeatles);

        Stream<Album> albums = Stream.of(aLoveSupreme);

        Set<Album> set = new HashSet<>();
        set.add(aLoveSupreme);
        set.add(sampleShortAlbum);
        set.add(manyTrackAlbum);
        Stream streamAlbum = Stream.of(set);

        Set<String> temp = filter1(set);
        temp.stream().forEach(o-> System.out.println(o));

        Set<Track> tracks = filterTrack(set);
        tracks.forEach(System.out::println);

        Track trackMin = minTrack(set);
        System.out.println(" min " + trackMin);

        Set<Album> min3 = filterAlbum(set);
        min3.stream().forEach(o-> System.out.println(o));

        int totalMembers = (int) set.stream().flatMap(q->q.getMusiciansStream())
                .distinct()
                .count();

        List<Artist> listArtist = set.stream().flatMap(q->q.getMusiciansStream())
                .distinct().collect(Collectors.toList());
        System.out.println(totalMembers);
        listArtist.stream().forEach(o-> System.out.println(o));

        String string = "qweRtY";
        String string2 = "qweRtyqwe";
        List<String> llll = new ArrayList<>();
        llll.add(string);
        llll.add(string2);


        int x = (int) string.chars().filter(chars-> Character.isLowerCase(chars)).count();
        System.out.println(x);

        // строка с максимальным кол-вом символов нижнего регистра
        String sss = llll.stream()
                .max(Comparator.comparingLong(s ->
                        s.chars()
                                .filter(Character::isUpperCase)
                                .count()))
                .get();
        System.out.println(sss);

        // return nameArtist maxLong
        String name = set.stream()
                .flatMap(Album::getMusiciansStream)
                .map(Artist::getName)
                .max(Comparator.comparingInt(s->
                        (int) s.chars()
                                .count()))
                .orElseGet(null);
        System.out.println("long name ----- :" + name);

        Stream stream = set.stream().flatMap(Album::getMusiciansStream).map(Artist::getArtist);
        Stream stream1 = Stream.of(albums);

        Optional <Artist> aaa = biggestGroup(stream1);
        System.out.println(aaa.toString());


        String str = set.stream()
                .flatMap(Album::getMusiciansStream)
                .map(Artist::getName)
                .filter(o->o.startsWith("R"))
                .collect(Collectors.joining(", ", "[","]"));
//
        System.out.println(str);

        Map<Artist, Long> map = set.stream().collect(groupingBy((a1)-> a1.getMainMusician(), counting()));
        map.entrySet().stream().forEach(o-> System.out.println(o.getKey()+" " + o.getValue()));

        Map<Artist, List<String>> map1;
                set.stream()
                .collect(groupingBy(Album::getMainMusician,
                        mapping(Album::getName, toList())));

    Stream <String> names = Stream.of("johnLennon", "paulMcCartney", "georgeHarrison", "ringoStarr",
            "georgeHarrison", "ringoStarr");
    List<String> list = names.collect(Collectors.toList());

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        int tempCount = 0;

        for (int i = 0; i < list.size(); i++) {
            if (treeMap.containsKey(list.get(i))) {
                tempCount = treeMap.get(list.get(i)) + 1;
                treeMap.put(list.get(i), tempCount);
            } else {
                treeMap.put(list.get(i), 1);
            }
        }
        treeMap.entrySet().stream().forEach(o-> System.out.print(o.getKey()+"-" +o.getValue()+" "));
}
    public static Optional<Artist> biggestGroup(Stream<Artist> artists) {
        Function<Artist, Long> getCount = artist -> artist.getMembers().stream().count();
        return artists.collect(Collectors.minBy(comparing(getCount)));
//
    }
        public double average(Set<Album> albums){
            return albums.stream()
                    .collect(averagingInt(album-> album.getTrackList().size()) );
        }


    public static Set<String> filter1(Set<Album> al){
       return al.stream()
               .flatMap(a ->a.getMusicianList().stream())
               .filter(o->o.getNationality().equals("GE"))
               .map(o-> o.getName())
               .collect(Collectors.toSet());
    }

    public static Set<Track> filterTrack(Set<Album> al){
        return al.stream()
                .flatMap(o->o.getTrackList().stream())
                .filter(q->q.getLength()<300)
                .collect(Collectors.toSet());
    }

    public static Track minTrack(Set<Album> set){
        return set.stream()
                .flatMap(o->o.getTracksStream())
                .min(Comparator.comparingInt(Track::getLength))
                .get();
    }

    public static Set<Album> filterAlbum(Set<Album> set){
        return set.stream()
                .filter(o->o.getTrackList().stream().count()<3)
                .collect(Collectors.toSet());
    }
}
