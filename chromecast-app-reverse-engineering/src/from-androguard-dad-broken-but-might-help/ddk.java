	  a
	
	    ddk()
	    {
	        this.a = 1;
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return this.a;
	    }
	
	
	    public void add(int p1, Object p2)
	    {
	        this.c();
	        super.add(p1, p2);
	        return;
	    }
	
	
	    public boolean add(Object p2)
	    {
	        this.c();
	        return super.add(p2);
	    }
	
	
	    public boolean addAll(int p2, java.util.Collection p3)
	    {
	        this.c();
	        return super.addAll(p2, p3);
	    }
	
	
	    public boolean addAll(java.util.Collection p2)
	    {
	        this.c();
	        return super.addAll(p2);
	    }
	
	
	    public final void b()
	    {
	        this.a = 0;
	        return;
	    }
	
	
	    protected final void c()
	    {
	        if (this.a) {
	            return;
	        } else {
	            throw new UnsupportedOperationException();
	        }
	    }
	
	
	    public void clear()
	    {
	        this.c();
	        super.clear();
	        return;
	    }
	
	
	    public Object remove(int p2)
	    {
	        this.c();
	        return super.remove(p2);
	    }
	
	
	    public boolean remove(Object p2)
	    {
	        this.c();
	        return super.remove(p2);
	    }
	
	
	    public boolean removeAll(java.util.Collection p2)
	    {
	        this.c();
	        return super.removeAll(p2);
	    }
	
	
	    public boolean retainAll(java.util.Collection p2)
	    {
	        this.c();
	        return super.retainAll(p2);
	    }
	
	
	    public Object set(int p2, Object p3)
	    {
	        this.c();
	        return super.set(p2, p3);
	    }
	
