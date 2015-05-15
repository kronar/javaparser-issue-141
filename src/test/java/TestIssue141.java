import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
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
        System.out.println();

        TypeDeclaration typeDeclaration = parse.getTypes().get(0);
        List<BodyDeclaration> members = typeDeclaration.getMembers();
        for (BodyDeclaration member : members) {
            if (member instanceof MethodDeclaration){
                MethodDeclaration md = (MethodDeclaration)member;
                JavadocComment javaDoc = md.getJavaDoc();
                Assert.assertNotNull(javaDoc);
            }
        }

    }
}
