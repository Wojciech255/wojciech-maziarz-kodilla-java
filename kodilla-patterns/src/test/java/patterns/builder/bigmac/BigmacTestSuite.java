package patterns.builder.bigmac;


import builder.bigmac.Bigmac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Biala")
                .burgers(3)
                .sauce("Barbecue")
                .ingredient("ser")
                .ingredient("salata")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);
    }
}
