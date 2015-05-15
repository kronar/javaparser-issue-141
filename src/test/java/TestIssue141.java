import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by nikita on 15.05.15.
 */
public class TestIssue141 {

    @Test
    public void testIssue141() throws IOException, ParseException {
        CompilationUnit parse = JavaParser.parse(new File("./src/main/java/ClassToParse.java"));
        List<ImportDeclaration> imports = parse.getImports();
        System.out.println();
        Assert.assertNotNull(imports);
        Assert.assertFalse(imports.isEmpty());
    }
}
