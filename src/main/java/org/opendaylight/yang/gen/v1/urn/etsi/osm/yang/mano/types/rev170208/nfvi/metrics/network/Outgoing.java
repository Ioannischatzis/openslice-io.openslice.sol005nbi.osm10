package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.network;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Network;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container outgoing {
 *   leaf label {
 *     type string;
 *     default "OUTGOING NETWORK TRAFFIC";
 *   }
 *   leaf bytes {
 *     type uint64;
 *   }
 *   leaf packets {
 *     type uint64;
 *   }
 *   leaf byte-rate {
 *     type decimal64 {
 *       fraction-digits 2;
 *     }
 *   }
 *   leaf packet-rate {
 *     type decimal64 {
 *       fraction-digits 2;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/network/outgoing</i>
 * 
 * <p>To create instances of this class use {@link OutgoingBuilder}.
 * @see OutgoingBuilder
 *
 */
public interface Outgoing
    extends
    ChildOf<Network>,
    Augmentable<Outgoing>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("outgoing");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.network.Outgoing> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.network.Outgoing.class;
    }
    
    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable String getLabel();
    
    /**
     * The cumulative number of outgoing bytes.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>bytes</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getBytes();
    
    /**
     * The cumulative number of outgoing packets.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>packets</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getPackets();
    
    /**
     * The current outgoing byte-rate (bytes per second).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>byteRate</code>, or <code>null</code> if not present
     */
    @Nullable BigDecimal getByteRate();
    
    /**
     * The current outgoing packet (packets per second).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>packetRate</code>, or <code>null</code> if not present
     */
    @Nullable BigDecimal getPacketRate();

}

