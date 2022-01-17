import java.io.File;
import java.util.Scanner;
public class LAB1
{
    
    static int words = 0;
    static int space = 0;
    static int num = 0;
    static int keywords = 0;
    static String[] KeyArray = new String[]{ "abstract", "assert", "boolean",
    "break", "byte", "case", "catch", "char", "class", "const",
    "continue", "default", "do", "double", "else", "extends", "false",
    "final", "finally", "float", "for", "goto", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "native",
    "new", "null", "package", "private", "protected", "public",
    "return", "short", "static", "strictfp", "super", "switch",
    "synchronized", "this", "throw", "throws", "transient", "true",
    "try", "void", "volatile", "while" }; 
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\sachi\\Desktop\\CD\\CODE_LAB1.txt");
    Scanner sc = new Scanner(file);
 
    while (sc.hasNextLine())
    {
        String test = sc.nextLine();
		count(test);
    }
    
    System.out.println("words: " + words);
    System.out.println("space: " + space);
    System.out.println("number: " + num);
    System.out.println("keywords: " + keywords);
    System.out.println("variables: "+ (words - keywords));
  }
  public static void count(String x){
    char[] ch = x.toCharArray();
    for(int i = 0; i < x.length(); i++){
        if(Character.isDigit(ch[i])){
            num ++ ;
        }
        else if(Character.isSpaceChar(ch[i])){
            space ++ ;
        }
    }
    for (int i = 0; i < x.length() - 1; i++)
    {
        if ((x.charAt(i) == ' ') && (x.charAt(i + 1) != ' '))
        {
            words++;
        }
    }
    String[] words=x.split("\\s"); 
    for(String w:words){
        for (int i = 0; i < KeyArray.length; i++) {
            if(KeyArray[i].equals(w))
                keywords++;
        }
    }  
}
}

//
