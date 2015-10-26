	private final java.lang.Class a
	private final java.lang.String b
	private final Ljava.lang.Class c
	
	    public varargs dgm(Class p1, String p2, Class[] p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    private reflect.Method a(Class p5)
	    {
	        reflect.Method v0 = 0;
	        if (this.b != null) {
	            reflect.Method v1_2 = dgm.a(p5, this.b, this.c);
	            if ((v1_2 == null) || ((this.a == null) || (this.a.isAssignableFrom(v1_2.getReturnType())))) {
	                v0 = v1_2;
	            }
	        }
	        return v0;
	    }
	
	
	    private static reflect.Method a(Class p3, String p4, Class[] p5)
	    {
	        NoSuchMethodException v0 = 0;
	        try {
	            NoSuchMethodException v1 = p3.getMethod(p4, p5);
	            try {
	                if ((v1.getModifiers() & 1) != 0) {
	                    v0 = v1;
	                    return v0;
	                } else {
	                    return v0;
	                }
	            } catch (NoSuchMethodException v0) {
	                v0 = v1;
	                return v0;
	            }
	        } catch (NoSuchMethodException v1) {
	            return v0;
	        }
	    }
	
	
	    private varargs Object c(Object p3, Object[] p4)
	    {
	        Object v0 = 0;
	        IllegalAccessException v1_1 = this.a(p3.getClass());
	        if (v1_1 != null) {
	            try {
	                v0 = v1_1.invoke(p3, p4);
	            } catch (IllegalAccessException v1) {
	            }
	        }
	        return v0;
	    }
	
	
	    private varargs Object d(Object p6, Object[] p7)
	    {
	        String v0_1 = this.a(p6.getClass());
	        if (v0_1 != null) {
	            try {
	                String v0_2 = v0_1.invoke(p6, p7);
	                return v0_2;
	            } catch (IllegalAccessException v1_0) {
	                AssertionError v2_1 = new AssertionError(new StringBuilder("Unexpectedly could not call: ").append(v0_2).toString());
	                v2_1.initCause(v1_0);
	                throw v2_1;
	            }
	        } else {
	            throw new AssertionError(new StringBuilder("Method ").append(this.b).append(" not supported for object ").append(p6).toString());
	        }
	    }
	
	
	    public final varargs Object a(Object p4, Object[] p5)
	    {
	        try {
	            return this.c(p4, p5);
	        } catch (RuntimeException v0_1) {
	            RuntimeException v0_2 = v0_1.getTargetException();
	            if (!(v0_2 instanceof RuntimeException)) {
	                AssertionError v1_2 = new AssertionError("Unexpected exception");
	                v1_2.initCause(v0_2);
	                throw v1_2;
	            } else {
	                throw ((RuntimeException) v0_2);
	            }
	        }
	    }
	
	
	    public final boolean a(Object p2)
	    {
	        int v0_2;
	        if (this.a(p2.getClass()) == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final varargs Object b(Object p4, Object[] p5)
	    {
	        try {
	            return this.d(p4, p5);
	        } catch (RuntimeException v0_1) {
	            RuntimeException v0_2 = v0_1.getTargetException();
	            if (!(v0_2 instanceof RuntimeException)) {
	                AssertionError v1_2 = new AssertionError("Unexpected exception");
	                v1_2.initCause(v0_2);
	                throw v1_2;
	            } else {
	                throw ((RuntimeException) v0_2);
	            }
	        }
	    }
	
