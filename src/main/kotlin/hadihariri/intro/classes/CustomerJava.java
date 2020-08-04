package hadihariri.intro.classes;

import org.jetbrains.annotations.NotNull;

public class CustomerJava {
    private Integer id;
    private String name;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void prettyPrint() {
        System.out.println("Id: " + getId() + ", Name: " + getName() + ", Email: " + getEmail());
    }

    public @NotNull String neverNull() {
        return "A String";
    }

    public String sometimesNull() {
        return "A String";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerJava)) return false;

        CustomerJava that = (CustomerJava) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getEmail() != null ? getEmail().equals(that.getEmail()) : that.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", email='" + email + '\'' +
          '}';
    }
}
