create table SIMI_FILE_CONTENT (
    ID uuid,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    --
    CONTENT bytea,
    --
    primary key (ID)
);