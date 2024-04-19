public class Trail {
    private int[] markers;

    public boolean isLevelTrailSegment(int start, int end) {
        int min = markers[start];
        int max = markers[start];
        for (int i = start; i <= end; i++) {
            int marker = markers[i];

            if (marker < min) {
                min = marker;
            }
            if (marker > max) {
                max = marker;
            }
        }
        return (max - min) <= 10;
    }

    public boolean isDifficult() {
        int count = 0;
        for (int i = 0; i < markers.length - 1; i++) {
            if (Math.abs(markers[i] - markers[i + 1]) >= 30) {
                count++;
            }
        }
        return count >= 3;
    }
}