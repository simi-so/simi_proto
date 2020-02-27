-- begin SIMI_SINGLE_ACTOR
alter table SIMI_SINGLE_ACTOR add constraint FK_SIMI_SINGLE_ACTOR_ON_ID foreign key (ID) references SIMI_DATA_PRODUCT(ID) on delete CASCADE^
-- end SIMI_SINGLE_ACTOR
-- begin SIMI_FACADE_LAYER
alter table SIMI_FACADE_LAYER add constraint FK_SIMI_FACADE_LAYER_ON_ID foreign key (ID) references SIMI_SINGLE_ACTOR(ID) on delete CASCADE^
-- end SIMI_FACADE_LAYER
-- begin SIMI_POSTGRES_DS
alter table SIMI_POSTGRES_DS add constraint FK_SIMI_POSTGRES_DS_ON_ID foreign key (ID) references SIMI_SINGLE_ACTOR(ID) on delete CASCADE^
-- end SIMI_POSTGRES_DS
