CREATE TABLE PRODUCER (
    PRODUCER_ID INT,
    NAME VARCHAR(50)
);

CREATE TABLE SAGA (
    SAGA_ID INT, 
    PRODUCER_ID INT,
    NAME VARCHAR(255),
    DATE DATE
);

CREATE TABLE GAME (
    GAME_ID INT,
    SAGA_ID INT, 
    TITLE VARCHAR(255),
    PRICE FLOAT,
    RELEASE_DATE DATE,
    DESCRIPTION VARCHAR(255),
    IMAGE_URL VARCHAR(255),
    CLASSIFICATION VARCHAR(3),
    SCORE FLOAT
);

CREATE TABLE GAME_GENRE (
    GAME_ID INT, 
    GENRE_ID VARCHAR(255)
);

CREATE TABLE GENRE (
    GENRE_ID INT, 
    GENRE_NAME VARCHAR(255)
);

CREATE TABLE LIBRARY (
    GAME_ID INT, 
    USER_ID INT, 
    ACQUISITION_MODE INT, 
    ACQUISITION_DATE DATE, 
    DISCOUNT FLOAT, 
    PURCHASE_PRICE FLOAT
);

CREATE TABLE WISHLIST (
    GAME_ID INT,
    USER_ID INT, 
    DATE_ADDED DATE
);

CREATE TABLE USERS (
    USER_ID INT, 
    NAME VARCHAR(255),
    WALLET_BALANCE FLOAT,
    EMAIL VARCHAR(255),
    PHONE_NUMBER VARCHAR(255)
);

CREATE TABLE GAME_LANGUAGE (
    GAME_ID INT, 
    LANGUAGE_ID INT    
);

CREATE TABLE LANGUAGE (
    LANGUAGE_ID INT, 
    LANGUAGE_NAME VARCHAR(30)
);

CREATE TABLE REVIEW (
    GAME_ID INT, 
    USER_ID INT, 
    DESCRIPTION VARCHAR(255)
);

CREATE TABLE GAME_PLATFORM (
    GAME_ID INT, 
    PLATFORM_ID INT
);

CREATE TABLE PLATFORM (
    PLATFORM_ID INT, 
    NAME VARCHAR(50)
);

CREATE TABLE AVATAR (
    GAME_ID INT, 
    USER_ID INT, 
    NAME VARCHAR(50)
);

CREATE TABLE MATCHES (
    GAME_ID INT, 
    USER_ID INT, 
    START_DATE DATE, 
    END_DATE DATE, 
    ONLINE_ BOOLEAN    
);