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

INSERT INTO `travel` (`id`, `travel_type_id`, `travel_transport_id`, `travel_feed_id`, `name`, `days_count`)
VALUES (1, 1, 1, 1, 'Путёвочка1', 1),
       (2, 2, 2, 2, 'Путёвочка2', 2),
       (3, 3, 3, 3, 'Путёвочка3', 3),
       (4, 4, 4, 4, 'Путёвочка4', 4),
       (5, 5, 5, 5, 'Путёвочка5', 5),
       (6, 2, 3, 4, 'Путёвочка6', 6),
       (7, 4, 3, 1, 'Путёвочка7', 7),
       (8, 3, 4, 5, 'Путёвочка8', 8),
       (9, 3, 2, 1, 'Путёвочка9', 9),
       (10, 1, 2, 2, 'Путёвочка10', 10),
       (11, 3, 4, 1, 'Путёвочка11', 11),
       (12, 5, 4, 3, 'Путёвочка12', 12),
       (13, 1, 1, 1, 'Путёвочка13', 13),
       (14, 2, 2, 2, 'Путёвочка14', 14),
       (15, 3, 3, 3, 'Путёвочка15', 15),
       (16, 4, 4, 4, 'Путёвочка16', 16),
       (17, 5, 5, 5, 'Путёвочка17', 17),
       (18, 2, 3, 2, 'Путёвочка18', 18),
       (19, 4, 3, 4, 'Путёвочка19', 19),
       (20, 3, 3, 5, 'Путёвочка20', 80),
       (21, 3, 3, 1, 'Путёвочка21', 19),
       (22, 1, 1, 2, 'Путёвочка22', 110),
       (23, 3, 5, 4, 'Путёвочка23', 112),
       (24, 5, 5, 4, 'Путёвочка24', 120),
       (25, 1, 3, 1, 'Путёвочка25', 10),
       (26, 2, 3, 2, 'Путёвочка26', 20),
       (27, 3, 2, 3, 'Путёвочка27', 30),
       (28, 4, 2, 4, 'Путёвочка28', 40),
       (29, 5, 2, 5, 'Путёвочка29', 50),
       (30, 2, 1, 4, 'Путёвочка30', 60),
       (31, 2, 1, 2, 'Путёвочка31', 70),
       (32, 5, 1, 1, 'Путёвочка32', 80),
       (33, 3, 2, 2, 'Путёвочка33', 90),
       (34, 1, 3, 3, 'Путёвочка34', 12),
       (35, 5, 4, 4, 'Путёвочка35', 15),
       (36, 3, 5, 5, 'Путёвочка36', 16),
       (37, 2, 1, 1, 'Путёвочка37', 1),
       (38, 5, 2, 2, 'Путёвочка38', 2),
       (39, 3, 3, 3, 'Путёвочка39', 3),
       (40, 1, 4, 4, 'Путёвочка40', 4),
       (41, 1, 5, 5, 'Путёвочка41', 5),
       (42, 4, 3, 4, 'Путёвочка42', 6),
       (43, 1, 3, 1, 'Путёвочка43', 7),
       (44, 3, 4, 1, 'Путёвочка44', 8),
       (45, 3, 2, 5, 'Путёвочка45', 9),
       (46, 1, 2, 3, 'Путёвочка46', 10),
       (47, 3, 4, 2, 'Путёвочка47', 11),
       (48, 5, 4, 1, 'Путёвочка48', 12),
       (49, 1, 1, 2, 'Путёвочка49', 13),
       (50, 2, 2, 1, 'Путёвочка50', 14),
       (51, 3, 3, 1, 'Путёвочка51', 15),
       (52, 4, 5, 4, 'Путёвочка52', 16),
       (53, 5, 4, 5, 'Путёвочка53', 17),
       (54, 2, 5, 2, 'Путёвочка54', 18),
       (55, 4, 4, 4, 'Путёвочка55', 19),
       (56, 3, 5, 5, 'Путёвочка56', 80),
       (57, 3, 2, 1, 'Путёвочка57', 19),
       (58, 1, 2, 2, 'Путёвочка58', 110),
       (59, 3, 2, 4, 'Путёвочка59', 112),
       (60, 5, 2, 4, 'Путёвочка60', 120),
       (61, 5, 2, 1, 'Путёвочка61', 10),
       (62, 1, 3, 2, 'Путёвочка62', 20),
       (63, 2, 2, 3, 'Путёвочка63', 30),
       (64, 3, 2, 4, 'Путёвочка64', 40),
       (65, 4, 2, 5, 'Путёвочка65', 50),
       (66, 1, 1, 4, 'Путёвочка66', 60),
       (67, 3, 1, 2, 'Путёвочка67', 70),
       (68, 5, 1, 1, 'Путёвочка68', 80),
       (69, 1, 2, 2, 'Путёвочка69', 90),
       (70, 2, 3, 3, 'Путёвочка70', 12),
       (71, 3, 4, 4, 'Путёвочка71', 15),
       (72, 1, 5, 5, 'Путёвочка72', 16);