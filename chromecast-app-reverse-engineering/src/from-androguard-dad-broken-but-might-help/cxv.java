	private final java.util.Map a
	private final  b
	private final cyw c
	private  d
	
	    cxv(int p2, cyw p3)
	    {
	        this.a = new java.util.HashMap();
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final declared_synchronized Object a(Object p2)
	    {
	        try {
	            return this.a.get(p2);
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    public final declared_synchronized void a(Object p6, Object p7)
	    {
	        try {
	            if (p6 != null) {
	                this.d = (this.d + this.c.a(p6, p7));
	                if (this.d > this.b) {
	                    java.util.Iterator v1_3 = this.a.entrySet().iterator();
	                    while (v1_3.hasNext()) {
	                        int v0_7 = ((java.util.Map$Entry) v1_3.next());
	                        this.d = (this.d - this.c.a(v0_7.getKey(), v0_7.getValue()));
	                        v1_3.remove();
	                        if (this.d <= this.b) {
	                            break;
	                        }
	                    }
	                }
	                this.a.put(p6, p7);
	                return;
	            } else {
	                throw new NullPointerException("key == null || value == null");
	            }
	        } catch (int v0_15) {
	            throw v0_15;
	        }
	    }
	
