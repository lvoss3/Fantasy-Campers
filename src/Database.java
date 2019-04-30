public final class Database { // 2.1.0

    Entry[] a;

    public Database() {
        this.a = new Entry[600];
        a[0] = new Entry("./res/intro_1.png", "WELCOME TO FANTASY CAMPERS - AN ADVENTURE GAME!", new String[]{"Click here to Continue"}, new int[]{1}); // 1.0.0, 4.0.0, 8.0.0, 8.1.0
        a[1] = new Entry("./res/Plain.png", "Unlike many other stories, this one begins—and ENDS—with you and your choices!", new String[]{"Click here to Continue"}, new int[]{2});
        a[2] = new Entry("./res/Plain.png", "How does that work, you ask? Great question! Beginning on the next screen, you'll be immersed into a magical tale that involves saving a princess, and much more!", new String[]{"Click here to Continue"}, new int[]{3});
        a[3] = new Entry("./res/Plain.png", "The difference between this story and many like it is that YOU are in control. ",  new String[]{"Click here to Continue"}, new int[]{4});
        a[4] = new Entry("./res/Plain.png", "You will embark on a journey that requires you to make choices at every turn. Some of these choices may lead to perilous consequences, while other choices may make you the hero of your own story...", new String[]{"Click here to Continue"}, new int[]{5});
        a[5] = new Entry("./res/Plain.png", "Are you ready for an adventure?", new String[]{"Yes! Let's do this!", "No, I'm Scared..."}, new int[]{7,6});
        a[6] = new Entry("./res/game_over.png", "THE END\n\"A man that flies from his fear may find that he has only taken a short cut to meet it.\"\n" + "-J.R.R. Tolkien\n", new String[]{"Start Over"}, new int[]{0}); // 6.0.0
        a[7] = new Entry("./res/Plain.png", "The sun brightly shines on the village of Clearborrow, while the townspeople stroll about in the marketplace and talk happily amongst themselves...", new String[]{"Click here to Continue"}, new int[]{8});
        a[8] = new Entry("./res/Plain.png", "As you pass through, taking in the sights and sounds, you observe your surroundings. One vendor is selling fresh brown bread, while another vendor is selling cured bacon and ale. ", new String[]{"Click here to Continue"}, new int[]{9});
        a[9] = new Entry("./res/Plain.png", "Off in the distance, beyond the village, you see Clearborrow castle, where Princess Seraphina is waiting with her father, the King of Clearborrow. ", new String[]{"Proceed to the castle and meet the King","The castle looks kind of far, maybe this was a bad idea..."}, new int[]{10,6}); // 3.0.0, 5.0.0, 10.0.0
        a[10] = new Entry("./res/Plain.png", "You make your way to the castle, and as you enter the court, you’re greeted by the King himself, who exclaims loudly:", new String[]{"Click here to Continue"}, new int[]{11});
        a[11] = new Entry("./res/Plain.png", "\"Hello good Nobelman. I tremendously appreciate your bravery in offering to escort my daughter, the Princess of Clearborrow, to the Kingdom of Woodness in order to meet the Prince of Woodness so that they may marry.", new String[]{"Click here to Continue"}, new int[]{12});
        a[12] = new Entry("./res/Plain.png", "I have been told many tales of your bravery, as well as your courage.", new String[]{"Click here to Continue"}, new int[]{13});
        a[13] = new Entry("./res/Plain.png", "Do you accept my offer of 50 shillings and the title of Count of Clearborrow in exchange for guaranteeing my daughter's safe passage to Woodness?\"", new String[]{"Accept the King's Offer", "Negotiate for 100 shillings", "Slap the King. Why Not? Let's Get Crazy!"}, new int[]{19,21,14});
        a[14] = new Entry("./res/slap_king.png", "", new String[]{"Click here to Continue"}, new int[]{15});
        a[15] = new Entry("./res/slap_king.png", "Upon slapping the King, you were arrested by the knights and imprisoned in the Royal Dungeon for a sentence of 20 years.", new String[]{"Click here to Continue"}, new int[]{16});
        a[16] = new Entry("./res/slap_king.png", "When the Prince (who never liked his father) took power, he took mercy on you, commuting your sentence to 5 years total.", new String[]{"Click here to Continue"}, new int[]{17});
        a[17] = new Entry("./res/slap_king.png", "After leaving prison you became a farmer and were never remembered in history for saving the Princess or anything heroic.", new String[]{"Click here to Continue"}, new int[]{18});
        a[18] = new Entry("./res/slap_king.png", "\"But man is not made for defeat. A man can be destroyed, but not defeated...\"\n-Ernest Hemingway\n", new String[]{"Start Over", "Meet the King Again"}, new int[]{0,10}); // 6.0.0, 7.0.0
        a[19] = new Entry("./res/journey_begins.png", "\"I thank you for your bravery and willingness to escort the Princess to Woodness. You are indeed a brave and courageous soul.", new String[]{"Click here to Continue"}, new int[]{20});
        a[20] = new Entry("./res/journey_begins.png", "I would also like to introduce you to some trusted members of my court—my best Knight and my loyal Mage. I would like them to accompany you to Woodness with the Princess. Will you accept this request?\"", new String[]{"Travel with the Knight & Mage", "Refuse and Go Alone"}, new int[]{20}); // 3.0.0, 5.0.0
        a[21] = new Entry("./res/journey_begins_shillings.png", "\"Young Nobleman, you are a steadfast negotiator, and as the King—I can respect that.", new String[]{"Click here to Continue"}, new int[]{22});
        a[22] = new Entry("./res/journey_begins_shillings.png", "Henceforth and forever more, I will agree to your offer of 100 shillings, but not a single shilling more.", new String[]{"Click here to Continue"}, new int[]{20});


    }

}