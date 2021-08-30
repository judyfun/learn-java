package java8.lambda.lesson1;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Project {
    private String  name;
    private String  language;
    private Integer stars;
    private String  description;
    private String  author;
}
