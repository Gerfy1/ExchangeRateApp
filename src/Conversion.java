public record Conversion(double conversion_result, String base_code,String target_code) {
    @Override
    public String toString() {
        return "[Conversion]" +
                "Conversion result:" + conversion_result +
                "In: (De)" + base_code + '\'' +
                "For: (Para)" + target_code + '\'' +
                '}';
    }
}
