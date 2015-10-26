	public static final tx c
	public final android.os.Bundle a
	 java.util.List b
	
	    static tx()
	    {
	        tx.c = new tx(new android.os.Bundle(), 0);
	        return;
	    }
	
	
	    tx(android.os.Bundle p1, java.util.List p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public static tx a(android.os.Bundle p2)
	    {
	        int v0_0;
	        if (p2 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = new tx(p2, 0);
	        }
	        return v0_0;
	    }
	
	
	    static synthetic void a(tx p0)
	    {
	        p0.b();
	        return;
	    }
	
	
	    static synthetic java.util.List b(tx p1)
	    {
	        return p1.b;
	    }
	
	
	    public final java.util.List a()
	    {
	        this.b();
	        return this.b;
	    }
	
	
	    public final boolean a(java.util.List p8)
	    {
	        int v0_1;
	        if (p8 == null) {
	            v0_1 = 0;
	        } else {
	            this.b();
	            int v5 = this.b.size();
	            if (v5 == 0) {
	            } else {
	                int v6 = p8.size();
	                int v4 = 0;
	                while (v4 < v6) {
	                    int v0_3 = ((android.content.IntentFilter) p8.get(v4));
	                    if (v0_3 != 0) {
	                        int v3 = 0;
	                        while (v3 < v5) {
	                            if (!v0_3.hasCategory(((String) this.b.get(v3)))) {
	                                v3++;
	                            } else {
	                                v0_1 = 1;
	                            }
	                            return v0_1;
	                        }
	                    }
	                    v4++;
	                }
	            }
	        }
	        return v0_1;
	    }
	
	
	    void b()
	    {
	        if (this.b == null) {
	            this.b = this.a.getStringArrayList("controlCategories");
	            if ((this.b == null) || (this.b.isEmpty())) {
	                this.b = java.util.Collections.emptyList();
	            }
	        }
	        return;
	    }
	
	
	    public final boolean c()
	    {
	        this.b();
	        return this.b.isEmpty();
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        int v0_1;
	        if (!(p3 instanceof tx)) {
	            v0_1 = 0;
	        } else {
	            this.b();
	            ((tx) p3).b();
	            v0_1 = this.b.equals(((tx) p3).b);
	        }
	        return v0_1;
	    }
	
	
	    public final int hashCode()
	    {
	        this.b();
	        return this.b.hashCode();
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append("MediaRouteSelector{ ");
	        v0_1.append("controlCategories=").append(java.util.Arrays.toString(this.a().toArray()));
	        v0_1.append(" }");
	        return v0_1.toString();
	    }
	
