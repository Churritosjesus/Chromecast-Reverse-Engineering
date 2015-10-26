	private synthetic ei a
	
	    el(ei p1)
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
	        if (this.a.a(p2) < 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean containsAll(java.util.Collection p4)
	    {
	        int v0_1 = this.a.b();
	        java.util.Iterator v1 = p4.iterator();
	        while (v1.hasNext()) {
	            if (!v0_1.containsKey(v1.next())) {
	                int v0_2 = 0;
	            }
	            return v0_2;
	        }
	        v0_2 = 1;
	        return v0_2;
	    }
	
	
	    public final boolean equals(Object p2)
	    {
	        return ei.a(this, p2);
	    }
	
	
	    public final int hashCode()
	    {
	        int v2 = (this.a.a() - 1);
	        int v3 = 0;
	        while (v2 >= 0) {
	            int v0_5;
	            int v0_4 = this.a.a(v2, 0);
	            if (v0_4 != 0) {
	                v0_5 = v0_4.hashCode();
	            } else {
	                v0_5 = 0;
	            }
	            v3 += v0_5;
	            v2--;
	        }
	        return v3;
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
	        return new ej(this.a, 0);
	    }
	
	
	    public final boolean remove(Object p3)
	    {
	        int v0_2;
	        int v0_1 = this.a.a(p3);
	        if (v0_1 < 0) {
	            v0_2 = 0;
	        } else {
	            this.a.a(v0_1);
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean removeAll(java.util.Collection p5)
	    {
	        int v0_1 = this.a.b();
	        int v1 = v0_1.size();
	        java.util.Iterator v2 = p5.iterator();
	        while (v2.hasNext()) {
	            v0_1.remove(v2.next());
	        }
	        int v0_3;
	        if (v1 == v0_1.size()) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean retainAll(java.util.Collection p2)
	    {
	        return ei.a(this.a.b(), p2);
	    }
	
	
	    public final int size()
	    {
	        return this.a.a();
	    }
	
	
	    public final Object[] toArray()
	    {
	        return this.a.b(0);
	    }
	
	
	    public final Object[] toArray(Object[] p3)
	    {
	        return this.a.a(p3, 0);
	    }
	
