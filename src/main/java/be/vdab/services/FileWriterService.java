package be.vdab.services;

import be.vdab.domain.Album;
import be.vdab.domain.Artist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileWriterService {
    // Author: Timothy
    private String path;

    public FileWriterService(String path) {
        this.path = path;
    }

    public void writeToFile(List<Artist> artistList) {
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(this.path)))) {
            for (Artist artist: artistList) {
                printWriter.printf("Name: %s ,Origin: %s \n", artist.getName(), artist.getOrigin());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
