	private java.util.ArrayList a
	
	    public ty()
	    {
	        return;
	    }
	
	
	    public ty(tx p3)
	    {
	        if (p3 != null) {
	            tx.a(p3);
	            if (!tx.b(p3).isEmpty()) {
	                this.a = new java.util.ArrayList(tx.b(p3));
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    private ty a(java.util.Collection p3)
	    {
	        if (p3 != null) {
	            if (!p3.isEmpty()) {
	                java.util.Iterator v1_0 = p3.iterator();
	                while (v1_0.hasNext()) {
	                    this.a(((String) v1_0.next()));
	                }
	            }
	            return this;
	        } else {
	            throw new IllegalArgumentException("categories must not be null");
	        }
	    }
	
	
	    public final tx a()
	    {
	        tx v0_3;
	        if (this.a != null) {
	            android.os.Bundle v1_1 = new android.os.Bundle();
	            v1_1.putStringArrayList("controlCategories", this.a);
	            v0_3 = new tx(v1_1, this.a);
	        } else {
	            v0_3 = tx.c;
	        }
	        return v0_3;
	    }
	
	
	    public final ty a(String p3)
	    {
	        if (p3 != null) {
	            if (this.a == null) {
	                this.a = new java.util.ArrayList();
	            }
	            if (!this.a.contains(p3)) {
	                this.a.add(p3);
	            }
	            return this;
	        } else {
	            throw new IllegalArgumentException("category must not be null");
	        }
	    }
	
	
	    public final ty a(tx p3)
	    {
	        if (p3 != null) {
	            this.a(p3.a());
	            return this;
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
