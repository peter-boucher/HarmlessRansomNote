public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
        for (String word : message.split(" ")) {
            if (!magazineText.contains(word)) {
                return false;
            }
        }
        return true;
    }
}
