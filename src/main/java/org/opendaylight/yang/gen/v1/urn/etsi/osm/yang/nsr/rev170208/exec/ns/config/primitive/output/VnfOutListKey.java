package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint64;

public class VnfOutListKey
 implements Identifier<VnfOutList> {
    private static final long serialVersionUID = -8249888545209337852L;
    private final Uint64 _memberVnfIndexRef;


    public VnfOutListKey(Uint64 _memberVnfIndexRef) {
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _memberVnfIndexRef memberVnfIndexRef in legacy Java type
     * @deprecated Use {#link VnfOutListKey(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfOutListKey(BigInteger _memberVnfIndexRef) {
        this(CodeHelpers.compatUint(_memberVnfIndexRef));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfOutListKey(VnfOutListKey source) {
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public Uint64 getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_memberVnfIndexRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfOutListKey)) {
            return false;
        }
        final VnfOutListKey other = (VnfOutListKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfOutListKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
        return helper.toString();
    }
}

