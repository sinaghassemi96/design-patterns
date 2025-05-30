package design_patterns.behavioral.iterator;

import lombok.Getter;

@Getter
public class BoxIterator {
    private final Iterator<String> iterator;
    public BoxIterator(String[] box) {
        iterator = new Iterator<>(box);
    }

    public static void main(String[] args) {
        var box = new BoxIterator(new String[]{"a", "b", "c"});
        var iterator = box.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
