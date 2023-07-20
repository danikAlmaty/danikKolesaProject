INSERT INTO public.permissions (id, role) VALUES (1, 'ROLE_USER');
INSERT INTO public.permissions (id, role) VALUES (2, 'ROLE_ADMIN');
INSERT INTO public.permissions (id, role) VALUES (3, 'ROLE_MODERATOR');

INSERT INTO public.users (id, email, full_name, password, status) VALUES (2, 'danikmalodes@gmail.com', 'Daniyar Orazaly', '$2a$10$4SxVNtto7.yA.RkGwQXdxOov7uGLfihZl8pnKhzAQfXQ6ESckk4mO', true);
INSERT INTO public.users (id, email, full_name, password, status) VALUES (3, 'abylai@gmail.com', 'Abylai Orazaly', '$2a$10$xCBVibF0PavMO2XtndxT4uwRZp32aYGQp4iSHhGG4MB6dXqn3b0LW', true);
INSERT INTO public.users (id, email, full_name, password, status) VALUES (4, 'zhasik@gmail.com', 'Zhasulan Tleubai', '$2a$10$P0liScdE4mrdYXXr/NwBHuLTNZ/FXGC/brlIoX7DOn3hJ1WPqlvnu', true);
INSERT INTO public.users (id, email, full_name, password, status) VALUES (5, 'aika@gmail.com', 'Aiya Orazaly', '$2a$10$S0IwNblrlOfyexBp9RSNl.X4x5eS4oe.BPri8.b4JtqAk2MSwq9RK', true);
INSERT INTO public.users (id, email, full_name, password, status) VALUES (6, 'ayan@gmail.com', 'Sadykov Ayan', '$2a$10$qO7dc8wPkBW2AvXjuRChze2LmNMkHhIhgyhDbCOq33.Q3CN2CNJui', true);
INSERT INTO public.users (id, email, full_name, password, status) VALUES (7, 'nurik@gmail.com', 'Nurtileu Amanzhol', '$2a$10$0Y2EB76rAzKFbsk46t/R1.ksZYI5PA1kKHIprd4GgW4xxE1VZ8ZQC', true);

INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (4, 1);
INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (5, 1);
INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (6, 1);
INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (7, 1);
INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (2, 1);
INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (2, 3);
INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (3, 1);
INSERT INTO public.users_permissons (user_id, permissons_id) VALUES (3, 2);

INSERT INTO public.transmission (id, type) VALUES (1, 'manual');
INSERT INTO public.transmission (id, type) VALUES (2, 'automat');
INSERT INTO public.transmission (id, type) VALUES (3, 'tiptronik');
INSERT INTO public.transmission (id, type) VALUES (4, 'variator');
INSERT INTO public.transmission (id, type) VALUES (5, 'robot');

INSERT INTO public.drive_train (id, name) VALUES (1, 'AWD');
INSERT INTO public.drive_train (id, name) VALUES (2, 'RWD');
INSERT INTO public.drive_train (id, name) VALUES (3, '4WD');
INSERT INTO public.drive_train (id, name) VALUES (4, 'FWD');

INSERT INTO public.city (id, name) VALUES (1, 'Almaty');
INSERT INTO public.city (id, name) VALUES (2, 'Astana');
INSERT INTO public.city (id, name) VALUES (3, 'Shymkent');
INSERT INTO public.city (id, name) VALUES (4, 'Aktobe');
INSERT INTO public.city (id, name) VALUES (5, 'Karagandy');
INSERT INTO public.city (id, name) VALUES (6, 'Taraz');
INSERT INTO public.city (id, name) VALUES (7, 'Oskemen');
INSERT INTO public.city (id, name) VALUES (8, 'Pavlodar');
INSERT INTO public.city (id, name) VALUES (9, 'Atyrau');
INSERT INTO public.city (id, name) VALUES (10, 'Semey');
INSERT INTO public.city (id, name) VALUES (11, 'Kyzylorda');
INSERT INTO public.city (id, name) VALUES (12, 'Aktau');
INSERT INTO public.city (id, name) VALUES (13, 'Kostanai');
INSERT INTO public.city (id, name) VALUES (14, 'Oral');
INSERT INTO public.city (id, name) VALUES (15, 'Kokshetau');

INSERT INTO public.body_style (id, style) VALUES (1, 'sedan');
INSERT INTO public.body_style (id, style) VALUES (2, 'coupe');
INSERT INTO public.body_style (id, style) VALUES (3, 'sport car');
INSERT INTO public.body_style (id, style) VALUES (4, 'station wagon');
INSERT INTO public.body_style (id, style) VALUES (5, 'hatchback');
INSERT INTO public.body_style (id, style) VALUES (6, 'SUV');
INSERT INTO public.body_style (id, style) VALUES (7, 'minivan');
INSERT INTO public.body_style (id, style) VALUES (8, 'pickup');

INSERT INTO public.car_brand (id, country, name) VALUES (1, 'Germany', 'BMW');
INSERT INTO public.car_brand (id, country, name) VALUES (2, 'Germany', 'Mercedes');
INSERT INTO public.car_brand (id, country, name) VALUES (3, 'Germany', 'Audi');
INSERT INTO public.car_brand (id, country, name) VALUES (4, 'Germany', 'Volkswagen');
INSERT INTO public.car_brand (id, country, name) VALUES (5, 'Germany', 'Porsche');
INSERT INTO public.car_brand (id, country, name) VALUES (6, 'Japan', 'Toyota');
INSERT INTO public.car_brand (id, country, name) VALUES (7, 'Japan', 'Nissan');
INSERT INTO public.car_brand (id, country, name) VALUES (8, 'Japan', 'Subaru');
INSERT INTO public.car_brand (id, country, name) VALUES (9, 'Korea', 'Hyundai');
INSERT INTO public.car_brand (id, country, name) VALUES (10, 'Korea', 'Kia');
INSERT INTO public.car_brand (id, country, name) VALUES (11, 'England', 'Aston Martin');
INSERT INTO public.car_brand (id, country, name) VALUES (12, 'Italia', 'Alfa Romeo');
INSERT INTO public.car_brand (id, country, name) VALUES (13, 'Russia', 'Aurus');
INSERT INTO public.car_brand (id, country, name) VALUES (14, 'France', 'Bugatti');
INSERT INTO public.car_brand (id, country, name) VALUES (15, 'England', 'Bentley');
INSERT INTO public.car_brand (id, country, name) VALUES (16, 'America', 'Cadilac');
INSERT INTO public.car_brand (id, country, name) VALUES (17, 'Uzbekistan', 'Daewoo');
INSERT INTO public.car_brand (id, country, name) VALUES (18, 'America', 'Dodge');
INSERT INTO public.car_brand (id, country, name) VALUES (19, 'Italia', 'Ferrari');
INSERT INTO public.car_brand (id, country, name) VALUES (20, 'America', 'Ford');
INSERT INTO public.car_brand (id, country, name) VALUES (21, 'Japan', 'Infinity');
INSERT INTO public.car_brand (id, country, name) VALUES (22, 'England', 'Jaguar');
INSERT INTO public.car_brand (id, country, name) VALUES (23, 'Italia', 'Lamborghini');
INSERT INTO public.car_brand (id, country, name) VALUES (24, 'England', 'Land Rover');
INSERT INTO public.car_brand (id, country, name) VALUES (25, 'Japan', 'Lexus');
INSERT INTO public.car_brand (id, country, name) VALUES (26, 'Russia', 'Lada');
INSERT INTO public.car_brand (id, country, name) VALUES (27, 'England', 'Rolls-Royce');


INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (1, 'white', 'Продам авто в идеальном состоянии как новая, один хозяин, приобреталась у официалов, на гарантии, сертификат на 5 ТО. Самая полная комплектация High-Tech', true, 16000, 'Sonata', 17600000, 2.5, 2022, 1, 9, 1, 4, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (2, 'grey metallic', 'Движок и ходовка в порядке. Полное ТО. Машина ухоженная. Комплект зимней резины на оригинальных дисках. Перекупам не звонить! За 2-3млн не отдам. Минимальный торг.', true, 550000, 'E280', 4400000, 2.8, 1998, 1, 2, 1, 2, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (3, 'blue metallic', 'Только продажа обмена нет. Торг. Срочно. Вложений не требует. Машина в Макинске.', true, 150000, 'Kalina', 2850000, 1.6, 2012, 4, 26, 15, 4, 1);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (4, 'white', 'Продам авто в хорошем состоянии, двигатель после кап. Ремонта (обкатку прошёл). Есть не значительные вложения по кузову (переднее правое крыло, на фото видно). Есть обоснованный торг.', true, 300000, 'ML350', 7000000, 3.5, 2006, 6, 2, 1, 1, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (5, 'white', 'Продам LEXUS 1999 год. Сделанный под рестаил установлен андройд, чехлы сделаны под заказ, машина в отличном состоянии в одних руках более 10 лет. По вложениям только косметика. Комплект зимней резины с дисками идут с машиной', true, 371276, 'LX470', 7700000, 4.7, 1999, 6, 25, 1, 3, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (6, 'Grey', e'Машина в отличном состояние. Цена ниже рыночной из за срочности. Все что есть все работает.

Двигатель как швейцарский часы, шепчет, тяга космическая хоть и 3 литра, при этом расход смешной как у легковой машины. Расхода масла нету.

Коробка в идеале, переключения незаметные.

Салон комбинированный, кожа с алькантарой, в отличном состояние не затертый не протертый, дверные карты так же в алькантаре, черный потолок. Все кнопки горят, стертых нету. Кондиционер морозит. Подогревы и так далее все работает. Безключевой доступ, парктроники перед-зад помогают легко припарковаться. Музыка играет отлично.

Кузов как на фото, выглядит бодро. Взгляды подают на машину.

По цене торг.', true, 250000, 'X6', 9200000, 3, 2009, 6, 1, 2, 1, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (7, 'black', 'Всем Ассалаумағалейкум. В продаже брутальный автомобиль.X5. Сел поехал. Никаких вложении. Торг у капота. На казахских номерах. Дуратские вопросы не задавать. Адрес Автосити напротив карсити', true, 160000, 'X5', 19000000, 3, 2016, 6, 1, 1, 1, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (8, 'black', 'литые диски, тонировка, корректор фар, кожа, дерево, алькантара, шторки, аудиосистема, сабвуфер, климат-контроль, ГУР, ABS, SRS, зимний режим, сигнализация, автозапуск, полный электропакет, центрозамок, круиз-контроль, подогрев сидений, парктроники, налог уплачен, техосмотр пройден, вложений не требует', true, 750000, 'S500', 3800000, 5, 1996, 1, 2, 1, 2, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (9, 'white', 'Срочно! Цена Окончательно', true, 60000, 'Accent', 7500000, 1.6, 2019, 1, 9, 9, 4, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (10, 'black metallic', 'Без пробега по СНГ, без слов и без вариантов, только эмоции', true, 138000, 'Alphard', 12500000, 3.5, 2009, 7, 6, 2, 4, 2);
INSERT INTO public.car (id, color, description, is_kazakh, mileage, model, price, volume, year_of_manufacturer, body_style_id, car_brand_id, city_id, drive_train_id, type_of_transmission_id) VALUES (11, 'black', e'Состояние отличное. Самая полная комплектация. Объём 3.0 полный привод, мотор очень надежный в линейке БМВ, машина вообще не прихотливая. Намного надежнее, комфортнее при должном уходе за авто в сравнении с предыдущими поколениями. Ходовка, мотор, коробка выполняют свою работу на все 1000%, никаких нареканий нет вообще, не дымит, не дрожит.
Вся морда до половины крыши в пленке, задний бампер тоже в пленке. Капитанские сидения, очень комфортен для водителя и пассажиров сзади. По машине были заменены абсолютно все жидкости вплоть до тормозных жидкостей, был заменен задний пневма баллон на оригинальный. Варианты на авто интересует. Желательно BMW X5, X6 или 540, 530 G30 или G63 2013-2016. Больше интересует варианты авто с вашей доплатой', true, 45000, '740', 29000000, 3, 2016, 1, 1, 3, 1, 1);

INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (11, '2023-07-20 12:39:47.024040', false, '+7 777 999 9297', 4, 11);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (1, '2023-07-20 12:17:22.914596', true, '+7 777 277 7714', 7, 1);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (2, '2023-07-20 12:19:44.634368', true, '+7 777 244 0770', 7, 2);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (3, '2023-07-20 12:23:58.192841', true, '+7 776 131 7686', 7, 3);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (4, '2023-07-20 12:25:46.455909', true, '+7 701 991 1830', 7, 4);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (5, '2023-07-20 12:27:42.814290', true, '+7 708 932 0805', 6, 5);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (6, '2023-07-20 12:29:37.691991', true, '+7 708 619 9597', 6, 6);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (7, '2023-07-20 12:31:15.216176', true, '+7 707 735 9202', 6, 7);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (8, '2023-07-20 12:33:24.810137', true, '+7 702 107 8256', 5, 8);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (9, '2023-07-20 12:35:05.285588', true, '+7 707 660 7066', 5, 9);
INSERT INTO public.deal (id, date_of_post, is_active, phone_number, author_id, car_id) VALUES (10, '2023-07-20 12:37:42.539660', true, '+7 702 803 2000', 4, 10);

INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (1, 'лучше взять камри', '2023-07-20 12:43:44.393859', 1, 7);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (2, 'кузов ширимеген ба?', '2023-07-20 12:44:02.492264', 2, 7);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (3, 'документ бари дурыс па?', '2023-07-20 12:44:23.649804', 3, 7);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (4, '6500 000 алып кетем ба?', '2023-07-20 12:45:18.637386', 4, 6);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (5, 'обмен на Х6 бар ма?', '2023-07-20 12:46:15.403644', 8, 6);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (6, 'кымбат емес па?!!!!!', '2023-07-20 12:46:36.055414', 10, 6);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (7, 'Обмен на земельный участок', '2023-07-20 12:47:31.804673', 9, 5);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (8, '7200 000 бар нал', '2023-07-20 12:47:51.559540', 8, 5);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (9, 'Обмен на Мерседес', '2023-07-20 12:48:12.266732', 7, 5);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (10, e'коробка не пинается?
', '2023-07-20 12:48:30.315092', 6, 5);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (11, 'У меня такая же во владении, машина топ, одни эмоции', '2023-07-20 12:49:47.147395', 9, 4);
INSERT INTO public.comment (id, content, createdat, deal_id, user_id) VALUES (12, 'Обмен на квартиру 1-х в городе Тараз', '2023-07-20 12:50:25.085196', 6, 4);

