package mid1.practice.equals;

import java.util.Objects;

public class User {

    private String id;

    public User(String id) {
        this.id = id;
    }
/*
    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return id.equals(user.id);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }
}
