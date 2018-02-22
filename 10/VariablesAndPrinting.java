public class VariablesAndPrinting {
    
    public static void main(String[] args) {
        String hisName, herName, herFeeling, hisFeeling;
        int herMark, hisMark, herMistakes, hisMistakes;
        
        hisName = "Bobby";
        herName = "Bobbina";
        herFeeling = "very happy";
        hisFeeling = "very sad";
        herMark = 48;
        hisMark = 97;
        herMistakes = 14;
        hisMistakes = 2;
        
        System.out.println(hisName + " and " + herName + " recieved their exams yesterday and compared their marks.");
        System.out.println(herName + " got a " + herMark + " and " + hisName + " got a " + hisMark + " on the exam.");
        System.out.println("When " + herName + " saw her mark, she was " + herFeeling + " because " + herMark + " is her favourite number!");
        System.out.println("When " + hisName + " saw his mark, he was " + hisFeeling + " because the number " + hisMark + " reminded him of how many times he was punched in the face when he was a little boy.");
        System.out.println(hisName + " got a total of " + hisMistakes + " mistakes on his exam while " + herName + " got " + herMistakes + " mistakes on her exam.");
        System.out.println("If " + hisName + " and " + herName + " add their mistakes together, it will total up to " + (herMistakes + hisMistakes) + " mistakes.");
    }   
}
