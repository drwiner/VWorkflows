/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.mihosoft.vrl.workflow;

/**
 *
 * @author Michael Hoffer  &lt;info@michaelhoffer.de&gt;
 */
public interface VFlowModel extends FlowModel, VNode {

    public VFlowModel newFlowNode(ValueObject obj);

    public VFlowModel newFlowNode();

    public VNode newNode(ValueObject obj);

    public VNode newNode();
}
