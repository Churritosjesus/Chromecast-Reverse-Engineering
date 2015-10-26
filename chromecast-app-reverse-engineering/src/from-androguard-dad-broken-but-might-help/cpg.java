	public java.lang.String a
	public  b
	public  c
	public  d
	public  e
	public  f
	
	    public cpg()
	    {
	        return;
	    }
	
	
	    public final synthetic void a(cov p2)
	    {
	        if (this.b != 0) {
	            ((cpg) p2).b = this.b;
	        }
	        if (this.c != 0) {
	            ((cpg) p2).c = this.c;
	        }
	        if (this.d != 0) {
	            ((cpg) p2).d = this.d;
	        }
	        if (this.e != 0) {
	            ((cpg) p2).e = this.e;
	        }
	        if (this.f != 0) {
	            ((cpg) p2).f = this.f;
	        }
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            ((cpg) p2).a = this.a;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        v0_1.put("language", this.a);
	        v0_1.put("screenColors", Integer.valueOf(this.b));
	        v0_1.put("screenWidth", Integer.valueOf(this.c));
	        v0_1.put("screenHeight", Integer.valueOf(this.d));
	        v0_1.put("viewportWidth", Integer.valueOf(this.e));
	        v0_1.put("viewportHeight", Integer.valueOf(this.f));
	        return cpg.a(v0_1);
	    }
	
