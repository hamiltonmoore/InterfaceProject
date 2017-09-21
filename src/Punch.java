
public interface Punch {
    public void punch();

    public default boolean retract() {
        return true;
    }
}

