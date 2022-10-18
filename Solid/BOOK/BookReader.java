public class BookReader implements BookScreenPrinter {
    private BookPrinter bookk;
    
    public BookReader(BookPrinter bookk) {
        super();
        this.bookk = bookk;
    }
    
    @Override
    public void printToScreen() {
        bookk.printToScreen();
    }
}