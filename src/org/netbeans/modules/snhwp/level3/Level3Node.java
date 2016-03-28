package org.netbeans.modules.snhwp.level3;

import java.beans.IntrospectionException;
import org.netbeans.modules.snhwp.level4.Level4ChildFactory;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;

public class Level3Node extends BeanNode {
    
    public Level3Node(String bean) throws IntrospectionException {
        super(bean, Children.create(new Level4ChildFactory(), true));
        setDisplayName(bean);
    }
    
}
