	public final java.util.List a
	public final java.util.List b
	public final java.util.Map c
	public bqa d
	
	    public cph()
	    {
	        this.a = new java.util.ArrayList();
	        this.b = new java.util.ArrayList();
	        this.c = new java.util.HashMap();
	        return;
	    }
	
	
	    public final synthetic void a(cov p8)
	    {
	        ((cph) p8).a.addAll(this.a);
	        ((cph) p8).b.addAll(this.b);
	        java.util.Iterator v3 = this.c.entrySet().iterator();
	        while (v3.hasNext()) {
	            bpz v0_8 = ((java.util.Map$Entry) v3.next());
	            String v1_3 = ((String) v0_8.getKey());
	            java.util.Iterator v4 = ((java.util.List) v0_8.getValue()).iterator();
	            while (v4.hasNext()) {
	                bpz v0_13 = ((bpz) v4.next());
	                if (v0_13 != null) {
	                    java.util.List v2_0;
	                    if (v1_3 != null) {
	                        v2_0 = v1_3;
	                    } else {
	                        v2_0 = "";
	                    }
	                    if (!((cph) p8).c.containsKey(v2_0)) {
	                        ((cph) p8).c.put(v2_0, new java.util.ArrayList());
	                    }
	                    ((java.util.List) ((cph) p8).c.get(v2_0)).add(v0_13);
	                }
	            }
	        }
	        if (this.d != null) {
	            ((cph) p8).d = this.d;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        if (!this.a.isEmpty()) {
	            v0_1.put("products", this.a);
	        }
	        if (!this.b.isEmpty()) {
	            v0_1.put("promotions", this.b);
	        }
	        if (!this.c.isEmpty()) {
	            v0_1.put("impressions", this.c);
	        }
	        v0_1.put("productAction", this.d);
	        return cph.a(v0_1);
	    }
	
