package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link GetNsConfigPrimitiveValuesInputBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     GetNsConfigPrimitiveValuesInputBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new GetNsConfigPrimitiveValuesInputBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of GetNsConfigPrimitiveValuesInputBuilder, as instances can be freely passed around without
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
 * @see GetNsConfigPrimitiveValuesInputBuilder
 * @see Builder
 *
 */
public class GetNsConfigPrimitiveValuesInputBuilder implements Builder<GetNsConfigPrimitiveValuesInput> {

    private String _name;
    private Object _nsrIdRef;
    private String _projectName;


    Map<Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>>, Augmentation<GetNsConfigPrimitiveValuesInput>> augmentation = Collections.emptyMap();

    public GetNsConfigPrimitiveValuesInputBuilder() {
    }
    public GetNsConfigPrimitiveValuesInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public GetNsConfigPrimitiveValuesInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }

    public GetNsConfigPrimitiveValuesInputBuilder(GetNsConfigPrimitiveValuesInput base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>>, Augmentation<GetNsConfigPrimitiveValuesInput>> aug =((AugmentationHolder<GetNsConfigPrimitiveValuesInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._projectName = base.getProjectName();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon]");
    }

    public String getName() {
        return _name;
    }
    
    public Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public String getProjectName() {
        return _projectName;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<GetNsConfigPrimitiveValuesInput>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public GetNsConfigPrimitiveValuesInputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public GetNsConfigPrimitiveValuesInputBuilder setNsrIdRef(final Object value) {
        this._nsrIdRef = value;
        return this;
    }
    
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public GetNsConfigPrimitiveValuesInputBuilder setProjectName(final String value) {
        if (value != null) {
            check_projectNameLength(value);
            
        }
        this._projectName = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public GetNsConfigPrimitiveValuesInputBuilder addAugmentation(Augmentation<GetNsConfigPrimitiveValuesInput> augmentation) {
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
    public GetNsConfigPrimitiveValuesInputBuilder addAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>> augmentationType, Augmentation<GetNsConfigPrimitiveValuesInput> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public GetNsConfigPrimitiveValuesInputBuilder removeAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private GetNsConfigPrimitiveValuesInputBuilder doAddAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>> augmentationType, Augmentation<GetNsConfigPrimitiveValuesInput> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public GetNsConfigPrimitiveValuesInput build() {
        return new GetNsConfigPrimitiveValuesInputImpl(this);
    }

    private static final class GetNsConfigPrimitiveValuesInputImpl
        extends AbstractAugmentable<GetNsConfigPrimitiveValuesInput>
        implements GetNsConfigPrimitiveValuesInput {
    
        private final String _name;
        private final Object _nsrIdRef;
        private final String _projectName;
    
        GetNsConfigPrimitiveValuesInputImpl(GetNsConfigPrimitiveValuesInputBuilder base) {
            super(base.augmentation);
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._projectName = base.getProjectName();
        }
    
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Object getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public String getProjectName() {
            return _projectName;
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_projectName);
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
            if (!GetNsConfigPrimitiveValuesInput.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            GetNsConfigPrimitiveValuesInput other = (GetNsConfigPrimitiveValuesInput)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetNsConfigPrimitiveValuesInputImpl otherImpl = (GetNsConfigPrimitiveValuesInputImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>>, Augmentation<GetNsConfigPrimitiveValuesInput>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GetNsConfigPrimitiveValuesInput");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
