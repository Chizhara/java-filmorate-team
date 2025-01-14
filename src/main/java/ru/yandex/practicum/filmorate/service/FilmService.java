package ru.yandex.practicum.filmorate.service;

import ru.yandex.practicum.filmorate.model.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAll();

    Film findFilm(long filmId);

    Film create(Film film);

    Film update(Film film);

    void delete(long id);

    void addLike(long filmId, long userId);

    void removeLike(long filmId, long userId);

    List<Film> getMostPopularFilms(Integer count, Integer year, Integer genreId);

    List<Film> getCommonFilms(long userId, long friendId);

    List<Film> getSortedFilmsByDirector(long directorId, String sortField);

    List<Film> getFilms(List<Film> films);

    List<Film> search(String query, String by);

}
