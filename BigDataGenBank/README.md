# Professor Christian Michel
# Bioinformatics Master SDSC 2019 - 2020 Project
# BIG DATA IN BIOINFORMATICS
# Statistics on trinucleotides in genes



1. Search for the genes and genomes of eukaryotes, prokaryotes (bacteria, archaea), viruses,
plasmids and organelles (mitochondria, chloroplasts) in the GenBank gene database
http://www.ncbi.nlm.nih.gov/genome/browse/

# Programming in Java

Structure your program in such a way that at subsequent runs the statistical calculation of the trinucleotides (Excel files) is based on the local tree structure and only concerns the data modified genomics (new or modified).

IMPORTANT: The calculation of the Excel files associated with the parent nodes must be completely recalculated,
even if parent nodes are not modified, for simplification and to avoid errors of programming.
The execution is carried out as follows:
 - if the local file tree does not exist: generation of the local tree.
 - if the local file tree exists: update of the local file tree

The update concerns the addition of a new GenBank genome or the deletion of a GenBank genome. removed from GenBank.
Manage general statistics (number of genomes, number of genes, number of trinucleotides) and the error statistics associated with each Excel file.
Graphical user interface:
 - show the local tree structure.
 - give a progress bar of the program and an estimated time calculation (MANDATORY).

IMPORTANT: It is imperative to avoid that your program gets stuck on data that are not available in the Excel file. data, an incomplete genome without data, or a download (transfer management, by for example by setting a time delay).
The important points of the program must be commented on, in particular the web tags must be mentioned in the accesses to the different web pages.


# By group of 4 we are currently working on this project, the deadline for this project is May 24th 2020
