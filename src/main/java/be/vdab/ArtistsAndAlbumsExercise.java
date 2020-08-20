package be.vdab;

import be.vdab.domain.Album;
import be.vdab.domain.Artist;
import be.vdab.domain.Track;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArtistsAndAlbumsExercise {
    public static void main(String[] args) {
        // Create some artists groups
        Artist simpleMinds = new Artist("Simple Minds");
        Artist marillion = new Artist("Marillion");
        Artist pinkFloyd = new Artist("Pink Floyd");
        // Create some artist group members
        Artist sydBarrett = new Artist("Syd Barett");
        sydBarrett.setOrigin("England");
        Artist rogerWaters = new Artist("Roger Waters");
        rogerWaters.setOrigin("England");
        Artist jimKerr = new Artist("Jim Kerr");
        jimKerr.setOrigin("Ireland");
        Artist steveRothery = new Artist("Steve Rothery");
        steveRothery.setOrigin("England");

        Set<Artist> tempGroup = new HashSet<>();
        tempGroup.add(jimKerr);
        simpleMinds.setMembers(tempGroup);
        simpleMinds.setOrigin("Ireland");

        tempGroup.clear();
        tempGroup.add(steveRothery);
        marillion.setMembers(tempGroup);
        marillion.setOrigin("England");

        tempGroup.clear();
        tempGroup.add(sydBarrett);
        tempGroup.add(rogerWaters);
        pinkFloyd.setMembers(tempGroup);
        pinkFloyd.setOrigin("England");

        // Prints the names and origins of artists
        tempGroup.stream()
                .forEach(e-> System.out.println("\n\nName : " + e.getName() + "\nOrigin : " + e.getOrigin()));

        // Create Tracks & Albums
        Track t1 = new Track("Heloo");
        Track t2 = new Track("Hello again");
        Track t3 = new Track("Goodbye");
        Track t4 = new Track("Once more");
        Track t5 = new Track("New Gold Dream");
        Set<Track> trackSet = new HashSet<>();
        trackSet.add(t1);
        trackSet.add(t2);
        trackSet.add(t3);
        trackSet.add(t4);
        trackSet.add(t5);
        Album al1 = new Album("All1");
        al1.setTracks(trackSet);


        Track d1 = new Track("Heloooo");
        Track d2 = new Track("Hello again and again");
        Track d3 = new Track("Goodbyeeee");
        Track d4 = new Track("Once not more");
        Track d5 = new Track("New Silver Dream");
        trackSet.clear();
        trackSet.add(d1);
        trackSet.add(d2);
        trackSet.add(d3);
        trackSet.add(d4);
        trackSet.add(d5);
        Album al2 = new Album("All2");
        al2.setTracks(trackSet);

        List<Album> albumList = new ArrayList<>();
        albumList.add(al1);
        albumList.add(al2);

        albumList.stream().map(e->e.getTracks(3)).forEach(s-> System.out.println(s.toString()));



    }

}
