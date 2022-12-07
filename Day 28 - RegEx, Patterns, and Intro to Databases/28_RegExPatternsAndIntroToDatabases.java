import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static final Pattern MAIL_PATTERN = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        List<String> namesList = new ArrayList<>();
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                Matcher matcher = MAIL_PATTERN.matcher(emailID);
                if(matcher.find()){
                    namesList.add(firstName);
                }
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        List<String> sortedList = namesList.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        bufferedReader.close();
        
        
    }
}