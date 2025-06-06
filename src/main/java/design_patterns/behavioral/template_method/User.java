package design_patterns.behavioral.template_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class User extends Feature {

    private String name;
    private int age;
    private String role;

    @Override
    void exportToXml() {
        System.out.printf("""
                        <xml>
                            <name>%s</name>
                            <age>%s</age>
                            <role>%s</role>
                        </xml>
                        """,
                name,
                age,
                role
        );

    }
}
