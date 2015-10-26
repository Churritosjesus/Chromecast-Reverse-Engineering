	 android.graphics.Bitmap a
	 aef b
	final java.util.LinkedList c
	private final ads d
	
	    public aev(aer p2, ads p3, aex p4)
	    {
	        this.c = new java.util.LinkedList();
	        this.d = p3;
	        this.c.add(p4);
	        return;
	    }
	
	
	    public final boolean a(aex p3)
	    {
	        int v0 = 1;
	        this.c.remove(p3);
	        if (this.c.size() != 0) {
	            v0 = 0;
	        } else {
	            this.d.g = 1;
	        }
	        return v0;
	    }
	
