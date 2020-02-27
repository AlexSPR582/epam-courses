package by.epam.courses.module3.analyzer.node;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NodeLogic {

    public List<Node> getNodes(String node) {
        List<Node> nodes = new ArrayList<>();
        Pattern pattern = Pattern.compile("(<([a-zA-Z]+).+?</\\2>)|(<[a-zA-Z]+/>)");
        Matcher matcher = pattern.matcher(node);
        while (matcher.find()) {
            nodes.add(new Node(matcher.group()));
        }
        return nodes;
    }

    public void printNodes(String node) {
        if (getNodes(node).size() == 0) {
            return;
        }
        else {
            for (Node node1 : getNodes(node)) {
                node1.printNode();
                if (!node1.isEmpty()) {
                    printNodes(node1.getContent());
                }
            }
        }
    }
}
