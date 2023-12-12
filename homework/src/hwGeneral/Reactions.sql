//Создать таблицы реакций и комментариев

//Добавить несколько записей в каждую таблицу выше


CREATE TABLE reactions (
    reaction_id int,
    created_at timestamp,
    value int,
    author_id int,
    video_id int
);

INSERT INTO reactions (reaction_id, created_at, value, author_id, video_id)
VALUES
	(1, CURRENT_TIMESTAMP, 5, 1, 1),
	(2, CURRENT_TIMESTAMP, 5, 4, 2),
	(3, CURRENT_TIMESTAMP, 5, 2, 1),
	(4, CURRENT_TIMESTAMP, 5, 5, 2)
