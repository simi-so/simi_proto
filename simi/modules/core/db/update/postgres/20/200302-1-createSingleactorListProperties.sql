create table SIMI_SINGLEACTOR_LIST_PROPERTIES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VISIBLE boolean not null,
    PRODUCTSET_ID uuid not null,
    SINGLEACTOR_ID uuid not null,
    SORT integer not null,
    TRANSPARENCY integer,
    --
    primary key (ID)
);