// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Gear joint definition. This definition requires two existing
 *  revolute or prismatic joints (any combination will work). */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2GearJointDef extends b2JointDef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2GearJointDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2GearJointDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2GearJointDef position(long position) {
        return (b2GearJointDef)super.position(position);
    }
    @Override public b2GearJointDef getPointer(long i) {
        return new b2GearJointDef((Pointer)this).offsetAddress(i);
    }

	public b2GearJointDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** The first revolute/prismatic joint attached to the gear joint. */
	public native b2Joint joint1(); public native b2GearJointDef joint1(b2Joint setter);

	/** The second revolute/prismatic joint attached to the gear joint. */
	public native b2Joint joint2(); public native b2GearJointDef joint2(b2Joint setter);

	/** The gear ratio.
	 *  @see b2GearJoint for explanation. */
	public native @Cast("float32") float ratio(); public native b2GearJointDef ratio(float setter);
}
