package dddasoview.day2;

/**
 * カテゴリ
 */
public enum Category {
    CERAMICS("陶芸体験"),
    GLASSWORK("ガラス細工"),
    CANOE_KAYAK("カヌー・カヤック"),
    PARAGLIDER("パラグライダー");

    private final String label;
    public String getLabel() {
        return this.label;
    }

    Category(String label) {
        this.label = label;
    }
}
