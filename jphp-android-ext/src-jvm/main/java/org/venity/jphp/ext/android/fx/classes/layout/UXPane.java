package org.venity.jphp.ext.android.fx.classes.layout;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import org.venity.jphp.ext.android.fx.JavaFXExtension;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name("UXPane")
@Namespace("php\\gui\\layout")
public class UXPane<T extends Pane> extends UXRegion<T> {
    interface WrappedInterface {

    }

    public UXPane(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public UXPane(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public T getWrappedObject() {
        return (T) super.getWrappedObject();
    }

    @Getter
    public ObservableList<Node> getChildren() {
        return getWrappedObject().getChildren();
    }

    @Signature
    public void __construct() {
        __wrappedObject = new Pane();
    }

    @Signature
    public void add(Node node) {
        getChildren().add(node);
    }

    @Signature
    public boolean remove(Node node) {
        getWrappedObject().getPrefWidth();
        return getChildren().remove(node);
    }
}
