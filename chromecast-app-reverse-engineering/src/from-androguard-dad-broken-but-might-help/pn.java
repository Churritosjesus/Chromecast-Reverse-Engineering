	private static final Ljava.lang.Class a
	private java.lang.Object b
	private java.lang.reflect.Method c
	
	    static pn()
	    {
	        Class[] v0_1 = new Class[1];
	        v0_1[0] = android.view.MenuItem;
	        pn.a = v0_1;
	        return;
	    }
	
	
	    public pn(Object p6, String p7)
	    {
	        this.b = p6;
	        String v1_0 = p6.getClass();
	        try {
	            this.c = v1_0.getMethod(p7, pn.a);
	            return;
	        } catch (Exception v0_2) {
	            android.view.InflateException v2_1 = new android.view.InflateException(new StringBuilder("Couldn\'t resolve menu item onClick handler ").append(p7).append(" in class ").append(v1_0.getName()).toString());
	            v2_1.initCause(v0_2);
	            throw v2_1;
	        }
	    }
	
	
	    public final boolean onMenuItemClick(android.view.MenuItem p6)
	    {
	        boolean v0_0 = 1;
	        try {
	            if (this.c.getReturnType() != Boolean.TYPE) {
	                reflect.Method v1_2 = this.c;
	                Object v2_1 = this.b;
	                Object[] v3_1 = new Object[1];
	                v3_1[0] = p6;
	                v1_2.invoke(v2_1, v3_1);
	            } else {
	                boolean v0_1 = this.c;
	                reflect.Method v1_3 = this.b;
	                Object v2_3 = new Object[1];
	                v2_3[0] = p6;
	                v0_0 = ((Boolean) v0_1.invoke(v1_3, v2_3)).booleanValue();
	            }
	        } catch (boolean v0_4) {
	            throw new RuntimeException(v0_4);
	        }
	        return v0_0;
	    }
	
