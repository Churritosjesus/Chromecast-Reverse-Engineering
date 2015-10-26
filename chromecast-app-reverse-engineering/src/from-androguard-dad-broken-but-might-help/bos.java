	private static final Lbfu d
	public boz a
	public android.widget.EditText b
	public final android.widget.CheckBox c
	private final android.content.Context e
	private final android.widget.Spinner f
	private final bfs g
	private final boq h
	private final android.view.View i
	private final android.view.View j
	private final android.widget.EditText k
	private final android.widget.Spinner l
	private final android.view.View m
	private java.lang.String n
	private  o
	private final android.text.TextWatcher p
	
	    static bos()
	    {
	        bfu[] v0_1 = new bfu[4];
	        v0_1[0] = bfu.b;
	        v0_1[1] = bfu.c;
	        v0_1[2] = bfu.f;
	        v0_1[3] = bfu.h;
	        bos.d = v0_1;
	        return;
	    }
	
	
	    public bos(android.view.ViewGroup p5)
	    {
	        this.o = -1;
	        this.p = new bot(this);
	        this.e = p5.getContext();
	        this.i = p5.findViewById(f.eD);
	        this.j = p5.findViewById(f.eI);
	        this.l = ((android.widget.Spinner) p5.findViewById(f.eH));
	        this.k = ((android.widget.EditText) p5.findViewById(f.eC));
	        this.i.setVisibility(8);
	        this.j.setVisibility(8);
	        this.k.addTextChangedListener(this.p);
	        android.widget.Spinner v0_18 = android.widget.ArrayAdapter.createFromResource(this.e, a.di, a.gJ);
	        v0_18.setDropDownViewResource(a.gL);
	        this.l.setAdapter(v0_18);
	        this.m = p5.findViewById(f.eG);
	        this.b = ((android.widget.EditText) p5.findViewById(f.eE));
	        this.b.addTextChangedListener(this.p);
	        this.c = ((android.widget.CheckBox) p5.findViewById(f.eF));
	        this.a(this.c.isChecked());
	        this.g = bos.b(this.e.getString(b.ek));
	        this.m.setVisibility(8);
	        this.b.addTextChangedListener(this.p);
	        this.c.setOnCheckedChangeListener(new boy(this));
	        this.l.setOnItemSelectedListener(new bou(this));
	        this.j.setOnClickListener(new bov(this));
	        p5.findViewById(f.ci).setOnClickListener(new bow(this));
	        this.f = ((android.widget.Spinner) p5.findViewById(f.ch));
	        this.h = new boq(this.e);
	        this.h.setDropDownViewResource(a.gL);
	        this.f.setAdapter(this.h);
	        this.f.setOnItemSelectedListener(new box(this));
	        return;
	    }
	
	
	    static synthetic String a(bos p1, String p2)
	    {
	        p1.n = 0;
	        return 0;
	    }
	
	
	    static synthetic void a(bos p1)
	    {
	        if (p1.a != null) {
	            p1.a.a();
	        }
	        return;
	    }
	
	
	    static synthetic void a(bos p0, boolean p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    private void a(boolean p5)
	    {
	        android.widget.EditText v0_2;
	        int v1_0 = this.b.getSelectionStart();
	        int v2 = this.b.getSelectionEnd();
	        android.widget.EditText v3_0 = this.b;
	        if (!p5) {
	            v0_2 = android.text.method.PasswordTransformationMethod.getInstance();
	        } else {
	            v0_2 = android.text.method.SingleLineTransformationMethod.getInstance();
	        }
	        android.widget.EditText v0_3;
	        v3_0.setTransformationMethod(v0_2);
	        if (!p5) {
	            v0_3 = 129;
	        } else {
	            v0_3 = 145;
	        }
	        this.b.setInputType(v0_3);
	        this.b.setSelection(v1_0, v2);
	        this.b.setHint(0);
	        return;
	    }
	
	
	    private static bfs b(String p2)
	    {
	        bfs v0_1 = new bfs();
	        v0_1.a = p2;
	        v0_1.b = bfu.a;
	        v0_1.g = 1;
	        return v0_1;
	    }
	
	
	    private void b()
	    {
	        int v0_5;
	        android.view.View v1_0 = 1;
	        int v2 = 0;
	        int v0_2 = ((bfs) this.f.getSelectedItem());
	        if (v0_2 != this.g) {
	            if ((v0_2 == 0) || (!v0_2.b.k)) {
	                v0_5 = 0;
	                v1_0 = 0;
	            } else {
	                v0_5 = 1;
	                v1_0 = 0;
	            }
	        } else {
	            if (!bos.d[this.l.getSelectedItemPosition()].k) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	        }
	        android.view.View v3_3;
	        if (v1_0 == null) {
	            v3_3 = 8;
	        } else {
	            v3_3 = 0;
	        }
	        android.view.View v1_1;
	        this.i.setVisibility(v3_3);
	        if (v1_0 == null) {
	            v1_1 = 8;
	        } else {
	            v1_1 = 0;
	        }
	        this.j.setVisibility(v1_1);
	        if (v0_5 == 0) {
	            v2 = 8;
	        }
	        this.m.setVisibility(v2);
	        return;
	    }
	
	
	    static synthetic void b(bos p0)
	    {
	        p0.b();
	        return;
	    }
	
	
	    static synthetic android.widget.Spinner c(bos p1)
	    {
	        return p1.l;
	    }
	
	
	    static synthetic android.widget.Spinner d(bos p1)
	    {
	        return p1.f;
	    }
	
	
	    static synthetic int e(bos p1)
	    {
	        return p1.o;
	    }
	
	
	    static synthetic String f(bos p1)
	    {
	        return p1.n;
	    }
	
	
	    public final bfs a()
	    {
	        bfs v0_3;
	        bfs v0_2 = ((bfs) this.f.getSelectedItem());
	        if (v0_2 != null) {
	            if (v0_2 != this.g) {
	                String v1_2 = new bfs(v0_2);
	                v1_2.i = 0;
	                v0_3 = v1_2;
	            } else {
	                v0_3 = bos.b(this.k.getText().toString().trim());
	            }
	            if (v0_3.b == bfu.a) {
	                v0_3.b = bos.d[this.l.getSelectedItemPosition()];
	            }
	            if (v0_3.b.k) {
	                v0_3.e = this.b.getText().toString();
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public final void a(String p2)
	    {
	        this.n = p2;
	        this.b.setHint(p2);
	        return;
	    }
	
	
	    public final void a(java.util.List p12, String p13, bfu p14, boolean p15)
	    {
	        int v3 = 0;
	        android.widget.Spinner v0_2 = ((bfs) this.f.getSelectedItem());
	        if (v0_2 != null) {
	            p13 = v0_2.a;
	        }
	        this.h.clear();
	        int v4_0 = blr.a(this.e, this.e.getResources().getStringArray(a.dh));
	        if (p12 != null) {
	            int v6_0 = p12.iterator();
	            while (v6_0.hasNext()) {
	                android.widget.Spinner v0_29 = ((bfs) v6_0.next());
	                bfu v1_7 = v0_29.a;
	                if ((v4_0.contains(v1_7)) || (android.text.TextUtils.equals(p13, v1_7))) {
	                    boq v7_1 = this.h;
	                    int v2_4 = 0;
	                    while (v2_4 < v7_1.getCount()) {
	                        bfu v1_11 = ((bfs) v7_1.getItem(v2_4));
	                        String v8_2 = android.net.wifi.WifiManager.compareSignalLevel(v1_11.h, v0_29.h);
	                        if ((v8_2 < null) || ((v8_2 == null) && (v1_11.a.compareToIgnoreCase(v0_29.a) > 0))) {
	                            break;
	                        }
	                        v2_4++;
	                    }
	                    v7_1.insert(v0_29, v2_4);
	                }
	            }
	        }
	        this.h.add(this.g);
	        this.o = -1;
	        if (!android.text.TextUtils.isEmpty(p13)) {
	            this.o = this.h.a(p13);
	            if (this.o == -1) {
	                boq v7_0 = p12.iterator();
	                bfu v1_4 = 0;
	                int v4_1 = 0;
	                while (v7_0.hasNext()) {
	                    android.widget.Spinner v0_26 = ((bfs) v7_0.next());
	                    String v8_0 = v0_26.a;
	                    int v6_2 = Math.min(p13.length(), v8_0.length());
	                    int v2_2 = 0;
	                    while (v2_2 < v6_2) {
	                        if (p13.charAt(v2_2) == v8_0.charAt(v2_2)) {
	                            v2_2++;
	                        }
	                        bfu v1_6;
	                        android.widget.Spinner v0_27;
	                        if (v2_2 <= v4_1) {
	                            v0_27 = v1_4;
	                            v1_6 = v4_1;
	                        } else {
	                            v0_27 = v0_26.a;
	                            v1_6 = v2_2;
	                        }
	                        v4_1 = v1_6;
	                        v1_4 = v0_27;
	                    }
	                    v2_2 = v6_2;
	                }
	                if (v4_1 < 5) {
	                    v1_4 = 0;
	                }
	                if (!p15) {
	                    if (v1_4 == null) {
	                        this.o = 0;
	                    } else {
	                        this.o = this.h.a(v1_4);
	                    }
	                } else {
	                    this.o = (this.h.getCount() - 1);
	                    this.k.setText(p13);
	                    while (v3 < bos.d.length) {
	                        if (bos.d[v3] != p14) {
	                            v3++;
	                        } else {
	                            this.l.setSelection(v3);
	                            break;
	                        }
	                    }
	                }
	            }
	            this.f.setSelection(this.o);
	        }
	        this.b();
	        return;
	    }
	
