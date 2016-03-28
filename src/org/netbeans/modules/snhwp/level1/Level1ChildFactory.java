package org.netbeans.modules.snhwp.level1;

import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

public class Level1ChildFactory extends ChildFactory<String> {

    @Override
    protected boolean createKeys(List<String> list) {
        list.add("one");
        return true;
    }

    @Override
    protected Node createNodeForKey(String key) {
        Level1Node node = null;
        try {
            node = new Level1Node(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
    
}
