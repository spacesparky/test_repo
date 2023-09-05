public class triangle {
       public static String triangleType(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return "not a triangle";
        } else if (x == y && y == z) {
            return "equilateral";
        } else if (x == y || x == z || y == z) {
            return "isosceles";
        } else if (x + y > z && x + z > y && y + z > x) {
            return "different-sided";
        } else {
            return "not a triangle";
        }
    }

    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
    }
}
