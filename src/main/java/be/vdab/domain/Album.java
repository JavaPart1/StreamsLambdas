package be.vdab.domain;

import java.util.List;
import java.util.Set;

public class Album {
    private String name;
    private Set<Track> tracks;
    private List<Artist> musicians;

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Artist> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Artist> musicians) {
        this.musicians = musicians;
    }
}
