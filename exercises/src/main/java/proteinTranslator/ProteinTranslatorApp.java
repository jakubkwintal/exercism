package proteinTranslator;

public class ProteinTranslatorApp {
    public static void main(String[] args) {

        String rna = "AUGUUUUCUUAAAUG";

        int numberOfProteins = rna.length() / 3;

        String[] proteins = new String[numberOfProteins];
        int proteinsCount = 0;
        for (int i = 0; i < rna.length(); i = i + 3) {
            String temp = rna.substring(i, i + 3);
            proteins[proteinsCount] = temp;
            proteinsCount ++;
                            }

        for(String protein: proteins)
            System.out.println(protein);

        for (int i=0; i<proteins.length; i++) {
            if (proteins[i].equals("AUG")) {
                proteins[i] = "Methionine";
            } else if (proteins[i].equals("UUU") || proteins[i].equals(("UUC"))) {
                proteins[i] = "Phenylalanine";
            } else if (proteins[i].equals("UUA") || proteins[i].equals("UUG")) {
                proteins[i] = "Leucine";
            } else if (proteins[i].equals("UCU") || proteins[i].equals("UCC") || proteins[i].equals("UCA") || proteins[i].equals("UCG")) {
                proteins[i] = "Serine";
            } else if (proteins[i].equals("UAU") || proteins[i].equals("UAC")) {
                proteins[i] = "Tyrosine";
            } else if (proteins[i].equals("UGU") || proteins[i].equals("UGC")) {
                proteins[i] = "Cysteine";
            } else proteins[i] = "Tryptophan";
        }

        for(String protein: proteins)
            System.out.println(protein);

        }
    }

