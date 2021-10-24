package lesson3.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trumpet implements Instrument{
    private TrumpetDiameter trumpetDiameter;

    @Override
    public String play() {
        return "Trumpet plays with its "+trumpetDiameter.getDiameter()+" cm diameter";
    }
}
