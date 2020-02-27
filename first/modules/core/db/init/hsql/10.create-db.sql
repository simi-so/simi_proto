-- begin FIRST_FACADE_LAYER
create table FIRST_FACADE_LAYER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    IDENTIFIER varchar(255) not null,
    --
    primary key (ID)
)^
-- end FIRST_FACADE_LAYER
-- begin FIRST_POSTGRES_DS
create table FIRST_POSTGRES_DS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TABLENAME varchar(255) not null,
    IN_DATA_SERVICES boolean not null,
    DEF_TRANSPARENCY integer not null,
    --
    primary key (ID)
)^
-- end FIRST_POSTGRES_DS
-- begin FIRST_SINGLE_ACTOR
create table FIRST_SINGLE_ACTOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    IN_WMS boolean not null,
    IN_WGC boolean not null,
    IDENTIFIER varchar(255) not null,
    TITLE varchar(255),
    --
    primary key (ID)
)^
-- end FIRST_SINGLE_ACTOR
