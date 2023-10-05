package ModelElements;

import java.util.Arrays;
import java.util.List;

public class PoligonalModel {
    List<Poligon> poligons;
    List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.poligons = Arrays.asList(new Poligon());
        this.textures = textures;
    }
}
