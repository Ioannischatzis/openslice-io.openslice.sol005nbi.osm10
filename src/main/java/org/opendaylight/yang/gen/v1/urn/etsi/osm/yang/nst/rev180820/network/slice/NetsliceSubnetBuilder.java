package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslice.subnet.InstantiationParameters;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceSubnetBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NetsliceSubnetBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NetsliceSubnetBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NetsliceSubnetBuilder, as instances can be freely passed around without
 * worrying about synchronization issues.
 * 
 * <p>
 * As a side note: method chaining results in:
 * <ul>
 *   <li>very efficient Java bytecode, as the method invocation result, in this case the Builder reference, is
 *       on the stack, so further method invocations just need to fill method arguments for the next method
 *       invocation, which is terminated by {@link #build()}, which is then returned from the method</li>
 *   <li>better understanding by humans, as the scope of mutable state (the builder) is kept to a minimum and is
 *       very localized</li>
 *   <li>better optimization oportunities, as the object scope is minimized in terms of invocation (rather than
 *       method) stack, making <a href="https://en.wikipedia.org/wiki/Escape_analysis">escape analysis</a> a lot
 *       easier. Given enough compiler (JIT/AOT) prowess, the cost of th builder object can be completely
 *       eliminated</li>
 * </ul>
 * 
 * @see NetsliceSubnetBuilder
 * @see Builder
 *
 */
public class NetsliceSubnetBuilder implements Builder<NetsliceSubnet> {

    private String _description;
    private String _id;
    private InstantiationParameters _instantiationParameters;
    private String _nsdRef;
    private Boolean _isSharedNss;
    private NetsliceSubnetKey key;


    Map<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> augmentation = Collections.emptyMap();

    public NetsliceSubnetBuilder() {
    }
    public NetsliceSubnetBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet arg) {
        this._id = arg.getId();
        this._description = arg.getDescription();
        this._isSharedNss = arg.isIsSharedNss();
        this._nsdRef = arg.getNsdRef();
        this._instantiationParameters = arg.getInstantiationParameters();
    }

    public NetsliceSubnetBuilder(NetsliceSubnet base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> aug =((AugmentationHolder<NetsliceSubnet>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._instantiationParameters = base.getInstantiationParameters();
        this._nsdRef = base.getNsdRef();
        this._isSharedNss = base.isIsSharedNss();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getId();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getDescription();
            this._isSharedNss = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).isIsSharedNss();
            this._nsdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getNsdRef();
            this._instantiationParameters = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getInstantiationParameters();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet]");
    }

    public NetsliceSubnetKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public InstantiationParameters getInstantiationParameters() {
        return _instantiationParameters;
    }
    
    public String getNsdRef() {
        return _nsdRef;
    }
    
    public Boolean isIsSharedNss() {
        return _isSharedNss;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NetsliceSubnet>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NetsliceSubnetBuilder withKey(final NetsliceSubnetKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceSubnetBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    private static void check_idLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NetsliceSubnetBuilder setId(final String value) {
        if (value != null) {
            check_idLength(value);
            
        }
        this._id = value;
        return this;
    }
    
    public NetsliceSubnetBuilder setInstantiationParameters(final InstantiationParameters value) {
        this._instantiationParameters = value;
        return this;
    }
    
    private static void check_nsdRefLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NetsliceSubnetBuilder setNsdRef(final String value) {
        if (value != null) {
            check_nsdRefLength(value);
            
        }
        this._nsdRef = value;
        return this;
    }
    
    public NetsliceSubnetBuilder setIsSharedNss(final Boolean value) {
        this._isSharedNss = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NetsliceSubnetBuilder addAugmentation(Augmentation<NetsliceSubnet> augmentation) {
        return doAddAugmentation(augmentation.implementedInterface(), augmentation);
    }
    
    /**
      * Add or remove an augmentation to this builder's product.
      *
      * @param augmentationType augmentation type to be added or removed
      * @param augmentationValue augmentation value, null if the augmentation type should be removed
      * @return this builder
      * @deprecated Use either {@link #addAugmentation(Augmentation)} or {@link #removeAugmentation(Class)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetsliceSubnetBuilder addAugmentation(Class<? extends Augmentation<NetsliceSubnet>> augmentationType, Augmentation<NetsliceSubnet> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NetsliceSubnetBuilder removeAugmentation(Class<? extends Augmentation<NetsliceSubnet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NetsliceSubnetBuilder doAddAugmentation(Class<? extends Augmentation<NetsliceSubnet>> augmentationType, Augmentation<NetsliceSubnet> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NetsliceSubnet build() {
        return new NetsliceSubnetImpl(this);
    }

    private static final class NetsliceSubnetImpl
        extends AbstractAugmentable<NetsliceSubnet>
        implements NetsliceSubnet {
    
        private final String _description;
        private final String _id;
        private final InstantiationParameters _instantiationParameters;
        private final String _nsdRef;
        private final Boolean _isSharedNss;
        private final NetsliceSubnetKey key;
    
        NetsliceSubnetImpl(NetsliceSubnetBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceSubnetKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._instantiationParameters = base.getInstantiationParameters();
            this._nsdRef = base.getNsdRef();
            this._isSharedNss = base.isIsSharedNss();
        }
    
        @Override
        public NetsliceSubnetKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public InstantiationParameters getInstantiationParameters() {
            return _instantiationParameters;
        }
        
        @Override
        public String getNsdRef() {
            return _nsdRef;
        }
        
        @Override
        public Boolean isIsSharedNss() {
            return _isSharedNss;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_instantiationParameters);
            result = prime * result + Objects.hashCode(_nsdRef);
            result = prime * result + Objects.hashCode(_isSharedNss);
            result = prime * result + Objects.hashCode(augmentations());
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!NetsliceSubnet.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NetsliceSubnet other = (NetsliceSubnet)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_instantiationParameters, other.getInstantiationParameters())) {
                return false;
            }
            if (!Objects.equals(_nsdRef, other.getNsdRef())) {
                return false;
            }
            if (!Objects.equals(_isSharedNss, other.isIsSharedNss())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsliceSubnetImpl otherImpl = (NetsliceSubnetImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> e : augmentations().entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceSubnet");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_instantiationParameters", _instantiationParameters);
            CodeHelpers.appendValue(helper, "_nsdRef", _nsdRef);
            CodeHelpers.appendValue(helper, "_isSharedNss", _isSharedNss);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
