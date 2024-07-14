public enum GameMove {
    ROCK("К"),
    SCISSORS("Н"),
    PAPER("Б");

    private String value;

    GameMove(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

