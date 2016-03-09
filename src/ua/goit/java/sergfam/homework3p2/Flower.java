package ua.goit.java.sergfam.homework3p2;

import java.util.List;

/**
 * Created by Serg-fam on 09.03.2016 on 14:54.
 */
public class Flower {

   private List<Rose> roses;
   private List<Chamomile> chamomiles;

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    public List<Chamomile> getChamomiles() {
        return chamomiles;
    }

    public void setChamomiles(List<Chamomile> chamomiles) {
        this.chamomiles = chamomiles;
    }

    public List<Astra> getAstras() {
        return astras;
    }

    public void setAstras(List<Astra> astras) {
        this.astras = astras;
    }

    public List<Tulip> getTulips() {
        return tulips;
    }

    public void setTulips(List<Tulip> tulips) {
        this.tulips = tulips;
    }

    private List<Astra> astras;
   private List<Tulip> tulips;
}
