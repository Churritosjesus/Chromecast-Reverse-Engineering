	private static final  serialVersionUID
	private final java.lang.String a
	private final B b
	
	    ddu(dea p2)
	    {
	        this.a = p2.getClass().getName();
	        this.b = p2.e();
	        return;
	    }
	
	
	    protected final Object readResolve()
	    {
	        try {
	            String v0_2 = Class.forName(this.a).getDeclaredField("DEFAULT_INSTANCE");
	            v0_2.setAccessible(1);
	            return ((dea) v0_2.get(0)).j().a(this.b).d();
	        } catch (String v0_10) {
	            RuntimeException v1_8 = v0_10;
	            String v0_12 = String.valueOf(this.a);
	            if (v0_12.length() == 0) {
	                String v0_14 = new String("Unable to call DEFAULT_INSTANCE in ");
	            } else {
	                v0_14 = "Unable to call DEFAULT_INSTANCE in ".concat(v0_12);
	            }
	            throw new RuntimeException(v0_14, v1_8);
	        } catch (String v0_8) {
	            throw new RuntimeException("Unable to understand proto buffer", v0_8);
	        } catch (String v0_15) {
	            RuntimeException v1_9 = v0_15;
	            String v0_17 = String.valueOf(this.a);
	            if (v0_17.length() == 0) {
	                String v0_19 = new String("Unable to find DEFAULT_INSTANCE in ");
	            } else {
	                v0_19 = "Unable to find DEFAULT_INSTANCE in ".concat(v0_17);
	            }
	            throw new RuntimeException(v0_19, v1_9);
	        } catch (String v0_9) {
	            throw new RuntimeException("Unable to call parsePartialFrom", v0_9);
	        } catch (String v0_20) {
	            RuntimeException v1_10 = v0_20;
	            String v0_22 = String.valueOf(this.a);
	            if (v0_22.length() == 0) {
	                String v0_24 = new String("Unable to find proto buffer class: ");
	            } else {
	                v0_24 = "Unable to find proto buffer class: ".concat(v0_22);
	            }
	            throw new RuntimeException(v0_24, v1_10);
	        }
	    }
	
