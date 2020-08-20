package be.vdab.domain;

import java.util.Set;

public class Artist {
    private String name;
    private Set<Artist> members;
    private String origin;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Artist> getMembers() {
        return members;
    }

    public void setMembers(Set<Artist> members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
