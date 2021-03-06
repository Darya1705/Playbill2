package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    void shouldSaveAddendumFilm() {
        AddendumFilm first = new AddendumFilm(1, 1, "Bloodshot", "action movie", 500);
        AddendumFilm second = new AddendumFilm(2, 2, "Forward", "cartoon", 350);
        AddendumFilm third = new AddendumFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        AddendumFilm fourth = new AddendumFilm(4, 4, "Gentlemen", "action movie", 500);
        AddendumFilm fifth = new AddendumFilm(5, 5, "Invisible Man", "horror", 10);
        AddendumFilm sixth = new AddendumFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        AddendumFilm seventh = new AddendumFilm(7, 7, "Number one", "comedy", 1500);
        AddendumFilm eighth = new AddendumFilm(8, 8, "lion king", "cartoon", 50);
        AddendumFilm ninth = new AddendumFilm(9, 9, "Hannibal Lecter", "horror", 500);
        AddendumFilm tenth = new AddendumFilm(10, 10, "The hills have eyes", "horror", 70);
        AddendumFilm eleventh = new AddendumFilm(11, 11, "The hills have eyes", "horror", 70);

        FilmManager managers = new FilmManager();
        managers.save(first);
        managers.save(second);
        managers.save(third);
        managers.save(fourth);
        managers.save(fifth);
        managers.save(sixth);
        managers.save(seventh);
        managers.save(eighth);
        managers.save(ninth);
        managers.save(tenth);

        managers.save(eleventh);


        AddendumFilm[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        AddendumFilm[] actual = managers.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        AddendumFilm first = new AddendumFilm(1, 1, "Bloodshot", "action movie", 500);
        AddendumFilm second = new AddendumFilm(2, 2, "Forward", "cartoon", 350);
        AddendumFilm third = new AddendumFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        AddendumFilm fourth = new AddendumFilm(4, 4, "Gentlemen", "action movie", 500);
        AddendumFilm fifth = new AddendumFilm(5, 5, "Invisible Man", "horror", 10);
        AddendumFilm sixth = new AddendumFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        AddendumFilm seventh = new AddendumFilm(7, 7, "Number one", "comedy", 1500);
        AddendumFilm eighth = new AddendumFilm(8, 8, "lion king", "cartoon", 50);
        AddendumFilm ninth = new AddendumFilm(9, 9, "Hannibal Lecter", "horror", 500);
        AddendumFilm tenth = new AddendumFilm(10, 10, "The hills have eyes", "horror", 70);

        FilmManager managers = new FilmManager();

        AddendumFilm[] expected = {};
        AddendumFilm[] actual = managers.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {
        AddendumFilm first = new AddendumFilm(1, 1, "Bloodshot", "action movie", 500);
        AddendumFilm second = new AddendumFilm(2, 2, "Forward", "cartoon", 350);
        AddendumFilm third = new AddendumFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        AddendumFilm fourth = new AddendumFilm(4, 4, "Gentlemen", "action movie", 500);
        AddendumFilm fifth = new AddendumFilm(5, 5, "Invisible Man", "horror", 10);
        AddendumFilm sixth = new AddendumFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        AddendumFilm seventh = new AddendumFilm(7, 7, "Number one", "comedy", 1500);
        AddendumFilm eighth = new AddendumFilm(8, 8, "lion king", "cartoon", 50);
        AddendumFilm ninth = new AddendumFilm(9, 9, "Hannibal Lecter", "horror", 500);
        AddendumFilm tenth = new AddendumFilm(10, 10, "The hills have eyes", "horror", 70);

        FilmManager managers = new FilmManager();
        managers.save(sixth);
        managers.save(seventh);
        managers.save(eighth);
        managers.save(ninth);
        managers.save(tenth);

        AddendumFilm[] expected = {tenth, ninth, eighth, seventh, sixth};
        AddendumFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {
        AddendumFilm first = new AddendumFilm(1, 1, "Bloodshot", "action movie", 500);
        AddendumFilm second = new AddendumFilm(2, 2, "Forward", "cartoon", 350);
        AddendumFilm third = new AddendumFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        AddendumFilm fourth = new AddendumFilm(4, 4, "Gentlemen", "action movie", 500);
        AddendumFilm fifth = new AddendumFilm(5, 5, "Invisible Man", "horror", 10);
        AddendumFilm sixth = new AddendumFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        AddendumFilm seventh = new AddendumFilm(7, 7, "Number one", "comedy", 1500);
        AddendumFilm eighth = new AddendumFilm(8, 8, "lion king", "cartoon", 50);
        AddendumFilm ninth = new AddendumFilm(9, 9, "Hannibal Lecter", "horror", 500);
        AddendumFilm tenth = new AddendumFilm(10, 10, "The hills have eyes", "horror", 70);

        FilmManager managers = new FilmManager();
        managers.save(first);
        managers.save(second);
        managers.save(third);
        managers.save(fourth);

        AddendumFilm[] expected = {fourth, third, second, first};
        AddendumFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {
        AddendumFilm first = new AddendumFilm(1, 1, "Bloodshot", "action movie", 500);
        AddendumFilm second = new AddendumFilm(2, 2, "Forward", "cartoon", 350);
        AddendumFilm third = new AddendumFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        AddendumFilm fourth = new AddendumFilm(4, 4, "Gentlemen", "action movie", 500);
        AddendumFilm fifth = new AddendumFilm(5, 5, "Invisible Man", "horror", 10);
        AddendumFilm sixth = new AddendumFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        AddendumFilm seventh = new AddendumFilm(7, 7, "Number one", "comedy", 1500);
        AddendumFilm eighth = new AddendumFilm(8, 8, "lion king", "cartoon", 50);
        AddendumFilm ninth = new AddendumFilm(9, 9, "Hannibal Lecter", "horror", 500);
        AddendumFilm tenth = new AddendumFilm(10, 10, "The hills have eyes", "horror", 70);

        FilmManager managers = new FilmManager();

        AddendumFilm[] expected = {};
        AddendumFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast4() {
        AddendumFilm first = new AddendumFilm(1, 1, "Bloodshot", "action movie", 500);
        AddendumFilm second = new AddendumFilm(2, 2, "Forward", "cartoon", 350);
        AddendumFilm third = new AddendumFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        AddendumFilm fourth = new AddendumFilm(4, 4, "Gentlemen", "action movie", 500);
        AddendumFilm fifth = new AddendumFilm(5, 5, "Invisible Man", "horror", 10);
        AddendumFilm sixth = new AddendumFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        AddendumFilm seventh = new AddendumFilm(7, 7, "Number one", "comedy", 1500);
        AddendumFilm eighth = new AddendumFilm(8, 8, "lion king", "cartoon", 50);
        AddendumFilm ninth = new AddendumFilm(9, 9, "Hannibal Lecter", "horror", 500);
        AddendumFilm tenth = new AddendumFilm(10, 10, "The hills have eyes", "horror", 70);

        FilmManager managers = new FilmManager();

        managers.save(first);
        managers.save(second);
        managers.save(third);
        managers.save(fourth);
        managers.save(fifth);
        managers.save(sixth);
        managers.save(seventh);
        managers.save(eighth);
        managers.save(ninth);
        managers.save(tenth);


        AddendumFilm[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        AddendumFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5() {
        AddendumFilm first = new AddendumFilm(1, 1, "Bloodshot", "action movie", 500);
        AddendumFilm second = new AddendumFilm(2, 2, "Forward", "cartoon", 350);
        AddendumFilm third = new AddendumFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        AddendumFilm fourth = new AddendumFilm(4, 4, "Gentlemen", "action movie", 500);
        AddendumFilm fifth = new AddendumFilm(5, 5, "Invisible Man", "horror", 10);
        AddendumFilm sixth = new AddendumFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        AddendumFilm seventh = new AddendumFilm(7, 7, "Number one", "comedy", 1500);
        AddendumFilm eighth = new AddendumFilm(8, 8, "lion king", "cartoon", 50);
        AddendumFilm ninth = new AddendumFilm(9, 9, "Hannibal Lecter", "horror", 500);
        AddendumFilm tenth = new AddendumFilm(10, 10, "The hills have eyes", "horror", 70);
        AddendumFilm eleven = new AddendumFilm(11, 11, "The hills have eyes", "horror", 70);
        AddendumFilm twelve = new AddendumFilm(12, 12, "The hills have eyes", "horror", 70);

        FilmManager managers = new FilmManager();

        managers.save(first);
        managers.save(second);
        managers.save(third);
        managers.save(fourth);
        managers.save(fifth);
        managers.save(sixth);
        managers.save(seventh);
        managers.save(eighth);
        managers.save(ninth);
        managers.save(tenth);

        AddendumFilm[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        AddendumFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }
}
