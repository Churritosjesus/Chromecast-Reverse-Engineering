	private android.view.ActionMode$Callback a
	private android.content.Context b
	private java.util.ArrayList c
	private ep d
	
	    public pl(android.content.Context p2, android.view.ActionMode$Callback p3)
	    {
	        this.b = p2;
	        this.a = p3;
	        this.c = new java.util.ArrayList();
	        this.d = new ep();
	        return;
	    }
	
	
	    private android.view.Menu a(android.view.Menu p3)
	    {
	        android.view.Menu v0_2 = ((android.view.Menu) this.d.get(p3));
	        if (v0_2 == null) {
	            v0_2 = a.a(this.b, ((cc) p3));
	            this.d.put(p3, v0_2);
	        }
	        return v0_2;
	    }
	
	
	    public final void a(vr p3)
	    {
	        this.a.onDestroyActionMode(this.b(p3));
	        return;
	    }
	
	
	    public final boolean a(vr p4, android.view.Menu p5)
	    {
	        return this.a.onCreateActionMode(this.b(p4), this.a(p5));
	    }
	
	
	    public final boolean a(vr p4, android.view.MenuItem p5)
	    {
	        return this.a.onActionItemClicked(this.b(p4), a.a(this.b, ((cd) p5)));
	    }
	
	
	    public final android.view.ActionMode b(vr p5)
	    {
	        int v2 = this.c.size();
	        int v1_1 = 0;
	        while (v1_1 < v2) {
	            int v0_2 = ((pk) this.c.get(v1_1));
	            if ((v0_2 == 0) || (v0_2.a != p5)) {
	                v1_1++;
	            }
	            return v0_2;
	        }
	        v0_2 = new pk(this.b, p5);
	        this.c.add(v0_2);
	        return v0_2;
	    }
	
	
	    public final boolean b(vr p4, android.view.Menu p5)
	    {
	        return this.a.onPrepareActionMode(this.b(p4), this.a(p5));
	    }
	
