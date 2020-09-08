package Utils;

public abstract class Misc {
    public static int clamp(int whichVarToClamp, int from, int to) {
        return Math.max(from, Math.min(whichVarToClamp, to));
    }
}
