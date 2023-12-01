/*
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.

DNA is composed of a series of nucleotides abbreviated as:
A: Adenine ; C: Cytosine ; G: Guanine ; T: Thymine
So a strand of DNA could look something like ACGAATTCCG.

string methods	value
length()	returns the length
concat()	concatenates two strings
equals()	checks for equality between two strings
indexOf()	returns the index of a substring
charAt()	returns a character
substring()	returns a substring
toUpperCase()	returns the upper case version
toLowerCase()	returns the lower case version
*/

public class ProteinAnalyzer {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna1;
        System.out.println("Length of DNA: " + dna.length());

        analyzeProtein(dna);
    }

    private static void analyzeProtein(String dna) {
        /*
        Protein begins with a start codon ATG.
        Protein ends with a stop codon TGA.
        Protein between, the number of nucleotides is divisible by 3.
        */

        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");

        if (isValidProtein(start, stop)) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein");
        }
    }

    private static boolean isValidProtein(int start, int stop) {
        return start != -1 && stop != -1 && (stop - start) % 3 == 0;
    }
}
