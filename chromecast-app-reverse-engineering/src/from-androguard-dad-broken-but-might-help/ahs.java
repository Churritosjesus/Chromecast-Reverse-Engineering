	private static java.lang.Object b
	 java.util.HashMap a
	private android.content.Context c
	
	    static ahs()
	    {
	        ahs.b = new Object();
	        return;
	    }
	
	
	    private ahs(android.content.Context p2)
	    {
	        this.a = new java.util.HashMap();
	        this.c = p2;
	        return;
	    }
	
	
	    public static ahs a(android.content.Context p8)
	    {
	        try {
	            ahs v3_1 = new ahs(p8);
	            String v0_0 = 0;
	            try {
	                Throwable v1_1 = new java.io.ObjectInputStream(new java.io.BufferedInputStream(v3_1.c.openFileInput("AppEventsLogger.persistedevents")));
	            } catch (Throwable v1_2) {
	                v1_1 = 0;
	                String v0_1 = v1_2;
	                ahe.f();
	                String v0_6 = String.valueOf(v0_1.toString());
	                if (v0_6.length() == 0) {
	                    new String("Got unexpected exception: ");
	                } else {
	                    "Got unexpected exception: ".concat(v0_6);
	                }
	                aji.a(v1_1);
	                return v3_1;
	            } catch (Throwable v1_3) {
	                v1_1 = 0;
	                String v0_2 = v1_3;
	                aji.a(v1_1);
	                throw v0_2;
	            } catch (String v0_2) {
	            }
	            try {
	                String v0_4 = ((java.util.HashMap) v1_1.readObject());
	                v3_1.c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
	                v3_1.a = v0_4;
	            } catch (String v0) {
	                v0_0 = v1_1;
	                aji.a(v0_0);
	                return v3_1;
	            } catch (String v0_1) {
	            }
	            aji.a(v1_1);
	            return v3_1;
	        } catch (String v0_8) {
	            throw v0_8;
	        }
	    }
	
	
	    public static void a(android.content.Context p1, ahk p2, aht p3)
	    {
	        java.util.HashMap v0_1 = new java.util.HashMap();
	        v0_1.put(p2, p3);
	        ahs.a(p1, v0_1);
	        return;
	    }
	
	
	    private static void a(android.content.Context p8, java.util.Map p9)
	    {
	        try {
	            int v4_0 = ahs.a(p8);
	            String v2_0 = p9.entrySet().iterator();
	        } catch (String v0_16) {
	            throw v0_16;
	        }
	        while (v2_0.hasNext()) {
	            String v0_11 = ((java.util.Map$Entry) v2_0.next());
	            int v1_4 = ((aht) v0_11.getValue()).b();
	            if (v1_4.size() != 0) {
	                String v0_13 = ((ahk) v0_11.getKey());
	                if (!v4_0.a.containsKey(v0_13)) {
	                    v4_0.a.put(v0_13, new java.util.ArrayList());
	                }
	                ((java.util.List) v4_0.a.get(v0_13)).addAll(v1_4);
	            }
	        }
	        try {
	            int v1_1 = new java.io.ObjectOutputStream(new java.io.BufferedOutputStream(v4_0.c.openFileOutput("AppEventsLogger.persistedevents", 0)));
	        } catch (String v0_5) {
	            v1_1 = 0;
	            aji.a(v1_1);
	            throw v0_5;
	        } catch (String v0_5) {
	        } catch (String v0_4) {
	            v1_1 = 0;
	            ahe.f();
	            String v0_8 = String.valueOf(v0_4.toString());
	            if (v0_8.length() == 0) {
	                new String("Got unexpected exception: ");
	            } else {
	                "Got unexpected exception: ".concat(v0_8);
	            }
	            aji.a(v1_1);
	            return;
	        }
	        try {
	            v1_1.writeObject(v4_0.a);
	        } catch (String v0_4) {
	        }
	        aji.a(v1_1);
	        return;
	    }
	
