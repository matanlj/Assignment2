package com.uber.matan.assigment2;

import com.uber.matan.assignment2.Chocolate;
import com.uber.matan.assignment2.Wine;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Sergiy Perevyazko <sergiy.perevyazko@gmail.com>
 */
public class TestProducts {

    private static final int BARCODE = 123456;
    private static final double BASE_PRICE = 321.654;
    private static final double BASE_TAX = 123.456;

    private static final double PRICE_TAX_MULTIPLICATION_RESULT = BASE_PRICE * BASE_TAX;

    @Test
    public void testWine() throws Exception {
        //for testing, keyword "final" means we won't change this variable
        final float bottleVolume = 1.7F;

        //5. products in wine class have extra tax of 10% which get added to the final price
        final double expectedFinalPrice = 1.1 * PRICE_TAX_MULTIPLICATION_RESULT;

        Wine wine = new Wine("Test wine", BARCODE, BASE_PRICE, BASE_TAX, bottleVolume);

        assertThat(wine.getFinalPrice()).isEqualTo(expectedFinalPrice);
    }

    @Test
    public void testChocolate() throws Exception {
        final float weight = 100;
        Chocolate chocolate = new Chocolate("Test chocolate", BARCODE, BASE_PRICE, BASE_TAX, weight);

        assertThat(chocolate.getFinalPrice()).isEqualTo(PRICE_TAX_MULTIPLICATION_RESULT);

        /*
         * usually we don't test getters, but if want to be certain that your constructor works correctly
         * u can do this
         */
        assertThat(chocolate.getName()).isEqualTo("Test chocolate");
        assertThat(chocolate.getWeight()).isEqualTo(weight);
        assertThat(chocolate.getBarcode()).isEqualTo(BARCODE);
        assertThat(chocolate.getBasePrice()).isEqualTo(BASE_PRICE);
        assertThat(chocolate.getBaseTax()).isEqualTo(BASE_TAX);
    }
}
