package mandatory.cinemama.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cinema_theaters", schema = "cinemama")
public class CinemaTheater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cinemaTheaterId;

    private String name;
    private String address;
    private String cinemaHalls; // List
}
