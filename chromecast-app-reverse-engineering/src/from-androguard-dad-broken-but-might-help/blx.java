	private static blp a
	
	    static blx()
	    {
	        blx.a = new blp("Util", 0);
	        return;
	    }
	
	
	    public static int a(android.app.Activity p2)
	    {
	        int v0_1 = new android.util.DisplayMetrics();
	        p2.getWindowManager().getDefaultDisplay().getMetrics(v0_1);
	        return v0_1.widthPixels;
	    }
	
	
	    public static varargs android.view.View a(android.content.Context p2, int p3, String p4, String[] p5)
	    {
	        android.view.View v1_1 = ((android.view.LayoutInflater) p2.getSystemService("layout_inflater")).inflate(p3, 0);
	        android.widget.TextView v0_5 = ((android.widget.TextView) v1_1.findViewById(f.bY));
	        v0_5.setText(p4);
	        blx.a(v0_5, p5);
	        return v1_1;
	    }
	
	
	    public static varargs android.view.View a(android.content.Context p1, String p2, String[] p3)
	    {
	        return blx.a(p1, a.fm, p2, p3);
	    }
	
	
	    public static dax a(String[] p3)
	    {
	        dax v0_1 = new dax();
	        v0_1.d = blj.c();
	        v0_1.a = Integer.valueOf(1);
	        v0_1.c = 1;
	        v0_1.b = p3;
	        return v0_1;
	    }
	
	
	    public static String a(android.content.Context p4)
	    {
	        Object[] v1_1 = new Object[1];
	        v1_1[0] = blj.b();
	        return p4.getString(b.cS, v1_1);
	    }
	
	
	    public static String a(android.content.Context p2, bdf p3)
	    {
	        String v0_3;
	        switch (bmf.a[(p3.b() - 1)]) {
	            case 1:
	                v0_3 = p2.getString(b.bd);
	                break;
	            default:
	                v0_3 = p2.getString(b.bc);
	        }
	        return v0_3;
	    }
	
	
	    public static String a(String p4)
	    {
	        if (!android.text.TextUtils.isEmpty(p4)) {
	            if (p4.length() != 1) {
	                StringBuilder v0_3 = Character.toTitleCase(p4.charAt(0));
	                String v1_2 = String.valueOf(p4.substring(1));
	                p4 = new StringBuilder((String.valueOf(v1_2).length() + 1)).append(v0_3).append(v1_2).toString();
	            } else {
	                p4 = Character.toString(Character.toTitleCase(p4.charAt(0)));
	            }
	        }
	        return p4;
	    }
	
	
	    public static java.util.Set a(android.content.Context p8, daz p9)
	    {
	        int v0_1 = p8.getPackageManager().getInstalledApplications(128);
	        java.util.HashSet v1_2 = new java.util.HashSet(v0_1.size());
	        java.util.HashSet v2_1 = v0_1.iterator();
	        while (v2_1.hasNext()) {
	            v1_2.add(((android.content.pm.ApplicationInfo) v2_1.next()).packageName.toLowerCase(java.util.Locale.US));
	        }
	        java.util.HashSet v2_3 = new java.util.HashSet();
	        dba[] v3_0 = p9.f;
	        int v4 = v3_0.length;
	        int v0_3 = 0;
	        while (v0_3 < v4) {
	            String v5_0 = v3_0[v0_3];
	            if (v1_2.contains(v5_0.b.toLowerCase(java.util.Locale.US))) {
	                v2_3.add(v5_0.a);
	            }
	            v0_3++;
	        }
	        return v2_3;
	    }
	
	
	    public static void a(android.app.Activity p5, android.content.DialogInterface$OnClickListener p6)
	    {
	        if (!p5.isFinishing()) {
	            android.app.AlertDialog v0_5;
	            blz v1_1 = new blz(p6);
	            if (android.os.Build$VERSION.SDK_INT >= blf.S(p5)) {
	                v0_5 = new android.app.AlertDialog$Builder(p5).setMessage(b.dU).setTitle(b.dV).setCancelable(1).setNegativeButton(b.dT, p6).setPositiveButton(b.dS, new bmb(p5)).create();
	            } else {
	                v0_5 = new android.app.AlertDialog$Builder(p5).setMessage(b.ce).setCancelable(1).setNegativeButton(b.bn, new bma(p5)).setPositiveButton(b.I, p6).create();
	            }
	            v0_5.setOnDismissListener(v1_1);
	            v0_5.show();
	        }
	        return;
	    }
	
	
	    public static void a(android.app.Activity p9, android.support.v7.widget.SearchView p10, android.view.View p11, android.view.View$OnFocusChangeListener p12)
	    {
	        int v0_2 = ((android.app.SearchManager) p9.getSystemService("search"));
	        p10.a(0);
	        p10.l = v0_2.getSearchableInfo(p9.getComponentName());
	        if (p10.l != null) {
	            if (android.support.v7.widget.SearchView.a) {
	                p10.b.setThreshold(p10.l.getSuggestThreshold());
	                p10.b.setImeOptions(p10.l.getImeOptions());
	                int v0_9 = p10.l.getInputType();
	                if ((v0_9 & 15) == 1) {
	                    v0_9 &= -65537;
	                    if (p10.l.getSuggestAuthority() != null) {
	                        v0_9 = ((v0_9 | 65536) | 524288);
	                    }
	                }
	                p10.b.setInputType(v0_9);
	                if (p10.j != null) {
	                    p10.j.a(0);
	                }
	                if (p10.l.getSuggestAuthority() != null) {
	                    p10.j = new aal(p10.getContext(), p10, p10.l, p10.n);
	                    p10.b.setAdapter(p10.j);
	                    ((aal) p10.j).e = 1;
	                }
	            }
	            p10.c();
	        }
	        int v0_27;
	        if (!android.support.v7.widget.SearchView.a) {
	            v0_27 = 0;
	        } else {
	            if ((p10.l == null) || (!p10.l.getVoiceSearchEnabled())) {
	                int v0_25 = 0;
	            } else {
	                int v0_24 = 0;
	                if (!p10.l.getVoiceSearchLaunchWebSearch()) {
	                    if (p10.l.getVoiceSearchLaunchRecognizer()) {
	                        v0_24 = p10.f;
	                    }
	                } else {
	                    v0_24 = p10.e;
	                }
	                if (v0_24 == 0) {
	                } else {
	                    if (p10.getContext().getPackageManager().resolveActivity(v0_24, 65536) == null) {
	                        v0_25 = 0;
	                    } else {
	                        v0_25 = 1;
	                    }
	                }
	            }
	            if (v0_25 == 0) {
	            } else {
	                v0_27 = 1;
	            }
	        }
	        p10.k = v0_27;
	        if (p10.k) {
	            p10.b.setPrivateImeOptions("nm");
	        }
	        p10.b(p10.i);
	        android.widget.TextView v1_2 = p10.findViewById(a.bn);
	        int v0_33 = ((android.widget.LinearLayout$LayoutParams) v1_2.getLayoutParams());
	        v0_33.leftMargin = 0;
	        v0_33.rightMargin = 0;
	        v0_33.topMargin = 0;
	        v0_33.bottomMargin = 0;
	        v0_33.height = -1;
	        v0_33.width = -1;
	        v1_2.setLayoutParams(v0_33);
	        android.widget.TextView v1_5 = ((android.widget.TextView) p10.findViewById(a.br));
	        v1_5.setTextColor(p9.getResources().getColor(a.dp));
	        v1_5.setLayoutParams(v0_33);
	        v1_5.setPadding(0, 0, 0, 0);
	        v1_5.setTextSize(2, 1096810496);
	        v1_5.setImeOptions(3);
	        ((android.widget.ImageView) p10.findViewById(a.bp)).setLayoutParams(new android.widget.LinearLayout$LayoutParams(0, 0));
	        int v0_40 = ((android.widget.ImageView) p10.findViewById(a.bm));
	        v0_40.setImageResource(a.eD);
	        v0_40.setPadding(p9.getResources().getDimensionPixelSize(a.dZ), 0, p9.getResources().getDimensionPixelSize(a.dZ), 0);
	        ((android.widget.ImageView) p10.findViewById(a.bs)).setImageResource(a.eG);
	        android.content.pm.PackageManager v3_29 = p10.findViewById(a.bq);
	        int v0_46 = ((android.widget.LinearLayout$LayoutParams) v3_29.getLayoutParams());
	        v0_46.height = -1;
	        v3_29.setLayoutParams(v0_46);
	        v3_29.setBackgroundColor(0);
	        p10.findViewById(a.bv).setBackgroundColor(0);
	        p9.getWindow().setSoftInputMode(3);
	        v1_5.setOnFocusChangeListener(new bmc(p11, p12, p9, v1_5));
	        p11.setOnClickListener(new bmd(v1_5));
	        v1_5.clearFocus();
	        return;
	    }
	
	
	    private static void a(android.app.Activity p3, String p4)
	    {
	        android.content.Intent v0_1 = new Object[1];
	        v0_1[0] = p4;
	        android.net.Uri v1_1 = p3.getApplication().getPackageManager();
	        android.content.Intent v0_4 = new android.content.Intent("android.intent.action.VIEW");
	        v0_4.setData(android.net.Uri.parse(p4));
	        v0_4.setPackage("com.android.vending");
	        if (v0_4.resolveActivity(v1_1) == null) {
	            v0_4 = new android.content.Intent("android.intent.action.VIEW");
	            v0_4.setData(android.net.Uri.parse(p4));
	        }
	        p3.startActivity(v0_4);
	        return;
	    }
	
	
	    public static void a(android.content.Context p1, String p2)
	    {
	        blx.a(p1, p2, 0);
	        return;
	    }
	
	
	    public static void a(android.content.Context p5, String p6, String p7)
	    {
	        android.widget.Toast v0_0 = p5.getPackageManager();
	        int v1_1 = new android.content.Intent("android.intent.action.CAST", android.net.Uri.parse(p6));
	        v1_1.addFlags(268435456);
	        v1_1.putExtra("source", "com.google.android.apps.chromecast.app");
	        if ((!blx.a(p5, v1_1, p7)) && (!blx.a(p5, v1_1.setAction("android.intent.action.VIEW"), p7))) {
	            android.widget.Toast v0_1 = v0_0.getLaunchIntentForPackage(p6);
	            if (v0_1 == null) {
	                android.widget.Toast.makeText(p5, b.bD, 0).show();
	            } else {
	                v0_1.addFlags(268435456);
	                p5.startActivity(v0_1);
	            }
	        }
	        return;
	    }
	
	
	    public static void a(android.view.View p1, int p2)
	    {
	        blx.a(p1, p1.getContext().getString(p2));
	        return;
	    }
	
	
	    public static void a(android.view.View p1, CharSequence p2)
	    {
	        if (p1 != null) {
	            if (!android.text.TextUtils.isEmpty(p2)) {
	                ((android.widget.TextView) p1).setText(p2);
	                p1.setVisibility(0);
	            } else {
	                p1.setVisibility(8);
	            }
	        }
	        return;
	    }
	
	
	    public static void a(android.widget.TextView p1, String p2, String p3, apd p4)
	    {
	        blx.a(p1, p2, p3, 0, p4);
	        return;
	    }
	
	
	    public static void a(android.widget.TextView p1, String p2, String p3, String p4, apd p5)
	    {
	        if ((!android.text.TextUtils.isEmpty(p3)) && (!android.text.TextUtils.isEmpty(p2))) {
	            p1.setVisibility(0);
	            p1.setText(p2);
	            p1.setOnClickListener(new bme(p3, p4, p5));
	        } else {
	            p1.setVisibility(8);
	        }
	        return;
	    }
	
	
	    public static varargs void a(android.widget.TextView p10, String[] p11)
	    {
	        int v0_0 = 0;
	        while (v0_0 < (p11.length - 1)) {
	            int v3_0 = p11[v0_0];
	            String v4 = p11[(v0_0 + 1)];
	            p10.setLinksClickable(1);
	            p10.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
	            android.text.SpannableString v5 = android.text.SpannableString.valueOf(p10.getText());
	            java.util.regex.Matcher v2_5 = 0;
	            while ((v2_5 < v3_0.length()) && (Character.getType(v3_0.charAt(0)) == 16)) {
	                v2_5++;
	            }
	            java.util.regex.Matcher v2_6;
	            if (v2_5 <= null) {
	                v2_6 = v3_0;
	            } else {
	                v2_6 = v3_0.substring(v2_5);
	            }
	            java.util.regex.Matcher v2_8 = java.util.regex.Pattern.compile(v2_6, 2).matcher(v5);
	            while (v2_8.find()) {
	                v5.setSpan(new bly(v4, 0), v2_8.start(), v2_8.end(), 33);
	            }
	            v0_0 += 2;
	        }
	        p10.setAutoLinkMask(1);
	        p10.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
	        return;
	    }
	
	
	    public static boolean a()
	    {
	        return 0;
	    }
	
	
	    public static boolean a(int p2)
	    {
	        if ((p2 != 82) || ((!"LGE".equalsIgnoreCase(android.os.Build.MANUFACTURER)) || (android.os.Build$VERSION.SDK_INT != 16))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public static boolean a(int p2, m p3)
	    {
	        if ((p2 != 82) || ((!"LGE".equalsIgnoreCase(android.os.Build.MANUFACTURER)) || (android.os.Build$VERSION.SDK_INT != 16))) {
	            int v0_4 = 0;
	        } else {
	            p3.openOptionsMenu();
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    private static boolean a(android.content.Context p4, android.content.Intent p5, String p6)
	    {
	        int v0 = 1;
	        android.content.pm.ResolveInfo v1_0 = p4.getPackageManager();
	        if (android.text.TextUtils.isEmpty(p6)) {
	            p5.setPackage(0);
	            if (v1_0.resolveActivity(p5, 65536) == null) {
	                v0 = 0;
	            } else {
	                p4.startActivity(p5);
	            }
	        } else {
	            p5.setPackage(p6);
	            if (v1_0.resolveActivity(p5, 65536) == null) {
	            } else {
	                p4.startActivity(p5);
	            }
	        }
	        return v0;
	    }
	
	
	    public static int b(android.app.Activity p2)
	    {
	        int v0_1 = new android.util.DisplayMetrics();
	        p2.getWindowManager().getDefaultDisplay().getMetrics(v0_1);
	        return Math.min(v0_1.widthPixels, v0_1.heightPixels);
	    }
	
	
	    public static String b(android.content.Context p4)
	    {
	        Object[] v1_1 = new Object[1];
	        v1_1[0] = blj.b();
	        return p4.getString(b.dK, v1_1);
	    }
	
	
	    public static String b(android.content.Context p2, bdf p3)
	    {
	        String v0_3;
	        switch (bmf.a[(p3.b() - 1)]) {
	            case 1:
	                v0_3 = p2.getString(b.bf);
	                break;
	            default:
	                v0_3 = p2.getString(b.bh);
	        }
	        return v0_3;
	    }
	
	
	    public static int c(android.app.Activity p4)
	    {
	        int v0 = 1;
	        int v1_2 = p4.getWindowManager().getDefaultDisplay().getRotation();
	        int v2_2 = p4.getResources().getConfiguration().orientation;
	        if (v2_2 != 1) {
	            if (v2_2 != 2) {
	                v0 = -1;
	            } else {
	                if ((v1_2 != 0) && (v1_2 != 1)) {
	                    v0 = 8;
	                } else {
	                    v0 = 0;
	                }
	            }
	        } else {
	            if ((v1_2 != 0) && (v1_2 != 3)) {
	                v0 = 9;
	            }
	        }
	        return v0;
	    }
	
	
	    public static void d(android.app.Activity p3)
	    {
	        ape.a().a(15, Integer.valueOf(2));
	        android.content.Intent v0_2 = new android.content.Intent("android.intent.action.VIEW");
	        v0_2.addFlags(268435456);
	        v0_2.setData(android.net.Uri.parse(blf.h(p3)));
	        p3.startActivity(v0_2);
	        return;
	    }
	
	
	    public static void e(android.app.Activity p1)
	    {
	        blx.a(p1, p1.getString(b.ay));
	        return;
	    }
	
	
	    public static void f(android.app.Activity p3)
	    {
	        ape.a().a(15, Integer.valueOf(0));
	        blx.a(p3, blf.W(p3));
	        return;
	    }
	
	
	    public static void g(android.app.Activity p4)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 21) {
	            p4.getWindow().clearFlags(67108864);
	            int v0_3 = new android.util.TypedValue();
	            p4.getTheme().resolveAttribute(a.dj, v0_3, 1);
	            p4.getWindow().setStatusBarColor(v0_3.data);
	        }
	        return;
	    }
	
	
	    public static void h(android.app.Activity p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 21) {
	            p3.getWindow().setFlags(67108864, 67108864);
	        }
	        return;
	    }
	
