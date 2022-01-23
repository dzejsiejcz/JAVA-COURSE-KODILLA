package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final boolean bunWithSesame;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private boolean bunWithSesame;
        private int burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bunWithSesame(boolean bunWithSesame) {
            this.bunWithSesame = bunWithSesame;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bunWithSesame, burgers, sauce, ingredients);
        }
    }

    public Bigmac(boolean bunWithSesame, int burgers, String sauce, List<String> ingredients) {
        this.bunWithSesame = bunWithSesame;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public boolean isBunWithSesame() {
        return bunWithSesame;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bunWithSesame=" + bunWithSesame +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
