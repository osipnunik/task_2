import javax.swing.text.StyleConstants;
import java.io.ObjectInput;
import java.nio.CharBuffer;

public class StringTransformer {

    private final Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    public String interviewRecursionTest(String line){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            boolean letterShouldNotBeIsoleted = false;
            for (Character el: vowels) {
                if(el.equals(line.charAt(i))){
                    if(i!=0 && i!=line.length()-1){
                        sb.append("*"+line.charAt(i) + "*");
                    }else if(i==0){
                        sb.append(line.charAt(i) + "*");
                    }else if(i==line.length()-1){
                        sb.append("*" + line.charAt(i));
                    }
                    letterShouldNotBeIsoleted = true;
                    continue;
                }
            }
            if(!letterShouldNotBeIsoleted) {
                sb.append(line.charAt(i));
            }
        }
        return sb.toString();
    }
}
