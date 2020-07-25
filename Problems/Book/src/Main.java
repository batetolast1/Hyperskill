// write your class here
class Book {
    final String title;
    final int yearOfPublishing;
    final String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors.clone();
    }
}