	private final abb a
	private  b
	private synthetic aav c
	
	    public aaz(aav p1, abb p2)
	    {
	        this.c = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    private declared_synchronized int a()
	    {
	        try {
	            return this.b;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final declared_synchronized void a(int p2)
	    {
	        try {
	            this.b = p2;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
	
	    protected final android.widget.Filter$FilterResults performFiltering(CharSequence p9)
	    {
	        Throwable v0_1 = new android.widget.Filter$FilterResults();
	        v0_1.values = 0;
	        v0_1.count = 0;
	        if (!android.text.TextUtils.isEmpty(p9)) {
	            java.util.ArrayList v2_3 = new java.util.ArrayList();
	            try {
	                int v1_1 = aav.a(this.c, p9, this.a(), Long.valueOf(this.a.a));
	            } catch (Throwable v0_2) {
	                if (v1_1 != 0) {
	                    v1_1.close();
	                }
	                throw v0_2;
	            }
	            if (v1_1 != 0) {
	                while (v1_1.moveToNext()) {
	                    v2_3.add(new abd(v1_1, Long.valueOf(this.a.a)));
	                }
	            }
	            if (v1_1 != 0) {
	                v1_1.close();
	            }
	            if (!v2_3.isEmpty()) {
	                v0_1.values = v2_3;
	                v0_1.count = v2_3.size();
	            }
	        }
	        return v0_1;
	    }
	
	
	    protected final void publishResults(CharSequence p11, android.widget.Filter$FilterResults p12)
	    {
	        aav.c(this.c).removeMessages(1);
	        if (android.text.TextUtils.equals(p11, this.c.j)) {
	            if (p12.count > 0) {
	                java.util.Iterator v3 = ((java.util.ArrayList) p12.values).iterator();
	                while (v3.hasNext()) {
	                    int v1_5;
	                    java.util.Set v4_0 = this.c;
	                    if (this.a.a != 0) {
	                        v1_5 = 0;
	                    } else {
	                        v1_5 = 1;
	                    }
	                    aav.a(((abd) v3.next()), v1_5, v4_0.e, v4_0.f, v4_0.g);
	                }
	            }
	            aav.d(this.c);
	            if (aav.e(this.c) > 0) {
	                aav.c(this.c).a();
	            }
	            if ((p12.count > 0) || (aav.e(this.c) == 0)) {
	                this.c.h = 0;
	            }
	        }
	        this.c.a(this.c.a());
	        return;
	    }
	
