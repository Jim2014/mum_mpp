package edu.mum.cs.cs401.entity;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by 985333 on 9/13/2016.
 */
public class Book {
    String ISBN;
    String title;
    String description;
    boolean availability;
    List<CopyBook> copyBooks= null;

    public Book(CopyBook copyBook){
        this.copyBooks = new ArrayList<>();
        setFirstCopyBooks(copyBook);
    }
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public List<CopyBook> getCopyBooks() {
        return copyBooks;
    }

    public void setFirstCopyBooks(CopyBook copyBook) {
        this.copyBooks.add(copyBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", availability=" + availability +
                ", copyBooks=" + copyBooks +
                '}';
    }
}
