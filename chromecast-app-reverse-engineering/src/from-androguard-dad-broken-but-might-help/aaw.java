	private synthetic aav a
	
	    aaw(aav p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final CharSequence convertResultToString(Object p5)
	    {
	        String v1 = ((acx) p5).c;
	        String v0 = ((acx) p5).d;
	        if ((!android.text.TextUtils.isEmpty(v1)) && (!android.text.TextUtils.equals(v1, v0))) {
	            v0 = new android.text.util.Rfc822Token(v1, v0, 0).toString();
	        }
	        return v0;
	    }
	
	
	    protected final android.widget.Filter$FilterResults performFiltering(CharSequence p9)
	    {
	        int v0_12;
	        java.util.List v1_0 = 0;
	        android.widget.Filter$FilterResults v6_1 = new android.widget.Filter$FilterResults();
	        if (!android.text.TextUtils.isEmpty(p9)) {
	            if (abe.a(aav.a(this.a), aav.b(this.a))) {
	                try {
	                    android.database.Cursor v7 = aav.a(this.a, p9, this.a.c, 0);
	                } catch (int v0_5) {
	                    if (v1_0 != null) {
	                        v1_0.close();
	                    }
	                    throw v0_5;
	                }
	                if (v7 != null) {
	                    try {
	                        java.util.LinkedHashMap v2_5 = new java.util.LinkedHashMap();
	                        java.util.ArrayList v3_2 = new java.util.ArrayList();
	                        java.util.HashSet v4_1 = new java.util.HashSet();
	                    } catch (int v0_5) {
	                        v1_0 = v7;
	                    }
	                    while (v7.moveToNext()) {
	                        aav.b(new abd(v7, 0), 1, v2_5, v3_2, v4_1);
	                    }
	                    java.util.List v1_1 = aav.a(this.a, v2_5, v3_2);
	                    v6_1.values = new aax(v1_1, v2_5, v3_2, v4_1, this.a.a(v4_1));
	                    v6_1.count = v1_1.size();
	                }
	                if (v7 != null) {
	                    v7.close();
	                }
	                v0_12 = v6_1;
	            } else {
	                this.a.h = 0;
	                v0_12 = v6_1;
	            }
	        } else {
	            this.a.h = 0;
	            v0_12 = v6_1;
	        }
	        return v0_12;
	    }
	
	
	    protected final void publishResults(CharSequence p8, android.widget.Filter$FilterResults p9)
	    {
	        this.a.j = p8;
	        this.a.h = 0;
	        if (p9.values == null) {
	            this.a.a(java.util.Collections.emptyList());
	        } else {
	            int v1_8;
	            int v0_5 = ((aax) p9.values);
	            aav.a(this.a, v0_5.b);
	            aav.a(this.a, v0_5.c);
	            aav.a(this.a, v0_5.d);
	            int v2_3 = this.a;
	            aav v3_0 = v0_5.a.size();
	            if (v0_5.e != null) {
	                v1_8 = v0_5.e.size();
	            } else {
	                v1_8 = 0;
	            }
	            v2_3.a(v3_0, v1_8);
	            this.a.a(v0_5.a);
	            if (v0_5.e != null) {
	                int v2_7 = (this.a.c - v0_5.d.size());
	                aav v3_1 = this.a;
	                java.util.List v4 = v0_5.e;
	                int v5 = v4.size();
	                int v1_13 = 1;
	                while (v1_13 < v5) {
	                    int v0_10 = ((abb) v4.get(v1_13));
	                    if (v0_10.e == null) {
	                        v0_10.e = new aaz(v3_1, v0_10);
	                    }
	                    v0_10.e.a(v2_7);
	                    v0_10.e.filter(p8);
	                    v1_13++;
	                }
	                v3_1.i = (v5 - 1);
	                v3_1.l.a();
	            }
	        }
	        return;
	    }
	
