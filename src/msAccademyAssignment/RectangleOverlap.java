package msAccademyAssignment;


/*
To check if two rectangles overlap in programming, you need to verify:

No Overlap Horizontally: If the right side of one rectangle is to the left of the other (x2 < x3 or x4 < x1).
No Overlap Vertically: If the top of one rectangle is below the other (y2 < y3 or y4 < y1).
If neither condition is true, the rectangles overlap.


 */
public class RectangleOverlap {

    // Method to check if two rectangles overlap
    public static boolean doRectanglesOverlap(int x1, int y1, int x2, int y2,
                                              int x3, int y3, int x4, int y4) {
        // Check if one rectangle is to the left of the other
        if (x2 < x3 || x4 < x1) {
            return false;
        }

        // Check if one rectangle is above the other
        if (y2 < y3 || y4 < y1) {
            return false;
        }

        // If neither condition is true, rectangles overlap
        return true;
    }

    public static void main(String[] args) {
        // Rectangle 1: bottom-left (x1, y1), top-right (x2, y2)
        int x1 = 0, y1 = 0, x2 = 4, y2 = 4;

        // Rectangle 2: bottom-left (x3, y3), top-right (x4, y4)
        int x3 = 2, y3 = 2, x4 = 6, y4 = 6;

        boolean overlap = doRectanglesOverlap(x1, y1, x2, y2, x3, y3, x4, y4);

        if (overlap) {
            System.out.println("The rectangles overlap.");
        } else {
            System.out.println("The rectangles do not overlap.");
        }
    }
}
