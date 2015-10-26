	public java.util.Map a
	public bqa b
	public java.util.Map c
	public java.util.List d
	public java.util.List e
	
	    protected bpp()
	    {
	        this.a = new java.util.HashMap();
	        this.c = new java.util.HashMap();
	        this.d = new java.util.ArrayList();
	        this.e = new java.util.ArrayList();
	        return;
	    }
	
	
	    public final bpp a(String p2, String p3)
	    {
	        this.a.put(p2, p3);
	        return this;
	    }
	
	
	    public java.util.Map a()
	    {
	        java.util.HashMap v5_1 = new java.util.HashMap(this.a);
	        if (this.b != null) {
	            v5_1.putAll(this.b.a());
	        }
	        int v3_0 = this.d.iterator();
	        String v1_0 = 1;
	        while (v3_0.hasNext()) {
	            v5_1.putAll(((bqb) v3_0.next()).a(a.a("&promo", v1_0)));
	            v1_0++;
	        }
	        int v3_1 = this.e.iterator();
	        String v1_1 = 1;
	        while (v3_1.hasNext()) {
	            v5_1.putAll(((bpz) v3_1.next()).a(a.a("&pr", v1_1)));
	            v1_1++;
	        }
	        java.util.Iterator v6 = this.c.entrySet().iterator();
	        int v3_2 = 1;
	        while (v6.hasNext()) {
	            int v0_12 = ((java.util.Map$Entry) v6.next());
	            String v1_3 = ((java.util.List) v0_12.getValue());
	            String v7 = a.a("&il", v3_2);
	            java.util.Iterator v8 = v1_3.iterator();
	            String v4_1 = 1;
	            while (v8.hasNext()) {
	                v5_1.putAll(((bpz) v8.next()).a(new StringBuilder().append(v7).append(a.a("pi", v4_1)).toString()));
	                v4_1++;
	            }
	            if (!android.text.TextUtils.isEmpty(((CharSequence) v0_12.getKey()))) {
	                v5_1.put(new StringBuilder().append(v7).append("nm").toString(), v0_12.getKey());
	            }
	            v3_2++;
	        }
	        return v5_1;
	    }
	
