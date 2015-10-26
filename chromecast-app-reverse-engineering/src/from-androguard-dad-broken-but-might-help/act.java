	final synthetic acb a
	
	    act(acb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    static synthetic ada a(act p1, acx p2)
	    {
	        return p1.a(p2);
	    }
	
	
	    private ada a(acx p5)
	    {
	        ada v0 = 0;
	        try {
	            if (!acb.s(this.a)) {
	                v0 = acb.a(this.a, p5);
	            }
	        } catch (acb v1_3) {
	            android.util.Log.e("RecipientEditTextView", v1_3.getMessage(), v1_3);
	        }
	        return v0;
	    }
	
	
	    static synthetic void a(act p0, java.util.List p1, java.util.List p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    private void a(java.util.List p4, java.util.List p5)
	    {
	        if ((p5 != null) && (p5.size() > 0)) {
	            acv v0_2 = new acv(this, p4, p5);
	            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
	                acb.e(this.a).post(v0_2);
	            } else {
	                v0_2.run();
	            }
	        }
	        return;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p6)
	    {
	        if (acb.u(this.a) != null) {
	            acb.u(this.a).cancel(1);
	        }
	        java.util.ArrayList v1_2 = new java.util.ArrayList();
	        java.util.Collections.addAll(v1_2, this.a.e());
	        if (acb.t(this.a) != null) {
	            v1_2.addAll(acb.t(this.a));
	        }
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        acu v3_0 = v1_2.iterator();
	        while (v3_0.hasNext()) {
	            String v0_15 = ((ada) v3_0.next());
	            if (v0_15 != null) {
	                v2_1.add(this.a.a(v0_15.g()));
	            }
	        }
	        this.a.g().a(v2_1, new acu(this, v1_2));
	        return 0;
	    }
	
	
	    protected final void onPreExecute()
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        java.util.Collections.addAll(v1_1, this.a.e());
	        if (acb.t(this.a) != null) {
	            v1_1.addAll(acb.t(this.a));
	        }
	        java.util.ArrayList v2_1 = new java.util.ArrayList(v1_1.size());
	        java.util.Iterator v3 = v1_1.iterator();
	        while (v3.hasNext()) {
	            ada v0_9 = ((ada) v3.next());
	            if ((!acx.a(v0_9.g().g)) || (this.a.getText().getSpanStart(v0_9) == -1)) {
	                v2_1.add(0);
	            } else {
	                v2_1.add(this.a(v0_9.g()));
	            }
	        }
	        this.a(v1_1, v2_1);
	        return;
	    }
	
