ALTER TABLE users
DROP COLUMN username;

ALTER TABLE users
RENAME COLUMN login TO username;