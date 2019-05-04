/**
* The class that controls the filepath for the background image/object
* (Req. 3.0.0, 4.0.0, 5.0.0)
*/

public class Entry {
    String filepath;
    String text;
    String[] optionTexts;
    int[] results;
    public Entry(
            String filepath, // used for background image
            String text,
            String[] optionTexts,
            int[] results
    ){
        this.text = text;
        this.filepath = filepath;
        this.optionTexts = optionTexts;
        this.results = results;
    }
}
