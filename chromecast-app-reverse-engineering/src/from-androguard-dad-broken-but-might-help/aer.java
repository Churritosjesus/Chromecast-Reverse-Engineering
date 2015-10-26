	final aew a
	final java.util.HashMap b
	final java.util.HashMap c
	 java.lang.Runnable d
	private final adv e
	private  f
	private final android.os.Handler g
	
	    public aer(adv p3, aew p4)
	    {
	        this.f = 100;
	        this.b = new java.util.HashMap();
	        this.c = new java.util.HashMap();
	        this.g = new android.os.Handler(android.os.Looper.getMainLooper());
	        this.e = p3;
	        this.a = p4;
	        return;
	    }
	
	
	    public final aex a(String p14, aey p15)
	    {
	        android.widget.ImageView$ScaleType v10 = android.widget.ImageView$ScaleType.CENTER_INSIDE;
	        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
	            aex v0_12;
	            int v4_0 = new StringBuilder((p14.length() + 12)).append("#W").append(0).append("#H").append(0).append("#S").append(v10.ordinal()).append(p14).toString();
	            aev v2_0 = this.a.a(v4_0);
	            if (v2_0 == null) {
	                v0_12 = new aex(this, 0, p14, v4_0, p15);
	                p15.a(v0_12, 1);
	                java.util.HashMap v1_11 = ((aev) this.b.get(v4_0));
	                if (v1_11 == null) {
	                    aez v5_2 = new aez(p14, new aes(this, v4_0), 0, 0, v10, android.graphics.Bitmap$Config.RGB_565, new aet(this, v4_0));
	                    this.e.a(v5_2);
	                    this.b.put(v4_0, new aev(this, v5_2, v0_12));
	                } else {
	                    v1_11.c.add(v0_12);
	                }
	            } else {
	                v0_12 = new aex(this, v2_0, p14, 0, 0);
	                p15.a(v0_12, 1);
	            }
	            return v0_12;
	        } else {
	            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
	        }
	    }
	
	
	    void a(String p5, aev p6)
	    {
	        this.c.put(p5, p6);
	        if (this.d == null) {
	            this.d = new aeu(this);
	            this.g.postDelayed(this.d, ((long) this.f));
	        }
	        return;
	    }
	
