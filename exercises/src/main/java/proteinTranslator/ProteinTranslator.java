package proteinTranslator;

import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> translate = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i = i + 3) {
            String temp = rnaSequence.substring(i, i + 3);
            if (!temp.equals("UAA") && !temp.equals("UAG") && !temp.equals("UGA")) {
                translate.add(temp);
            } else break;
        }

        for (int i=0; i<translate.size(); i++) {
            if (translate.get(i).equals("AUG")) {
                translate.set(i, "Methionine");
            } else if (translate.get(i).equals("UUU") || translate.get(i).equals(("UUC"))) {
                translate.set(i, "Phenylalanine");
            } else if (translate.get(i).equals("UUA") || translate.get(i).equals("UUG")) {
                translate.set(i, "Leucine");
            } else if (translate.get(i).equals("UCU") || translate.get(i).equals("UCC") || translate.get(i).equals("UCA") || translate.get(i).equals("UCG")) {
                translate.set(i, "Serine");
            } else if (translate.get(i).equals("UAU") || translate.get(i).equals("UAC")) {
                translate.set(i, "Tyrosine");
            } else if (translate.get(i).equals("UGU") || translate.get(i).equals("UGC")) {
                translate.set(i, "Cysteine");
            } else translate.set(i, "Tryptophan");
        }

        return translate;
    }
}