// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class lrn_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lrn_backward(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_lrn_desc_t data(); public native desc data(mkldnn_lrn_desc_t setter);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                    @Const @ByRef memory.desc data_desc,
                    @Const @ByRef memory.desc diff_data_desc,
                    int local_size, float alpha, float beta, float k) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta, k); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                    @Const @ByRef memory.desc data_desc,
                    @Const @ByRef memory.desc diff_data_desc,
                    int local_size, float alpha, float beta, float k);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                    @Const @ByRef memory.desc data_desc,
                    @Const @ByRef memory.desc diff_data_desc,
                    int local_size, float alpha, float beta) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                    @Const @ByRef memory.desc data_desc,
                    @Const @ByRef memory.desc diff_data_desc,
                    int local_size, float alpha, float beta);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd);

        public native @ByVal memory.primitive_desc diff_src_primitive_desc();
        public native @ByVal memory.primitive_desc diff_dst_primitive_desc();
        public native @ByVal memory.primitive_desc workspace_primitive_desc();
    }

    public lrn_backward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at workspace, @Const @ByRef memory diff_src) { super((Pointer)null); allocate(aprimitive_desc, src, diff_dst, workspace, diff_src); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at workspace, @Const @ByRef memory diff_src);

    public lrn_backward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_src) { super((Pointer)null); allocate(aprimitive_desc, src, diff_dst, diff_src); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_src);
}
