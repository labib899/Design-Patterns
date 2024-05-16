import java.util.Objects;

public class Font {
    private String fontName;

    public Font(String fontName) {
        this.fontName = fontName;
    }

    public String getFontName() {
        return fontName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Font font = (Font) obj;
        return Objects.equals(fontName, font.fontName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontName);
    }
}
