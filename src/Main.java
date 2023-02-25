public class Main {
    public static void main(String[] args) {
        Author lermontov = new Author("Михаил ", "Лермонтов.");
        Author tolstoy = new Author("Лев  ", "Толстой.");

        Book mcyri = new Book("Мцыри",1863 , lermontov);
        Book warAndPeace = new Book("Война и мир",  1824 , tolstoy);
        mcyri.printInfo();
        warAndPeace.printInfo();
        mcyri.setPublishingYear(1865);
        mcyri.printInfo();
    }
}