package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionListUrlsSupplier.get());
    }

    public static String getDBConnectionUrl() {
        return "jdbc://localhost:5432//users";
    }

    public static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432//users";

    public static Supplier<List<String>> getDBConnectionListUrlsSupplier = () ->
            List.of(
                    "jdbc://localhost:5432//users",
                    "jdbc://localhost:5432//users"
            );
}
