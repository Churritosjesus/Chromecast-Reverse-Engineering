	private final android.os.Bundle a
	private java.util.ArrayList b
	
	    public tw()
	    {
	        this.a = new android.os.Bundle();
	        return;
	    }
	
	
	    public final tv a()
	    {
	        if (this.b != null) {
	            java.util.ArrayList v2_0 = this.b.size();
	            java.util.ArrayList v3_1 = new java.util.ArrayList(v2_0);
	            String v1_0 = 0;
	            while (v1_0 < v2_0) {
	                v3_1.add(((tn) this.b.get(v1_0)).a);
	                v1_0++;
	            }
	            this.a.putParcelableArrayList("routes", v3_1);
	        }
	        return new tv(this.a, this.b);
	    }
	
	
	    public final tw a(tn p3)
	    {
	        if (p3 != null) {
	            if (this.b != null) {
	                if (this.b.contains(p3)) {
	                    throw new IllegalArgumentException("route descriptor already added");
	                }
	            } else {
	                this.b = new java.util.ArrayList();
	            }
	            this.b.add(p3);
	            return this;
	        } else {
	            throw new IllegalArgumentException("route must not be null");
	        }
	    }
	
