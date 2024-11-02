SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';
SET NAMES utf8mb4;

DROP DATABASE IF EXISTS `travel_package`;
CREATE DATABASE `travel_package` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION = 'N' */;
USE `travel_package`;

-- Создание таблицы типа путёвок
CREATE TABLE `travel_type`
(
    `id`   bigint       NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

-- Создание таблицы транспорта
CREATE TABLE `travel_transport`
(
    `id`   bigint       NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

-- Создание таблицы питания
CREATE TABLE `travel_feed`
(
    `id`   bigint       NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

-- Создание таблицы путёвок
CREATE TABLE `travel`
(
    `id`                  bigint NOT NULL AUTO_INCREMENT,
    `travel_type`         bigint NOT NULL,
    `travel_transport_id` bigint NOT NULL,
    `travel_feed_id`      bigint NOT NULL,
    `days_count`          int    NOT NULL DEFAULT '0',
    PRIMARY KEY (`id`),
    KEY `travel_transport_id` (`travel_transport_id`),
    KEY `travel_feed_id` (`travel_feed_id`),
    KEY `travel_type` (`travel_type`),
    CONSTRAINT `travel_ibfk_1` FOREIGN KEY (`travel_transport_id`) REFERENCES `travel_transport` (`id`),
    CONSTRAINT `travel_ibfk_2` FOREIGN KEY (`travel_feed_id`) REFERENCES `travel_feed` (`id`),
    CONSTRAINT `travel_ibfk_3` FOREIGN KEY (`travel_type`) REFERENCES `travel_type` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;
