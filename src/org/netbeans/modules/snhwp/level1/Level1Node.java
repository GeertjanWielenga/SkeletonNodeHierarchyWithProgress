package org.netbeans.modules.snhwp.level1;

import java.beans.IntrospectionException;
import org.netbeans.modules.snhwp.level2.Level2ChildFactory;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;

public class Level1Node extends BeanNode {
    
    public Level1Node(String bean) throws IntrospectionException {
        super(bean, Children.create(new Level2ChildFactory(), true));
        setDisplayName(bean);
    }
    
}
