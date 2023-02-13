package ba.unsa.etf.rpr.domain;
import java.util.Objects;

/**
 * holds information about upcoming matches
 */
public class Matches {
    private int match_id;
    private String description;
    private int number_of_people;
    private String price;
    private boolean status;

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int Match_id) {
        this.match_id = match_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber_of_people() {
        return number_of_people;
    }

    public void setNumber_of_people(int number_of_people) {
        this.number_of_people = number_of_people;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "ticket_id=" + match_id +
                ", description='" + description + '\'' +
                ", number_of_people=" + number_of_people +
                ", price='" + price + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matches match = (Matches) o;
        return match_id == match.match_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(match_id, description, number_of_people, price, status);
    }
}
