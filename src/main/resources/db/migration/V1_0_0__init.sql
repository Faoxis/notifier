CREATE TABLE IF NOT EXISTS event_target
(
    id         UUID         NOT NULL PRIMARY KEY,
    object     VARCHAR(100) NOT NULL UNIQUE,
    object_id  VARCHAR(100) NOT NULL UNIQUE,
    created_at TIMESTAMP WITHOUT TIME ZONE
);
CREATE INDEX IF NOT EXISTS event_target_object_type_index ON event_target(object);
CREATE INDEX IF NOT EXISTS event_target_object_id_index ON event_target USING HASH (object_id);

CREATE TABLE IF NOT EXISTS event_target_type
(
    id              UUID         NOT NULL PRIMARY KEY,
    name            VARCHAR(100) NOT NULL UNIQUE,
    event_target_id UUID         NOT NULL REFERENCES event_target(id),
    created_at      TIMESTAMP WITHOUT TIME ZONE
);
CREATE INDEX IF NOT EXISTS event_target_type_event_target_id_index ON event_target(object);

CREATE TABLE IF NOT EXISTS event
(
    id              UUID NOT NULL PRIMARY KEY,
    event_target_id UUID NOT NULL REFERENCES event_target (id),
    message         VARCHAR(300),
    created_at      TIMESTAMP WITHOUT TIME ZONE
);
CREATE INDEX IF NOT EXISTS event_event_target_id_index ON event(id);

CREATE TABLE IF NOT EXISTS person
(
    id         UUID         NOT NULL PRIMARY KEY,
    login      VARCHAR(256) NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE IF NOT EXISTS subscription
(
    person_id       UUID NOT NULL REFERENCES person (id),
    event_target_id UUID NOT NULL REFERENCES event_target (id),
    created_at      TIMESTAMP WITHOUT TIME ZONE
);
CREATE INDEX IF NOT EXISTS subscription_person_id_index ON subscription(person_id);
CREATE INDEX IF NOT EXISTS subscription_event_target_id_index ON subscription(event_target_id);
