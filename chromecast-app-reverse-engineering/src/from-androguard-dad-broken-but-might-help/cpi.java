	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	public  d
	
	    public cpi()
	    {
	        return;
	    }
	
	
	    public final synthetic void a(cov p5)
	    {
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            ((cpi) p5).a = this.a;
	        }
	        if (!android.text.TextUtils.isEmpty(this.b)) {
	            ((cpi) p5).b = this.b;
	        }
	        if (!android.text.TextUtils.isEmpty(this.c)) {
	            ((cpi) p5).c = this.c;
	        }
	        if (this.d != 0) {
	            ((cpi) p5).d = this.d;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        v0_1.put("category", this.a);
	        v0_1.put("action", this.b);
	        v0_1.put("label", this.c);
	        v0_1.put("value", Long.valueOf(this.d));
	        return cpi.a(v0_1);
	    }
	
