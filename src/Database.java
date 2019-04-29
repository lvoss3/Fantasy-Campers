public final class Database { // 2.1.0

    Entry[] a;

    public Database() {
        this.a = new Entry[600];
        a[0] = new Entry("./res/Plain.png", "WELCOME TO FANTASY CAMPERS - AN ADVENTURE GAME!", new String[]{"Click here to Continue"}, new int[]{1});
        a[1] = new Entry("./res/Plain.png", "Unlike many other stories, this one begins—and ENDS—with you and your choices!", new String[]{"Click here to Continue"}, new int[]{2});
        a[2] = new Entry("./res/Plain.png", "How does that work, you ask? Great question! Beginning on the next screen, you'll be immersed into a magical tale that involves saving a princess, and much more!", new String[]{"Click here to Continue"}, new int[]{3});
        a[3] = new Entry("./res/Plain.png", "The difference between this story and many like it is that YOU are in control. ",  new String[]{"Click here to Continue"}, new int[]{4});
        a[4] = new Entry("./res/Plain.png", "You will embark on a journey that requires you to make choices at every turn. Some of these choices may lead to perilous consequences, while other choices may make you the hero of your own story...", new String[]{"Click here to Continue"}, new int[]{5});
        a[5] = new Entry("./res/Plain.png", "Are you ready for an adventure?", new String[]{"Yes! Let's do this!", "No, I'm Scared..."}, new int[]{7,6});
        a[6] = new Entry("./res/Plain.png", "THE END\n“A man that flies from his fear may find that he has only taken a short cut to meet it.”\n" + "-J.R.R. Tolkien\n", new String[]{"Start Over"}, new int[]{0});
    }

}