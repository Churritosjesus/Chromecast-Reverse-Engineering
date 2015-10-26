	public  e
	private final android.support.v7.widget.SearchView f
	private final android.app.SearchableInfo g
	private final android.content.Context h
	private final java.util.WeakHashMap i
	private final  j
	private  k
	private android.content.res.ColorStateList l
	private  m
	private  n
	private  o
	private  p
	private  q
	private  r
	
	    public aal(android.content.Context p5, android.support.v7.widget.SearchView p6, android.app.SearchableInfo p7, java.util.WeakHashMap p8)
	    {
	        this(p5, p6.c, 0, 1);
	        this.k = 0;
	        this.e = 1;
	        this.m = -1;
	        this.n = -1;
	        this.o = -1;
	        this.p = -1;
	        this.q = -1;
	        this.r = -1;
	        this.d.getSystemService("search");
	        this.f = p6;
	        this.g = p7;
	        this.j = p6.d;
	        this.h = p5;
	        this.i = p8;
	        return;
	    }
	
	
	    private android.graphics.drawable.Drawable a(android.content.ComponentName p6)
	    {
	        String v0 = 0;
	        String v1_1 = this.d.getPackageManager();
	        try {
	            String v2_1 = v1_1.getActivityInfo(p6, 128);
	            String v3_0 = v2_1.getIconResource();
	        } catch (String v1_2) {
	            android.util.Log.w("SuggestionsAdapter", v1_2.toString());
	            return v0;
	        }
	        if (v3_0 != null) {
	            String v1_4 = v1_1.getDrawable(p6.getPackageName(), v3_0, v2_1.applicationInfo);
	            if (v1_4 != null) {
	                v0 = v1_4;
	                return v0;
	            } else {
	                android.util.Log.w("SuggestionsAdapter", new StringBuilder("Invalid icon resource ").append(v3_0).append(" for ").append(p6.flattenToShortString()).toString());
	                return v0;
	            }
	        } else {
	            return v0;
	        }
	    }
	
	
	    private android.graphics.drawable.Drawable a(android.net.Uri p7)
	    {
	        try {
	            Throwable v0_5;
	            if (!"android.resource".equals(p7.getScheme())) {
	                java.io.IOException v2_1 = this.h.getContentResolver().openInputStream(p7);
	                if (v2_1 != null) {
	                    try {
	                        v0_5 = android.graphics.drawable.Drawable.createFromStream(v2_1, 0);
	                        try {
	                            v2_1.close();
	                        } catch (java.io.IOException v2_3) {
	                            android.util.Log.e("SuggestionsAdapter", new StringBuilder("Error closing icon stream for ").append(p7).toString(), v2_3);
	                        }
	                    } catch (Throwable v0_6) {
	                        try {
	                            v2_1.close();
	                        } catch (java.io.IOException v2_2) {
	                            android.util.Log.e("SuggestionsAdapter", new StringBuilder("Error closing icon stream for ").append(p7).toString(), v2_2);
	                        }
	                        throw v0_6;
	                    }
	                } else {
	                    throw new java.io.FileNotFoundException(new StringBuilder("Failed to open ").append(p7).toString());
	                }
	            } else {
	                try {
	                    v0_5 = this.b(p7);
	                } catch (Throwable v0) {
	                    throw new java.io.FileNotFoundException(new StringBuilder("Resource does not exist: ").append(p7).toString());
	                }
	            }
	        } catch (Throwable v0_11) {
	            android.util.Log.w("SuggestionsAdapter", new StringBuilder("Icon not found: ").append(p7).append(", ").append(v0_11.getMessage()).toString());
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    private android.graphics.drawable.Drawable a(String p5)
	    {
	        if ((p5 != null) && ((p5.length() != 0) && (!"0".equals(p5)))) {
	            try {
	                String v2_0 = Integer.parseInt(p5);
	                String v3_4 = new StringBuilder("android.resource://").append(this.h.getPackageName()).append("/").append(v2_0).toString();
	                android.graphics.drawable.Drawable v0_8 = this.b(v3_4);
	            } catch (android.graphics.drawable.Drawable v0) {
	                android.util.Log.w("SuggestionsAdapter", new StringBuilder("Icon resource not found: ").append(p5).toString());
	                v0_8 = 0;
	            } catch (android.graphics.drawable.Drawable v0) {
	                v0_8 = this.b(p5);
	                if (v0_8 == null) {
	                    v0_8 = this.a(android.net.Uri.parse(p5));
	                    this.a(p5, v0_8);
	                }
	            }
	            if (v0_8 == null) {
	                v0_8 = au.a(this.h, v2_0);
	                this.a(v3_4, v0_8);
	            }
	        } else {
	            v0_8 = 0;
	        }
	        return v0_8;
	    }
	
	
	    private static String a(android.database.Cursor p4, int p5)
	    {
	        String v0 = 0;
	        if (p5 != -1) {
	            try {
	                v0 = p4.getString(p5);
	            } catch (Exception v1_1) {
	                android.util.Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", v1_1);
	            }
	        }
	        return v0;
	    }
	
	
	    public static String a(android.database.Cursor p1, String p2)
	    {
	        return aal.a(p1, p1.getColumnIndex(p2));
	    }
	
	
	    private static void a(android.widget.ImageView p2, android.graphics.drawable.Drawable p3, int p4)
	    {
	        p2.setImageDrawable(p3);
	        if (p3 != null) {
	            p2.setVisibility(0);
	            p3.setVisible(0, 0);
	            p3.setVisible(1, 0);
	        } else {
	            p2.setVisibility(p4);
	        }
	        return;
	    }
	
	
	    private static void a(android.widget.TextView p1, CharSequence p2)
	    {
	        p1.setText(p2);
	        if (!android.text.TextUtils.isEmpty(p2)) {
	            p1.setVisibility(0);
	        } else {
	            p1.setVisibility(8);
	        }
	        return;
	    }
	
	
	    private void a(String p3, android.graphics.drawable.Drawable p4)
	    {
	        if (p4 != null) {
	            this.i.put(p3, p4.getConstantState());
	        }
	        return;
	    }
	
	
	    private android.graphics.drawable.Drawable b(android.net.Uri p8)
	    {
	        String v2_0 = p8.getAuthority();
	        if (!android.text.TextUtils.isEmpty(v2_0)) {
	            try {
	                android.content.res.Resources v3 = this.d.getPackageManager().getResourcesForApplication(v2_0);
	                String v1_0 = p8.getPathSegments();
	            } catch (android.graphics.drawable.Drawable v0) {
	                throw new java.io.FileNotFoundException(new StringBuilder("No package found for authority: ").append(p8).toString());
	            }
	            if (v1_0 != null) {
	                android.graphics.drawable.Drawable v0_10;
	                android.graphics.drawable.Drawable v0_5 = v1_0.size();
	                if (v0_5 != 1) {
	                    if (v0_5 != 2) {
	                        throw new java.io.FileNotFoundException(new StringBuilder("More than two path segments: ").append(p8).toString());
	                    } else {
	                        v0_10 = v3.getIdentifier(((String) v1_0.get(1)), ((String) v1_0.get(0)), v2_0);
	                    }
	                } else {
	                    try {
	                        v0_10 = Integer.parseInt(((String) v1_0.get(0)));
	                    } catch (android.graphics.drawable.Drawable v0) {
	                        throw new java.io.FileNotFoundException(new StringBuilder("Single path segment is not a resource ID: ").append(p8).toString());
	                    }
	                }
	                if (v0_10 != null) {
	                    return v3.getDrawable(v0_10);
	                } else {
	                    throw new java.io.FileNotFoundException(new StringBuilder("No resource found for: ").append(p8).toString());
	                }
	            } else {
	                throw new java.io.FileNotFoundException(new StringBuilder("No path: ").append(p8).toString());
	            }
	        } else {
	            throw new java.io.FileNotFoundException(new StringBuilder("No authority: ").append(p8).toString());
	        }
	    }
	
	
	    private android.graphics.drawable.Drawable b(String p2)
	    {
	        android.graphics.drawable.Drawable v0_3;
	        android.graphics.drawable.Drawable v0_2 = ((android.graphics.drawable.Drawable$ConstantState) this.i.get(p2));
	        if (v0_2 != null) {
	            v0_3 = v0_2.newDrawable();
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    private static void c(android.database.Cursor p2)
	    {
	        boolean v0_0;
	        if (p2 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = p2.getExtras();
	        }
	        // Both branches of the condition point to the same code.
	        // if ((v0_0) && (!v0_0.getBoolean("in_progress"))) {
	            return;
	        // }
	    }
	
	
	    public final android.database.Cursor a(CharSequence p8)
	    {
	        android.database.Cursor v0_0;
	        if (p8 != null) {
	            v0_0 = p8.toString();
	        } else {
	            v0_0 = "";
	        }
	        if ((this.f.getVisibility() == 0) && (this.f.getWindowVisibility() == 0)) {
	            try {
	                android.database.Cursor v0_4;
	                android.net.Uri v1_4 = this.g;
	            } catch (android.database.Cursor v0_5) {
	                android.util.Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", v0_5);
	                v0_4 = 0;
	            }
	            if (v1_4 != null) {
	                int v2_0 = v1_4.getSuggestAuthority();
	                if (v2_0 != 0) {
	                    int v2_3 = new android.net.Uri$Builder().scheme("content").authority(v2_0).query("").fragment("");
	                    String v3_5 = v1_4.getSuggestPath();
	                    if (v3_5 != null) {
	                        v2_3.appendEncodedPath(v3_5);
	                    }
	                    int v4_1;
	                    v2_3.appendPath("search_suggest_query");
	                    String v3_7 = v1_4.getSuggestSelection();
	                    if (v3_7 == null) {
	                        v2_3.appendPath(v0_0);
	                        v4_1 = 0;
	                    } else {
	                        v4_1 = new String[1];
	                        v4_1[0] = v0_0;
	                    }
	                    v2_3.appendQueryParameter("limit", "50");
	                    v0_4 = this.d.getContentResolver().query(v2_3.build(), 0, v3_7, v4_1, 0);
	                } else {
	                    v0_4 = 0;
	                }
	            } else {
	                v0_4 = 0;
	            }
	            if (v0_4 == null) {
	            } else {
	                v0_4.getCount();
	            }
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final android.view.View a(android.content.Context p4, android.database.Cursor p5, android.view.ViewGroup p6)
	    {
	        android.view.View v1 = super.a(p4, p5, p6);
	        v1.setTag(new aam(v1));
	        ((android.widget.ImageView) v1.findViewById(a.bf)).setImageResource(this.j);
	        return v1;
	    }
	
	
	    public final void a(android.database.Cursor p4)
	    {
	        try {
	            super.a(p4);
	        } catch (int v0_12) {
	            android.util.Log.e("SuggestionsAdapter", "error changing cursor and caching columns", v0_12);
	            return;
	        }
	        if (p4 == null) {
	            return;
	        } else {
	            this.m = p4.getColumnIndex("suggest_text_1");
	            this.n = p4.getColumnIndex("suggest_text_2");
	            this.o = p4.getColumnIndex("suggest_text_2_url");
	            this.p = p4.getColumnIndex("suggest_icon_1");
	            this.q = p4.getColumnIndex("suggest_icon_2");
	            this.r = p4.getColumnIndex("suggest_flags");
	            return;
	        }
	    }
	
	
	    public final void a(android.view.View p14, android.database.Cursor p15)
	    {
	        int v7;
	        int v1_0 = 0;
	        aam v6_1 = ((aam) p14.getTag());
	        if (this.r == -1) {
	            v7 = 0;
	        } else {
	            v7 = p15.getInt(this.r);
	        }
	        if (v6_1.a != null) {
	            aal.a(v6_1.a, aal.a(p15, this.m));
	        }
	        if (v6_1.b != null) {
	            android.graphics.drawable.Drawable v0_10;
	            String v9 = aal.a(p15, this.o);
	            if (v9 == null) {
	                v0_10 = aal.a(p15, this.n);
	            } else {
	                if (this.l == null) {
	                    android.graphics.drawable.Drawable v0_13 = new android.util.TypedValue();
	                    this.d.getTheme().resolveAttribute(a.R, v0_13, 1);
	                    this.l = this.d.getResources().getColorStateList(v0_13.resourceId);
	                }
	                java.util.WeakHashMap v8_1 = new android.text.SpannableString(v9);
	                v8_1.setSpan(new android.text.style.TextAppearanceSpan(0, 0, 0, this.l, 0), 0, v9.length(), 33);
	                v0_10 = v8_1;
	            }
	            if (!android.text.TextUtils.isEmpty(v0_10)) {
	                if (v6_1.a != null) {
	                    v6_1.a.setSingleLine(1);
	                    v6_1.a.setMaxLines(1);
	                }
	            } else {
	                if (v6_1.a != null) {
	                    v6_1.a.setSingleLine(0);
	                    v6_1.a.setMaxLines(2);
	                }
	            }
	            aal.a(v6_1.b, v0_10);
	        }
	        if (v6_1.c != null) {
	            android.graphics.drawable.Drawable v0_22;
	            int v4_3 = v6_1.c;
	            if (this.p != -1) {
	                v0_22 = this.a(p15.getString(this.p));
	                if (v0_22 == null) {
	                    android.graphics.drawable.Drawable v0_24 = this.g.getSearchActivity();
	                    String v5_1 = v0_24.flattenToShortString();
	                    if (!this.i.containsKey(v5_1)) {
	                        android.graphics.drawable.Drawable v0_25;
	                        android.content.res.Resources v3_17 = this.a(v0_24);
	                        if (v3_17 != null) {
	                            v0_25 = v3_17.getConstantState();
	                        } else {
	                            v0_25 = 0;
	                        }
	                        this.i.put(v5_1, v0_25);
	                        v0_22 = v3_17;
	                    } else {
	                        android.graphics.drawable.Drawable v0_28 = ((android.graphics.drawable.Drawable$ConstantState) this.i.get(v5_1));
	                        if (v0_28 != null) {
	                            v0_22 = v0_28.newDrawable(this.h.getResources());
	                        } else {
	                            v0_22 = 0;
	                        }
	                    }
	                    if (v0_22 == null) {
	                        v0_22 = this.d.getPackageManager().getDefaultActivityIcon();
	                    }
	                }
	            } else {
	                v0_22 = 0;
	            }
	            aal.a(v4_3, v0_22, 4);
	        }
	        if (v6_1.d != null) {
	            android.graphics.drawable.Drawable v0_32 = v6_1.d;
	            if (this.q != -1) {
	                v1_0 = this.a(p15.getString(this.q));
	            }
	            aal.a(v0_32, v1_0, 8);
	        }
	        if ((this.e != 2) && ((this.e != 1) || ((v7 & 1) == 0))) {
	            v6_1.e.setVisibility(8);
	        } else {
	            v6_1.e.setVisibility(0);
	            v6_1.e.setTag(v6_1.a.getText());
	            v6_1.e.setOnClickListener(this);
	        }
	        return;
	    }
	
	
	    public final CharSequence b(android.database.Cursor p3)
	    {
	        String v0 = 0;
	        if (p3 != null) {
	            String v1_1 = aal.a(p3, "suggest_intent_query");
	            if (v1_1 == null) {
	                if (this.g.shouldRewriteQueryFromData()) {
	                    String v1_5 = aal.a(p3, "suggest_intent_data");
	                    if (v1_5 != null) {
	                        v0 = v1_5;
	                        return v0;
	                    }
	                }
	                if (this.g.shouldRewriteQueryFromText()) {
	                    String v1_9 = aal.a(p3, "suggest_text_1");
	                    if (v1_9 != null) {
	                        v0 = v1_9;
	                    }
	                }
	            } else {
	                v0 = v1_1;
	            }
	        }
	        return v0;
	    }
	
	
	    public final android.view.View getView(int p4, android.view.View p5, android.view.ViewGroup p6)
	    {
	        try {
	            android.view.View v0_0 = super.getView(p4, p5, p6);
	        } catch (String v2_0) {
	            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", v2_0);
	            android.view.View v1_2 = this.a(this.d, this.c, p6);
	            if (v1_2 != null) {
	                ((aam) v1_2.getTag()).a.setText(v2_0.toString());
	            }
	            v0_0 = v1_2;
	        }
	        return v0_0;
	    }
	
	
	    public final boolean hasStableIds()
	    {
	        return 0;
	    }
	
	
	    public final void notifyDataSetChanged()
	    {
	        super.notifyDataSetChanged();
	        aal.c(this.c);
	        return;
	    }
	
	
	    public final void notifyDataSetInvalidated()
	    {
	        super.notifyDataSetInvalidated();
	        aal.c(this.c);
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        CharSequence v0_0 = p3.getTag();
	        if ((v0_0 instanceof CharSequence)) {
	            this.f.a(((CharSequence) v0_0));
	        }
	        return;
	    }
	
