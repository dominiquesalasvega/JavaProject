# Paris City Hall Internship

I worked with the framework Lutece.

# AddressProject 

AddressProject/lutece-tech-plugin-address/src/java/fr/paris/lutece/plugins/address/service/RestAddressService.java

I modified the program to get the X and Y position from a postal identification to get the autocompletion and location of what the customer is looking for.
We used APIs that give us all the data on the geographical position linked to a postal address.
(example: address, name, latitude and longitude, street name, etc ...)

# Indexation

The goal was to improve the logs of the indexing of the files by Lutèce core in order to know what is the state of progress of the indexing as well as to lock the indexing when it is launched in order not to be able to launch several of them at the same time

Principle file modified:

NewIndexlutece/lutece-core/webapp/WEB-INF/templates/admin/search/ : 
 - search_indexation_logs
 - manage_search_indexation

NewIndexlutece/lutece-core/src/java/fr/paris/lutece/portal/business/search : 
 - all files
