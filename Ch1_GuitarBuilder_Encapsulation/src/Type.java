/**
 * Methods or classes that use enums are protected from any values not defined
 * in the enum. So you can't misspell or mistype an enum without getting a
 * compiler error. It's a great way to get not only type safety, but value safety;
 * you can avoid getting bad data for anything that has a standard range or set of
 * legal values. Enums avoid all those string comparisons completely and takes the
 * place of one of the guitar properties that is standard across all guitars.
 */
public enum Type {

    ACOUSTIC, ELECTRIC;

    /**
     * Guitar class uses these enumerated types to represent data in a way that
     * won't get screwed up by case issues or errors in spelling.
     * @return - Returns the appropriate spelling and case of type.
     */
    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "acoustic";
            case ELECTRIC:
                return "electric";
        }
        return null;
    }
}

