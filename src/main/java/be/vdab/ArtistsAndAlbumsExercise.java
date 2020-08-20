package be.vdab;

import be.vdab.domain.Artist;
import be.vdab.domain.Track;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    }

}
