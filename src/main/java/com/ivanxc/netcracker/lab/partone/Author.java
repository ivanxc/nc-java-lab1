package com.ivanxc.netcracker.lab.partone;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return gender == author.gender && name.equals(author.name)
            && email.equals(author.email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + Character.hashCode(gender);
        return result;
    }

    @Override
    public String toString() {
        return "Author[" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", gender=" + gender +
            ']';
    }
}
