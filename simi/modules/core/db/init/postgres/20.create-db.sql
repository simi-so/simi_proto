-- begin SIMI_DATASET_LIST_PROPERTIES
alter table SIMI_DATASET_LIST_PROPERTIES add constraint FK_SIMI_DATASET_LIST_PROPERTIES_ON_FACADELAYER foreign key (FACADELAYER_ID) references SIMI_FACADE_LAYER(ID)^
alter table SIMI_DATASET_LIST_PROPERTIES add constraint FK_SIMI_DATASET_LIST_PROPERTIES_ON_DATASET foreign key (DATASET_ID) references SIMI_POSTGRES_DS(ID)^
create index IDX_SIMI_DATASET_LIST_PROPERTIES_ON_FACADELAYER on SIMI_DATASET_LIST_PROPERTIES (FACADELAYER_ID)^
create index IDX_SIMI_DATASET_LIST_PROPERTIES_ON_DATASET on SIMI_DATASET_LIST_PROPERTIES (DATASET_ID)^
-- end SIMI_DATASET_LIST_PROPERTIES
-- begin SIMI_SINGLE_ACTOR_LIST_PROPERTIES
alter table SIMI_SINGLE_ACTOR_LIST_PROPERTIES add constraint FK_SIMI_SINGLE_ACTOR_LIST_PROPERTIES_ON_PRODUCTSET foreign key (PRODUCTSET_ID) references SIMI_PRODUCT_SET(ID)^
alter table SIMI_SINGLE_ACTOR_LIST_PROPERTIES add constraint FK_SIMI_SINGLE_ACTOR_LIST_PROPERTIES_ON_SINGLEACTOR foreign key (SINGLEACTOR_ID) references SIMI_SINGLE_ACTOR(ID)^
create index IDX_SIMI_SINGLE_ACTOR_LIST_PROPERTIES_ON_PRODUCTSET on SIMI_SINGLE_ACTOR_LIST_PROPERTIES (PRODUCTSET_ID)^
create index IDX_SIMI_SINGLE_ACTOR_LIST_PROPERTIES_ON_SINGLEACTOR on SIMI_SINGLE_ACTOR_LIST_PROPERTIES (SINGLEACTOR_ID)^
-- end SIMI_SINGLE_ACTOR_LIST_PROPERTIES

-- begin SIMI_FACADE_LAYER
alter table SIMI_FACADE_LAYER add constraint FK_SIMI_FACADE_LAYER_ON_ID foreign key (ID) references SIMI_SINGLE_ACTOR(ID) on delete CASCADE^
-- end SIMI_FACADE_LAYER
-- begin SIMI_POSTGRES_DS
alter table SIMI_POSTGRES_DS add constraint FK_SIMI_POSTGRES_DS_ON_ID foreign key (ID) references SIMI_SINGLE_ACTOR(ID) on delete CASCADE^
-- end SIMI_POSTGRES_DS
