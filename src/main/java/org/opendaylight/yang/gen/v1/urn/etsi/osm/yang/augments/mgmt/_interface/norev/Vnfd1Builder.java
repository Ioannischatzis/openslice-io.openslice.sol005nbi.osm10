package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.mgmt._interface.norev;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Vnfd1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     Vnfd1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new Vnfd1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of Vnfd1Builder, as instances can be freely passed around without
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
 * @see Vnfd1Builder
 * @see Builder
 *
 */
public class Vnfd1Builder implements Builder<Vnfd1> {

    private String _mgmtCp;



    public Vnfd1Builder() {
    }
    public Vnfd1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.mgmt._interface.norev.ExtendedMgmtInterface arg) {
        this._mgmtCp = arg.getMgmtCp();
    }

    public Vnfd1Builder(Vnfd1 base) {
        this._mgmtCp = base.getMgmtCp();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.mgmt._interface.norev.ExtendedMgmtInterface</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.mgmt._interface.norev.ExtendedMgmtInterface) {
            this._mgmtCp = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.mgmt._interface.norev.ExtendedMgmtInterface)arg).getMgmtCp();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.mgmt._interface.norev.ExtendedMgmtInterface]");
    }

    public String getMgmtCp() {
        return _mgmtCp;
    }

    
    public Vnfd1Builder setMgmtCp(final String value) {
        this._mgmtCp = value;
        return this;
    }
    

    @Override
    public Vnfd1 build() {
        return new Vnfd1Impl(this);
    }

    private static final class Vnfd1Impl
        implements Vnfd1 {
    
        private final String _mgmtCp;
    
        Vnfd1Impl(Vnfd1Builder base) {
            this._mgmtCp = base.getMgmtCp();
        }
    
        @Override
        public String getMgmtCp() {
            return _mgmtCp;
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
            result = prime * result + Objects.hashCode(_mgmtCp);
        
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
            if (!Vnfd1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vnfd1 other = (Vnfd1)obj;
            if (!Objects.equals(_mgmtCp, other.getMgmtCp())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnfd1");
            CodeHelpers.appendValue(helper, "_mgmtCp", _mgmtCp);
            return helper.toString();
        }
    }
}
