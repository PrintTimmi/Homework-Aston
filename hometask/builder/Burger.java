package ru.aston.hometask.builder;

public class Burger {
    private final String bun;
    private final String patty;
    private final String sauce;
    private final boolean cheese;
    private final boolean lettuce;

    private Burger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
    }

    @Override
    public String toString() {
        return String.format(
                "Burger{bun='%s', patty='%s', sauce='%s', cheese=%b, lettuce=%b}",
                bun, patty, sauce, cheese, lettuce);
    }

    public static class Builder {
        private String bun;
        private String patty;
        private String sauce;
        private boolean cheese;
        private boolean lettuce;

        public Builder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public Builder patty(String patty) {
            this.patty = patty;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
