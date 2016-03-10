package ua.goit.java.sergfam.homework3p1;

import java.util.List;

/**
 * Created by Serg-fam on 09.03.2016 on 14:12.
 */
public class Folder {


    File file;
    private List<Image> images;
    private List<Audio> audios;
    private List<Text> texts;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Audio> getAudios() {
        return audios;
    }

    public void setAudios(List<Audio> audios) {
        this.audios = audios;
    }

    public List<Text> getTexts() {
        return texts;
    }

    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }


}
