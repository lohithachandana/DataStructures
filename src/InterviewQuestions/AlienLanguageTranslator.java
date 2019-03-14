package InterviewQuestions;


import java.util.*;
/*

Write a class class AlienLanguageTranslator that implements all the funcionality of the given
LanguageTranslator class. You will need to override all the methods given in the LanguageTranslator
interface.

*/

 interface LanguageTranslator {
    public String DEFAULT_TRANSLATION = "EN";

    // Translates the language from default language
    public String fromDefaultLanguage(String languageTokens);

    // Translates the language to default language
    public String toDefaultLanguage(String languageTokens);
}

class AlienLanguageTranslator implements LanguageTranslator{
    public String fromDefaultLanguage(String languageTokens){
    char[] input=languageTokens.toCharArray();
    for(int i=0;i<input.length;i++){

        char tmp=input[i];
        int convert=tmp+3;
        if(i==0 && convert>90){
            convert=convert-26;
        }
        if(i!=0 && convert>122){
            convert=convert-26;
        }
        input[i]=(char)convert;

    }
    languageTokens=new String(input);
    return languageTokens;
    }

    public String toDefaultLanguage(String languageTokens){
        char[] input=languageTokens.toCharArray();
        for(int i=0;i<input.length;i++){
            char tmp=input[i];
            int convert=tmp-3;
            if(i==0 && convert<65){
                convert=convert+26;
            }
            if(i!=0 && convert<97){
                convert=convert+26;
            }
            input[i]=(char)convert;
        }
        languageTokens=new String(input);
        return languageTokens;
    }
    public static void main(String[] args){
        AlienLanguageTranslator translate= new AlienLanguageTranslator();
        Scanner scan= new Scanner(System.in);
        String input=scan.next();
        String output1=translate.fromDefaultLanguage(input);
        System.out.println(input+" = "+output1);
        String output2=translate.toDefaultLanguage(output1);
        System.out.println(output1+" = "+output2);

    }

}
