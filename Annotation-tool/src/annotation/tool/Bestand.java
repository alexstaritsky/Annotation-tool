package annotation.tool;

/**
 *
 * @author Alexander
 */
public class Bestand {

    private int bestandID;
    private String bestandnaam;
    private String type;

    public Bestand(int bestandID, String bestandnaam, String type) {
        this.bestandID = bestandID;
        this.bestandnaam = bestandnaam;
        this.type = type;
    }

    /**
     * @return the bestandID
     */
    public int getBestandID() {
        return bestandID;
    }

    /**
     * @return the bestandnaam
     */
    public String getBestandnaam() {
        return bestandnaam;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", Integer.toString(bestandID), bestandnaam, type);
    }
}
