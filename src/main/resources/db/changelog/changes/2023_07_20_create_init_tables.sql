CREATE TABLE permissions (
     id SERIAL PRIMARY KEY,
     role VARCHAR(255)
);

CREATE TABLE users (
   id SERIAL PRIMARY KEY,
   email VARCHAR(255),
   password VARCHAR(255),
   full_name VARCHAR(255),
   status BOOLEAN
);

CREATE TABLE users_permissons (
  user_id BIGINT,
  permissons_id BIGINT,
  PRIMARY KEY (user_id, permissons_id),
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (permissons_id) REFERENCES permissions(id)
);

CREATE TABLE body_style (
    id SERIAL PRIMARY KEY,
    style VARCHAR(255)
);

CREATE TABLE car_brand (
   id SERIAL PRIMARY KEY,
   name VARCHAR(255),
   country VARCHAR(255)
);

CREATE TABLE city (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE drive_train (
 id SERIAL PRIMARY KEY,
 name VARCHAR(255)
);

CREATE TABLE transmission (
  id SERIAL PRIMARY KEY,
  type VARCHAR(255)
);

CREATE TABLE car (
     id SERIAL PRIMARY KEY,
     car_brand_id BIGINT,
     model VARCHAR(255),
     color VARCHAR(255),
     volume DOUBLE PRECISION,
     city_id BIGINT,
     year_of_manufacturer INT,
     price INT,
     is_kazakh BOOLEAN,
     body_style_id BIGINT,
     drive_train_id BIGINT,
     type_of_transmission_id BIGINT,
     description TEXT,
     mileage INT,
     FOREIGN KEY (car_brand_id) REFERENCES car_brand(id),
     FOREIGN KEY (city_id) REFERENCES city(id),
     FOREIGN KEY (body_style_id) REFERENCES body_style(id),
     FOREIGN KEY (drive_train_id) REFERENCES drive_train(id),
     FOREIGN KEY (type_of_transmission_id) REFERENCES transmission(id)
);

CREATE TABLE deal (
      id SERIAL PRIMARY KEY,
      date_of_post TIMESTAMP,
      phone_number VARCHAR(255),
      is_active BOOLEAN,
      car_id BIGINT,
      author_id BIGINT,
      FOREIGN KEY (car_id) REFERENCES car(id),
      FOREIGN KEY (author_id) REFERENCES users(id)
);

CREATE TABLE comment (
     id SERIAL PRIMARY KEY,
     content TEXT,
     created_at TIMESTAMP,
     user_id BIGINT,
     deal_id BIGINT,
     FOREIGN KEY (user_id) REFERENCES users(id),
     FOREIGN KEY (deal_id) REFERENCES deal(id)
);
