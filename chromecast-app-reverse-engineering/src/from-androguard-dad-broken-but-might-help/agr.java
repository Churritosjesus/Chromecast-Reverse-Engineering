	private static final java.lang.String a
	private java.lang.String b
	private android.content.SharedPreferences c
	
	    static agr()
	    {
	        agr.a = agr.getSimpleName();
	        return;
	    }
	
	
	    public agr(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private agr(android.content.Context p3, String p4)
	    {
	        android.content.SharedPreferences v0_0 = 0;
	        ajp.a(p3, "context");
	        if (aji.a(0)) {
	            v0_0 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
	        }
	        this.b = v0_0;
	        android.content.SharedPreferences v0_1 = p3.getApplicationContext();
	        if (v0_1 != null) {
	            p3 = v0_1;
	        }
	        this.c = p3.getSharedPreferences(this.b, 0);
	        return;
	    }
	
	
	    static java.util.Date a(android.os.Bundle p6, String p7)
	    {
	        java.util.Date v0_0 = 0;
	        if (p6 != null) {
	            long v2 = p6.getLong(p7, -0.0);
	            if (v2 != -0.0) {
	                v0_0 = new java.util.Date(v2);
	            }
	        }
	        return v0_0;
	    }
	
	
	    private void a(String p8, android.os.Bundle p9)
	    {
	        int v0_0 = 0;
	        org.json.JSONArray v2_2 = new org.json.JSONObject(this.c.getString(p8, "{}"));
	        int v1_3 = v2_2.getString("valueType");
	        if (!v1_3.equals("bool")) {
	            if (!v1_3.equals("bool[]")) {
	                if (!v1_3.equals("byte")) {
	                    if (!v1_3.equals("byte[]")) {
	                        if (!v1_3.equals("short")) {
	                            if (!v1_3.equals("short[]")) {
	                                if (!v1_3.equals("int")) {
	                                    if (!v1_3.equals("int[]")) {
	                                        if (!v1_3.equals("long")) {
	                                            if (!v1_3.equals("long[]")) {
	                                                if (!v1_3.equals("float")) {
	                                                    if (!v1_3.equals("float[]")) {
	                                                        if (!v1_3.equals("double")) {
	                                                            if (!v1_3.equals("double[]")) {
	                                                                if (!v1_3.equals("char")) {
	                                                                    if (!v1_3.equals("char[]")) {
	                                                                        if (!v1_3.equals("string")) {
	                                                                            if (!v1_3.equals("stringList")) {
	                                                                                if (v1_3.equals("enum")) {
	                                                                                    try {
	                                                                                        p9.putSerializable(p8, Enum.valueOf(Class.forName(v2_2.getString("enumType")), v2_2.getString("value")));
	                                                                                    } catch (int v0) {
	                                                                                    } catch (int v0) {
	                                                                                    }
	                                                                                }
	                                                                            } else {
	                                                                                org.json.JSONArray v2_3 = v2_2.getJSONArray("value");
	                                                                                int v3_36 = v2_3.length();
	                                                                                char v4_1 = new java.util.ArrayList(v3_36);
	                                                                                int v1_7 = 0;
	                                                                                while (v1_7 < v3_36) {
	                                                                                    int v0_8;
	                                                                                    int v0_7 = v2_3.get(v1_7);
	                                                                                    if (v0_7 != org.json.JSONObject.NULL) {
	                                                                                        v0_8 = ((String) v0_7);
	                                                                                    } else {
	                                                                                        v0_8 = 0;
	                                                                                    }
	                                                                                    v4_1.add(v1_7, v0_8);
	                                                                                    v1_7++;
	                                                                                }
	                                                                                p9.putStringArrayList(p8, v4_1);
	                                                                            }
	                                                                        } else {
	                                                                            p9.putString(p8, v2_2.getString("value"));
	                                                                        }
	                                                                    } else {
	                                                                        org.json.JSONArray v2_4 = v2_2.getJSONArray("value");
	                                                                        int v3_37 = new char[v2_4.length()];
	                                                                        int v1_10 = 0;
	                                                                        while (v1_10 < v3_37.length) {
	                                                                            char v4_3 = v2_4.getString(v1_10);
	                                                                            if ((v4_3 != 0) && (v4_3.length() == 1)) {
	                                                                                v3_37[v1_10] = v4_3.charAt(0);
	                                                                            }
	                                                                            v1_10++;
	                                                                        }
	                                                                        p9.putCharArray(p8, v3_37);
	                                                                    }
	                                                                } else {
	                                                                    int v1_12 = v2_2.getString("value");
	                                                                    if ((v1_12 != 0) && (v1_12.length() == 1)) {
	                                                                        p9.putChar(p8, v1_12.charAt(0));
	                                                                    }
	                                                                }
	                                                            } else {
	                                                                int v1_14 = v2_2.getJSONArray("value");
	                                                                org.json.JSONArray v2_7 = new double[v1_14.length()];
	                                                                while (v0_0 < v2_7.length) {
	                                                                    v2_7[v0_0] = v1_14.getDouble(v0_0);
	                                                                    v0_0++;
	                                                                }
	                                                                p9.putDoubleArray(p8, v2_7);
	                                                            }
	                                                        } else {
	                                                            p9.putDouble(p8, v2_2.getDouble("value"));
	                                                        }
	                                                    } else {
	                                                        int v1_16 = v2_2.getJSONArray("value");
	                                                        org.json.JSONArray v2_9 = new float[v1_16.length()];
	                                                        while (v0_0 < v2_9.length) {
	                                                            v2_9[v0_0] = ((float) v1_16.getDouble(v0_0));
	                                                            v0_0++;
	                                                        }
	                                                        p9.putFloatArray(p8, v2_9);
	                                                    }
	                                                } else {
	                                                    p9.putFloat(p8, ((float) v2_2.getDouble("value")));
	                                                }
	                                            } else {
	                                                int v1_18 = v2_2.getJSONArray("value");
	                                                org.json.JSONArray v2_11 = new long[v1_18.length()];
	                                                while (v0_0 < v2_11.length) {
	                                                    v2_11[v0_0] = v1_18.getLong(v0_0);
	                                                    v0_0++;
	                                                }
	                                                p9.putLongArray(p8, v2_11);
	                                            }
	                                        } else {
	                                            p9.putLong(p8, v2_2.getLong("value"));
	                                        }
	                                    } else {
	                                        int v1_20 = v2_2.getJSONArray("value");
	                                        org.json.JSONArray v2_13 = new int[v1_20.length()];
	                                        while (v0_0 < v2_13.length) {
	                                            v2_13[v0_0] = v1_20.getInt(v0_0);
	                                            v0_0++;
	                                        }
	                                        p9.putIntArray(p8, v2_13);
	                                    }
	                                } else {
	                                    p9.putInt(p8, v2_2.getInt("value"));
	                                }
	                            } else {
	                                int v1_22 = v2_2.getJSONArray("value");
	                                org.json.JSONArray v2_15 = new short[v1_22.length()];
	                                while (v0_0 < v2_15.length) {
	                                    v2_15[v0_0] = ((short) v1_22.getInt(v0_0));
	                                    v0_0++;
	                                }
	                                p9.putShortArray(p8, v2_15);
	                            }
	                        } else {
	                            p9.putShort(p8, ((short) v2_2.getInt("value")));
	                        }
	                    } else {
	                        int v1_24 = v2_2.getJSONArray("value");
	                        org.json.JSONArray v2_17 = new byte[v1_24.length()];
	                        while (v0_0 < v2_17.length) {
	                            v2_17[v0_0] = ((byte) v1_24.getInt(v0_0));
	                            v0_0++;
	                        }
	                        p9.putByteArray(p8, v2_17);
	                    }
	                } else {
	                    p9.putByte(p8, ((byte) v2_2.getInt("value")));
	                }
	            } else {
	                int v1_26 = v2_2.getJSONArray("value");
	                org.json.JSONArray v2_19 = new boolean[v1_26.length()];
	                while (v0_0 < v2_19.length) {
	                    v2_19[v0_0] = v1_26.getBoolean(v0_0);
	                    v0_0++;
	                }
	                p9.putBooleanArray(p8, v2_19);
	            }
	        } else {
	            p9.putBoolean(p8, v2_2.getBoolean("value"));
	        }
	        return;
	    }
	
	
	    public static boolean a(android.os.Bundle p6)
	    {
	        int v0 = 0;
	        if (p6 != null) {
	            long v1_1 = p6.getString("com.facebook.TokenCachingStrategy.Token");
	            if ((v1_1 != 0) && ((v1_1.length() != 0) && (p6.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) != 0))) {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public static String b(android.os.Bundle p1)
	    {
	        ajp.a(p1, "bundle");
	        return p1.getString("com.facebook.TokenCachingStrategy.Token");
	    }
	
	
	    public static afl c(android.os.Bundle p1)
	    {
	        afl v0_5;
	        ajp.a(p1, "bundle");
	        if (!p1.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
	            if (!p1.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
	                v0_5 = afl.c;
	            } else {
	                v0_5 = afl.a;
	            }
	        } else {
	            v0_5 = ((afl) p1.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource"));
	        }
	        return v0_5;
	    }
	
	
	    public static String d(android.os.Bundle p1)
	    {
	        ajp.a(p1, "bundle");
	        return p1.getString("com.facebook.TokenCachingStrategy.ApplicationId");
	    }
	
	
	    public final android.os.Bundle a()
	    {
	        String v1_1 = new android.os.Bundle();
	        ags v2_0 = this.c.getAll().keySet().iterator();
	        while (v2_0.hasNext()) {
	            int v0_6 = ((String) v2_0.next());
	            try {
	                this.a(v0_6, v1_1);
	            } catch (String v1_2) {
	                String v1_3 = String.valueOf(v1_2);
	                aiw.a(ags.d, 5, agr.a, new StringBuilder(((String.valueOf(v0_6).length() + 42) + String.valueOf(v1_3).length())).append("Error reading cached value for key: \'").append(v0_6).append("\' -- ").append(v1_3).toString());
	                int v0_4 = 0;
	                return v0_4;
	            }
	        }
	        v0_4 = v1_1;
	        return v0_4;
	    }
	
	
	    public final void b()
	    {
	        this.c.edit().clear().apply();
	        return;
	    }
	
