package serzhio_projects.taco_cloud.data;

import java.util.Optional;
import serzhio_projects.taco_cloud.models.Ingredient;


public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
