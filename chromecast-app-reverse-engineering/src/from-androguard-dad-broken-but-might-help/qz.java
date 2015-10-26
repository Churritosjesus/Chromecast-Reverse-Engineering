	private final android.util.SparseArray a
	private synthetic qy b
	
	    qz(qy p2)
	    {
	        this.b = p2;
	        this.a = new android.util.SparseArray();
	        return;
	    }
	
	
	    final android.view.View a(int p3)
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get(p3));
	        if (v0_2 != null) {
	            this.a.delete(p3);
	        }
	        return v0_2;
	    }
	
	
	    final void a()
	    {
	        android.util.SparseArray v2 = this.a;
	        int v3 = v2.size();
	        int v1 = 0;
	        while (v1 < v3) {
	            int v0_2 = ((android.view.View) v2.valueAt(v1));
	            if (v0_2 != 0) {
	                qy.a(this.b, v0_2, 1);
	            }
	            v1++;
	        }
	        v2.clear();
	        return;
	    }
	
	
	    public final void a(int p2, android.view.View p3)
	    {
	        this.a.put(p2, p3);
	        return;
	    }
	
