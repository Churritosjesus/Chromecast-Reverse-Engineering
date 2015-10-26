	private synthetic java.util.ArrayList a
	private synthetic agm b
	
	    agc(java.util.ArrayList p1, agm p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.Iterator v2 = this.a.iterator();
	        while (v2.hasNext()) {
	            agn v0_8 = ((android.util.Pair) v2.next());
	            ((agf) v0_8.first).a(((agp) v0_8.second));
	        }
	        java.util.Iterator v1_0 = this.b.d.iterator();
	        while (v1_0.hasNext()) {
	            ((agn) v1_0.next()).a();
	        }
	        return;
	    }
	
