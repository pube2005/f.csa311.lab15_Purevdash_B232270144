package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("Хоосон string-ийг урвуулбал хоосон байх")
    void reverse_empty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    @DisplayName("Нэг тэмдэгтийг урвуулбал өөрчлөгдөхгүй")
    void reverse_singleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    @DisplayName("ASCII string-ийг зөв урвуулна")
    void reverse_ascii() {
        assertEquals("edcba", StringUtils.reverse("abcde"));
    }

    @Test
    @DisplayName("Юникод тэмдэгтийг зөв урвуулна")
    void reverse_unicode() {
        assertEquals("монгол", StringUtils.reverse("логном"));
    }

    @Test
    @DisplayName("Null-ийг буцаах")
    void reverse_null() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    @DisplayName("isBlank - null бол true")
    void isBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    @DisplayName("isBlank - хоосон string бол true")
    void isBlank_empty() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    @DisplayName("isBlank - зөвхөн space бол true")
    void isBlank_spaces() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    @DisplayName("isBlank - агуулгатай string бол false")
    void isBlank_notBlank() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    @Test
    @DisplayName("capitalize - эхний үсгийг том болгоно")
    void capitalize_simple() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    @DisplayName("capitalize - том үсгийг хэвээр үлдээнэ")
    void capitalize_alreadyCapitalized() {
        assertEquals("Hello", StringUtils.capitalize("Hello"));
    }

    @Test
    @DisplayName("capitalize - хоосон string-ийг хэвээр үлдээнэ")
    void capitalize_empty() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    @DisplayName("capitalize - null-ийг хэвээр үлдээнэ")
    void capitalize_null() {
        assertNull(StringUtils.capitalize(null));
    }
}
