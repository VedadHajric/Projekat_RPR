package ba.unsa.etf.rpr.domain;
import java.util.Objects;
import java.util.Date;

/**
 * holds information about available tickets
 */
public class Tickets {
    private int ticket_id;
    private Date kick_off;
    private int number_of_people;
    private int match_id;
    private int person_id;

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public Date getKick_off() {
        return kick_off;
    }

    public void setKick_off(Date kick_off) {
        this.kick_off = kick_off;
    }

    public int getNumber_of_people() {
        return number_of_people;
    }

    public void setNumber_of_people(int number_of_people) {
        this.number_of_people = number_of_people;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "ticket_id=" + ticket_id +
                ", check_in=" + kick_off +
                ", number_of_people=" + number_of_people +
                ", match_id=" + match_id +
                ", person_id=" + person_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tickets that = (Tickets) o;
        return ticket_id == that.ticket_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticket_id, kick_off, number_of_people, match_id, person_id);
    }
}
