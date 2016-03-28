package org.netbeans.modules.snhwp.level2;

import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

public class Level2ChildFactory extends ChildFactory<String> {

    @Override
    protected boolean createKeys(List<String> list) {
        list.add("two");
        return true;
    }

    @Override
    protected Node createNodeForKey(String key) {
        Level2Node node = null;
        try {
            node = new Level2Node(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
    
}
