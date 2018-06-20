package com.codecool.uml.overriding;

abstract class AbstractProcess {

    public void process(Orderable item) {
        System.out.println("process() function invoked from AbstractProcess");
        stepBefore();
        action(item);
        stepAfter();
    }

    public void stepBefore() {
        System.out.println("stepBefore() function invoked from AbstractProcess");
    }

    public void stepAfter() {
        System.out.println("stepAfter() function invoked from AbstractProcess");
    }

    protected abstract void action(Orderable item); // TODO: why is the parameter type Orderable instead of Order?

}
