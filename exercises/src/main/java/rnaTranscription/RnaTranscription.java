package rnaTranscription;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        char[] charDnaStrand = dnaStrand.toCharArray();

        for (int i = 0; i < dnaStrand.length(); i++) {
            if (charDnaStrand[i] == 'G') {
                charDnaStrand[i] = 'C';
            } else if (charDnaStrand[i] == 'C') {
                charDnaStrand[i] = 'G';
            } else if (charDnaStrand[i] == 'T') {
                charDnaStrand[i] = 'A';
            } else {
                charDnaStrand[i]='U';
            }
        }
        String rnaTranscription = String.valueOf(charDnaStrand);
        return rnaTranscription;
    }
}
