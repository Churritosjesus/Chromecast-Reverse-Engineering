	final tq a
	public final java.util.ArrayList b
	 tv c
	private final tt d
	
	    ug(tq p2)
	    {
	        this.b = new java.util.ArrayList();
	        this.a = p2;
	        this.d = p2.b;
	        return;
	    }
	
	
	    final int a(String p4)
	    {
	        int v2 = this.b.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            if (!((uh) this.b.get(v1)).a.equals(p4)) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    public final String a()
	    {
	        return this.d.a.getPackageName();
	    }
	
	
	    public final android.content.ComponentName b()
	    {
	        return this.d.a;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=").append(this.a()).append(" }").toString();
	    }
	
