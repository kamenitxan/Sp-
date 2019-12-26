CREATE TABLE Item
(
    id           INTEGER      NOT NULL,
    name         VARCHAR(255) NOT NULL,
    bestBefore   DATE,
    manufactured DATE,
    amount       VARCHAR(255),
    kind         VARCHAR(50)  NOT NULL,
    category_id  INTEGER      NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id) REFERENCES JakonObject (id) ON DELETE CASCADE,
    FOREIGN KEY (category_id) REFERENCES Category (id) ON DELETE CASCADE
)