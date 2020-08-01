package pigLatin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PigLatinTranslator {


    public String translate(String sentence) {
        String[] sentenceArray = sentence.split(" ");

        return Arrays.stream(sentenceArray).map(this::oneWordTranslate).collect(Collectors.joining(" "));

    }


    private String oneWordTranslate(String oneWord) {

        List<Pattern> listOfRules = Arrays.asList(
                Pattern.compile("^([aeiouy].*|xr.*|yt.*)()"),
                Pattern.compile("^([^aeiou]+)(.*)"),
                Pattern.compile("^([^aeiouq]*qu)(.*)"),
                Pattern.compile("^([^aeiou]+)(y.*)")



//                Pattern.compile("^([aeiou].*|xr.*|yt.*)()"),
//                Pattern.compile("^(.)(y)$"),
//                Pattern.compile("^([^aeiouq]*qu)(.*)"),
//                Pattern.compile("^([^aeiou]+)(y.*)"),
//                Pattern.compile("^([^aeiou]+)(.*)")
        );


        for (Pattern rule : listOfRules) {
            Matcher matcher = rule.matcher(oneWord);
            if (matcher.find()) {

                return matcher.group(2) + matcher.group(1) + "ay";


            }
        }
        return oneWord;

    }


}
