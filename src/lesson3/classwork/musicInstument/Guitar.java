package lesson3.classwork.musicInstument;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument {
    private StringsNumber stringsNumber;

    @Override
    public String play() {
       return "Guitar play with "+stringsNumber.getNumber()+" strings";
    }
}
