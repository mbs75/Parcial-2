public enum Cargo {
    DESARROLLADOR("Desarrollador"),
    DISEÑADORA("Diseñadora"),
    GERENTE("Gerente");

    private final String displayName;

    Cargo(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
