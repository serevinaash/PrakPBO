public class Document {
    private String title;
    private String content;

    // Constructor
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter untuk title
    public String getTitle() {
        return title;
    }

    // Setter untuk title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter untuk content
    public String getContent() {
        return content;
    }

    // Setter untuk content
    public void setContent(String content) {
        this.content = content;
    }

    // Method to represent the document as a string
    @Override
    public String toString() {
        return "Document [title=" + title + ", content=" + content + "]";
    }
}
