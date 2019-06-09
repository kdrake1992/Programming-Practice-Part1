public class StringUtils {

    public static boolean included (String word, String searched) {
        word = word.toUpperCase();
        word = word.trim();

        searched = searched.toUpperCase();
        searched = searched.trim();

        if (word.contains(searched)) {
            return true;
        }
        else {
            return false;
        }
    }
}
