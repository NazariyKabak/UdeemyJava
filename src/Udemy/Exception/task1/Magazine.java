package Udemy.Exception.task1;

public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;



    public Magazine(Magazine magazine) {
        setTitle(magazine.title);
        setPublisher(magazine.publisher);
        setIssueNumber(magazine.issueNumber);
        setPublicationYear(magazine.publicationYear);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title==null || title.isBlank()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher==null || publisher.isBlank()){
            throw new IllegalArgumentException("Publisher cannot be null or empty");
        }
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber<=0){
            throw new IllegalArgumentException("Issue number cannot be null or empty");
        }
        this.issueNumber = issueNumber;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear==0 || issueNumber < 0){
            throw new IllegalArgumentException("Publication year cannot be null or empty");
        }
        this.publicationYear = publicationYear;
    }

    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);

    }
}
