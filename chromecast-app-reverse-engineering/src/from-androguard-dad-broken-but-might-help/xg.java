	private synthetic java.util.ArrayList a
	private synthetic xe b
	
	    xg(xe p1, java.util.ArrayList p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.Iterator v4 = this.a.iterator();
	        while (v4.hasNext()) {
	            ih v1_2;
	            ih v0_6 = ((xn) v4.next());
	            xe v5 = this.b;
	            ih v1_1 = v0_6.a;
	            if (v1_1 != null) {
	                v1_2 = v1_1.a;
	            } else {
	                v1_2 = 0;
	            }
	            int v3_1;
	            int v3_0 = v0_6.b;
	            if (v3_0 == 0) {
	                v3_1 = 0;
	            } else {
	                v3_1 = v3_0.a;
	            }
	            if (v1_2 != null) {
	                ih v1_4 = gt.o(v1_2).a(v5.l);
	                v5.g.add(v0_6.a);
	                v1_4.b(((float) (v0_6.e - v0_6.c)));
	                v1_4.c(((float) (v0_6.f - v0_6.d)));
	                v1_4.a(0).a(new xl(v5, v0_6, v1_4)).b();
	            }
	            if (v3_1 != 0) {
	                ih v1_6 = gt.o(v3_1);
	                v5.g.add(v0_6.b);
	                v1_6.b(0).c(0).a(v5.l).a(1065353216).a(new xm(v5, v0_6, v1_6, v3_1)).b();
	            }
	        }
	        this.a.clear();
	        this.b.c.remove(this.a);
	        return;
	    }
	
