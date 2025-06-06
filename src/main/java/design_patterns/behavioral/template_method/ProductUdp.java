package design_patterns.behavioral.template_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class ProductUdp extends Feature {

    private String name;
    private Long price;

    @Override
    void exportToXml() {
        System.out.printf("""
                        <xml>
                            <name>%s</name>
                            <price>%s</price>
                        </xml>
                        """,
                name,
                price
        );
    }
}
