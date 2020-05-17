import java.util.ArrayList;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        ArrayList<String> result = new ArrayList();

        for (String s1 : array1) {
            if (result.contains(s1)) {
                continue;
            }

            for (String s2 : array2) {
                if (s1.equals(s2)) {
                    result.add(s1);
                    break;
                }
            }
        }

        String[] resultArray = new String[result.size()];
        result.toArray(resultArray);
        return resultArray;
    }
}