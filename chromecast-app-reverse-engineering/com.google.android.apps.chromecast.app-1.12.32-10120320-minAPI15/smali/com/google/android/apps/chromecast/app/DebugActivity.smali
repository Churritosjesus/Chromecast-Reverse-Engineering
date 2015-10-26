.class public Lcom/google/android/apps/chromecast/app/DebugActivity;
.super Lmm;
.source "PG"

# interfaces
.implements Lbaq;


# instance fields
.field private e:Lbah;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lmm;-><init>()V

    .line 303
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 40
    invoke-static {p0, p1}, Lcom/google/android/apps/chromecast/app/DebugActivity;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/DebugActivity;)V
    .locals 2

    .prologue
    .line 5346
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    .line 6067
    iget-object v0, v0, Lbkh;->g:Lbke;

    .line 6219
    iget-object v0, v0, Lbke;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 6221
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 6220
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 6222
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "IGNORED_ANNOUNCEMENT_CARDS"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 40
    return-void
.end method

.method private static b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 337
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 338
    aget-object v1, p1, v0

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 342
    :goto_1
    return v0

    .line 337
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 342
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method


# virtual methods
.method public final b_()Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 357
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 352
    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->d()V

    .line 223
    :goto_0
    return-void

    .line 221
    :cond_0
    invoke-super {p0}, Lmm;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 178
    invoke-super {p0, p1}, Lmm;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 179
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    invoke-virtual {v0, p1}, Lbah;->a(Landroid/content/res/Configuration;)V

    .line 180
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, 0x0

    const v5, 0x1090009

    .line 46
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 47
    sget v0, La;->fR:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->setContentView(I)V

    .line 48
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 49
    new-instance v0, Lbah;

    sget-object v1, Lbat;->e:Lbat;

    invoke-direct {v0, p0, p0, v1}, Lbah;-><init>(Lmm;Lbaq;Lbat;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    .line 1077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 51
    sget v1, Lb;->aG:I

    invoke-virtual {v0, v1}, Lmj;->a(I)V

    .line 2059
    new-instance v1, Landroid/widget/ArrayAdapter;

    sget-object v0, Lbld;->b:Ljava/util/List;

    invoke-direct {v1, p0, v5, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 2063
    sget v0, Lf;->dB:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 2064
    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 2065
    new-instance v1, Lalf;

    invoke-direct {v1, p0}, Lalf;-><init>(Lcom/google/android/apps/chromecast/app/DebugActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 2079
    sget-object v1, Lbld;->a:Ljava/util/List;

    .line 2080
    invoke-static {p0}, Lblf;->y(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 2079
    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 2084
    sget v0, Lf;->an:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 2085
    invoke-static {}, Lblj;->e()Ljava/util/List;

    move-result-object v1

    .line 2086
    new-instance v2, Lblm;

    const-string v3, ""

    const-string v4, "Default"

    invoke-direct {v2, v3, v4}, Lblm;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v6, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 2087
    new-instance v2, Landroid/widget/ArrayAdapter;

    const v3, 0x1090008

    invoke-direct {v2, p0, v3, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 2089
    invoke-virtual {v2, v5}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 2090
    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 2092
    invoke-static {p0}, Lblf;->B(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 2093
    if-eqz v2, :cond_0

    .line 2095
    invoke-static {v1, v2}, Lblj;->a(Ljava/util/List;Ljava/lang/String;)Lblm;

    move-result-object v2

    .line 2094
    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 2098
    :cond_0
    new-instance v1, Lalg;

    invoke-direct {v1, p0, v0}, Lalg;-><init>(Lcom/google/android/apps/chromecast/app/DebugActivity;Landroid/widget/Spinner;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 2115
    new-instance v1, Lalh;

    invoke-direct {v1, p0}, Lalh;-><init>(Lcom/google/android/apps/chromecast/app/DebugActivity;)V

    sget v0, Lf;->l:I

    .line 2238
    invoke-interface {v1}, Lall;->b()Ljava/lang/String;

    move-result-object v2

    .line 2239
    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 2241
    new-instance v3, Landroid/widget/ArrayAdapter;

    .line 2244
    invoke-interface {v1}, Lall;->c()[Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p0, v5, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 2246
    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 2248
    invoke-interface {v1}, Lall;->d()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/apps/chromecast/app/DebugActivity;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    .line 2249
    if-ltz v3, :cond_1

    .line 2250
    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setSelection(I)V

    .line 2253
    :cond_1
    new-instance v3, Lalk;

    invoke-direct {v3, p0, v0, v1, v2}, Lalk;-><init>(Lcom/google/android/apps/chromecast/app/DebugActivity;Landroid/widget/Spinner;Lall;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 2297
    invoke-virtual {v0, v6}, Landroid/widget/Spinner;->setVisibility(I)V

    .line 2145
    sget v0, Lf;->do:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 2146
    new-instance v1, Lali;

    invoke-direct {v1, p0}, Lali;-><init>(Lcom/google/android/apps/chromecast/app/DebugActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2155
    sget v0, Lf;->ef:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    .line 2156
    invoke-virtual {v0, v7}, Landroid/widget/Switch;->setVisibility(I)V

    .line 2157
    sget v1, Lf;->H:I

    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2159
    invoke-static {p0}, Lblf;->C(Landroid/content/Context;)Z

    move-result v1

    .line 3029
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 3030
    const-string v3, "PREF_BLE_ENABLED"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 2158
    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 2160
    new-instance v1, Lalj;

    invoke-direct {v1, p0}, Lalj;-><init>(Lcom/google/android/apps/chromecast/app/DebugActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 56
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->c()V

    .line 213
    invoke-super {p0}, Lmm;->onDestroy()V

    .line 214
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    invoke-virtual {v0, p1}, Lbah;->a(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    const/4 v0, 0x1

    .line 230
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lmm;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 172
    invoke-super {p0, p1}, Lmm;->onPostCreate(Landroid/os/Bundle;)V

    .line 173
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    .line 3290
    iget-object v0, v0, Lbah;->c:Lmn;

    invoke-virtual {v0}, Lmn;->c()V

    .line 174
    return-void
.end method

.method public onResume()V
    .locals 10

    .prologue
    .line 190
    invoke-super {p0}, Lmm;->onResume()V

    .line 192
    sget v0, Lf;->bD:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 193
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    .line 194
    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->k()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 195
    sget v2, Lb;->bF:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 196
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    .line 3519
    iget-wide v8, v1, Lcom/google/android/apps/chromecast/app/SetupApplication;->k:J

    .line 197
    sub-long/2addr v6, v8

    .line 196
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    .line 4510
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/SetupApplication;->l:Ljava/lang/String;

    .line 198
    aput-object v1, v3, v4

    .line 195
    invoke-virtual {p0, v2, v3}, Lcom/google/android/apps/chromecast/app/DebugActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    :goto_0
    return-void

    .line 200
    :cond_0
    sget v1, Lb;->bG:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 184
    invoke-super {p0}, Lmm;->onStart()V

    .line 185
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->a()V

    .line 186
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DebugActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->b()V

    .line 207
    invoke-super {p0}, Lmm;->onStop()V

    .line 208
    return-void
.end method
