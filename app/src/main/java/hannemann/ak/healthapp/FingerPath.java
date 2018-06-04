package hannemann.ak.healthapp;

import android.graphics.Path;

public class FingerPath {
    private int strokeWidth;
    private Path path;

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public Path getPath() {
        return path;
    }
    public FingerPath(int strokeWidth, Path path) {
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
