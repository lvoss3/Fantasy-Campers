public class Entry {
    String filepath;
    String text;
    String[] optionTexts;
    int[] results;
    public Entry(
            String filepath, //Used for background image
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
