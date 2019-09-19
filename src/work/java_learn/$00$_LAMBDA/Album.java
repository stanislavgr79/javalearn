package work.java_learn.$00$_LAMBDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.unmodifiableList;

public final class Album implements Performance {

    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;

    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(tracks);
        Objects.requireNonNull(musicians);
        this.name = name;
        this.tracks = new ArrayList<>(tracks);
        this.musicians = new ArrayList<>(musicians);
    }

    public String getName() {
        return name;
    }

    public Stream<Track> getTracksStream() {
        return tracks.stream();
    }

    public List<Track> getTrackList() {
        return unmodifiableList(tracks);
    }

    public Stream<Artist> getMusiciansStream() {
        return musicians.stream();
    }

    public List<Artist> getMusicianList() {
        return unmodifiableList(musicians);
    }

    public Artist getMainMusician() {
        return musicians.get(0);
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                ", musicians=" + musicians +
                '}';
    }

    public Album copy() {
        List<Track> tracks = getTracksStream().collect(Collectors.toList());
        List<Artist> musicians = getMusiciansStream().map(Artist::getArtist).collect(Collectors.toList());
        return new Album(name, tracks, musicians);
    }
}
