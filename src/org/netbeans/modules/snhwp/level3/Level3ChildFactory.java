package org.netbeans.modules.snhwp.level3;

import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

public class Level3ChildFactory extends ChildFactory<String> {

    @Override
    protected boolean createKeys(List<String> list) {
        list.add("three");
        return true;
    }

    @Override
    protected Node createNodeForKey(String key) {
        Level3Node node = null;
        try {
            node = new Level3Node(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
    
}
