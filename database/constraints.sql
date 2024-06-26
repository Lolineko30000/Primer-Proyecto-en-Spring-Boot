-- PRODUCTORA
ALTER TABLE PRODUCER ADD PRIMARY KEY (PRODUCER_ID);
-- SAGA
ALTER TABLE SAGA ADD PRIMARY KEY (SAGA_ID);
-- GAME
ALTER TABLE GAME ADD PRIMARY KEY (GAME_ID);
-- GAME_GENRE
ALTER TABLE GAME_GENRE ADD PRIMARY KEY (GAME_ID, GENRE_ID);
-- GENRE
ALTER TABLE GENRE ADD PRIMARY KEY (GENRE_ID);
-- LIBRARY
ALTER TABLE LIBRARY ADD PRIMARY KEY (GAME_ID);
-- WISHLIST
ALTER TABLE WISHLIST ADD PRIMARY KEY (GAME_ID, USER_ID);
-- USER
ALTER TABLE USERS ADD PRIMARY KEY (USER_ID);
-- GAME_LANGUAGE
ALTER TABLE GAME_LANGUAGE ADD PRIMARY KEY (GAME_ID, LANGUAGE_ID);
-- LANGUAGE
ALTER TABLE LANGUAGE ADD PRIMARY KEY (LANGUAGE_ID);
-- REVIEW
ALTER TABLE REVIEW ADD PRIMARY KEY (GAME_ID, USER_ID);
-- GAME_PLATFORM
ALTER TABLE GAME_PLATFORM ADD PRIMARY KEY (GAME_ID, PLATFORM_ID);
-- PLATFORM
ALTER TABLE PLATFORM ADD PRIMARY KEY (PLATFORM_ID);
-- AVATAR
ALTER TABLE AVATAR ADD PRIMARY KEY (GAME_ID, USER_ID);
-- MATCHES
ALTER TABLE MATCHES ADD PRIMARY KEY (GAME_ID, USER_ID);




-- SAGA
ALTER TABLE SAGA ADD FOREIGN KEY (PRODUCER_ID) REFERENCES PRODUCER(PRODUCER_ID);

-- GAME
ALTER TABLE GAME ADD FOREIGN KEY (SAGA_ID) REFERENCES SAGA(SAGA_ID);

-- GAME_GENRE
ALTER TABLE GAME_GENRE ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE GAME_GENRE ADD FOREIGN KEY (GENRE_ID) REFERENCES GENRE(GENRE_ID);

-- LIBRARY
ALTER TABLE LIBRARY ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE LIBRARY ADD FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID);

-- WISHLIST
ALTER TABLE WISHLIST ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE WISHLIST ADD FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID);

-- GAME_LANGUAGE
ALTER TABLE GAME_LANGUAGE ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE GAME_LANGUAGE ADD FOREIGN KEY (LANGUAGE_ID) REFERENCES LANGUAGE(LANGUAGE_ID);

-- REVIEW
ALTER TABLE REVIEW ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE REVIEW ADD FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID);

-- GAME_PLATFORM
ALTER TABLE GAME_PLATFORM ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE GAME_PLATFORM ADD FOREIGN KEY (PLATFORM_ID) REFERENCES PLATFORM(PLATFORM_ID);

-- AVATAR
ALTER TABLE AVATAR ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE AVATAR ADD FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID);

-- MATCHES
ALTER TABLE MATCHES ADD FOREIGN KEY (GAME_ID) REFERENCES GAME(GAME_ID);
ALTER TABLE MATCHES ADD FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID);
