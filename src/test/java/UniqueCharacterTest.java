import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UniqueCharacterTest {

    @Test
    public void shouldFindUniqueCharInText() {

        String text = "Hello my friend Henson. I want to tell you my story";
        String text2 = "The Tao gave birth to machine language. Machine language gave birth to the assembler. The assembler gave birth to the compiler. Now there are ten thousand languages. Each language has its purpose, however humble. Each language expresses the Yin and Yang of software. Each language has its place within the Tao. But do not program in COBOL if you can avoid it. -- Geoffrey James, \"The Tao of Programming\"";

        assertEquals('f', UniqueCharacter.firstUniqueInList(text));
        assertEquals('m', UniqueCharacter.firstUniqueInList(text2));

    }
}
