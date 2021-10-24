package lesson3.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument {
    private DrumSize drumSize;
    @Override
    public String play() {
        return "Drum play with its "+drumSize.getDrumSize()+" cm radius";
    }
}
