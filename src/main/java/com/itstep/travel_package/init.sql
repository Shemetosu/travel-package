\connect "travel_package";

-- Создание таблицы даты поездки
DROP TABLE IF EXISTS "date";
CREATE TABLE "public"."dates" (
                                  "id" uuid NOT NULL,
                                  "date_arrival" timestamp NOT NULL,
                                  "date_departure" timestamp NOT NULL,
                                  "number_days" integer NOT NULL,
                                  CONSTRAINT "date_id" PRIMARY KEY ("id")
) WITH (oids = false);

-- Создание таблицы проживания
DROP TABLE IF EXISTS "living";
CREATE TABLE "public"."living" (
                                   "id" uuid NOT NULL,
                                   "name" text NOT NULL,
                                   "feeding" text NOT NULL,
                                   CONSTRAINT "living_id" PRIMARY KEY ("id")
) WITH (oids = false);

-- Создание таблицы бронирований
DROP TABLE IF EXISTS "reservation";
CREATE TABLE "public"."reservation" (
                                        "id" uuid NOT NULL,
                                        "user_id" uuid NOT NULL,
                                        "types_id" uuid NOT NULL,
                                        "transport_id" uuid NOT NULL,
                                        "living_id" uuid NOT NULL,
                                        "dates_id" uuid NOT NULL,
                                        "date_creation" uuid NOT NULL,
                                        "last_modified" uuid NOT NULL,
                                        CONSTRAINT "reservation_id" PRIMARY KEY ("id")
) WITH (oids = false);

-- Создание таблицы транспорта
DROP TABLE IF EXISTS "transport";
CREATE TABLE "public"."transport" (
                                      "id" uuid NOT NULL,
                                      "name" text NOT NULL,
                                      "date_arrival" timestamp NOT NULL,
                                      "date_departure" timestamp NOT NULL,
                                      CONSTRAINT "transport_id" PRIMARY KEY ("id")
) WITH (oids = false);

-- Создание таблицы туров
DROP TABLE IF EXISTS "type";
CREATE TABLE "public"."types" (
                                  "id" uuid NOT NULL,
                                  "name" text NOT NULL,
                                  CONSTRAINT "type_id" PRIMARY KEY ("id")
) WITH (oids = false);

-- Создание таблицы пользователей
DROP TABLE IF EXISTS "user";
CREATE TABLE "public"."user" (
                                 "id" uuid NOT NULL,
                                 "name" text NOT NULL,
                                 CONSTRAINT "user_id" PRIMARY KEY ("id")
) WITH (oids = false);
