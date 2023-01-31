public class Main {
    public static void main(String[] args) {
        Author Dostoevsky = new Author("Федор", "Достоевский");
        Book idiot = new Book("Идиот", Dostoevsky,1868);
        Author Chehov = new Author("Антон", "Чехов");
        Book cherryGarden = new Book("Вишневый сад", Chehov, 1903);
    }
}