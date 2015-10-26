	private synthetic java.util.ArrayList a
	private synthetic act b
	
	    acu(act p1, java.util.ArrayList p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void a(java.util.Map p7)
	    {
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        java.util.Iterator v3 = this.a.iterator();
	        while (v3.hasNext()) {
	            ada v0_5;
	            ada v0_4 = ((ada) v3.next());
	            if ((v0_4 == null) || ((!acx.a(v0_4.g().g)) || (this.b.a.getText().getSpanStart(v0_4) == -1))) {
	                v0_5 = 0;
	            } else {
	                v0_5 = acb.b(this.b.a, ((acx) p7.get(acb.a(v0_4.g().d))));
	            }
	            if (v0_5 == null) {
	                v2_1.add(0);
	            } else {
	                v2_1.add(act.a(this.b, v0_5));
	            }
	        }
	        act.a(this.b, this.a, v2_1);
	        return;
	    }
	
	
	    public final void a(java.util.Set p8)
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList(p8.size());
	        java.util.ArrayList v2_0 = this.a.iterator();
	        while (v2_0.hasNext()) {
	            ada v0_5 = ((ada) v2_0.next());
	            if ((v0_5 == null) || ((!acx.a(v0_5.g().g)) || (this.b.a.getText().getSpanStart(v0_5) == -1))) {
	                v1_1.add(0);
	            } else {
	                if (!p8.contains(v0_5.g().d)) {
	                    v1_1.add(0);
	                } else {
	                    v1_1.add(act.a(this.b, v0_5.g()));
	                }
	            }
	        }
	        act.a(this.b, this.a, v1_1);
	        return;
	    }
	
