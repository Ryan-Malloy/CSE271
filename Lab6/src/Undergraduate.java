/**
 * Undergraduate.
 * 
 * @author RyanMalloy
 */
public class Undergraduate extends Student {

    /**
     * initialize name.
     * 
     * @param name name.
     */
    public Undergraduate(String name) {
        super(name);
    }

    /**
     * performs deep copy of scores.
     * 
     * @param src the new copy.
     */
    public Undergraduate(Undergraduate src) {
        super(src.name);
        for (int i = 0; i < src.scores.size(); i++) {
            addScore(src.scores.get(i));
        }
    }

    /**
     * Clones an object.
     */
    public Undergraduate clone() {
        return new Undergraduate(this);
    }

    /**
     * Two Undergraduate objects are equal only if name and all scores are
     * equal.
     * 
     * @return boolean.
     */
    public boolean equals(Object o) {

        if (!(o instanceof Student) || o == null) {
            return false;
        }
        Undergraduate a = (Undergraduate) o;
        if (!(a.name).equals(name)) {
            return false;
        } else if (a.scores.size() == scores.size()) {
            for (int i = 0; i < scores.size(); i++) {
                if (!(a.scores.get(i) == scores.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Two Undergraduate objects are to be compared first based on name and (if
     * name is equal) then based on average scores.
     * 
     * @param o first object.
     * @return 1 if o > a, -1 if o < a, 0 if o = a.
     */
    public int compareTo(Student o) {
        if (name.equals(o.name)) {
            if (getAverageScore() < o.getAverageScore()) {
                return 1;
            } else if (getAverageScore() > o.getAverageScore()) {
                return -1;
            }
        }
        return 0;
    }
}
