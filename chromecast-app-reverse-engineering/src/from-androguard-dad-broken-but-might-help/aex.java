	public android.graphics.Bitmap a
	final aey b
	public final java.lang.String c
	private final java.lang.String d
	private synthetic aer e
	
	    public aex(aer p1, android.graphics.Bitmap p2, String p3, String p4, aey p5)
	    {
	        this.e = p1;
	        this.a = p2;
	        this.c = p3;
	        this.d = p4;
	        this.b = p5;
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.b != null) {
	            java.util.HashMap v0_4 = ((aev) this.e.b.get(this.d));
	            if (v0_4 == null) {
	                java.util.HashMap v0_8 = ((aev) this.e.c.get(this.d));
	                if (v0_8 != null) {
	                    v0_8.a(this);
	                    if (v0_8.c.size() == 0) {
	                        this.e.c.remove(this.d);
	                    }
	                }
	            } else {
	                if (v0_4.a(this)) {
	                    this.e.b.remove(this.d);
	                }
	            }
	        }
	        return;
	    }
	
