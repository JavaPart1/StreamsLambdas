package be.vdab.domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Album {
    private String name;
    private List<Track> tracks;
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

    public List<Track> getTracks(int nbr) {
        if (nbr > 0){
            return  (tracks.stream().limit(nbr).collect(Collectors.toList()));

        }else{
            return tracks;
        }
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Artist> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Artist> musicians) {
        this.musicians = musicians;
    }
}
