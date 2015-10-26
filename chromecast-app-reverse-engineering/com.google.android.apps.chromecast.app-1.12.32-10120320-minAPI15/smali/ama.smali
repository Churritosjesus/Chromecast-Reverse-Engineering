.class public final Lama;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lasq;
.implements Lazf;
.implements Lbbt;


# instance fields
.field private Z:Layz;

.field private a:Landroid/os/Handler;

.field private aa:Lalm;

.field private ab:Lash;

.field private ac:Landroid/content/SharedPreferences;

.field private ad:Z

.field private final ae:Lblp;

.field private af:Lcom/google/android/apps/chromecast/app/SetupApplication;

.field private ag:Lbbn;

.field private ah:Landroid/view/View;

.field private b:Landroid/widget/ViewFlipper;

.field private c:Landroid/support/v7/widget/RecyclerView;

.field private d:Lbmu;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 139
    invoke-direct {p0}, Lj;-><init>()V

    .line 140
    new-instance v0, Lblp;

    const-string v1, "DevicesFragment"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lama;->ae:Lblp;

    .line 141
    return-void
.end method

.method static synthetic a(Lama;)Lalm;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lama;->aa:Lalm;

    return-object v0
.end method

.method static synthetic a(Lama;Laow;I)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2}, Lama;->a(Laow;I)V

    return-void
.end method

.method private a(Laow;I)V
    .locals 10

    .prologue
    .line 400
    .line 34704
    iget-boolean v0, p1, Laow;->s:Z

    .line 400
    if-eqz v0, :cond_0

    .line 422
    :goto_0
    return-void

    .line 404
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lamd;

    invoke-direct {v1, p0, p1}, Lamd;-><init>(Lama;Laow;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 411
    invoke-virtual {p1}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35612
    iget-object v1, p0, Lj;->y:Lm;

    .line 412
    invoke-virtual {p1}, Laow;->f()Ljava/lang/String;

    move-result-object v2

    .line 413
    invoke-virtual {p1}, Laow;->n()Ljava/lang/String;

    move-result-object v3

    .line 36597
    iget-object v4, p1, Laow;->c:Lbdf;

    .line 414
    invoke-virtual {p1}, Laow;->a()J

    move-result-wide v6

    .line 37570
    iget-object v8, p1, Laow;->f:Ljava/lang/String;

    .line 37809
    iget-object v9, p1, Laow;->e:Landroid/bluetooth/BluetoothDevice;

    move v5, p2

    .line 412
    invoke-static/range {v1 .. v9}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbdf;IJLjava/lang/String;Landroid/bluetooth/BluetoothDevice;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lama;->a(Landroid/content/Intent;)V

    goto :goto_0

    .line 38612
    :cond_1
    iget-object v1, p0, Lj;->y:Lm;

    .line 418
    invoke-virtual {p1}, Laow;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Laow;->n()Ljava/lang/String;

    move-result-object v3

    .line 39597
    iget-object v4, p1, Laow;->c:Lbdf;

    .line 419
    invoke-virtual {p1}, Laow;->a()J

    move-result-wide v6

    .line 40474
    iget-object v8, p1, Laow;->j:Ljava/lang/String;

    .line 40479
    iget-object v9, p1, Laow;->k:Ljava/lang/String;

    move v5, p2

    .line 417
    invoke-static/range {v1 .. v9}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbdf;IJLjava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lama;->a(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 567
    new-instance v0, Lamg;

    invoke-direct {v0, p0}, Lamg;-><init>(Lama;)V

    .line 575
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 50247
    iget-object v2, p0, Lj;->y:Lm;

    .line 575
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lb;->bJ:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {p0, v2, v3}, Lama;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lb;->J:I

    .line 577
    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    const/4 v2, 0x0

    .line 578
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 579
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 580
    return-void
.end method

.method static synthetic b(Lama;)Lblp;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lama;->ae:Lblp;

    return-object v0
.end method

.method static synthetic c(Lama;)Lash;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lama;->ab:Lash;

    return-object v0
.end method

.method static synthetic d(Lama;)Lbmu;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lama;->d:Lbmu;

    return-object v0
.end method

.method static synthetic e(Lama;)Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lama;->c:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method static synthetic f(Lama;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lama;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private t()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 547
    .line 50246
    iget-object v1, p0, Lj;->y:Lm;

    .line 547
    invoke-virtual {v1}, Lm;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "location_mode"

    invoke-static {v1, v2, v0}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v1

    .line 549
    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private static u()Z
    .locals 2

    .prologue
    .line 553
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private v()V
    .locals 2

    .prologue
    .line 557
    invoke-direct {p0}, Lama;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lama;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lama;->aa:Lalm;

    sget v1, Laoz;->b:I

    .line 558
    invoke-virtual {v0, v1}, Lalm;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lama;->aa:Lalm;

    sget v1, Laoz;->c:I

    .line 559
    invoke-virtual {v0, v1}, Lalm;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 560
    iget-object v0, p0, Lama;->ah:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 564
    :goto_0
    return-void

    .line 562
    :cond_0
    iget-object v0, p0, Lama;->ah:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .prologue
    .line 146
    sget v0, La;->fW:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v10

    .line 148
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    iput-object v0, p0, Lama;->af:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 149
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lama;->a:Landroid/os/Handler;

    .line 9612
    iget-object v0, p0, Lj;->y:Lm;

    .line 151
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lama;->ac:Landroid/content/SharedPreferences;

    .line 10428
    iget-object v0, p0, Lama;->ac:Landroid/content/SharedPreferences;

    const-string v1, "FIRST_RUN"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lama;->ad:Z

    .line 10612
    iget-object v0, p0, Lj;->y:Lm;

    .line 153
    invoke-static {v0}, Lbbn;->a(Landroid/content/Context;)Lbbn;

    move-result-object v0

    iput-object v0, p0, Lama;->ag:Lbbn;

    .line 155
    sget v0, Lf;->ev:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lama;->b:Landroid/widget/ViewFlipper;

    .line 11612
    iget-object v0, p0, Lj;->y:Lm;

    .line 11808
    iget-object v1, v0, Lm;->b:Lt;

    .line 158
    const-string v0, "backdropStorage"

    invoke-virtual {v1, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lash;

    iput-object v0, p0, Lama;->ab:Lash;

    .line 160
    iget-object v0, p0, Lama;->ab:Lash;

    if-nez v0, :cond_0

    .line 12162
    new-instance v0, Lash;

    invoke-direct {v0}, Lash;-><init>()V

    .line 161
    iput-object v0, p0, Lama;->ab:Lash;

    .line 162
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v0

    iget-object v1, p0, Lama;->ab:Lash;

    const-string v2, "backdropStorage"

    invoke-virtual {v0, v1, v2}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 165
    :cond_0
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    iput-object v0, p0, Lama;->aa:Lalm;

    .line 12612
    iget-object v0, p0, Lj;->y:Lm;

    .line 166
    check-cast v0, Lami;

    .line 167
    invoke-interface {v0}, Lami;->a()Layz;

    move-result-object v0

    iput-object v0, p0, Lama;->Z:Layz;

    .line 169
    sget v0, Lf;->g:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lama;->ah:Landroid/view/View;

    .line 170
    invoke-direct {p0}, Lama;->v()V

    .line 172
    iget-object v0, p0, Lama;->ah:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 175
    sget v0, Lf;->aA:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lama;->c:Landroid/support/v7/widget/RecyclerView;

    .line 176
    iget-object v0, p0, Lama;->c:Landroid/support/v7/widget/RecyclerView;

    .line 12701
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 177
    iget-object v0, p0, Lama;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lxw;

    .line 13612
    iget-object v2, p0, Lj;->y:Lm;

    .line 177
    invoke-direct {v1, v2}, Lxw;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 14612
    iget-object v0, p0, Lj;->y:Lm;

    .line 180
    invoke-static {v0}, Lblx;->a(Landroid/app/Activity;)I

    move-result v11

    .line 181
    invoke-virtual {p0}, Lama;->e()Landroid/content/res/Resources;

    move-result-object v0

    .line 182
    sget v1, La;->dE:I

    .line 183
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x1

    sub-int v1, v11, v1

    sget v2, La;->dD:I

    .line 184
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 182
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 186
    iget-object v0, p0, Lama;->ah:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput v9, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 188
    new-instance v0, Lbmu;

    .line 15612
    iget-object v1, p0, Lj;->y:Lm;

    .line 16612
    iget-object v2, p0, Lj;->y:Lm;

    .line 189
    invoke-static {v2}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v2

    iget-object v3, p0, Lama;->aa:Lalm;

    .line 17268
    iget-object v3, v3, Lalm;->g:Ljava/util/List;

    .line 190
    iget-object v4, p0, Lama;->aa:Lalm;

    .line 17272
    iget-object v4, v4, Lalm;->h:Ljava/util/List;

    .line 190
    iget-object v5, p0, Lama;->aa:Lalm;

    .line 17542
    iget-object v5, v5, Lalm;->m:Ljava/util/List;

    .line 191
    iget-object v6, p0, Lama;->ab:Lash;

    iget-object v7, p0, Lama;->ag:Lbbn;

    new-instance v8, Lamb;

    invoke-direct {v8, p0}, Lamb;-><init>(Lama;)V

    invoke-direct/range {v0 .. v9}, Lbmu;-><init>(Landroid/content/Context;Latf;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lash;Lbbn;Lbob;I)V

    iput-object v0, p0, Lama;->d:Lbmu;

    .line 249
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lama;->aa:Lalm;

    .line 18268
    iget-object v2, v2, Lalm;->g:Ljava/util/List;

    .line 250
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lama;->aa:Lalm;

    .line 18542
    iget-object v2, v2, Lalm;->m:Ljava/util/List;

    .line 250
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lama;->aa:Lalm;

    .line 19272
    iget-object v2, v2, Lalm;->h:Ljava/util/List;

    .line 251
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 253
    iget-object v0, p0, Lama;->aa:Lalm;

    iget-object v1, p0, Lama;->d:Lbmu;

    .line 20168
    iput-object v1, v0, Lalm;->d:Lbmu;

    .line 254
    iget-object v0, p0, Lama;->aa:Lalm;

    .line 20612
    iget-object v1, p0, Lj;->y:Lm;

    .line 254
    invoke-static {v1}, Lblr;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lalm;->a(Lazf;Ljava/lang/String;)V

    .line 256
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v1

    .line 21067
    iget-object v0, v1, Lbkh;->g:Lbke;

    .line 257
    iget-object v2, p0, Lama;->d:Lbmu;

    .line 21203
    iget-object v3, v0, Lbke;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21205
    invoke-virtual {v0}, Lbke;->b()Ldal;

    move-result-object v0

    invoke-interface {v2, v0}, Lbkf;->a(Ldal;)V

    .line 22083
    iget-object v0, v1, Lbkh;->d:Lctk;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 260
    :goto_0
    if-nez v0, :cond_1

    .line 261
    invoke-virtual {v1}, Lbkh;->b()V

    .line 263
    :cond_1
    iget-object v0, p0, Lama;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lama;->d:Lbmu;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 264
    iget-object v0, p0, Lama;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lamh;

    .line 265
    invoke-virtual {p0}, Lama;->e()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->dF:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sub-int v3, v11, v9

    div-int/lit8 v3, v3, 0x2

    invoke-direct {v1, p0, v2, v3}, Lamh;-><init>(Lama;II)V

    .line 264
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 267
    new-instance v0, Lxe;

    invoke-direct {v0}, Lxe;-><init>()V

    .line 22473
    const/4 v1, 0x0

    iput-boolean v1, v0, Lzc;->m:Z

    .line 269
    iget-object v1, p0, Lama;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzc;)V

    .line 271
    sget v0, Lf;->dG:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 272
    sget v0, Lf;->dH:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 274
    return-object v10

    .line 22083
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastDevice;)V
    .locals 4

    .prologue
    .line 436
    if-nez p1, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    if-eqz p1, :cond_2

    .line 437
    invoke-virtual {p1, p2}, Lcom/google/android/gms/cast/CastDevice;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 448
    :cond_1
    return-void

    .line 441
    :cond_2
    iget-object v0, p0, Lama;->aa:Lalm;

    .line 41268
    iget-object v0, v0, Lalm;->g:Ljava/util/List;

    .line 441
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 442
    invoke-virtual {v0}, Laow;->e()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p1, :cond_3

    .line 42000
    iget-object v2, p1, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 42469
    iget-object v3, v0, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 43000
    iget-object v3, v3, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 443
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 445
    invoke-virtual {v0}, Laow;->p()V

    goto :goto_0
.end method

.method public final a_(I)V
    .locals 2

    .prologue
    .line 352
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 353
    iget-object v0, p0, Lama;->aa:Lalm;

    iget-object v1, p0, Lama;->ab:Lash;

    invoke-virtual {v1}, Lash;->p()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lalm;->a(Ljava/util/List;)V

    .line 355
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 279
    invoke-super {p0}, Lj;->d()V

    .line 280
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lama;->aa:Lalm;

    .line 23268
    iget-object v1, v1, Lalm;->g:Ljava/util/List;

    .line 281
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    iget-object v1, p0, Lama;->aa:Lalm;

    .line 23542
    iget-object v1, v1, Lalm;->m:Ljava/util/List;

    .line 281
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v5

    const/4 v1, 0x2

    iget-object v2, p0, Lama;->aa:Lalm;

    .line 24272
    iget-object v2, v2, Lalm;->h:Ljava/util/List;

    .line 282
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 283
    iget-object v0, p0, Lama;->aa:Lalm;

    iget-object v1, p0, Lama;->d:Lbmu;

    .line 25172
    iget-object v2, v0, Lalm;->d:Lbmu;

    if-ne v2, v1, :cond_0

    .line 25173
    iput-object v6, v0, Lalm;->d:Lbmu;

    .line 284
    :cond_0
    iget-object v0, p0, Lama;->aa:Lalm;

    .line 25206
    iget-object v1, v0, Lalm;->e:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 25207
    iget-object v1, v0, Lalm;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 25209
    iget-object v0, v0, Lalm;->c:Lass;

    .line 26080
    iget-object v0, v0, Lass;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laqj;

    .line 26081
    new-array v2, v5, [Ljava/lang/Object;

    .line 26396
    iget-object v3, v0, Laqj;->b:Laow;

    .line 26597
    iget-object v3, v3, Laow;->c:Lbdf;

    .line 27254
    iget-object v3, v3, Lbdf;->b:Ljava/lang/String;

    .line 26081
    aput-object v3, v2, v4

    .line 26082
    invoke-virtual {v0}, Laqj;->g()V

    goto :goto_0

    .line 285
    :cond_1
    iput-object v6, p0, Lama;->ag:Lbbn;

    .line 286
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 290
    invoke-super {p0}, Lj;->j()V

    .line 292
    invoke-direct {p0}, Lama;->v()V

    .line 294
    iget-object v0, p0, Lama;->d:Lbmu;

    .line 27380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 295
    iget-object v0, p0, Lama;->ab:Lash;

    invoke-virtual {v0, p0}, Lash;->a(Lasq;)V

    .line 296
    iget-object v0, p0, Lama;->ab:Lash;

    invoke-virtual {v0}, Lash;->p()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 297
    iget-object v0, p0, Lama;->aa:Lalm;

    iget-object v1, p0, Lama;->ab:Lash;

    invoke-virtual {v1}, Lash;->p()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lalm;->a(Ljava/util/List;)V

    .line 300
    :cond_0
    iget-object v0, p0, Lama;->Z:Layz;

    .line 28155
    iput-object p0, v0, Layz;->a:Lazf;

    .line 301
    iget-object v0, p0, Lama;->ag:Lbbn;

    if-eqz v0, :cond_1

    .line 302
    iget-object v0, p0, Lama;->ag:Lbbn;

    invoke-virtual {v0, p0}, Lbbn;->a(Lbbt;)V

    .line 303
    iget-object v0, p0, Lama;->ag:Lbbn;

    invoke-virtual {v0}, Lbbn;->d()V

    .line 305
    :cond_1
    invoke-virtual {p0}, Lama;->q()V

    .line 306
    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    .line 310
    invoke-super {p0}, Lj;->k()V

    .line 311
    iget-object v0, p0, Lama;->ab:Lash;

    invoke-virtual {v0, p0}, Lash;->b(Lasq;)V

    .line 312
    iget-object v0, p0, Lama;->Z:Layz;

    .line 28159
    const/4 v1, 0x0

    iput-object v1, v0, Layz;->a:Lazf;

    .line 313
    iget-object v0, p0, Lama;->ag:Lbbn;

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Lama;->ag:Lbbn;

    invoke-virtual {v0, p0}, Lbbn;->b(Lbbt;)V

    .line 316
    :cond_0
    invoke-super {p0}, Lj;->k()V

    .line 317
    return-void
.end method

.method public final l()V
    .locals 4

    .prologue
    .line 321
    invoke-super {p0}, Lj;->l()V

    .line 322
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    .line 29067
    iget-object v1, v0, Lbkh;->g:Lbke;

    .line 323
    iget-object v2, p0, Lama;->d:Lbmu;

    .line 29209
    const/4 v0, 0x0

    :goto_0
    iget-object v3, v1, Lbke;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 29210
    iget-object v3, v1, Lbke;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    .line 29211
    iget-object v1, v1, Lbke;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 324
    :cond_0
    return-void

    .line 29209
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 584
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 585
    sget v0, Lf;->dG:I

    if-ne v3, v0, :cond_3

    move v0, v1

    .line 586
    :goto_0
    sget v4, Lf;->dH:I

    if-ne v3, v4, :cond_4

    .line 588
    :goto_1
    if-nez v0, :cond_0

    if-eqz v1, :cond_1

    .line 589
    :cond_0
    invoke-direct {p0}, Lama;->t()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, Lama;->u()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 590
    if-eqz v0, :cond_5

    sget v1, Lb;->bc:I

    invoke-virtual {p0, v1}, Lama;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 592
    :goto_2
    if-eqz v0, :cond_6

    .line 593
    sget v0, Lb;->bg:I

    invoke-virtual {p0, v0}, Lama;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 595
    :goto_3
    invoke-direct {p0, v1, v0}, Lama;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 603
    :cond_1
    :goto_4
    sget v0, Lf;->g:I

    if-ne v3, v0, :cond_2

    .line 604
    sget v0, Lb;->bc:I

    invoke-virtual {p0, v0}, Lama;->a(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lb;->bg:I

    .line 605
    invoke-virtual {p0, v1}, Lama;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 604
    invoke-direct {p0, v0, v1}, Lama;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    :cond_2
    return-void

    :cond_3
    move v0, v2

    .line 585
    goto :goto_0

    :cond_4
    move v1, v2

    .line 586
    goto :goto_1

    .line 591
    :cond_5
    sget v1, Lb;->bd:I

    invoke-virtual {p0, v1}, Lama;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 594
    :cond_6
    sget v0, Lb;->be:I

    invoke-virtual {p0, v0}, Lama;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 50248
    :cond_7
    iget-object v0, p0, Lj;->y:Lm;

    .line 597
    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->a(Landroid/content/Context;Z)Landroid/content/Intent;

    move-result-object v0

    .line 599
    invoke-virtual {p0, v0}, Lama;->a(Landroid/content/Intent;)V

    goto :goto_4
.end method

.method public final p()V
    .locals 0

    .prologue
    .line 328
    invoke-virtual {p0}, Lama;->q()V

    .line 329
    return-void
.end method

.method public final q()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 332
    .line 29612
    iget-object v0, p0, Lj;->y:Lm;

    .line 333
    check-cast v0, Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->k()Z

    move-result v0

    if-nez v0, :cond_1

    .line 334
    const/4 v0, 0x3

    .line 344
    :goto_0
    iget-object v1, p0, Lama;->b:Landroid/widget/ViewFlipper;

    invoke-virtual {v1}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v1

    .line 345
    if-eq v1, v0, :cond_0

    .line 346
    iget-object v1, p0, Lama;->b:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, v0}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 348
    :cond_0
    return-void

    .line 335
    :cond_1
    iget-object v0, p0, Lama;->aa:Lalm;

    .line 30268
    iget-object v0, v0, Lalm;->g:Ljava/util/List;

    .line 335
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lama;->aa:Lalm;

    .line 30272
    iget-object v0, v0, Lalm;->h:Ljava/util/List;

    .line 336
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lama;->aa:Lalm;

    .line 30542
    iget-object v0, v0, Lalm;->m:Ljava/util/List;

    .line 337
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 338
    iget-object v0, p0, Lama;->Z:Layz;

    .line 31166
    iget-boolean v0, v0, Layz;->c:Z

    .line 338
    if-eqz v0, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_0

    .line 339
    :cond_3
    iget-boolean v0, p0, Lama;->ad:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lama;->aa:Lalm;

    .line 340
    invoke-virtual {v0}, Lalm;->b()I

    move-result v0

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lama;->aa:Lalm;

    invoke-virtual {v0}, Lalm;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 341
    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0
.end method

.method public final r()V
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 365
    iget-object v0, p0, Lama;->af:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 31192
    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->h:Z

    .line 365
    if-eqz v0, :cond_0

    .line 366
    iget-boolean v5, p0, Lama;->ad:Z

    .line 367
    iget-object v0, p0, Lama;->af:Lcom/google/android/apps/chromecast/app/SetupApplication;

    .line 31199
    iput-boolean v2, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->h:Z

    .line 368
    iput-boolean v2, p0, Lama;->ad:Z

    .line 369
    iget-object v0, p0, Lama;->ac:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "FIRST_RUN"

    iget-boolean v4, p0, Lama;->ad:Z

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 371
    iget-object v0, p0, Lama;->aa:Lalm;

    .line 372
    invoke-virtual {v0}, Lalm;->b()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lama;->aa:Lalm;

    .line 31268
    iget-object v0, v0, Lalm;->g:Ljava/util/List;

    .line 372
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    move-object v4, v0

    .line 373
    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 374
    :goto_1
    invoke-static {}, Lape;->a()Lape;

    move-result-object v6

    const/16 v7, 0x32

    if-eqz v0, :cond_3

    move v3, v1

    .line 376
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v8, p0, Lama;->Z:Layz;

    .line 31300
    iget-wide v8, v8, Layz;->d:J

    .line 376
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    .line 374
    invoke-virtual {v6, v7, v3, v8}, Lape;->a(ILjava/lang/Integer;Ljava/lang/Long;)V

    .line 378
    if-eqz v0, :cond_4

    .line 380
    const/4 v0, -0x1

    invoke-direct {p0, v4, v0}, Lama;->a(Laow;I)V

    .line 396
    :cond_0
    :goto_3
    invoke-virtual {p0}, Lama;->q()V

    .line 397
    return-void

    .line 372
    :cond_1
    const/4 v0, 0x0

    move-object v4, v0

    goto :goto_0

    :cond_2
    move v0, v2

    .line 373
    goto :goto_1

    :cond_3
    move v3, v2

    .line 376
    goto :goto_2

    .line 382
    :cond_4
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    .line 32067
    iget-object v3, v0, Lbkh;->g:Lbke;

    .line 384
    if-eqz v5, :cond_5

    .line 32109
    iput-boolean v1, v3, Lbke;->c:Z

    .line 32110
    invoke-virtual {v3}, Lbke;->a()V

    .line 387
    :cond_5
    iget-object v0, p0, Lama;->aa:Lalm;

    .line 32288
    iget-object v4, v0, Lalm;->g:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 387
    :goto_4
    if-eqz v2, :cond_9

    .line 33103
    iput-boolean v1, v3, Lbke;->b:Z

    .line 33104
    iput-boolean v1, v3, Lbke;->a:Z

    .line 33105
    invoke-virtual {v3}, Lbke;->a()V

    goto :goto_3

    .line 32291
    :cond_6
    iget-object v0, v0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 32292
    invoke-virtual {v0}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_8
    move v2, v1

    .line 32296
    goto :goto_4

    .line 389
    :cond_9
    iget-object v0, p0, Lama;->aa:Lalm;

    invoke-virtual {v0}, Lalm;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lama;->aa:Lalm;

    .line 390
    invoke-virtual {v0}, Lalm;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 34095
    iput-boolean v1, v3, Lbke;->a:Z

    .line 34096
    invoke-virtual {v3}, Lbke;->a()V

    goto :goto_3
.end method

.method public final s()V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 507
    invoke-direct {p0}, Lama;->v()V

    .line 43523
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 44479
    iget-object v7, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->g:Lazg;

    .line 43524
    if-eqz v7, :cond_2

    .line 43527
    iget-object v0, p0, Lama;->aa:Lalm;

    .line 45268
    iget-object v0, v0, Lalm;->g:Ljava/util/List;

    .line 43527
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Laow;

    .line 43528
    invoke-virtual {v6}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43529
    invoke-virtual {v6}, Laow;->f()Ljava/lang/String;

    move-result-object v0

    .line 46054
    iget-object v2, v7, Lazg;->a:Ljava/lang/String;

    .line 43529
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46597
    iget-object v0, v6, Laow;->c:Lbdf;

    .line 46628
    iget-object v0, v0, Lbdf;->G:Lbdj;

    .line 43530
    sget-object v2, Lbdj;->o:Lbdj;

    if-ne v0, v2, :cond_0

    .line 46704
    iget-boolean v0, v6, Laow;->s:Z

    .line 43532
    if-nez v0, :cond_0

    .line 43533
    invoke-virtual {v7}, Lazg;->a()Ljava/lang/String;

    move-result-object v0

    .line 43534
    if-nez v0, :cond_1

    .line 47597
    iget-object v0, v6, Laow;->c:Lbdf;

    .line 48254
    iget-object v0, v0, Lbdf;->b:Ljava/lang/String;

    .line 43537
    :cond_1
    const/4 v1, 0x1

    .line 48737
    iput-boolean v1, v6, Laow;->s:Z

    .line 48745
    iput-object v0, v6, Laow;->t:Ljava/lang/String;

    .line 49459
    new-instance v0, Lbdu;

    invoke-virtual {v6}, Laow;->n()Ljava/lang/String;

    move-result-object v1

    .line 49597
    iget-object v2, v6, Laow;->c:Lbdf;

    .line 50239
    iget v2, v2, Lbdf;->a:I

    .line 49460
    sget v4, Lbew;->a:I

    move-object v5, v3

    invoke-direct/range {v0 .. v5}, Lbdu;-><init>(Ljava/lang/String;ILjava/lang/String;ILaph;)V

    .line 50240
    iget-object v1, v6, Laow;->c:Lbdf;

    .line 49461
    new-instance v2, Lame;

    invoke-direct {v2, p0, v6, v7}, Lame;-><init>(Lama;Laow;Lazg;)V

    invoke-virtual {v7, v0, v1, v2}, Lazg;->a(Lbdu;Lbdf;Lbdn;)V

    .line 50241
    :cond_2
    iget-object v0, p0, Lj;->y:Lm;

    .line 511
    check-cast v0, Lcom/google/android/apps/chromecast/app/MainActivity;

    .line 50242
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/MainActivity;->f:Lbah;

    .line 50244
    iget-object v0, v0, Lbah;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 513
    invoke-virtual {p0}, Lama;->q()V

    .line 514
    return-void
.end method
