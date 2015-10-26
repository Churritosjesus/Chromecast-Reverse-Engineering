	private static final java.util.Map g
	private final  a
	private  b
	private abz c
	private final java.lang.Long d
	private abj e
	private final android.graphics.drawable.StateListDrawable f
	
	    static aby()
	    {
	        aby.g = new java.util.HashMap();
	        return;
	    }
	
	
	    public aby(android.content.Context p13, long p14, Long p16, String p17, long p18, int p20, abz p21, abj p22, android.graphics.drawable.StateListDrawable p23, s p24)
	    {
	        String[] v4;
	        android.database.Cursor v3_2;
	        String v8;
	        if (p20 != 0) {
	            v4 = abt.a.a;
	            if (p17 != null) {
	                v3_2 = android.provider.ContactsContract$Contacts.getLookupUri(p14, p17).buildUpon().appendPath("entities").appendQueryParameter("directory", String.valueOf(p16)).build();
	                v8 = "vnd.android.cursor.item/phone_v2";
	            } else {
	                v3_2 = abt.a.c;
	                v8 = 0;
	            }
	        } else {
	            v4 = abt.b.a;
	            if ((p16 != null) && (p17 != null)) {
	                v3_2 = android.provider.ContactsContract$Contacts.getLookupUri(p14, p17).buildUpon().appendPath("entities").appendQueryParameter("directory", String.valueOf(p16)).build();
	                v8 = "vnd.android.cursor.item/email_v2";
	            } else {
	                v3_2 = abt.b.c;
	                v8 = 0;
	            }
	        }
	        int v2_22;
	        String v5_5 = new StringBuilder().append(v4[4]).append(" = ?").toString();
	        if (!abe.a(p13, p24)) {
	            v2_22 = new android.database.MatrixCursor(v4);
	        } else {
	            int v2_23 = p13.getContentResolver();
	            String[] v6_1 = new String[1];
	            v6_1[0] = String.valueOf(p14);
	            v2_22 = v2_23.query(v3_2, v4, v5_5, v6_1, 0);
	        }
	        android.database.Cursor v3_5 = aby.a(v2_22, v8, p17);
	        v2_22.close();
	        this(p13, v3_5, 0);
	        this.b = -1;
	        this.a = p18;
	        this.d = p16;
	        this.c = p21;
	        this.e = p22;
	        this.f = p23;
	        return;
	    }
	
	
	    static acx a(acx p2, acx p3)
	    {
	        if (p3 != null) {
	            if (p2 != null) {
	                if ((android.text.TextUtils.isEmpty(p2.c)) || (!android.text.TextUtils.isEmpty(p3.c))) {
	                    if ((android.text.TextUtils.isEmpty(p3.c)) || (!android.text.TextUtils.isEmpty(p2.c))) {
	                        if ((android.text.TextUtils.equals(p2.c, p2.d)) || (!android.text.TextUtils.equals(p3.c, p3.d))) {
	                            if ((android.text.TextUtils.equals(p3.c, p3.d)) || (!android.text.TextUtils.equals(p2.c, p2.d))) {
	                                if (((p2.j == null) && (p2.a() == null)) || ((p3.j != null) || (p3.a() != null))) {
	                                    // Both branches of the condition point to the same code.
	                                    // if (((p3.j != null) || (p3.a() != null)) && ((p2.j == null) && (p2.a() != null))) {
	                                    // }
	                                } else {
	                                    p3 = p2;
	                                }
	                            }
	                        } else {
	                            p3 = p2;
	                        }
	                    }
	                } else {
	                    p3 = p2;
	                }
	            }
	        } else {
	            p3 = p2;
	        }
	        return p3;
	    }
	
	
	    private static android.database.Cursor a(android.database.Cursor p11, String p12, String p13)
	    {
	        android.database.MatrixCursor v5_1 = new android.database.MatrixCursor(p11.getColumnNames(), p11.getCount());
	        java.util.HashSet v6_1 = new java.util.HashSet();
	        p11.moveToPosition(-1);
	        while (p11.moveToNext()) {
	            if ("vnd.android.cursor.item/name".equals(p11.getString(9))) {
	                String v3_2 = p11.getString(0);
	                String v2_1 = p11.getString(6);
	                int v1_2 = p11.getInt(7);
	            }
	            p11.moveToPosition(-1);
	            while (p11.moveToNext()) {
	                if ((p12 == null) || (p12.equals(p11.getString(9)))) {
	                    int v0_12 = p11.getString(1);
	                    if (!v6_1.contains(v0_12)) {
	                        v6_1.add(v0_12);
	                        Object[] v7 = new Object[10];
	                        v7[0] = p11.getString(0);
	                        v7[1] = p11.getString(1);
	                        v7[2] = Integer.valueOf(p11.getInt(2));
	                        v7[3] = p11.getString(3);
	                        v7[4] = Long.valueOf(p11.getLong(4));
	                        v7[5] = Long.valueOf(p11.getLong(5));
	                        v7[6] = p11.getString(6);
	                        v7[7] = Integer.valueOf(p11.getInt(7));
	                        v7[8] = p11.getString(8);
	                        v7[9] = p11.getString(9);
	                        if (v7[0] == null) {
	                            v7[0] = v3_2;
	                        }
	                        if (v7[6] == null) {
	                            v7[6] = v2_1;
	                        }
	                        if (((Integer) v7[7]).intValue() == 0) {
	                            v7[7] = Integer.valueOf(v1_2);
	                        }
	                        if (v7[8] == null) {
	                            v7[8] = p13;
	                        }
	                        int v0_40 = ((String) v7[6]);
	                        if (v0_40 != 0) {
	                            if (!aby.g.containsKey(v0_40)) {
	                                if (v0_40.indexOf(63) != v0_40.lastIndexOf(63)) {
	                                    java.util.Map v8_4 = v0_40.split("\\?");
	                                    StringBuilder v9_1 = new StringBuilder();
	                                    int v4_30 = 0;
	                                    while (v4_30 < v8_4.length) {
	                                        if (v4_30 != 1) {
	                                            if (v4_30 > 1) {
	                                                v9_1.append("&");
	                                            }
	                                        } else {
	                                            v9_1.append("?");
	                                        }
	                                        v9_1.append(v8_4[v4_30]);
	                                        v4_30++;
	                                    }
	                                    int v4_31 = v9_1.toString();
	                                    aby.g.put(v0_40, v4_31);
	                                    v7[6] = v4_31;
	                                }
	                            } else {
	                                v7[6] = aby.g.get(v0_40);
	                            }
	                        }
	                        v5_1.addRow(v7);
	                    }
	                }
	            }
	            return v5_1;
	        }
	        v3_2 = 0;
	        v2_1 = 0;
	        v1_2 = 0;
	    }
	
	
	    private static java.util.HashMap a(android.database.Cursor p15, Long p16)
	    {
	        java.util.HashMap v13_1 = new java.util.HashMap();
	        if ((p15 != null) && (p15.moveToFirst())) {
	            do {
	                String v14 = p15.getString(1);
	                v13_1.put(v14, aby.a(((acx) v13_1.get(v14)), acx.a(p15.getString(0), p15.getInt(7), p15.getString(1), p15.getInt(2), p15.getString(3), p15.getLong(4), p16, p15.getLong(5), p15.getString(6), 1, p15.getString(8))));
	                if (android.util.Log.isLoggable("RecipAlternates", 3)) {
	                    boolean v0_11 = String.valueOf(p15.getString(0));
	                    String v2_2 = p15.getLong(4);
	                    String v1_7 = String.valueOf(p15.getString(1));
	                    new StringBuilder((((String.valueOf(v14).length() + 103) + String.valueOf(v0_11).length()) + String.valueOf(v1_7).length())).append("Received reverse look up information for ").append(v14).append(" RESULTS:  NAME : ").append(v0_11).append(" CONTACT ID : ").append(v2_2).append(" ADDRESS :").append(v1_7);
	                }
	            } while(p15.moveToNext());
	        }
	        return v13_1;
	    }
	
	
	    public static void a(android.content.Context p13, aav p14, java.util.ArrayList p15, android.accounts.Account p16, aca p17, s p18)
	    {
	        s v8_0 = abt.b;
	        java.util.HashSet v3_0 = Math.min(50, p15.size());
	        java.util.HashSet v9_1 = new java.util.HashSet();
	        android.accounts.Account v4_1 = new StringBuilder();
	        int v2_1 = 0;
	        while (v2_1 < v3_0) {
	            android.content.Context v1_16;
	            android.content.Context v1_14 = android.text.util.Rfc822Tokenizer.tokenize(((String) p15.get(v2_1)).toLowerCase());
	            if (v1_14.length <= 0) {
	                v1_16 = ((String) p15.get(v2_1));
	            } else {
	                v1_16 = v1_14[0].getAddress();
	            }
	            v9_1.add(v1_16);
	            v4_1.append("?");
	            if (v2_1 < (v3_0 - 1)) {
	                v4_1.append(",");
	            }
	            v2_1++;
	        }
	        if (android.util.Log.isLoggable("RecipAlternates", 3)) {
	            int v2_4 = String.valueOf(v9_1.toString());
	            if (v2_4.length() == 0) {
	                new String("Doing reverse lookup for ");
	            } else {
	                "Doing reverse lookup for ".concat(v2_4);
	            }
	        }
	        java.util.HashSet v5_0 = new String[v9_1.size()];
	        v9_1.toArray(v5_0);
	        try {
	            java.util.HashSet v3_2;
	            if (!abe.a(p13, p18)) {
	                v3_2 = 0;
	                try {
	                    int v2_8 = aby.a(v3_2, 0);
	                    p17.a(v2_8);
	                } catch (android.content.Context v1_7) {
	                    int v2_6 = v3_2;
	                }
	                if (v3_2 != null) {
	                    v3_2.close();
	                }
	                java.util.HashSet v5_2 = new java.util.HashSet();
	                aby.a(p13, v2_8, v9_1, p16, v5_2, v8_0, p17, p18);
	                p17.a(v5_2);
	                return;
	            } else {
	                android.content.Context v1_8 = p13.getContentResolver();
	                int v2_7 = v8_0.c;
	                java.util.HashSet v3_3 = v8_0.a;
	                abw v6_1 = v8_0.a[1];
	                android.accounts.Account v4_3 = String.valueOf(v4_1.toString());
	                v3_2 = v1_8.query(v2_7, v3_3, new StringBuilder(((String.valueOf(v6_1).length() + 6) + String.valueOf(v4_3).length())).append(v6_1).append(" IN (").append(v4_3).append(")").toString(), v5_0, 0);
	            }
	        } catch (android.content.Context v1_7) {
	            v2_6 = 0;
	        }
	        if (v2_6 != 0) {
	            v2_6.close();
	        }
	        throw v1_7;
	    }
	
	
	    private static void a(android.content.Context p16, java.util.Map p17, java.util.Set p18, android.accounts.Account p19, java.util.Set p20, abw p21, aca p22, s p23)
	    {
	        if (p17.size() < p18.size()) {
	            int v9_1 = new java.util.HashSet();
	            int v3_1 = p18.iterator();
	            while (v3_1.hasNext()) {
	                String v2_25 = ((String) v3_1.next());
	                if (!p17.containsKey(v2_25)) {
	                    v9_1.add(v2_25);
	                }
	            }
	            p20.addAll(v9_1);
	            try {
	                int v3_2;
	                if (!abe.a(p16, p23)) {
	                    v3_2 = 0;
	                    if (v3_2 != 0) {
	                        try {
	                            java.util.List v11 = aav.a(p16, v3_2, p19);
	                        } catch (String v2_3) {
	                        }
	                        if (v3_2 != 0) {
	                            v3_2.close();
	                        }
	                        int v3_4 = 0;
	                        java.util.Iterator v12 = v9_1.iterator();
	                        while (v12.hasNext()) {
	                            String v8_2 = ((String) v12.next());
	                            int v9_2 = 0;
	                            boolean v10 = v3_4;
	                            while (v9_2 < v11.size()) {
	                                long v14 = ((abb) v11.get(v9_2)).a;
	                                try {
	                                    String v2_11 = Long.valueOf(v14);
	                                } catch (String v2_15) {
	                                    if (v10) {
	                                        v10.close();
	                                    }
	                                    throw v2_15;
	                                }
	                                if (abe.a(p16, p23)) {
	                                    int v3_9 = p21.b.buildUpon().appendPath(v8_2.toString()).appendQueryParameter("limit", "6");
	                                    if (v2_11 != null) {
	                                        v3_9.appendQueryParameter("directory", String.valueOf(v2_11));
	                                    }
	                                    if (p19 != null) {
	                                        v3_9.appendQueryParameter("name_for_primary_account", p19.name);
	                                        v3_9.appendQueryParameter("type_for_primary_account", p19.type);
	                                    }
	                                    v3_4 = p16.getContentResolver().query(v3_9.build(), p21.a, 0, 0, 0);
	                                } else {
	                                    v3_4 = 0;
	                                }
	                                try {
	                                    if ((v3_4 == 0) || (v3_4.getCount() == 0)) {
	                                        String v2_18;
	                                        if (v3_4 == 0) {
	                                            v2_18 = v3_4;
	                                        } else {
	                                            v3_4.close();
	                                            v2_18 = 0;
	                                        }
	                                        v9_2++;
	                                        v10 = v2_18;
	                                    } else {
	                                        java.util.HashMap v4_7 = aby.a(v3_4, Long.valueOf(v14));
	                                        java.util.Iterator v5_3 = v4_7.keySet().iterator();
	                                        while (v5_3.hasNext()) {
	                                            p20.remove(((String) v5_3.next()));
	                                        }
	                                        p22.a(v4_7);
	                                        if (v3_4 != 0) {
	                                            v3_4.close();
	                                            v3_4 = 0;
	                                        }
	                                    }
	                                    return;
	                                } catch (String v2_15) {
	                                    v10 = v3_4;
	                                }
	                            }
	                            v3_4 = v10;
	                        }
	                        return;
	                    } else {
	                        if (v3_2 != 0) {
	                            v3_2.close();
	                        }
	                        return;
	                    }
	                } else {
	                    v3_2 = p16.getContentResolver().query(aba.a, aba.b, 0, 0, 0);
	                }
	            } catch (String v2_3) {
	                v3_2 = 0;
	            }
	            if (v3_2 != 0) {
	                v3_2.close();
	            }
	            throw v2_3;
	        }
	        return;
	    }
	
	
	    public final acx a(int p15)
	    {
	        String v12_0 = this.getCursor();
	        v12_0.moveToPosition(p15);
	        return acx.a(v12_0.getString(0), v12_0.getInt(7), v12_0.getString(1), v12_0.getInt(2), v12_0.getString(3), v12_0.getLong(4), this.d, v12_0.getLong(5), v12_0.getString(6), 1, v12_0.getString(8));
	    }
	
	
	    public final void bindView(android.view.View p9, android.content.Context p10, android.database.Cursor p11)
	    {
	        int v4 = p11.getPosition();
	        this.e.a(p9, 0, this.a(v4), v4, abn.b, 0, this.f);
	        return;
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        long v0_0 = this.getCursor();
	        if (v0_0.moveToPosition(p3)) {
	            v0_0.getLong(5);
	        }
	        return -1;
	    }
	
	
	    public final android.view.View getView(int p7, android.view.View p8, android.view.ViewGroup p9)
	    {
	        android.database.Cursor v0 = this.getCursor();
	        v0.moveToPosition(p7);
	        if (p8 == null) {
	            p8 = this.e.a(abn.b);
	        }
	        if (v0.getLong(5) == this.a) {
	            this.b = p7;
	            if (this.c != null) {
	                this.c.a(this.b);
	            }
	        }
	        this.bindView(p8, p8.getContext(), v0);
	        return p8;
	    }
	
	
	    public final android.view.View newView(android.content.Context p3, android.database.Cursor p4, android.view.ViewGroup p5)
	    {
	        return this.e.a(abn.b);
	    }
	
