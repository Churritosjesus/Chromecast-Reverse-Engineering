	private final com.google.android.gms.common.api.Status a
	private final android.os.ParcelFileDescriptor b
	private final  c
	private final  d
	
	    public csb(com.google.android.gms.common.api.Status p1, android.os.ParcelFileDescriptor p2, boolean p3, int p4, int p5)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p4;
	        this.d = p5;
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.b != null) {
	            java.io.IOException v0_1 = this.b;
	            if (v0_1 != null) {
	                try {
	                    v0_1.close();
	                } catch (java.io.IOException v0) {
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final com.google.android.gms.common.api.Status b()
	    {
	        return this.a;
	    }
	
	
	    public final android.os.ParcelFileDescriptor c()
	    {
	        return this.b;
	    }
	
	
	    public final int d()
	    {
	        return this.c;
	    }
	
	
	    public final int e()
	    {
	        return this.d;
	    }
	
