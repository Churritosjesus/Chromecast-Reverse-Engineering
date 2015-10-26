	public java.lang.String a
	public  b
	public java.lang.String c
	public java.lang.String d
	
	    public cpm()
	    {
	        return;
	    }
	
	
	    public final synthetic void a(cov p5)
	    {
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            ((cpm) p5).a = this.a;
	        }
	        if (this.b != 0) {
	            ((cpm) p5).b = this.b;
	        }
	        if (!android.text.TextUtils.isEmpty(this.c)) {
	            ((cpm) p5).c = this.c;
	        }
	        if (!android.text.TextUtils.isEmpty(this.d)) {
	            ((cpm) p5).d = this.d;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        v0_1.put("variableName", this.a);
	        v0_1.put("timeInMillis", Long.valueOf(this.b));
	        v0_1.put("category", this.c);
	        v0_1.put("label", this.d);
	        return cpm.a(v0_1);
	    }
	
