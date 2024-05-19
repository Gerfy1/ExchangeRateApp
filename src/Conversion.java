public record Conversion(double conversion_result) {
    @Override
    public String toString() {
        return "[Conversion]\n" +
                "Conversion Result: " + conversion_result +
                ' ';
    }
}
