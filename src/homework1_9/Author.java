package homework1_9;

public class Author {
    private final String authorFirstName;
    private final String authorLastName;

    public Author(String firstName, String lastName) {
        this.authorFirstName = firstName;
        this.authorLastName = lastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return this.authorFirstName + " " + authorLastName;
    }
}
