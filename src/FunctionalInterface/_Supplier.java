package FunctionalInterface;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(localTimeSupplier.get());
        System.out.println(zoneTimeSupplier.get());
    }

    /*

    Suppliers are essentially a function whose sole purpose is to return something. It essentially 'supplies' an output.
    Making a supplier is very similar to a Function, Consumer, and Predicate.

    Supplier<InputType> supplierExample

    After that, add brackets, a ->, and what you want to return.

    () -> LocalTime.now()

    Combine the two:

    Supplier<InputType> supplierExample = () -> LocalTime.now();

    And you now have a supplier!

    */

    static Supplier<LocalTime> localTimeSupplier = () -> LocalTime.now();

    static Supplier<List<ZonedDateTime>> zoneTimeSupplier = () -> List.of(ZonedDateTime.now(ZoneId.of("Asia/Jerusalem"))
            , ZonedDateTime.now(ZoneId.of("America/Montreal")), ZonedDateTime.now(ZoneId.of("Europe/London")));

}
