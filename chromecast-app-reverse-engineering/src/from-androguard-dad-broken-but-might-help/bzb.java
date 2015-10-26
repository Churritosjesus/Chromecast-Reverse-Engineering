	private final java.lang.String a
	private final android.content.ComponentName b
	
	    public bzb(android.content.ComponentName p2)
	    {
	        this.a = 0;
	        this.b = ((android.content.ComponentName) a.c(p2));
	        return;
	    }
	
	
	    public bzb(String p2)
	    {
	        this.a = a.f(p2);
	        this.b = 0;
	        return;
	    }
	
	
	    public final android.content.Intent a()
	    {
	        android.content.Intent v0_3;
	        if (this.a == null) {
	            v0_3 = new android.content.Intent().setComponent(this.b);
	        } else {
	            v0_3 = new android.content.Intent(this.a).setPackage("com.google.android.gms");
	        }
	        return v0_3;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if ((p5 instanceof bzb)) {
	                if ((!a.e(this.a, ((bzb) p5).a)) || (!a.e(this.b, ((bzb) p5).b))) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1 = new Object[2];
	        v0_1[0] = this.a;
	        v0_1[1] = this.b;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        String v0_1;
	        if (this.a != null) {
	            v0_1 = this.a;
	        } else {
	            v0_1 = this.b.flattenToString();
	        }
	        return v0_1;
	    }
	
