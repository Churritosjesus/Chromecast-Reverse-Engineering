	 abo a
	 abp b
	 abw c
	private final android.view.LayoutInflater d
	private final android.content.Context e
	private  f
	
	    public abj(android.view.LayoutInflater p3, android.content.Context p4)
	    {
	        this.d = p3;
	        this.e = p4;
	        this.f = p4.getResources().getDimensionPixelOffset(a.cC);
	        return;
	    }
	
	
	    private static void a(android.view.View p0, int p1)
	    {
	        if (p0 != null) {
	            p0.setVisibility(p1);
	        }
	        return;
	    }
	
	
	    private static void a(CharSequence p1, android.widget.TextView p2)
	    {
	        if (p2 != null) {
	            if (p1 == null) {
	                p2.setVisibility(8);
	            } else {
	                p2.setText(p1);
	                p2.setVisibility(0);
	            }
	        }
	        return;
	    }
	
	
	    protected static int b(int p2)
	    {
	        int v0_2;
	        switch (abm.a[(p2 - 1)]) {
	            case 1:
	                v0_2 = a.cN;
	                break;
	            case 2:
	                v0_2 = a.cO;
	                break;
	            default:
	                v0_2 = a.cO;
	        }
	        return v0_2;
	    }
	
	
	    private static int c(int p2)
	    {
	        int v0_2;
	        switch (abm.a[(p2 - 1)]) {
	            case 1:
	                v0_2 = a.cN;
	                break;
	            case 2:
	                v0_2 = a.cO;
	                break;
	            default:
	                v0_2 = a.cO;
	        }
	        return v0_2;
	    }
	
	
	    public final android.view.View a(int p4)
	    {
	        return this.d.inflate(abj.c(p4), 0);
	    }
	
	
	    public final android.view.View a(android.view.View p11, android.view.ViewGroup p12, acx p13, int p14, int p15, String p16, android.graphics.drawable.StateListDrawable p17)
	    {
	        android.view.ViewGroup$MarginLayoutParams v1_5;
	        int v2_0 = new String[2];
	        v2_0[0] = p13.c;
	        v2_0[1] = p13.d;
	        if (android.text.TextUtils.isEmpty(p16)) {
	            v1_5 = 1;
	        } else {
	            android.view.ViewGroup$MarginLayoutParams v1_4 = 0;
	            while (v1_4 < p16.length()) {
	                if (Character.isWhitespace(p16.charAt(v1_4))) {
	                    v1_4++;
	                } else {
	                    v1_5 = 0;
	                }
	            }
	        }
	        android.view.ViewGroup$MarginLayoutParams v1_9;
	        if (v1_5 == null) {
	            int v3_5 = new CharSequence[2];
	            android.view.ViewGroup$MarginLayoutParams v1_8 = 0;
	            int v4_1 = 0;
	            while (v4_1 < 2) {
	                int v5_1 = v2_0[v4_1];
	                if (v5_1 != 0) {
	                    if (v1_8 == null) {
	                        int v6_1 = v5_1.toLowerCase().indexOf(p16.toLowerCase());
	                        if (v6_1 != -1) {
	                            android.view.ViewGroup$MarginLayoutParams v1_10 = android.text.SpannableStringBuilder.valueOf(v5_1);
	                            v1_10.setSpan(new android.text.style.ForegroundColorSpan(this.e.getResources().getColor(a.cw)), v6_1, (p16.length() + v6_1), 33);
	                            v3_5[v4_1] = v1_10;
	                            v1_8 = 1;
	                            v4_1++;
	                        }
	                    }
	                    v3_5[v4_1] = v5_1;
	                }
	            }
	            v1_9 = v3_5;
	        } else {
	            v1_9 = v2_0;
	        }
	        int v2_2 = v1_9[0];
	        android.view.ViewGroup$MarginLayoutParams v1_11 = v1_9[1];
	        int v3_7 = 1;
	        int v5_6 = this.c.a(this.e.getResources(), p13.e, p13.f).toString().toUpperCase();
	        int v4_5 = abj.c(p15);
	        switch (abm.a[(p15 - 1)]) {
	            case 1:
	            case 2:
	            default:
	                break;
	            case 1:
	            case 2:
	                break;
	            case 3:
	                v4_5 = abj.b(p15);
	                break;
	        }
	        if (p11 == null) {
	            p11 = this.d.inflate(v4_5, p12, 0);
	        }
	        android.view.ViewGroup$MarginLayoutParams v1_15;
	        int v2_3;
	        int v4_10;
	        int v6_7 = new abq(this, p11);
	        switch (abm.a[(p15 - 1)]) {
	            case 1:
	                if ((!android.text.TextUtils.isEmpty(v2_2)) && (!android.text.TextUtils.equals(v2_2, v1_11))) {
	                    String v9_2 = v1_11;
	                    v1_11 = v2_2;
	                    v2_3 = v9_2;
	                } else {
	                    if (!p13.b) {
	                        v2_3 = v1_11;
	                    } else {
	                        v2_3 = 0;
	                    }
	                }
	                if (p13.b) {
	                    v4_10 = v1_11;
	                } else {
	                    v4_10 = 0;
	                    v3_7 = 0;
	                }
	                if (v6_7.h != null) {
	                    android.view.ViewGroup$MarginLayoutParams v1_18;
	                    if (p14 != 0) {
	                        v1_18 = 8;
	                    } else {
	                        v1_18 = 0;
	                    }
	                    v6_7.h.setVisibility(v1_18);
	                    ft.a(((android.view.ViewGroup$MarginLayoutParams) v6_7.h.getLayoutParams()), this.f);
	                }
	                if (v6_7.i == null) {
	                    v1_15 = v5_6;
	                } else {
	                    ft.a(((android.view.ViewGroup$MarginLayoutParams) v6_7.i.getLayoutParams()), this.f);
	                    v1_15 = v5_6;
	                }
	                break;
	            case 2:
	                if (p14 == 0) {
	                    v4_10 = v2_2;
	                    v2_3 = v1_11;
	                    v1_15 = v5_6;
	                } else {
	                    v3_7 = 0;
	                    v4_10 = 0;
	                    v2_3 = v1_11;
	                    v1_15 = v5_6;
	                }
	                break;
	            case 3:
	                v1_15 = 0;
	                v4_10 = v2_2;
	                v2_3 = android.text.util.Rfc822Tokenizer.tokenize(p13.d)[0].getAddress();
	                break;
	            default:
	        }
	        abj.a(v4_10, v6_7.b);
	        abj.a(v2_3, v6_7.c);
	        abj.a(v1_15, v6_7.d);
	        android.view.ViewGroup$MarginLayoutParams v1_26 = v6_7.f;
	        if (v1_26 != null) {
	            if (v3_7 == 0) {
	                v1_26.setVisibility(8);
	            } else {
	                switch (abm.a[(p15 - 1)]) {
	                    case 1:
	                        int v2_12 = p13.a();
	                        if ((v2_12 == 0) || (v2_12.length <= 0)) {
	                            v1_26.setImageResource(a.cF);
	                        } else {
	                            v1_26.setImageBitmap(android.graphics.BitmapFactory.decodeByteArray(v2_12, 0, v2_12.length));
	                        }
	                        break;
	                    case 2:
	                        int v2_10 = p13.j;
	                        if (v2_10 == 0) {
	                            v1_26.setImageResource(a.cF);
	                        } else {
	                            v1_26.setImageURI(v2_10);
	                        }
	                        break;
	                }
	                v1_26.setVisibility(0);
	            }
	        }
	        android.view.ViewGroup$MarginLayoutParams v1_27 = p13.c;
	        int v2_16 = v6_7.g;
	        if (v2_16 != 0) {
	            if (p17 != null) {
	                int v3_13 = this.e.getResources();
	                v2_16.setImageDrawable(p17);
	                int v5_9 = new Object[1];
	                v5_9[0] = v1_27;
	                v2_16.setContentDescription(v3_13.getString(a.cU, v5_9));
	                if (this.a != null) {
	                    v2_16.setOnClickListener(new abk(this, p17));
	                }
	            } else {
	                v2_16.setVisibility(8);
	            }
	        }
	        int v2_17 = v6_7.e;
	        if (v2_17 != 0) {
	            if (0 != 0) {
	                v2_17.setText(0);
	                v2_17.setVisibility(0);
	                v2_17.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
	            } else {
	                v2_17.setVisibility(8);
	            }
	        }
	        android.view.ViewGroup$MarginLayoutParams v1_37 = v6_7.l;
	        if (v1_37 != null) {
	            v1_37.setOnClickListener(new abl(this));
	        }
	        android.view.ViewGroup$MarginLayoutParams v1_38 = p13.a;
	        if (v1_38 != null) {
	            if (v1_38 == 1) {
	                abj.a(v6_7.a, 8);
	                abj.a(v6_7.k, 0);
	                abj.a(v6_7.j, 0);
	            }
	        } else {
	            abj.a(v6_7.a, 0);
	            abj.a(v6_7.k, 8);
	            abj.a(v6_7.j, 8);
	        }
	        return p11;
	    }
	
