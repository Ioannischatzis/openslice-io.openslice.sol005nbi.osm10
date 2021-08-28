package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.deviated.constituent.cpd.id;
import com.google.common.base.MoreObjects;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ConstituentCpdIdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ConstituentCpdIdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ConstituentCpdIdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ConstituentCpdIdBuilder, as instances can be freely passed around without
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
 * @see ConstituentCpdIdBuilder
 * @see Builder
 *
 */
public class ConstituentCpdIdBuilder implements Builder<ConstituentCpdId> {

    private Object _constituentBaseElementId;
    private Object _constituentCpdId;
    private IpAddress _ipAddress;
    private ConstituentCpdIdKey key;


    Map<Class<? extends Augmentation<ConstituentCpdId>>, Augmentation<ConstituentCpdId>> augmentation = Collections.emptyMap();

    public ConstituentCpdIdBuilder() {
    }

    public ConstituentCpdIdBuilder(ConstituentCpdId base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ConstituentCpdId>>, Augmentation<ConstituentCpdId>> aug =((AugmentationHolder<ConstituentCpdId>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._constituentBaseElementId = base.getConstituentBaseElementId();
        this._constituentCpdId = base.getConstituentCpdId();
        this._ipAddress = base.getIpAddress();
    }


    public ConstituentCpdIdKey key() {
        return key;
    }
    
    public Object getConstituentBaseElementId() {
        return _constituentBaseElementId;
    }
    
    public Object getConstituentCpdId() {
        return _constituentCpdId;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ConstituentCpdId>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ConstituentCpdIdBuilder withKey(final ConstituentCpdIdKey key) {
        this.key = key;
        return this;
    }
    
    public ConstituentCpdIdBuilder setConstituentBaseElementId(final Object value) {
        this._constituentBaseElementId = value;
        return this;
    }
    
    public ConstituentCpdIdBuilder setConstituentCpdId(final Object value) {
        this._constituentCpdId = value;
        return this;
    }
    
    public ConstituentCpdIdBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ConstituentCpdIdBuilder addAugmentation(Augmentation<ConstituentCpdId> augmentation) {
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
    public ConstituentCpdIdBuilder addAugmentation(Class<? extends Augmentation<ConstituentCpdId>> augmentationType, Augmentation<ConstituentCpdId> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ConstituentCpdIdBuilder removeAugmentation(Class<? extends Augmentation<ConstituentCpdId>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ConstituentCpdIdBuilder doAddAugmentation(Class<? extends Augmentation<ConstituentCpdId>> augmentationType, Augmentation<ConstituentCpdId> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ConstituentCpdId build() {
        return new ConstituentCpdIdImpl(this);
    }

    private static final class ConstituentCpdIdImpl
        extends AbstractAugmentable<ConstituentCpdId>
        implements ConstituentCpdId {
    
        private final Object _constituentBaseElementId;
        private final Object _constituentCpdId;
        private final IpAddress _ipAddress;
        private final ConstituentCpdIdKey key;
    
        ConstituentCpdIdImpl(ConstituentCpdIdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ConstituentCpdIdKey(base.getConstituentBaseElementId(), base.getConstituentCpdId());
            }
            this._constituentBaseElementId = key.getConstituentBaseElementId();
            this._constituentCpdId = key.getConstituentCpdId();
            this._ipAddress = base.getIpAddress();
        }
    
        @Override
        public ConstituentCpdIdKey key() {
            return key;
        }
        
        @Override
        public Object getConstituentBaseElementId() {
            return _constituentBaseElementId;
        }
        
        @Override
        public Object getConstituentCpdId() {
            return _constituentCpdId;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
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
            result = prime * result + Objects.hashCode(_constituentBaseElementId);
            result = prime * result + Objects.hashCode(_constituentCpdId);
            result = prime * result + Objects.hashCode(_ipAddress);
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
            if (!ConstituentCpdId.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ConstituentCpdId other = (ConstituentCpdId)obj;
            if (!Objects.equals(_constituentBaseElementId, other.getConstituentBaseElementId())) {
                return false;
            }
            if (!Objects.equals(_constituentCpdId, other.getConstituentCpdId())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConstituentCpdIdImpl otherImpl = (ConstituentCpdIdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConstituentCpdId>>, Augmentation<ConstituentCpdId>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConstituentCpdId");
            CodeHelpers.appendValue(helper, "_constituentBaseElementId", _constituentBaseElementId);
            CodeHelpers.appendValue(helper, "_constituentCpdId", _constituentCpdId);
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
