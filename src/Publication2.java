class Publication2 {

    private String title;

    public Publication2(String title) {
        this.title = title;
    }

    public final String getInfo() {
       return getType() + getDetails() + title;
    }

    public String getType() {
        return "Publication: ";
    }

    public String getDetails() {
        return "";
    }

    public static void main(String[] args) {
        Publication2 publication2 = new Publication2("The new era");
        System.out.println(publication2.getInfo());

        Newspaper2 newspaper2 = new Newspaper2("Football results", "Sport news");
        System.out.println(newspaper2.getInfo());

        Article2 article2 = new Article2("Why the Sun is hot", "Dr James Smith");
        System.out.println(article2.getInfo());

        Announcement2 announcement2 = new Announcement2("Will sell a house", 30);
        System.out.println(announcement2.getInfo());
    }

}

class Newspaper2 extends Publication2 {

    private String source;

    public Newspaper2(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getType() {
        return "Newspaper ";
    }

    @Override
    public String getDetails() {
        return "(" + source + "): ";
    }

}

class Article2 extends Publication2 {

    private String author;

    public Article2(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article ";
    }

    @Override
    public String getDetails() {
        return "(" + author + "): ";
    }

}

class Announcement2 extends Publication2 {

    private int daysToExpire;

    public Announcement2(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement ";
    }

    @Override
    public String getDetails() {
        return "(" + daysToExpire + "): ";
    }

}