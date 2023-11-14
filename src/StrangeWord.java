public class StrangeWord {

    private String word;

    /* PRECONDITIONS: word will contain all capital letters
     *                with no spaces or other non-letter symbols;
     *                word.length() >= 2
     */
    public StrangeWord(String word) {
        this.word = word;
    }

    /* getter method for word */
    public String getWord() {
        return word;
    }

    /* This method updates word to include endChar repeated num times
     * on each end; this method does not return a value, but rather
     * updates the word instance variable
     *
     * PRECONDITIONS:  num > 0 and endChar.length() == 1
     *
     */
    public void bookend(String endChar, int num){
        for(int i = 0; i < num; i++ ){
            word = endChar + word + endChar;
        }
    }



    /* Returns the number of times that word contains searchChar followed
     * immediately by a character that is not searchChar; this method
     * does NOT modify word
     *
     * PRECONDITION: searchChar.length() == 1
     */
    public int followedBy(String searchChar){
        int count = 0;
        for(int i = 0; i < word.length() - 1; i++){
            if((word.charAt(i) + "").equals(searchChar)){
                if(!(word.charAt(i+1) + "").equals(searchChar)){
                    count++;
                    i++;
                }
            }
        }
        return count;
    }


    /* Returns a new string consisting of the letters of word that are
     * situated at indices that are multiples of offSet; this method
     * does NOT modify word
     *
     * PRECONDITION: offset > 0
     */
    public String everyOther(int offSet){
        String newWord = "";
        for(int i = 0; i < word.length(); i += offSet){
            newWord = newWord + word.charAt(i);
        }
        return newWord;
    }


    /* This method prints a word pyramid containing the letters of word;
     * the pyramid should be built top down, starting with the first
     * letter and building subsequent levels that are one more character
     * in length than the previous level; the last level can be does not
     * need to be filled
     */
    public void wordPyramid(){
        int o = 0;
        for(int i = 0; i < word.length(); i += o){
            o++;

            if(i + o > word.length()){
                System.out.println(word.substring(i));
            }else{
                System.out.println(word.substring(i, i + o));+




// etst text whatever 32






            }
        }


    }
}
