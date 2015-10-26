	private synthetic ei a
	
	    en(ei p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final boolean add(Object p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final boolean addAll(java.util.Collection p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final void clear()
	    {
	        this.a.c();
	        return;
	    }
	
	
	    public final boolean contains(Object p2)
	    {
	        int v0_2;
	        if (this.a.b(p2) < 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean containsAll(java.util.Collection p3)
	    {
	        int v0_0 = p3.iterator();
	        while (v0_0.hasNext()) {
	            if (!this.contains(v0_0.next())) {
	                int v0_1 = 0;
	            }
	            return v0_1;
	        }
	        v0_1 = 1;
	        return v0_1;
	    }
	
	
	    public final boolean isEmpty()
	    {
	        int v0_2;
	        if (this.a.a() != 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final java.util.Iterator iterator()
	    {
	        return new ej(this.a, 1);
	    }
	
	
	    public final boolean remove(Object p3)
	    {
	        int v0_2;
	        int v0_1 = this.a.b(p3);
	        if (v0_1 < 0) {
	            v0_2 = 0;
	        } else {
	            this.a.a(v0_1);
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean removeAll(java.util.Collection p6)
	    {
	        int v0 = 0;
	        int v3 = this.a.a();
	        int v1_1 = 0;
	        while (v0 < v3) {
	            if (p6.contains(this.a.a(v0, 1))) {
	                this.a.a(v0);
	                v0--;
	                v3--;
	                v1_1 = 1;
	            }
	            v0++;
	        }
	        return v1_1;
	    }
	
	
	    public final boolean retainAll(java.util.Collection p6)
	    {
	        int v0 = 0;
	        int v3 = this.a.a();
	        int v1_1 = 0;
	        while (v0 < v3) {
	            if (!p6.contains(this.a.a(v0, 1))) {
	                this.a.a(v0);
	                v0--;
	                v3--;
	                v1_1 = 1;
	            }
	            v0++;
	        }
	        return v1_1;
	    }
	
	
	    public final int size()
	    {
	        return this.a.a();
	    }
	
	
	    public final Object[] toArray()
	    {
	        return this.a.b(1);
	    }
	
	
	    public final Object[] toArray(Object[] p3)
	    {
	        return this.a.a(p3, 1);
	    }
	
