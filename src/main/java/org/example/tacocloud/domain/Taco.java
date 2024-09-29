package org.example.tacocloud.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Taco implements Serializable {


    @NotNull
    @Size(min = 5, message = "Name must be at least 5characters long")
    private String name;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;

    public void addIngredient(IngredientRef ingredient) {
        this.getIngredients().add(ingredient);
    }
}
