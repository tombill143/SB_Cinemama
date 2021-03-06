package mandatory.cinemama.Entities.Genre;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mandatory.cinemama.Entities.Movie;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "genres", schema = "cinemama")
public class Genre {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private EGenre name;

  @JsonIgnore
  @ManyToMany(mappedBy = "genres", cascade = CascadeType.ALL)
  private List<Movie> movies = new ArrayList<Movie>();

  public Genre(EGenre name) {
    this.name = name;
  }
}
