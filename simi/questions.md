Questions:
* Default texts for entities place where?
* In the table of the browse screen: How to display the "instance name" in a table column? Instance name as configured by the namePattern.
* How to do default sort in browse screen? 
* How to create a screen for selecting 


**Development**

Hi Konstatin

A few remarks concerning the development of the 
* edit screens
* file storage in the database

**Edit screens**

To make sure that the LayerGroup and Map entities are OK, I created browse and edit screens. 
Extend them or throw them away - whatever works best for you.

The app is configured to work with postgres. I use a docker image for that, config to build and run located in /simi/devdb

**File storage in the database**

I think this is a topic of general interest. If you think so too, could you discuss in the cuba team, 
how the solution can be made understandable for the community? I can think of several ways:

* Provide this as framework core feature in the future
* Extending the guide https://www.cuba-platform.com/guides/working-with-images
* Documentation containing sample code snipplets

Could you inform me on your decision? If you think this is not of general interest - just solve it for us. Thanks.

**Rough estimate of effort and finishdate**

Could you post back for the two tasks above:
* what is your estimate in hours
* whether you can finish it until wednesday next week





 