	public java.lang.String a
	public  b
	public java.lang.String c
	private  d
	private java.lang.String e
	private  f
	private  g
	
	    public cpk()
	    {
	        this(0);
	        return;
	    }
	
	
	    private cpk(boolean p9)
	    {
	        String v2_0 = java.util.UUID.randomUUID();
	        int v0_0 = ((int) (v2_0.getLeastSignificantBits() & 2147483647));
	        if (v0_0 == 0) {
	            v0_0 = ((int) (v2_0.getMostSignificantBits() & 2147483647));
	            if (v0_0 == 0) {
	                android.util.Log.e("GAv4", "UUID.randomUUID() returned 0.");
	                v0_0 = 2147483647;
	            }
	        }
	        this(0, v0_0);
	        return;
	    }
	
	
	    private cpk(boolean p3, int p4)
	    {
	        if (p4 != 0) {
	            this.b = p4;
	            this.g = p3;
	            return;
	        } else {
	            throw new IllegalArgumentException("Given Integer is zero");
	        }
	    }
	
	
	    public final synthetic void a(cov p3)
	    {
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            ((cpk) p3).a = this.a;
	        }
	        if (this.b != 0) {
	            ((cpk) p3).b = this.b;
	        }
	        if (this.d != 0) {
	            ((cpk) p3).d = this.d;
	        }
	        if (!android.text.TextUtils.isEmpty(this.e)) {
	            ((cpk) p3).e = this.e;
	        }
	        if (!android.text.TextUtils.isEmpty(this.c)) {
	            boolean v0_12 = this.c;
	            if (!android.text.TextUtils.isEmpty(v0_12)) {
	                ((cpk) p3).c = v0_12;
	            } else {
	                ((cpk) p3).c = 0;
	            }
	        }
	        if (this.f) {
	            ((cpk) p3).f = this.f;
	        }
	        if (this.g) {
	            ((cpk) p3).g = this.g;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        v0_1.put("screenName", this.a);
	        v0_1.put("interstitial", Boolean.valueOf(this.f));
	        v0_1.put("automatic", Boolean.valueOf(this.g));
	        v0_1.put("screenId", Integer.valueOf(this.b));
	        v0_1.put("referrerScreenId", Integer.valueOf(this.d));
	        v0_1.put("referrerScreenName", this.e);
	        v0_1.put("referrerUri", this.c);
	        return cpk.a(v0_1);
	    }
	
