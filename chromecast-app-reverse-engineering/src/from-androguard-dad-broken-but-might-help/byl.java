	public final android.accounts.Account a
	public final java.util.Set b
	final java.util.Set c
	public final java.util.Map d
	public final java.lang.String e
	public final java.lang.String f
	public final clt g
	public java.lang.Integer h
	
	    public byl(android.accounts.Account p4, java.util.Collection p5, java.util.Map p6, int p7, android.view.View p8, String p9, String p10, clt p11)
	    {
	        java.util.Set v0_2;
	        this.a = p4;
	        if (p5 != null) {
	            v0_2 = java.util.Collections.unmodifiableSet(new java.util.HashSet(p5));
	        } else {
	            v0_2 = java.util.Collections.EMPTY_SET;
	        }
	        this.b = v0_2;
	        if (p6 == null) {
	            p6 = java.util.Collections.EMPTY_MAP;
	        }
	        this.d = p6;
	        this.e = p9;
	        this.f = p10;
	        this.g = p11;
	        java.util.Set v0_4 = new java.util.HashSet(this.b);
	        java.util.Iterator v1_3 = this.d.values().iterator();
	        while (v1_3.hasNext()) {
	            v1_3.next();
	            v0_4.addAll(0);
	        }
	        this.c = java.util.Collections.unmodifiableSet(v0_4);
	        return;
	    }
	
