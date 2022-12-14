package tools.cevi.contact;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table(name= "contact_form_entries")
@Entity
public class ContactFormEntry extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(columnDefinition = "TEXT")
    public String message;

    @Override
    public String toString() {
        return "ContactFormEntry{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
