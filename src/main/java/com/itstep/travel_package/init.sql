-- Создание таблицы пользователей
CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       role VARCHAR(50) NOT NULL,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Создание таблицы туров
CREATE TABLE tours (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       description TEXT,
                       destination VARCHAR(255) NOT NULL,
                       start_date DATE NOT NULL,
                       end_date DATE NOT NULL,
                       price DECIMAL(10, 2) NOT NULL,
                       available_slots INT NOT NULL,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Создание таблицы бронирований
CREATE TABLE bookings (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          user_id BIGINT NOT NULL,
                          tour_id BIGINT NOT NULL,
                          booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          status VARCHAR(50) NOT NULL,
                          FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                          FOREIGN KEY (tour_id) REFERENCES tours(id) ON DELETE CASCADE
);

-- Создание таблицы отзывов
CREATE TABLE reviews (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         user_id BIGINT NOT NULL,
                         tour_id BIGINT NOT NULL,
                         rating INT CHECK (rating >= 1 AND rating <= 5),
                         comment TEXT,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                         FOREIGN KEY (tour_id) REFERENCES tours(id) ON DELETE CASCADE
);

-- Создание таблицы категорий туров
CREATE TABLE tour_categories (
                                 id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                 name VARCHAR(255) NOT NULL
);

-- Создание связывающей таблицы туров и категорий
CREATE TABLE tour_category_link (
                                    tour_id BIGINT NOT NULL,
                                    category_id BIGINT NOT NULL,
                                    PRIMARY KEY (tour_id, category_id),
                                    FOREIGN KEY (tour_id) REFERENCES tours(id) ON DELETE CASCADE,
                                    FOREIGN KEY (category_id) REFERENCES tour_categories(id) ON DELETE CASCADE
);

-- Создание таблицы типов размещения
CREATE TABLE accommodation_types (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     type_name VARCHAR(255) NOT NULL
);

-- Создание таблицы транспорта
CREATE TABLE transport (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           transport_type VARCHAR(255) NOT NULL
);
