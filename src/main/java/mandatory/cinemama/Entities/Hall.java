package mandatory.cinemama.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "halls", schema = "cinemama")
public class Hall {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false, length = 40)
  private String name;

  @ManyToOne
  private Theater theater;

  // TODO: private List<Schedule> schedules;

  public Hall(String name, Theater theater) {
    this.name = name;
    this.theater = theater;
  }
}
