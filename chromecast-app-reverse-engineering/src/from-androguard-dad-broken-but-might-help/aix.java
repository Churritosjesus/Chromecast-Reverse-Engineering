	private static final ajb a
	private static java.util.List b
	private static java.util.concurrent.atomic.AtomicBoolean c
	private static final java.util.List d
	
	    static aix()
	    {
	        aix.a = new aiz();
	        java.util.List v0_3 = new java.util.ArrayList();
	        v0_3.add(aix.a);
	        v0_3.add(new ajc());
	        aix.b = v0_3;
	        java.util.List v0_5 = new java.util.HashMap();
	        int v1_4 = new java.util.ArrayList();
	        v1_4.add(new aja());
	        v0_5.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", aix.b);
	        v0_5.put("com.facebook.platform.action.request.FEED_DIALOG", aix.b);
	        v0_5.put("com.facebook.platform.action.request.LIKE_DIALOG", aix.b);
	        v0_5.put("com.facebook.platform.action.request.APPINVITES_DIALOG", aix.b);
	        v0_5.put("com.facebook.platform.action.request.MESSAGE_DIALOG", v1_4);
	        v0_5.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", v1_4);
	        aix.c = new java.util.concurrent.atomic.AtomicBoolean(0);
	        java.util.List v0_9 = new Integer[11];
	        v0_9[0] = Integer.valueOf(20141218);
	        v0_9[1] = Integer.valueOf(20141107);
	        v0_9[2] = Integer.valueOf(20141028);
	        v0_9[3] = Integer.valueOf(20141001);
	        v0_9[4] = Integer.valueOf(20140701);
	        v0_9[5] = Integer.valueOf(20140324);
	        v0_9[6] = Integer.valueOf(20140204);
	        v0_9[7] = Integer.valueOf(20131107);
	        v0_9[8] = Integer.valueOf(20130618);
	        v0_9[9] = Integer.valueOf(20130502);
	        v0_9[10] = Integer.valueOf(20121101);
	        aix.d = java.util.Arrays.asList(v0_9);
	        return;
	    }
	
	
	    public static final int a()
	    {
	        return ((Integer) aix.d.get(0)).intValue();
	    }
	
	
	    public static int a(int p10)
	    {
	        int v2 = -1;
	        int v0_0 = aix.b;
	        int[] v4 = new int[1];
	        v4[0] = p10;
	        aix.b();
	        if (v0_0 != 0) {
	            java.util.Iterator v5 = v0_0.iterator();
	            while (v5.hasNext()) {
	                int v0_3 = ((ajb) v5.next());
	                if (v0_3.a == null) {
	                    v0_3.a(0);
	                }
	                int v1_2 = v0_3.a;
	                int v6 = aix.a();
	                int v0_5 = (v4.length - 1);
	                java.util.Iterator v7 = v1_2.descendingIterator();
	                int v1_3 = -1;
	                int v3_0 = v0_5;
	                while (v7.hasNext()) {
	                    int v8 = ((Integer) v7.next()).intValue();
	                    int v0_9 = Math.max(v1_3, v8);
	                    int v1_4 = v3_0;
	                    while ((v1_4 >= 0) && (v4[v1_4] > v8)) {
	                        v1_4--;
	                    }
	                    if (v1_4 < 0) {
	                        break;
	                    }
	                    if (v4[v1_4] != v8) {
	                        v3_0 = v1_4;
	                        v1_3 = v0_9;
	                    } else {
	                        if ((v1_4 % 2) != 0) {
	                            int v0_10 = -1;
	                        } else {
	                            v0_10 = Math.min(v0_9, v6);
	                        }
	                    }
	                    if (v0_10 != -1) {
	                        v2 = v0_10;
	                    }
	                }
	                v0_10 = -1;
	            }
	        }
	        return v2;
	    }
	
	
	    public static afq a(android.os.Bundle p3)
	    {
	        afr v0_5;
	        if (p3 != null) {
	            afr v0_1 = p3.getString("error_type");
	            if (v0_1 == null) {
	                v0_1 = p3.getString("com.facebook.platform.status.ERROR_TYPE");
	            }
	            String v1_1 = p3.getString("error_description");
	            if (v1_1 == null) {
	                v1_1 = p3.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
	            }
	            if ((v0_1 == null) || (!v0_1.equalsIgnoreCase("UserCanceled"))) {
	                v0_5 = new afq(v1_1);
	            } else {
	                v0_5 = new afr(v1_1);
	            }
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p5)
	    {
	        java.util.Iterator v2 = aix.b.iterator();
	        while (v2.hasNext()) {
	            int v0_2 = new android.content.Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((ajb) v2.next()).a()).addCategory("android.intent.category.DEFAULT");
	            if (v0_2 != 0) {
	                boolean v3_4 = p5.getPackageManager().resolveService(v0_2, 0);
	                if (v3_4) {
	                    if (!ajb.a(p5, v3_4.serviceInfo.packageName)) {
	                        v0_2 = 0;
	                    }
	                } else {
	                    v0_2 = 0;
	                }
	            } else {
	                v0_2 = 0;
	            }
	            if (v0_2 != 0) {
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p5, String p6, java.util.Collection p7, String p8, boolean p9, boolean p10, ajy p11)
	    {
	        java.util.Iterator v2 = aix.b.iterator();
	        while (v2.hasNext()) {
	            int v0_2 = new android.content.Intent().setClassName(((ajb) v2.next()).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", p6);
	            if (!aji.a(p7)) {
	                v0_2.putExtra("scope", android.text.TextUtils.join(",", p7));
	            }
	            if (!aji.a(p8)) {
	                v0_2.putExtra("e2e", p8);
	            }
	            v0_2.putExtra("response_type", "token,signed_request");
	            v0_2.putExtra("return_scopes", "true");
	            if (p10) {
	                v0_2.putExtra("default_audience", p11.b);
	            }
	            v0_2.putExtra("legacy_override", "v2.4");
	            if (p9) {
	                v0_2.putExtra("auth_type", "rerequest");
	            }
	            if (v0_2 != 0) {
	                boolean v3_13 = p5.getPackageManager().resolveActivity(v0_2, 0);
	                if (v3_13) {
	                    if (!ajb.a(p5, v3_13.activityInfo.packageName)) {
	                        v0_2 = 0;
	                    }
	                } else {
	                    v0_2 = 0;
	                }
	            } else {
	                v0_2 = 0;
	            }
	            if (v0_2 != 0) {
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    public static android.content.Intent a(android.content.Intent p6, android.os.Bundle p7, afq p8)
	    {
	        android.content.Intent v0_0 = 0;
	        String v2_0 = aix.b(p6);
	        if (v2_0 != null) {
	            android.content.Intent v1_1 = new android.content.Intent();
	            v1_1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", p6.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
	            android.os.Bundle v3_2 = new android.os.Bundle();
	            v3_2.putString("action_id", v2_0.toString());
	            if (p8 != null) {
	                if (p8 != null) {
	                    v0_0 = new android.os.Bundle();
	                    v0_0.putString("error_description", p8.toString());
	                    if ((p8 instanceof afr)) {
	                        v0_0.putString("error_type", "UserCanceled");
	                    }
	                }
	                v3_2.putBundle("error", v0_0);
	            }
	            v1_1.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", v3_2);
	            if (p7 != null) {
	                v1_1.putExtra("com.facebook.platform.protocol.RESULT_ARGS", p7);
	            }
	            v0_0 = v1_1;
	        }
	        return v0_0;
	    }
	
	
	    public static android.os.Bundle a(android.content.Intent p2)
	    {
	        android.os.Bundle v0_4;
	        if (aix.b(p2.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
	            v0_4 = p2.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
	        } else {
	            v0_4 = p2.getExtras();
	        }
	        return v0_4;
	    }
	
	
	    static synthetic java.util.TreeSet a(ajb p1)
	    {
	        return aix.b(p1);
	    }
	
	
	    private static java.util.TreeSet b(ajb p10)
	    {
	        int v6 = 0;
	        java.util.TreeSet v7_1 = new java.util.TreeSet();
	        Throwable v0_1 = afv.f().getContentResolver();
	        String[] v2 = new String[1];
	        v2[0] = "version";
	        Integer v1_3 = String.valueOf("content://");
	        int v3_1 = p10.a();
	        int v4_1 = String.valueOf(".provider.PlatformProvider/versions");
	        Integer v1_8 = android.net.Uri.parse(new StringBuilder((((String.valueOf(v1_3).length() + 0) + String.valueOf(v3_1).length()) + String.valueOf(v4_1).length())).append(v1_3).append(v3_1).append(v4_1).toString());
	        try {
	            int v3_7;
	            int v4_2 = afv.f().getPackageManager();
	            int v5_2 = String.valueOf(p10.a());
	            int v3_5 = String.valueOf(".provider.PlatformProvider");
	        } catch (Throwable v0_2) {
	            if (v6 != 0) {
	                v6.close();
	            }
	            throw v0_2;
	        }
	        if (v3_5.length() == 0) {
	            v3_7 = new String(v5_2);
	        } else {
	            v3_7 = v5_2.concat(v3_5);
	        }
	        Throwable v0_3;
	        if (v4_2.resolveContentProvider(v3_7, 0) == null) {
	            v0_3 = 0;
	        } else {
	            v0_3 = v0_1.query(v1_8, v2, 0, 0, 0);
	            if (v0_3 == null) {
	                if (v0_3 != null) {
	                    v0_3.close();
	                }
	                return v7_1;
	            }
	            try {
	                while (v0_3.moveToNext()) {
	                    v7_1.add(Integer.valueOf(v0_3.getInt(v0_3.getColumnIndex("version"))));
	                }
	            } catch (Integer v1_10) {
	                v6 = v0_3;
	                v0_2 = v1_10;
	            }
	        }
	    }
	
	
	    private static java.util.UUID b(android.content.Intent p3)
	    {
	        java.util.UUID v1 = 0;
	        if (p3 != null) {
	            IllegalArgumentException v0_4;
	            if (!aix.b(p3.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
	                v0_4 = p3.getStringExtra("com.facebook.platform.protocol.CALL_ID");
	            } else {
	                IllegalArgumentException v0_6 = p3.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
	                if (v0_6 == null) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = v0_6.getString("action_id");
	                }
	            }
	            if (v0_4 != null) {
	                try {
	                    v1 = java.util.UUID.fromString(v0_4);
	                } catch (IllegalArgumentException v0) {
	                }
	            }
	        }
	        return v1;
	    }
	
	
	    public static void b()
	    {
	        if (aix.c.compareAndSet(0, 1)) {
	            afv.d().execute(new aiy());
	        }
	        return;
	    }
	
	
	    private static boolean b(int p2)
	    {
	        if ((!aix.d.contains(Integer.valueOf(p2))) || (p2 < 20140701)) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    static synthetic java.util.List c()
	    {
	        return aix.b;
	    }
	
	
	    static synthetic java.util.concurrent.atomic.AtomicBoolean d()
	    {
	        return aix.c;
	    }
	
