	private synthetic java.util.List a
	private synthetic java.util.List b
	private synthetic act c
	
	    acv(act p1, java.util.List p2, java.util.List p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        android.text.SpannableStringBuilder v5_1 = new android.text.SpannableStringBuilder(this.c.a.getText());
	        java.util.Iterator v6 = this.a.iterator();
	        int v2 = 0;
	        while (v6.hasNext()) {
	            java.util.List v0_8 = ((ada) v6.next());
	            ada v1_2 = ((ada) this.b.get(v2));
	            if (v1_2 != null) {
	                int v4_2;
	                int v4_0 = v0_8.g();
	                int v7_0 = v1_2.g();
	                if (aby.a(v4_0, v7_0) != v7_0) {
	                    v4_2 = 0;
	                } else {
	                    v4_2 = 1;
	                }
	                if (v4_2 != 0) {
	                    int v4_3 = v5_1.getSpanStart(v0_8);
	                    if (v4_3 != -1) {
	                        int v7_4 = Math.min((v5_1.getSpanEnd(v0_8) + 1), v5_1.length());
	                        v5_1.removeSpan(v0_8);
	                        java.util.List v0_10 = new android.text.SpannableString(String.valueOf(this.c.a.a(v1_2.g()).trim()).concat(" "));
	                        v0_10.setSpan(v1_2, 0, (v0_10.length() - 1), 33);
	                        v5_1.replace(v4_3, v7_4, v0_10);
	                        v1_2.a(v0_10.toString());
	                        this.b.set(v2, 0);
	                        this.a.set(v2, v1_2);
	                    }
	                }
	            }
	            v2++;
	        }
	        this.c.a.setText(v5_1);
	        return;
	    }
	
