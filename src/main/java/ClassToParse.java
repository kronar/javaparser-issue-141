import com.google.common.base.Optional;

/**
 * Created by nikita on 15.05.15.
 */
public class ClassToParse {

    /**
     * Some javadoc
     * @param args
     */
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.fromNullable(System.getProperty("os.name"));

    }

}
