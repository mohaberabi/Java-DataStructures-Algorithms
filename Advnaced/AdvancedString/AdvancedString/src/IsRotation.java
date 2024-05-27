public class IsRotation {


    boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);

    }


    boolean isRotationByTwoPlaces(String str1, String str2) {


        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2) || concatenated.contains(str2.substring(str2.length() - 2) + str2.substring(0, str2.length() - 2));
    }

}
