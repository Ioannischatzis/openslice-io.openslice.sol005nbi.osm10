package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnffgrKey
 implements Identifier<Vnffgr> {
    private static final long serialVersionUID = 604552479552640837L;
    private final Uuid _id;


    public VnffgrKey(Uuid _id) {
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnffgrKey(VnffgrKey source) {
        this._id = source._id;
    }


    public Uuid getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_id);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnffgrKey)) {
            return false;
        }
        final VnffgrKey other = (VnffgrKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnffgrKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

