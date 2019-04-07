DROP TABLE IF EXISTS rating;

DROP TABLE IF EXISTS comments;

DROP TABLE IF EXISTS markers;

DROP TABLE IF EXISTS topics;

DROP TABLE IF EXISTS users;

DROP TYPE IF EXISTS user_role;

CREATE TYPE user_role AS ENUM (
    'admin',
    'informer',
    'commentator'
);

CREATE TABLE users (
    user_id SERIAL NOT NULL PRIMARY KEY,
    user_name TEXT NOT NULL,
    user_email TEXT NOT NULL,
    user_password TEXT NOT NULL,
    user_role user_role NOT NULL
);

CREATE TABLE topics (
    topic_id SERIAL NOT NULL,
    topic_owner INTEGER NOT NULL REFERENCES users (user_id) ON DELETE CASCADE,
    topic_name TEXT NOT NULL,
    topic_color CHAR(9) NOT NULL,
    PRIMARY KEY (topic_id, topic_owner)
);

CREATE TABLE markers (
    marker_id SERIAL NOT NULL,
    topic_id INTEGER NOT NULL,
    topic_owner INTEGER NOT NULL,
    marker_location POINT NOT NULL,
    FOREIGN KEY (topic_id, topic_owner) REFERENCES topics (topic_id, topic_owner) ON DELETE CASCADE,
    PRIMARY KEY (marker_id, topic_id, topic_owner)
);

CREATE TABLE comments (
    comment_id SERIAL NOT NULL,
    comment_owner INTEGER NOT NULL REFERENCES users (user_id) ON DELETE CASCADE,
    comment_text TEXT NOT NULL,
    PRIMARY KEY (comment_id, comment_owner)
);

CREATE TABLE rating (
    rating_id SERIAL NOT NULL,
    rating_owner INTEGER NOT NULL REFERENCES users (user_id) ON DELETE CASCADE,
    comment_id INTEGER NOT NULL,
    comment_owner INTEGER NOT NULL,
    rating_value BOOLEAN NOT NULL,
    FOREIGN KEY (comment_id, comment_owner) REFERENCES comments (comment_id, comment_owner) ON DELETE CASCADE,
    PRIMARY KEY (rating_id, rating_owner, comment_id, comment_owner)
);

