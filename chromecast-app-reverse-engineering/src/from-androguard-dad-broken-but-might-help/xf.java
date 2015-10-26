	private synthetic java.util.ArrayList a
	private synthetic xe b
	
	    xf(xe p1, java.util.ArrayList p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.Iterator v6 = this.a.iterator();
	        while (v6.hasNext()) {
	            ih v0_6 = ((xo) v6.next());
	            java.util.ArrayList v1_1 = this.b;
	            zr v2 = v0_6.a;
	            ih v7_0 = v2.a;
	            int v3_1 = (v0_6.d - v0_6.b);
	            int v4_1 = (v0_6.e - v0_6.c);
	            if (v3_1 != 0) {
	                gt.o(v7_0).b(0);
	            }
	            if (v4_1 != 0) {
	                gt.o(v7_0).c(0);
	            }
	            ih v5_1 = gt.o(v7_0);
	            v1_1.e.add(v2);
	            v5_1.a(v1_1.k).a(new xk(v1_1, v2, v3_1, v4_1, v5_1)).b();
	        }
	        this.a.clear();
	        this.b.b.remove(this.a);
	        return;
	    }
	
