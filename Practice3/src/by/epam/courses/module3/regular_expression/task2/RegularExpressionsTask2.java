package by.epam.courses.module3.regular_expression.task2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class RegularExpressionsTask2 {
    public void getResult() {

        Pattern pattern = Pattern.compile("<([a-zA-Z]+)>(.+?)</\\1>");
        Matcher matcher = pattern.matcher("<body></body><body><head>Good morning someone</head></body>");
        List<String> tags = new ArrayList<>();
        while (matcher.find()){





            String str = matcher.group(2);
            //matcher = pattern.matcher(str);
            System.out.println(str);
        }
    }

}
