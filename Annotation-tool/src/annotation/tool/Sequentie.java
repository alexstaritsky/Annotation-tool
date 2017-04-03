package annotation.tool;

/**
 *
 * @author Alex
 */
public class Sequentie {

    private int type;
    private String header;
    private String sequentie;

    public Sequentie(int type, String header, String sequentie) {
        this.type = type;
        this.header = header;
        this.sequentie = sequentie;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @return the header
     */
    public String getHeader() {
        return header;
    }

    /**
     * @return the sequentie
     */
    public String getSequentie() {
        return sequentie;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", type, header, sequentie.subSequence(0, 10));
    }
}
