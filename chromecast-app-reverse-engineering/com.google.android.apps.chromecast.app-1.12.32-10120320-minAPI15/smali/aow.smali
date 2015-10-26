.class public final Laow;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final v:Ljava/util/regex/Pattern;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/google/android/gms/cast/CastDevice;

.field public c:Lbdf;

.field public d:Z

.field e:Landroid/bluetooth/BluetoothDevice;

.field f:Ljava/lang/String;

.field public g:Latu;

.field public h:Ljava/util/ArrayList;

.field public i:Ljava/util/ArrayList;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/util/List;

.field public m:Z

.field public n:I

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public final r:Ljava/lang/Runnable;

.field s:Z

.field public t:Ljava/lang/String;

.field public final u:[J

.field private final w:Lbkl;

.field private final x:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    new-instance v0, Laoy;

    .line 28780
    invoke-direct {v0}, Laoy;-><init>()V

    .line 48
    const-string v0, "\\.([a-z][a-z0-9]{0,3})$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Laow;->v:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lbkl;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v1, Lbdf;

    invoke-direct {v1}, Lbdf;-><init>()V

    iput-object v1, p0, Laow;->c:Lbdf;

    .line 58
    iput-boolean v0, p0, Laow;->d:Z

    .line 61
    new-instance v1, Latu;

    invoke-direct {v1}, Latu;-><init>()V

    iput-object v1, p0, Laow;->g:Latu;

    .line 62
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Laow;->h:Ljava/util/ArrayList;

    .line 64
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Laow;->i:Ljava/util/ArrayList;

    .line 69
    iput-boolean v0, p0, Laow;->m:Z

    .line 78
    new-instance v1, Laox;

    invoke-direct {v1, p0}, Laox;-><init>(Laow;)V

    iput-object v1, p0, Laow;->r:Ljava/lang/Runnable;

    .line 105
    const/4 v1, 0x5

    new-array v1, v1, [J

    iput-object v1, p0, Laow;->u:[J

    .line 108
    iput-object p1, p0, Laow;->w:Lbkl;

    .line 109
    new-instance v1, Lblp;

    const-string v2, "UnifiedDevice"

    invoke-direct {v1, v2}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Laow;->x:Lblp;

    .line 110
    :goto_0
    iget-object v1, p0, Laow;->u:[J

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 111
    iget-object v1, p0, Laow;->u:[J

    const-wide/16 v2, -0x1

    aput-wide v2, v1, v0

    .line 110
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 113
    :cond_0
    return-void
.end method

.method static synthetic a(Laow;)Lblp;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Laow;->x:Lblp;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 442
    if-eqz p0, :cond_0

    .line 443
    const-string v0, "-"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 445
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final a()J
    .locals 6

    .prologue
    .line 143
    const-wide/16 v2, -0x1

    .line 144
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Laow;->u:[J

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 145
    iget-object v1, p0, Laow;->u:[J

    aget-wide v4, v1, v0

    cmp-long v1, v4, v2

    if-lez v1, :cond_0

    .line 146
    iget-object v1, p0, Laow;->u:[J

    aget-wide v2, v1, v0

    .line 144
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 149
    :cond_1
    return-wide v2
.end method

.method public final a(D)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    .line 337
    invoke-virtual {p0}, Laow;->o()Latu;

    move-result-object v2

    .line 12218
    const/4 v0, 0x0

    .line 12220
    iget-object v3, v2, Latu;->d:Latv;

    if-nez v3, :cond_0

    .line 12222
    new-instance v0, Latv;

    invoke-direct {v0}, Latv;-><init>()V

    iput-object v0, v2, Latu;->d:Latv;

    move v0, v1

    .line 12225
    :cond_0
    iget-object v3, v2, Latu;->d:Latv;

    .line 12316
    iget-wide v4, v3, Latv;->b:D

    .line 12225
    cmpl-double v3, v4, p1

    if-eqz v3, :cond_2

    .line 12226
    iget-object v0, v2, Latu;->d:Latv;

    .line 13316
    iput-wide p1, v0, Latv;->b:D

    .line 337
    :goto_0
    if-eqz v1, :cond_1

    .line 13657
    iget-object v0, p0, Laow;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lalu;

    .line 13658
    invoke-interface {v0, p0}, Lalu;->b(Laow;)V

    goto :goto_1

    .line 340
    :cond_1
    return-void

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method a(I)V
    .locals 4

    .prologue
    .line 119
    iget-object v0, p0, Laow;->u:[J

    add-int/lit8 v1, p1, -0x1

    invoke-static {}, Lbkl;->b()J

    move-result-wide v2

    aput-wide v2, v0, v1

    .line 120
    return-void
.end method

.method public final a(Lals;)V
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Laow;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    return-void
.end method

.method public final a(Lbdf;)V
    .locals 1

    .prologue
    .line 253
    invoke-virtual {p0, p1}, Laow;->b(Lbdf;)V

    .line 254
    sget v0, Laoz;->a:I

    invoke-virtual {p0, v0}, Laow;->a(I)V

    .line 255
    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 436
    if-eqz p1, :cond_0

    .line 437
    invoke-static {p1}, Laow;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Laow;->a:Ljava/lang/String;

    .line 439
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 192
    iput-object p1, p0, Laow;->f:Ljava/lang/String;

    .line 193
    iget-object v0, p0, Laow;->c:Lbdf;

    invoke-virtual {v0, p2}, Lbdf;->a(Ljava/lang/String;)V

    .line 1219
    sget-object v0, Laow;->v:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1220
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1221
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 1772
    :goto_0
    iget-boolean v1, p0, Laow;->d:Z

    .line 197
    if-nez v1, :cond_0

    .line 2231
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 2233
    iget-object v1, p0, Laow;->c:Lbdf;

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 3514
    iput-object v2, v1, Lbdf;->F:Ljava/lang/String;

    .line 2531
    sget-object v3, Lbdh;->a:[I

    invoke-virtual {v1}, Lbdf;->b()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 2553
    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v5

    .line 9318
    iput-boolean v6, v1, Lbdf;->h:Z

    .line 9342
    iput-boolean v5, v1, Lbdf;->k:Z

    .line 199
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 202
    iget-object v1, p0, Laow;->c:Lbdf;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int v0, v2, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 10247
    iput-object v0, v1, Lbdf;->b:Ljava/lang/String;

    .line 207
    :cond_0
    :goto_2
    sget v0, Laoz;->b:I

    invoke-virtual {p0, v0}, Laow;->a(I)V

    .line 208
    return-void

    .line 1223
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 4318
    :pswitch_0
    iput-boolean v5, v1, Lbdf;->h:Z

    .line 4342
    iput-boolean v6, v1, Lbdf;->k:Z

    goto :goto_1

    .line 5318
    :pswitch_1
    iput-boolean v6, v1, Lbdf;->h:Z

    .line 5342
    iput-boolean v6, v1, Lbdf;->k:Z

    goto :goto_1

    .line 6318
    :pswitch_2
    iput-boolean v6, v1, Lbdf;->h:Z

    .line 6342
    iput-boolean v5, v1, Lbdf;->k:Z

    goto :goto_1

    .line 7318
    :pswitch_3
    iput-boolean v5, v1, Lbdf;->h:Z

    .line 7342
    iput-boolean v5, v1, Lbdf;->k:Z

    goto :goto_1

    .line 8318
    :pswitch_4
    iput-boolean v6, v1, Lbdf;->h:Z

    .line 8342
    iput-boolean v5, v1, Lbdf;->k:Z

    goto :goto_1

    .line 2235
    :cond_2
    iget-object v1, p0, Laow;->c:Lbdf;

    const-string v2, ""

    .line 9514
    iput-object v2, v1, Lbdf;->F:Ljava/lang/String;

    goto :goto_1

    .line 204
    :cond_3
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 11247
    iput-object p1, v0, Lbdf;->b:Ljava/lang/String;

    goto :goto_2

    .line 2531
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final a(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 711
    iget-object v0, p0, Laow;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Laow;->l:Ljava/util/List;

    .line 712
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 714
    :goto_0
    iput-object p1, p0, Laow;->l:Ljava/util/List;

    .line 716
    if-eqz v0, :cond_1

    .line 717
    invoke-virtual {p0}, Laow;->p()V

    .line 719
    :cond_1
    return-void

    .line 712
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(I)J
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Laow;->u:[J

    add-int/lit8 v1, p1, -0x1

    aget-wide v0, v0, v1

    return-wide v0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 343
    invoke-virtual {p0}, Laow;->o()Latu;

    move-result-object v0

    .line 14288
    iget-object v0, v0, Latu;->d:Latv;

    .line 344
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Latv;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 346
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    .line 14439
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 346
    invoke-virtual {v1, p0}, Lass;->a(Laow;)Laqj;

    move-result-object v1

    .line 347
    if-eqz v1, :cond_0

    .line 348
    invoke-virtual {v0}, Latv;->b()Z

    move-result v0

    invoke-virtual {v1, v0}, Laqj;->a(Z)V

    .line 351
    :cond_0
    return-void
.end method

.method public final b(Lbdf;)V
    .locals 1

    .prologue
    .line 601
    if-eqz p1, :cond_0

    .line 602
    iput-object p1, p0, Laow;->c:Lbdf;

    .line 603
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 26362
    iget-object v0, v0, Lbdf;->n:Ljava/lang/String;

    .line 603
    invoke-virtual {p0, v0}, Laow;->a(Ljava/lang/String;)V

    .line 605
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Laow;->d:Z

    .line 606
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 384
    iget-object v0, p0, Laow;->o:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Laow;->p:Ljava/lang/String;

    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 391
    :goto_0
    return-void

    .line 387
    :cond_0
    iput-object p1, p0, Laow;->o:Ljava/lang/String;

    .line 388
    iput-object p2, p0, Laow;->p:Ljava/lang/String;

    .line 389
    invoke-virtual {p0}, Laow;->o()Latu;

    move-result-object v0

    iget-object v1, p0, Laow;->p:Ljava/lang/String;

    .line 16255
    iget-object v2, v0, Latu;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 17048
    iput-object v3, v0, Latu;->b:Ljava/util/List;

    .line 17049
    iput-object v3, v0, Latu;->c:Ljava/lang/String;

    .line 17050
    iput-object v3, v0, Latu;->d:Latv;

    .line 17051
    iput-object v3, v0, Latu;->e:Ldbw;

    .line 17052
    iput-object v3, v0, Latu;->f:Ljava/lang/String;

    .line 17053
    iput-object v3, v0, Latu;->g:Ljava/lang/String;

    .line 17054
    iput-object v3, v0, Latu;->h:Ljava/lang/String;

    .line 17055
    iput-object v3, v0, Latu;->i:Ljava/lang/String;

    .line 16258
    :cond_1
    iput-object v1, v0, Latu;->a:Ljava/lang/String;

    .line 390
    invoke-virtual {p0}, Laow;->p()V

    goto :goto_0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 372
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 15439
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 372
    invoke-virtual {v0, p0}, Lass;->a(Laow;)Laqj;

    move-result-object v0

    .line 373
    if-eqz v0, :cond_0

    .line 16226
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lapk;->a(ZZ)V

    .line 378
    :cond_0
    return-void
.end method

.method c(I)Z
    .locals 6

    .prologue
    const-wide/16 v4, -0x1

    .line 167
    iget-object v0, p0, Laow;->u:[J

    add-int/lit8 v1, p1, -0x1

    aget-wide v0, v0, v1

    .line 168
    cmp-long v2, v0, v4

    if-eqz v2, :cond_0

    invoke-static {}, Lbkl;->b()J

    move-result-wide v2

    sub-long v0, v2, v0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 169
    iget-object v0, p0, Laow;->u:[J

    add-int/lit8 v1, p1, -0x1

    aput-wide v4, v0, v1

    .line 170
    const/4 v0, 0x1

    .line 172
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 402
    const-string v0, "E8C28D3C"

    iget-object v1, p0, Laow;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final d(I)Z
    .locals 4

    .prologue
    .line 697
    iget-object v0, p0, Laow;->u:[J

    add-int/lit8 v1, p1, -0x1

    aget-wide v0, v0, v1

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 406
    const-string v0, "674A0243"

    iget-object v1, p0, Laow;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 424
    iget-object v0, p0, Laow;->c:Lbdf;

    if-eqz v0, :cond_1

    iget-object v0, p0, Laow;->c:Lbdf;

    .line 17395
    iget-object v0, v0, Lbdf;->q:Ljava/lang/String;

    .line 424
    if-eqz v0, :cond_1

    .line 425
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 18395
    iget-object v0, v0, Lbdf;->q:Ljava/lang/String;

    .line 428
    :cond_0
    :goto_0
    return-object v0

    .line 18432
    :cond_1
    iget-object v0, p0, Laow;->a:Ljava/lang/String;

    .line 428
    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 452
    .line 18597
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 19254
    iget-object v0, v0, Lbdf;->b:Ljava/lang/String;

    .line 452
    return-object v0
.end method

.method public final h()I
    .locals 1

    .prologue
    .line 459
    .line 19772
    iget-boolean v0, p0, Laow;->d:Z

    .line 459
    if-eqz v0, :cond_0

    .line 20597
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 21314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 459
    if-eqz v0, :cond_1

    .line 460
    :cond_0
    sget v0, La;->eM:I

    .line 462
    :goto_0
    return v0

    :cond_1
    sget v0, La;->eL:I

    goto :goto_0
.end method

.method public final i()V
    .locals 1

    .prologue
    .line 496
    iget-boolean v0, p0, Laow;->m:Z

    if-eqz v0, :cond_0

    .line 497
    const/4 v0, 0x0

    iput-boolean v0, p0, Laow;->m:Z

    .line 498
    const/4 v0, -0x1

    iput v0, p0, Laow;->n:I

    .line 499
    invoke-virtual {p0}, Laow;->p()V

    .line 501
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 3

    .prologue
    .line 505
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 21439
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 505
    invoke-virtual {v0, p0}, Lass;->a(Laow;)Laqj;

    move-result-object v0

    .line 506
    if-eqz v0, :cond_0

    .line 508
    invoke-virtual {v0}, Laqj;->f()V

    .line 513
    :goto_0
    return-void

    .line 510
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 511
    invoke-virtual {p0}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_0
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 532
    iget v0, p0, Laow;->n:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 536
    iget v0, p0, Laow;->n:I

    iget-object v1, p0, Laow;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 562
    .line 21597
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 22395
    iget-object v0, v0, Lbdf;->q:Ljava/lang/String;

    .line 562
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 585
    iget-object v0, p0, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    if-eqz v0, :cond_0

    .line 586
    iget-object v0, p0, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 23000
    iget-object v0, v0, Lcom/google/android/gms/cast/CastDevice;->d:Ljava/net/Inet4Address;

    .line 586
    invoke-virtual {v0}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    .line 590
    :goto_0
    return-object v0

    .line 23597
    :cond_0
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 24427
    iget-object v0, v0, Lbdf;->u:Ljava/lang/String;

    .line 587
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 24597
    iget-object v0, p0, Laow;->c:Lbdf;

    .line 25427
    iget-object v0, v0, Lbdf;->u:Ljava/lang/String;

    goto :goto_0

    .line 590
    :cond_1
    const-string v0, "192.168.255.249"

    goto :goto_0
.end method

.method public final o()Latu;
    .locals 1

    .prologue
    .line 626
    iget-object v0, p0, Laow;->g:Latu;

    if-nez v0, :cond_0

    .line 627
    new-instance v0, Latu;

    invoke-direct {v0}, Latu;-><init>()V

    iput-object v0, p0, Laow;->g:Latu;

    .line 629
    :cond_0
    iget-object v0, p0, Laow;->g:Latu;

    return-object v0
.end method

.method public final p()V
    .locals 2

    .prologue
    .line 651
    iget-object v0, p0, Laow;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lals;

    .line 652
    invoke-interface {v0, p0}, Lals;->a(Laow;)V

    goto :goto_0

    .line 654
    :cond_0
    return-void
.end method

.method public final q()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 669
    invoke-virtual {p0}, Laow;->r()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Laow;->c:Lbdf;

    .line 26443
    iget-boolean v2, v2, Lbdf;->w:Z

    .line 670
    if-eqz v2, :cond_0

    .line 26597
    iget-object v2, p0, Laow;->c:Lbdf;

    .line 27507
    iget-boolean v2, v2, Lbdf;->E:Z

    .line 670
    if-eqz v2, :cond_1

    .line 28597
    :cond_0
    iget-object v2, p0, Laow;->c:Lbdf;

    .line 28628
    iget-object v2, v2, Lbdf;->G:Lbdj;

    .line 27675
    sget-object v3, Lbdj;->o:Lbdj;

    if-ne v2, v3, :cond_3

    move v2, v1

    .line 671
    :goto_0
    if-eqz v2, :cond_2

    :cond_1
    move v0, v1

    :cond_2
    return v0

    :cond_3
    move v2, v0

    .line 27675
    goto :goto_0
.end method

.method public final r()Z
    .locals 1

    .prologue
    .line 683
    sget v0, Laoz;->a:I

    invoke-virtual {p0, v0}, Laow;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Laoz;->d:I

    invoke-virtual {p0, v0}, Laow;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final s()Z
    .locals 1

    .prologue
    .line 725
    iget-object v0, p0, Laow;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Laow;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 777
    invoke-virtual {p0}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "needs set up"

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "ready to cast"

    goto :goto_0
.end method
