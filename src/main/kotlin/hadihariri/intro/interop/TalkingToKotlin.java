package hadihariri.intro.interop;

import com.rsk.hadihariri.classes.CustomerDataClass;
import com.rsk.hadihariri.classes.CustomerDataClassKt;
import com.rsk.hadihariri.classes.Status;
import com.rsk.hadihariri.interop.UtilityClass;

import java.io.IOException;

public class TalkingToKotlin {

    public static void main(String[] args) {
        CustomerDataClass customerKotlin = new CustomerDataClass(1, "Ravi",
          "ravi@email.com");
        // By default Kotlin properties can be accessed via Getter/Setter methods only
        // customerKotlin.getSomeProperty();
        // Use @JvmField in Kotlin to access the field directly
        String someProperty = customerKotlin.someProperty;

        customerKotlin.changeStatus(Status.CURRENT);
        // Methods with default parameters in Kotlin does not work in Java
        // To call methods with default parameters, annotate method with @JvmOverloads in Kotlin class
        customerKotlin.changeStatus();
        // Method name changed using @JvmName in Kotlin, use for Generics, type-erasure and method overload
        customerKotlin.preferential();

        // Invoking top-level functions in kotlin, class name can be changed using @file:JvmName("UtilityClass")
        // TopLevelFunctionsKt.prefix("Mr", "Ravi");
        UtilityClass.prefix("Mr", "Ravi");
        // Accessing top-level properties
        //int copyRight = UtilityClass.getCopyRight();
        // To access fields directly, modify property as "const" in kotlin file
        int copyRight = UtilityClass.CopyRight;

        // Invoking extension function directly is not possible, however it can be invoked using below convention
        CustomerDataClassKt.extension(customerKotlin);
    }

    public void loadStats(CustomerDataClass customerKotlin) {
        // This method throws IOException
        try {
            // catch(IOException e) won't compile if kotlin class method is not annotated with @Throws
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
