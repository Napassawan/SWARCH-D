public class BookPublisher implements BookFilePrinter {
    private BookPrinter bookk;
    
    public BookPublisher(BookPrinter bookk) {
        super();
        this.bookk = bookk;
    }
    
    @Override
    public void printToFile() {
        bookk.printToFile();
    }
}