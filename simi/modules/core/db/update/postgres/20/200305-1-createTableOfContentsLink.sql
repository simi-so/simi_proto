create table SIMI_TABLE_OF_CONTENTS_LINK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCTSET_ID uuid not null,
    TABLE_OF_CONTENTS_ID uuid not null,
    SORT integer not null,
    --
    primary key (ID)
);