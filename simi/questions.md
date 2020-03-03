Questions
* Default texts for entities place where?
* I set the productsetfield invisible - is there a more elegant approach? (in ch/so/agi/simi/web/screens/propertiesinlist/properties-in-list-edit.xml)
* How can the generated entity title be used in a lookup field? title = '%s|identifier'
    * How can the titles of the subclasses be shown in a superclass-list? (FacadeLayer and PostgresDs in a list of SingleActors) 
* Softdelete
    * How does undelete work? How is it integrated into the UI?
    * Pitfalls when using external job to clean up old deleted records?
* Properties in list does not (no more) exists but is part of the menu. How to delete?
* Why is the button style "friendly" once green and once blue?
* Encountered strange behaviour when renaming an entity
    * Recommended "best practice"? Create new entity and copy over the attributes?
    * Relevance / background on serialVersionUID?
    * Could no more login. Worked again after removing view pointing to no more existing entity --> Could that (really) have been the cause?
* Can not see test data - I can't find what is wrong
* Ways to have a column sorted by default

Todos:
* Implement TOC sort
    * Sort the table
    * Sort field editable in table
    * "OnBeforeSafe" set sort int for each row (0, 10, 20)