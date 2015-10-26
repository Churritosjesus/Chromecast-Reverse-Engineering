	private synthetic ei a
	
	    ek(ei p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final synthetic boolean add(Object p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final boolean addAll(java.util.Collection p6)
	    {
	        int v1 = this.a.a();
	        java.util.Iterator v2 = p6.iterator();
	        while (v2.hasNext()) {
	            int v0_6 = ((java.util.Map$Entry) v2.next());
	            this.a.a(v0_6.getKey(), v0_6.getValue());
	        }
	        int v0_4;
	        if (v1 == this.a.a()) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public final void clear()
	    {
	        this.a.c();
	        return;
	    }
	
	
	    public final boolean contains(Object p4)
	    {
	        boolean v0_0 = 0;
	        if ((p4 instanceof java.util.Map$Entry)) {
	            Object v1_2 = this.a.a(((java.util.Map$Entry) p4).getKey());
	            if (v1_2 >= null) {
	                v0_0 = ef.a(this.a.a(v1_2, 1), ((java.util.Map$Entry) p4).getValue());
	            }
	        }
	        return v0_0;
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
	
	
	    public final boolean equals(Object p2)
	    {
	        return ei.a(this, p2);
	    }
	
	
	    public final int hashCode()
	    {
	        int v3 = (this.a.a() - 1);
	        int v4 = 0;
	        while (v3 >= 0) {
	            int v2_1;
	            int v0_4 = this.a.a(v3, 0);
	            Object v5_1 = this.a.a(v3, 1);
	            if (v0_4 != 0) {
	                v2_1 = v0_4.hashCode();
	            } else {
	                v2_1 = 0;
	            }
	            int v0_6;
	            if (v5_1 != null) {
	                v0_6 = v5_1.hashCode();
	            } else {
	                v0_6 = 0;
	            }
	            v3--;
	            v4 += (v0_6 ^ v2_1);
	        }
	        return v4;
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
	        return new em(this.a);
	    }
	
	
	    public final boolean remove(Object p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final boolean removeAll(java.util.Collection p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final boolean retainAll(java.util.Collection p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final int size()
	    {
	        return this.a.a();
	    }
	
	
	    public final Object[] toArray()
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final Object[] toArray(Object[] p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
