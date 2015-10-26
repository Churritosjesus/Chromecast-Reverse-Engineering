	private synthetic android.view.View a
	private synthetic al b
	private synthetic java.util.Map c
	private synthetic java.util.Map d
	private synthetic android.transition.Transition e
	private synthetic java.util.ArrayList f
	private synthetic android.view.View g
	
	    ah(android.view.View p1, al p2, java.util.Map p3, java.util.Map p4, android.transition.Transition p5, java.util.ArrayList p6, android.view.View p7)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        this.g = p7;
	        return;
	    }
	
	
	    public final boolean onPreDraw()
	    {
	        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
	        android.view.View v2 = this.b.a();
	        if (v2 != null) {
	            if (!this.c.isEmpty()) {
	                a.a(this.d, v2);
	                this.d.keySet().retainAll(this.c.values());
	                java.util.Iterator v3 = this.c.entrySet().iterator();
	                while (v3.hasNext()) {
	                    String v0_19 = ((java.util.Map$Entry) v3.next());
	                    android.view.View v1_10 = ((android.view.View) this.d.get(((String) v0_19.getValue())));
	                    if (v1_10 != null) {
	                        v1_10.setTransitionName(((String) v0_19.getKey()));
	                    }
	                }
	            }
	            if (this.e != null) {
	                a.a(this.f, v2);
	                this.f.removeAll(this.d.values());
	                this.f.add(this.g);
	                this.e.removeTarget(this.g);
	                a.b(this.e, this.f);
	            }
	        }
	        return 1;
	    }
	
