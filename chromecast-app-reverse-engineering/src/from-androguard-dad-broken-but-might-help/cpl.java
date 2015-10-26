	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	
	    public cpl()
	    {
	        return;
	    }
	
	
	    public final synthetic void a(cov p2)
	    {
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            ((cpl) p2).a = this.a;
	        }
	        if (!android.text.TextUtils.isEmpty(this.b)) {
	            ((cpl) p2).b = this.b;
	        }
	        if (!android.text.TextUtils.isEmpty(this.c)) {
	            ((cpl) p2).c = this.c;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        v0_1.put("network", this.a);
	        v0_1.put("action", this.b);
	        v0_1.put("target", this.c);
	        return cpl.a(v0_1);
	    }
	
