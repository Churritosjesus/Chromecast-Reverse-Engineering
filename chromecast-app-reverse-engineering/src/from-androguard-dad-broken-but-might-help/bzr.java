	private final java.util.List a
	private final java.lang.Object b
	
	    public bzr(Object p2)
	    {
	        this.b = a.c(p2);
	        this.a = new java.util.ArrayList();
	        return;
	    }
	
	
	    public final bzr a(String p4, Object p5)
	    {
	        this.a.add(new StringBuilder().append(((String) a.c(p4))).append("=").append(String.valueOf(p5)).toString());
	        return this;
	    }
	
	
	    public final String toString()
	    {
	        StringBuilder v2 = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append(123);
	        int v3 = this.a.size();
	        int v1_5 = 0;
	        while (v1_5 < v3) {
	            v2.append(((String) this.a.get(v1_5)));
	            if (v1_5 < (v3 - 1)) {
	                v2.append(", ");
	            }
	            v1_5++;
	        }
	        return v2.append(125).toString();
	    }
	
