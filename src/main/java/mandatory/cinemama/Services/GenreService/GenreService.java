package mandatory.cinemama.Services.GenreService;

import java.util.List;

import mandatory.cinemama.Entities.Genre.EGenre;
import mandatory.cinemama.Entities.Genre.Genre;

public interface GenreService {
  public List<Genre> findAllGenres();

  public Genre findGenreById(Long id);

  public Genre findGenreByName(EGenre name);
}
