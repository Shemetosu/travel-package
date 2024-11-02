SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';
SET NAMES utf8mb4;

USE `travel_package`;

INSERT INTO `travel_type` (`id`, `name`)
VALUES (1, 'Отдых'),
       (2, 'Экскурсии'),
       (3, 'Лечение'),
       (4, 'Шопинг'),
       (5, 'Круиз');

INSERT INTO `travel_transport` (`id`, `name`)
VALUES (1, 'Поезд'),
       (2, 'Самолёт'),
       (3, 'Круизный лайнер'),
       (4, 'Туристический автобус'),
       (5, 'Микроавтобус');

INSERT INTO `travel_feed` (`id`, `name`)
VALUES (1, 'Завтрак'),
       (2, 'Завтрак и обед'),
       (3, 'Трёхразовое питание'),
       (4, 'Шведский стол'),
       (5, 'Без питания');