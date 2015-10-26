	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	public java.lang.String d
	
	    public cpe()
	    {
	        return;
	    }
	
	
	    public final bridge synthetic void a(cov p1)
	    {
	        this.a(((cpe) p1));
	        return;
	    }
	
	
	    public final void a(cpe p2)
	    {
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            p2.a = this.a;
	        }
	        if (!android.text.TextUtils.isEmpty(this.b)) {
	            p2.b = this.b;
	        }
	        if (!android.text.TextUtils.isEmpty(this.c)) {
	            p2.c = this.c;
	        }
	        if (!android.text.TextUtils.isEmpty(this.d)) {
	            p2.d = this.d;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        v0_1.put("appName", this.a);
	        v0_1.put("appVersion", this.b);
	        v0_1.put("appId", this.c);
	        v0_1.put("appInstallerId", this.d);
	        return cpe.a(v0_1);
	    }
	
