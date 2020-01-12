package service;

import java.util.Arrays;
import java.util.List;

public class RecipeParser {

    public List<String> parseRecipeLine(String recipeLine){
        return Arrays.asList(recipeLine.split(":"));
    }
}
