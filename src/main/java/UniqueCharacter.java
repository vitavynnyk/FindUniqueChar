import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class UniqueCharacter {

    private static String[] separateForWords(String text) {
        return text.split(" ");
    }

    private static List<Character> findUniqueCharacters(String text) {
        String[] words = separateForWords(text);

        return Arrays.stream(words)
                .map(word -> {
                    Map<Character, Long> charCountMap = word.chars()
                            .mapToObj(c -> (char) c)
                            .collect(groupingBy(c -> c,
                                    LinkedHashMap::new, counting()));

                    return charCountMap.entrySet().stream()
                            .filter(entry -> entry.getValue() == 1)
                            .map(Map.Entry::getKey)
                            .findFirst()
                            .orElse(null);
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public static char firstUniqueInList(String text) {
        List<Character> characters = findUniqueCharacters(text);
        return characters.stream()
                .filter(element -> characters.indexOf(element) == characters.lastIndexOf(element))
                .findFirst().orElse('0');
    }

}
