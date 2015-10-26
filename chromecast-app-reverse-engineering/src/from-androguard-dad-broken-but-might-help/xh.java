	private synthetic java.util.ArrayList a
	private synthetic xe b
	
	    xh(xe p1, java.util.ArrayList p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.ArrayList v1_0 = this.a.iterator();
	        while (v1_0.hasNext()) {
	            java.util.ArrayList v0_6 = ((zr) v1_0.next());
	            xe v2 = this.b;
	            ih v3_1 = gt.o(v0_6.a);
	            v2.d.add(v0_6);
	            v3_1.a(1065353216).a(v2.i).a(new xj(v2, v0_6, v3_1)).b();
	        }
	        this.a.clear();
	        this.b.a.remove(this.a);
	        return;
	    }
	
