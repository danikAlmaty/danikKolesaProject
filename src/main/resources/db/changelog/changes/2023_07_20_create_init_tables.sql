CREATE TABLE permissions (
     id SERIAL PRIMARY KEY,
     role VARCHAR(255) NOT NULL
);

CREATE TABLE users (
   id SERIAL PRIMARY KEY,
   email VARCHAR(255) NOT NULL,
   password VARCHAR(255) NOT NULL,
   full_name VARCHAR(255) NOT NULL,
   status BOOLEAN NOT NULL
);

CREATE TABLE users_permissons (
  user_id BIGINT NOT NULL,
  permissons_id BIGINT NOT NULL,
  PRIMARY KEY (user_id, permissons_id),
  FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
  FOREIGN KEY (permissons_id) REFERENCES permissions(id) ON DELETE CASCADE
);

CREATE TABLE body_style (
    id SERIAL PRIMARY KEY,
    style VARCHAR(255) NOT NULL
);

CREATE TABLE car_brand (
   id SERIAL PRIMARY KEY,
   name VARCHAR(255) NOT NULL,
   country VARCHAR(255) NOT NULL
);

CREATE TABLE city (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE drive_train (
 id SERIAL PRIMARY KEY,
 name VARCHAR(255) NOT NULL
);

CREATE TABLE transmission (
  id SERIAL PRIMARY KEY,
  type VARCHAR(255) NOT NULL
);

CREATE TABLE car (
     id SERIAL PRIMARY KEY,
     car_brand_id BIGINT NOT NULL,
     model VARCHAR(255) NOT NULL,
     color VARCHAR(255) NOT NULL,
     volume DOUBLE PRECISION NOT NULL,
     city_id BIGINT NOT NULL,
     year_of_manufacturer INT NOT NULL,
     price INT NOT NULL,
     is_kazakh BOOLEAN NOT NULL,
     body_style_id BIGINT NOT NULL,
     drive_train_id BIGINT NOT NULL,
     type_of_transmission_id BIGINT NOT NULL,
     description TEXT,
     mileage INT NOT NULL,
     FOREIGN KEY (car_brand_id) REFERENCES car_brand(id),
     FOREIGN KEY (city_id) REFERENCES city(id),
     FOREIGN KEY (body_style_id) REFERENCES body_style(id),
     FOREIGN KEY (drive_train_id) REFERENCES drive_train(id),
     FOREIGN KEY (type_of_transmission_id) REFERENCES transmission(id)
);

CREATE TABLE deal (
      id SERIAL PRIMARY KEY,
      date_of_post TIMESTAMP NOT NULL,
      phone_number VARCHAR(255) NOT NULL,
      is_active BOOLEAN NOT NULL,
      car_id BIGINT NOT NULL,
      author_id BIGINT NOT NULL,
      FOREIGN KEY (car_id) REFERENCES car(id),
      FOREIGN KEY (author_id) REFERENCES users(id)
);

CREATE TABLE comment (
     id SERIAL PRIMARY KEY,
     content TEXT NOT NULL,
     createdAt TIMESTAMP NOT NULL,
     user_id BIGINT NOT NULL,
     deal_id BIGINT NOT NULL,
     FOREIGN KEY (user_id) REFERENCES users(id),
     FOREIGN KEY (deal_id) REFERENCES deal(id)
);
