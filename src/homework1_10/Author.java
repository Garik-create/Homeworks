package homework1_10;

import java.util.Objects;

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
        return authorFirstName + " " + authorLastName;
    }

    @Override
    public boolean equals(Object Author) {
        if (this == Author) return true;
        if (Author == null || getClass() != Author.getClass()) return false;
        Author author = (Author) Author;
        return authorFirstName.equals(author.authorFirstName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}
