	public final java.util.List a
	public java.lang.String b
	public  c
	private final java.util.Map d
	
	    cma()
	    {
	        this.a = new java.util.ArrayList();
	        this.d = new java.util.HashMap();
	        this.b = "";
	        this.c = 0;
	        return;
	    }
	
	
	    public final clz a()
	    {
	        return new clz(this.a, this.d, this.b, this.c);
	    }
	
	
	    public final cma a(clx p4)
	    {
	        String v1_2 = cyh.a(((cje) java.util.Collections.unmodifiableMap(p4.a).get(cit.u.toString())));
	        java.util.ArrayList v0_6 = ((java.util.List) this.d.get(v1_2));
	        if (v0_6 == null) {
	            v0_6 = new java.util.ArrayList();
	            this.d.put(v1_2, v0_6);
	        }
	        v0_6.add(p4);
	        return this;
	    }
	
