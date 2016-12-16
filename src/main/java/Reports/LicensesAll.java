package Reports;

import Entity.Licenses;

import java.util.List;

/**
 * Created by adyachenko on 18.08.16.
 */
public class LicensesAll {
    public static void getLicensesAll(List<Licenses> licensesList) {
        System.out.println("################# LICENSES BY TYPE REPORT ####################");
        for (Licenses licenses : licensesList) {
            System.out.println("License key: " + licenses.getFieldKey + "   Product: " + licenses.getFieldProduct);
        }
        System.out.println("################# ####################### ####################");
    }
}
