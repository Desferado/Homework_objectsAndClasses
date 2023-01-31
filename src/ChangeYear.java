public class ChangeYear {
    public static void main (String [] args) {
        Author Bunin = new Author("Иван", "Бунин");
        Book third = new Book("Темные аллеи", Bunin, 1953);
        third.setYear(1865);
        System.out.println("third.getYear() = " + third.getYear());
    }
}
