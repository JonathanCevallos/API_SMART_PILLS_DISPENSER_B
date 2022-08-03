package uteq.api_smart_pills_dispenser.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "registration_date")
    private Date registration_date;

    @Column(name = "state")
    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "id_person")
    Person person;

    @ManyToOne
    @JoinColumn(name = "id_carer")
    Carer carer;

}
