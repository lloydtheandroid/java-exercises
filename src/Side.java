/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public enum Side {
    LEFT(2),
    RIGHT(1);

    private final int points;

    Side(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}