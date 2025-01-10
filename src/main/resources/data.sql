INSERT INTO city (city_id, city_name) VALUES (1, 'New York');
INSERT INTO city (city_id, city_name) VALUES (2, 'Los Angeles');
INSERT INTO city (city_id, city_name) VALUES (3, 'Chicago');

INSERT INTO theatre (theatre_id, theatre_name, city_id) VALUES (1, 'AMC Empire 25', 1);
INSERT INTO theatre (theatre_id, theatre_name, city_id) VALUES (2, 'Regal LA Live', 2);
INSERT INTO theatre (theatre_id, theatre_name, city_id) VALUES (3, 'Cinemark 18', 3);

INSERT INTO movie (movie_id, title, genre, duration) VALUES (1, 'Inception', 'Sci-Fi', 148);
INSERT INTO movie (movie_id, title, genre, duration) VALUES (2, 'The Dark Knight', 'Action', 152);
INSERT INTO movie (movie_id, title, genre, duration) VALUES (3, 'Interstellar', 'Sci-Fi', 169);

INSERT INTO show (show_id, movie_id, theatre_id, show_time, available_seats) VALUES (1, 1, 1, '2023-10-01 19:00:00', 100);
INSERT INTO show (show_id, movie_id, theatre_id, show_time, available_seats) VALUES (2, 2, 2, '2023-10-01 20:00:00', 50);
INSERT INTO show (show_id, movie_id, theatre_id, show_time, available_seats) VALUES (3, 3, 3, '2023-10-01 21:00:00', 75);