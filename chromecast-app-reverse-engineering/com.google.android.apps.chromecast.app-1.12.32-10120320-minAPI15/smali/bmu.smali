.class public final Lbmu;
.super Lyz;
.source "PG"

# interfaces
.implements Lbkf;


# static fields
.field public static k:Lblq;


# instance fields
.field final b:Latf;

.field final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field final e:Lash;

.field final f:Lbbn;

.field final g:Lbob;

.field final h:Landroid/content/Context;

.field final i:Landroid/os/Handler;

.field final j:I

.field private l:Ldal;

.field private final m:Ljava/util/List;

.field private final n:Lblp;

.field private final o:I

.field private final p:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Latf;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lash;Lbbn;Lbob;I)V
    .locals 2

    .prologue
    .line 412
    invoke-direct {p0}, Lyz;-><init>()V

    .line 413
    iput-object p2, p0, Lbmu;->b:Latf;

    .line 414
    iput-object p3, p0, Lbmu;->m:Ljava/util/List;

    .line 415
    iput-object p4, p0, Lbmu;->c:Ljava/util/List;

    .line 416
    iput-object p5, p0, Lbmu;->d:Ljava/util/List;

    .line 417
    iput-object p6, p0, Lbmu;->e:Lash;

    .line 418
    iput-object p7, p0, Lbmu;->f:Lbbn;

    .line 419
    iput-object p8, p0, Lbmu;->g:Lbob;

    .line 420
    new-instance v0, Lblp;

    const-string v1, "SetupCastDeviceAdapter"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbmu;->n:Lblp;

    .line 421
    iput-object p1, p0, Lbmu;->h:Landroid/content/Context;

    .line 422
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbmu;->i:Landroid/os/Handler;

    .line 423
    iput p9, p0, Lbmu;->j:I

    .line 424
    mul-int/lit8 v0, p9, 0x9

    div-int/lit8 v0, v0, 0x10

    iput v0, p0, Lbmu;->o:I

    .line 425
    iget-object v0, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v0}, Lblf;->s(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Lbmu;->p:J

    .line 426
    iget-object v0, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    .line 8178
    iget-object v0, v0, Latf;->d:Lblq;

    .line 426
    sput-object v0, Lbmu;->k:Lblq;

    .line 428
    iget-object v0, p0, Lbmu;->m:Ljava/util/List;

    invoke-direct {p0, v0}, Lbmu;->a(Ljava/lang/Iterable;)V

    .line 429
    return-void
.end method

.method static synthetic a(Lbmu;I)I
    .locals 1

    .prologue
    .line 69
    .line 50473
    iget-object v0, p0, Lbmu;->l:Ldal;

    if-nez v0, :cond_0

    :goto_0
    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 69
    goto :goto_0
.end method

.method private a(Ldak;Ljava/lang/Long;)Landroid/view/View$OnClickListener;
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1011
    iget v0, p1, Ldak;->c:I

    packed-switch v0, :pswitch_data_0

    .line 1039
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 1014
    :pswitch_0
    :try_start_0
    iget-object v0, p1, Ldak;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v1

    .line 1016
    new-instance v0, Lbmz;

    invoke-direct {v0, p0, v1}, Lbmz;-><init>(Lbmu;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 1024
    :catch_0
    move-exception v0

    iget-object v0, p0, Lbmu;->n:Lblp;

    const-string v1, "Failed to parse android intent: %s | for card: %ld"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p1, Ldak;->b:Ljava/lang/String;

    aput-object v4, v2, v3

    aput-object p2, v2, v5

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1030
    :pswitch_1
    new-instance v0, Lbna;

    invoke-direct {v0, p0, p2}, Lbna;-><init>(Lbmu;Ljava/lang/Long;)V

    goto :goto_1

    .line 1011
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Landroid/view/View;Laow;)V
    .locals 12

    .prologue
    const/4 v11, 0x4

    const/16 v10, 0x8

    const/4 v0, 0x0

    .line 1204
    invoke-virtual {p2}, Laow;->o()Latu;

    move-result-object v1

    .line 50469
    iget-object v7, v1, Latu;->b:Ljava/util/List;

    .line 1205
    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1206
    :cond_0
    invoke-virtual {p1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1263
    :cond_1
    return-void

    .line 1210
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1211
    new-array v8, v11, [Landroid/view/View;

    sget v1, Lf;->dw:I

    .line 1212
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    aput-object v1, v8, v0

    const/4 v1, 0x1

    sget v2, Lf;->dx:I

    .line 1213
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v8, v1

    const/4 v1, 0x2

    sget v2, Lf;->dy:I

    .line 1214
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v8, v1

    const/4 v1, 0x3

    sget v2, Lf;->dz:I

    .line 1215
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v8, v1

    move v6, v0

    .line 1217
    :goto_0
    if-ge v6, v11, :cond_1

    .line 1218
    aget-object v9, v8, v6

    .line 1219
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lt v6, v0, :cond_3

    .line 1220
    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1217
    :goto_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    .line 1222
    :cond_3
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldcw;

    .line 1225
    invoke-virtual {v2}, Ldcw;->b()Ldco;

    move-result-object v0

    sget-object v1, Ldco;->c:Ldco;

    if-ne v0, v1, :cond_4

    .line 50470
    iget-object v0, p2, Laow;->j:Ljava/lang/String;

    .line 1226
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1227
    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 50471
    :cond_4
    iget-object v0, v2, Ldcw;->a:Ljava/lang/String;

    .line 1231
    invoke-static {v9, v0}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 50472
    iget-object v4, v2, Ldcw;->b:Ljava/lang/String;

    .line 1233
    new-instance v0, Lbnk;

    move-object v1, p0

    move-object v3, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lbnk;-><init>(Lbmu;Ldcw;Laow;Ljava/lang/String;Landroid/view/View;)V

    .line 1260
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/Iterable;)V
    .locals 2

    .prologue
    .line 927
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 928
    invoke-virtual {p0, v0}, Lbmu;->a(Laow;)V

    goto :goto_0

    .line 930
    :cond_0
    return-void
.end method

.method private h(I)Laow;
    .locals 2

    .prologue
    .line 569
    iget-object v0, p0, Lbmu;->l:Ldal;

    if-nez v0, :cond_0

    iget-object v0, p0, Lbmu;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lbmu;->m:Ljava/util/List;

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    .line 581
    iget-object v0, p0, Lbmu;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 582
    iget-object v1, p0, Lbmu;->l:Ldal;

    if-eqz v1, :cond_0

    .line 583
    add-int/lit8 v0, v0, 0x1

    .line 585
    :cond_0
    iget-object v1, p0, Lbmu;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 586
    add-int/lit8 v0, v0, 0x1

    .line 588
    :cond_1
    iget-object v1, p0, Lbmu;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 589
    add-int/lit8 v0, v0, 0x1

    .line 591
    :cond_2
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    .line 592
    return v0
.end method

.method public final a(I)I
    .locals 6

    .prologue
    const/4 v0, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 542
    if-nez p1, :cond_0

    iget-object v3, p0, Lbmu;->l:Ldal;

    if-eqz v3, :cond_0

    .line 543
    iget-object v3, p0, Lbmu;->l:Ldal;

    iget v3, v3, Ldal;->e:I

    packed-switch v3, :pswitch_data_0

    .line 549
    iget-object v3, p0, Lbmu;->n:Lblp;

    const-string v4, "Unhandled announcement type: %d"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v5, p0, Lbmu;->l:Ldal;

    iget v5, v5, Ldal;->e:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v1

    invoke-virtual {v3, v4, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    :goto_0
    :pswitch_0
    return v0

    .line 547
    :pswitch_1
    const/4 v0, 0x3

    goto :goto_0

    .line 555
    :cond_0
    iget-object v0, p0, Lbmu;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 12596
    invoke-virtual {p0}, Lbmu;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 555
    if-ne p1, v0, :cond_1

    .line 556
    const/4 v0, 0x4

    goto :goto_0

    .line 560
    :cond_1
    iget-object v0, p0, Lbmu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lbmu;->b()I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 561
    const/4 v0, 0x5

    goto :goto_0

    .line 565
    :cond_2
    invoke-direct {p0, p1}, Lbmu;->h(I)Laow;

    move-result-object v0

    invoke-virtual {v0}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Landroid/view/ViewGroup;I)Lzr;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 609
    packed-switch p2, :pswitch_data_0

    .line 631
    iget-object v0, p0, Lbmu;->n:Lblp;

    const-string v1, "Unknown view type: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lblp;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 611
    :pswitch_0
    new-instance v0, Lboa;

    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->gk:I

    .line 612
    invoke-virtual {v1, v2, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lboa;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 614
    :pswitch_1
    new-instance v0, Lboc;

    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fv:I

    .line 615
    invoke-virtual {v1, v2, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lboc;-><init>(Landroid/view/View;)V

    .line 13245
    iget-object v1, v0, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 616
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    iget v3, p0, Lbmu;->j:I

    iget v4, p0, Lbmu;->o:I

    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 620
    :pswitch_2
    new-instance v0, Lbnt;

    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fo:I

    .line 621
    invoke-virtual {v1, v2, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lbnt;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 623
    :pswitch_3
    new-instance v0, Lbnt;

    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fp:I

    .line 624
    invoke-virtual {v1, v2, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lbnt;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 626
    :pswitch_4
    new-instance v0, Lbny;

    invoke-direct {v0, p0}, Lbny;-><init>(Lbmu;)V

    goto :goto_0

    .line 628
    :pswitch_5
    new-instance v0, Lbnu;

    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->gd:I

    .line 629
    invoke-virtual {v1, v2, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lbnu;-><init>(Lbmu;Landroid/view/View;)V

    goto :goto_0

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(II)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 456
    iget-object v2, p0, Lbmu;->l:Ldal;

    if-eqz v2, :cond_0

    .line 457
    add-int/lit8 p1, p1, 0x1

    .line 458
    add-int/lit8 p2, p2, 0x1

    .line 460
    :cond_0
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v3, 0x2

    iget-object v4, p0, Lbmu;->l:Ldal;

    if-eqz v4, :cond_1

    .line 461
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v2, v3

    .line 8444
    iget-object v0, p0, Lyz;->a:Lza;

    invoke-virtual {v0, p1, p2}, Lza;->d(II)V

    .line 463
    return-void

    :cond_1
    move v0, v1

    .line 460
    goto :goto_0
.end method

.method public final a(J)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 160
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v2

    .line 161
    iget-object v0, p0, Lbmu;->l:Ldal;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbmu;->l:Ldal;

    iget-object v0, v0, Ldal;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    .line 162
    const/4 v0, 0x0

    iput-object v0, p0, Lbmu;->l:Ldal;

    .line 164
    invoke-virtual {p0, v2}, Lbmu;->d(I)V

    .line 166
    :cond_0
    return-void
.end method

.method a(Laow;)V
    .locals 4

    .prologue
    .line 920
    .line 50466
    iget-boolean v0, p1, Laow;->m:Z

    .line 920
    if-eqz v0, :cond_0

    .line 921
    iget-object v0, p0, Lbmu;->i:Landroid/os/Handler;

    .line 50467
    iget-object v1, p1, Laow;->r:Ljava/lang/Runnable;

    .line 921
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 922
    iget-object v0, p0, Lbmu;->i:Landroid/os/Handler;

    .line 50468
    iget-object v1, p1, Laow;->r:Ljava/lang/Runnable;

    .line 922
    iget-wide v2, p0, Lbmu;->p:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 924
    :cond_0
    return-void
.end method

.method public final a(Ldal;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 170
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 171
    iget-object v0, p0, Lbmu;->l:Ldal;

    .line 172
    iput-object p1, p0, Lbmu;->l:Ldal;

    .line 174
    if-eqz p1, :cond_2

    .line 175
    iget-object v1, p0, Lbmu;->l:Ldal;

    if-eq v0, v1, :cond_0

    .line 176
    if-nez v0, :cond_1

    .line 178
    invoke-virtual {p0, v2}, Lbmu;->c(I)V

    .line 188
    :cond_0
    :goto_0
    return-void

    .line 181
    :cond_1
    invoke-virtual {p0, v2}, Lbmu;->b(I)V

    goto :goto_0

    .line 184
    :cond_2
    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {p0, v2}, Lbmu;->d(I)V

    goto :goto_0
.end method

.method public final a(Lzr;I)V
    .locals 12

    .prologue
    .line 638
    instance-of v0, p1, Lboa;

    if-eqz v0, :cond_1

    .line 639
    check-cast p1, Lboa;

    .line 13654
    invoke-direct {p0, p2}, Lbmu;->h(I)Laow;

    move-result-object v0

    .line 14225
    iget-object v1, p1, Lboa;->k:Landroid/widget/TextView;

    .line 13655
    invoke-virtual {v0}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15225
    iget-object v1, p1, Lboa;->o:Landroid/widget/ImageView;

    .line 13657
    sget-object v2, Lbnl;->a:[I

    .line 15597
    iget-object v3, v0, Laow;->c:Lbdf;

    .line 13657
    invoke-virtual {v3}, Lbdf;->b()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 13665
    sget v2, La;->eq:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13668
    :goto_0
    iget-object v2, p0, Lbmu;->h:Landroid/content/Context;

    .line 16597
    iget-object v3, v0, Laow;->c:Lbdf;

    .line 13669
    invoke-static {v2, v3}, Lblx;->a(Landroid/content/Context;Lbdf;)Ljava/lang/String;

    move-result-object v2

    .line 13668
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 13671
    new-instance v1, Lbmv;

    invoke-direct {v1, p0, v0, p1}, Lbmv;-><init>(Lbmu;Laow;Lboa;)V

    .line 17225
    iget-object v2, p1, Lboa;->l:Landroid/widget/TextView;

    .line 13678
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18225
    iget-object v2, p1, Lboa;->n:Landroid/view/View;

    .line 13679
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19225
    iget-object v2, p1, Lboa;->o:Landroid/widget/ImageView;

    .line 13680
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20225
    iget-object v1, p1, Lboa;->m:Landroid/widget/TextView;

    .line 13681
    new-instance v2, Lbni;

    invoke-direct {v2, p0, v0}, Lbni;-><init>(Lbmu;Laow;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 651
    :cond_0
    :goto_1
    return-void

    .line 13659
    :pswitch_0
    sget v2, La;->eo:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 13662
    :pswitch_1
    sget v2, La;->ep:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 640
    :cond_1
    instance-of v0, p1, Lboc;

    if-eqz v0, :cond_1f

    .line 641
    check-cast p1, Lboc;

    .line 20690
    invoke-direct {p0, p2}, Lbmu;->h(I)Laow;

    move-result-object v3

    .line 20691
    if-eqz v3, :cond_0

    .line 20694
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {v3}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 20695
    invoke-virtual {v3}, Laow;->o()Latu;

    move-result-object v4

    .line 21245
    iget-object v0, p1, Lboc;->m:Landroid/view/View;

    .line 20696
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 21760
    iget-object v0, v3, Laow;->t:Ljava/lang/String;

    .line 20698
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 20699
    invoke-virtual {v3}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    .line 23245
    :goto_2
    iget-object v1, p1, Lboc;->k:Landroid/widget/TextView;

    .line 20700
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20702
    const/4 v0, 0x0

    .line 20703
    const/4 v1, 0x0

    .line 23772
    iget-boolean v2, v3, Laow;->d:Z

    .line 20704
    if-eqz v2, :cond_c

    .line 24597
    iget-object v0, v3, Laow;->c:Lbdf;

    .line 25314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 20705
    if-nez v0, :cond_a

    const/4 v0, 0x1

    .line 25413
    :goto_3
    invoke-virtual {v3}, Laow;->e()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v3}, Laow;->d()Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, v3, Laow;->o:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x1

    .line 26245
    :goto_4
    iget-object v2, p1, Lboc;->t:Landroid/widget/ImageView;

    .line 20707
    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 27245
    iget-object v2, p1, Lboc;->t:Landroid/widget/ImageView;

    .line 20708
    new-instance v6, Lbnm;

    invoke-direct {v6, p0, v3, p1}, Lbnm;-><init>(Lbmu;Laow;Lboc;)V

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29245
    :goto_5
    iget-object v2, p1, Lboc;->u:Landroid/widget/ImageView;

    .line 20719
    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20721
    invoke-virtual {v3}, Laow;->s()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 30245
    iget-object v2, p1, Lboc;->x:Landroid/widget/TextView;

    .line 29865
    new-instance v6, Lbns;

    invoke-direct {v6, p0, v3}, Lbns;-><init>(Lbmu;Laow;)V

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31245
    iget-object v2, p1, Lboc;->w:Landroid/widget/ImageView;

    .line 29873
    new-instance v6, Lbmw;

    invoke-direct {v6, p0, v3}, Lbmw;-><init>(Lbmu;Laow;)V

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32245
    iget-object v2, p1, Lboc;->y:Landroid/widget/ImageView;

    .line 29881
    new-instance v6, Lbmx;

    invoke-direct {v6, p0, v3, p1}, Lbmx;-><init>(Lbmu;Laow;Lboc;)V

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33245
    iget-object v2, p1, Lboc;->z:Landroid/widget/ImageView;

    .line 29900
    new-instance v6, Lbmy;

    invoke-direct {v6, p0, v3, p1}, Lbmy;-><init>(Lbmu;Laow;Lboc;)V

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33934
    :cond_2
    iget-object v2, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v2}, Lblf;->r(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v3}, Laow;->d()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 34484
    iget-boolean v2, v3, Laow;->m:Z

    .line 33935
    if-eqz v2, :cond_d

    .line 35245
    iget-object v2, p1, Lboc;->v:Landroid/widget/TextView;

    .line 33936
    iget-object v6, p0, Lbmu;->h:Landroid/content/Context;

    sget v7, Lb;->W:I

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    .line 35552
    iget-object v10, v3, Laow;->l:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    iget v11, v3, Laow;->n:I

    sub-int/2addr v10, v11

    .line 33937
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    .line 36548
    iget-object v10, v3, Laow;->l:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    .line 33937
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    .line 33936
    invoke-virtual {v6, v7, v8}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37245
    iget-object v2, p1, Lboc;->D:Landroid/view/View;

    .line 33938
    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 38245
    iget-object v2, p1, Lboc;->y:Landroid/widget/ImageView;

    .line 33939
    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 39245
    iget-object v2, p1, Lboc;->z:Landroid/widget/ImageView;

    .line 33940
    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 40245
    iget-object v2, p1, Lboc;->y:Landroid/widget/ImageView;

    .line 33941
    invoke-virtual {v3}, Laow;->k()Z

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 41245
    iget-object v2, p1, Lboc;->z:Landroid/widget/ImageView;

    .line 33942
    invoke-virtual {v3}, Laow;->l()Z

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 33949
    :goto_6
    iget-object v2, p0, Lbmu;->h:Landroid/content/Context;

    invoke-static {v2}, Lblf;->r(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v3}, Laow;->d()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 44484
    iget-boolean v2, v3, Laow;->m:Z

    .line 33950
    if-nez v2, :cond_e

    invoke-virtual {v3}, Laow;->s()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 45245
    iget-object v2, p1, Lboc;->w:Landroid/widget/ImageView;

    .line 33951
    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 47245
    :goto_7
    iget-object v2, p1, Lboc;->s:Landroid/widget/ImageView;

    .line 20728
    invoke-virtual {v3}, Laow;->h()I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 48235
    iget-object v2, v4, Latu;->h:Ljava/lang/String;

    .line 20729
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_f

    .line 48245
    iget-object v0, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 20730
    const v2, 0x106000c

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->setBackgroundColor(I)V

    .line 49147
    const/4 v0, 0x0

    iget v2, p0, Lbmu;->o:I

    .line 49148
    invoke-virtual {v3}, Laow;->o()Latu;

    move-result-object v6

    .line 49235
    iget-object v6, v6, Latu;->h:Ljava/lang/String;

    .line 49147
    invoke-static {v0, v2, v6}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 49245
    iget-object v2, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 49152
    invoke-virtual {v2}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->getWidth()I

    move-result v2

    .line 50245
    iget-object v6, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 49152
    invoke-virtual {v6}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->getHeight()I

    move-result v6

    .line 49153
    invoke-virtual {v3}, Laow;->o()Latu;

    move-result-object v7

    .line 50246
    iget-object v7, v7, Latu;->i:Ljava/lang/String;

    .line 49151
    invoke-static {v2, v6, v7}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 50247
    iget-object v6, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 50248
    iget-object v7, v6, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->f:Ljava/lang/String;

    invoke-static {v0, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 50249
    iput-object v0, v6, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->f:Ljava/lang/String;

    .line 50251
    :cond_3
    iget-object v7, v6, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->g:Ljava/lang/String;

    invoke-static {v2, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 50252
    iput-object v2, v6, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->g:Ljava/lang/String;

    .line 49155
    :cond_4
    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v3}, Laow;->g()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    aput-object v0, v6, v7

    const/4 v7, 0x2

    aput-object v2, v6, v7

    .line 49157
    new-instance v6, Lbng;

    invoke-direct {v6, p0, v3, v0, p1}, Lbng;-><init>(Lbmu;Laow;Ljava/lang/String;Lboc;)V

    .line 49168
    iget-object v7, p0, Lbmu;->b:Latf;

    invoke-virtual {v7, v0, v6}, Latf;->a(Ljava/lang/String;Lats;)V

    .line 49170
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 49171
    new-instance v0, Lbnh;

    invoke-direct {v0, p0, v3, v2, p1}, Lbnh;-><init>(Lbmu;Laow;Ljava/lang/String;Lboc;)V

    .line 49182
    iget-object v6, p0, Lbmu;->b:Latf;

    invoke-virtual {v6, v2, v0}, Latf;->a(Ljava/lang/String;Lats;)V

    .line 50255
    :cond_5
    iget-object v0, p1, Lboc;->p:Landroid/view/View;

    .line 20732
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50264
    :goto_8
    iget-object v0, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 50265
    const-string v2, "233637DE"

    iget-object v6, v3, Laow;->o:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 50266
    iput-boolean v2, v0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->j:Z

    .line 50268
    iget-object v0, v4, Latu;->c:Ljava/lang/String;

    .line 20745
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 50269
    iget-object v0, p1, Lboc;->o:Landroid/view/View;

    .line 20746
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50270
    iget-object v0, p1, Lboc;->o:Landroid/view/View;

    .line 20747
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50273
    :goto_9
    iget-object v0, v4, Latu;->f:Ljava/lang/String;

    .line 20767
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 20768
    invoke-virtual {v3}, Laow;->d()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 20769
    sget v0, Lb;->Q:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 20776
    :cond_6
    :goto_a
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 20778
    sget v0, Lb;->ad:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 50275
    :cond_7
    iget-object v2, p1, Lboc;->q:Landroid/widget/TextView;

    .line 20780
    invoke-static {v2, v0}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 50276
    iget-object v2, p1, Lboc;->r:Landroid/widget/TextView;

    .line 50277
    iget-object v5, v4, Latu;->g:Ljava/lang/String;

    .line 20781
    invoke-static {v2, v5}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 50278
    iget-object v2, p1, Lboc;->m:Landroid/view/View;

    .line 50279
    iget-object v4, v4, Latu;->g:Ljava/lang/String;

    .line 20783
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, " "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 50280
    iget-object v0, p1, Lboc;->A:Landroid/view/View;

    .line 20785
    invoke-direct {p0, v0, v3}, Lbmu;->a(Landroid/view/View;Laow;)V

    .line 20786
    iget-object v0, p0, Lbmu;->f:Lbbn;

    if-nez v0, :cond_17

    const/4 v0, 0x0

    .line 20788
    :goto_b
    invoke-virtual {v3}, Laow;->e()Z

    move-result v2

    if-eqz v2, :cond_18

    if-eqz v0, :cond_18

    .line 50282
    iget-object v0, v0, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 50283
    iget-object v2, v3, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 50284
    iget-object v2, v2, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 20789
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 50285
    iget-object v0, p1, Lboc;->B:Landroid/view/View;

    .line 20790
    sget v2, Lb;->bi:I

    invoke-static {v0, v2}, Lblx;->a(Landroid/view/View;I)V

    .line 50286
    iget-object v0, p1, Lboc;->B:Landroid/view/View;

    .line 20792
    new-instance v2, Lbno;

    invoke-direct {v2, p0}, Lbno;-><init>(Lbmu;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50287
    iget-object v0, p1, Lboc;->A:Landroid/view/View;

    .line 20800
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 20806
    :goto_c
    if-eqz v1, :cond_1d

    .line 50289
    iget-object v0, p1, Lboc;->C:Landroid/view/View;

    .line 20807
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 50290
    iget-object v0, p1, Lboc;->C:Landroid/view/View;

    .line 20808
    sget v1, Lf;->ei:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lbnp;

    invoke-direct {v1, p0, v3}, Lbnp;-><init>(Lbmu;Laow;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20816
    invoke-virtual {v3}, Laow;->o()Latu;

    move-result-object v0

    .line 50291
    iget-object v2, v0, Latu;->d:Latv;

    .line 50292
    iget-object v0, p1, Lboc;->C:Landroid/view/View;

    .line 20818
    sget v1, Lf;->cQ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 20819
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Latv;->a()Z

    move-result v1

    if-nez v1, :cond_19

    .line 20820
    :cond_8
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 50294
    :goto_d
    iget-object v0, p1, Lboc;->C:Landroid/view/View;

    .line 20833
    sget v1, Lf;->ew:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 20834
    if-eqz v2, :cond_1c

    .line 20835
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20836
    new-instance v1, Lbnr;

    invoke-direct {v1, p0, v3}, Lbnr;-><init>(Lbmu;Laow;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20849
    :goto_e
    invoke-virtual {v3}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    .line 50296
    iget-object v1, v3, Laow;->c:Lbdf;

    .line 50297
    iget-object v1, v1, Lbdf;->R:Ljava/lang/String;

    .line 20851
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 50298
    iget-object v1, p1, Lboc;->l:Landroid/widget/TextView;

    .line 20852
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 50301
    :goto_f
    iget-object v1, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 20860
    invoke-virtual {v1, v0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 22760
    :cond_9
    iget-object v0, v3, Laow;->t:Ljava/lang/String;

    goto/16 :goto_2

    .line 20705
    :cond_a
    const/4 v0, 0x0

    goto/16 :goto_3

    .line 25413
    :cond_b
    const/4 v1, 0x0

    goto/16 :goto_4

    .line 28245
    :cond_c
    iget-object v2, p1, Lboc;->t:Landroid/widget/ImageView;

    .line 20716
    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_5

    .line 42245
    :cond_d
    iget-object v2, p1, Lboc;->D:Landroid/view/View;

    .line 33944
    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 43245
    iget-object v2, p1, Lboc;->y:Landroid/widget/ImageView;

    .line 33945
    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 44245
    iget-object v2, p1, Lboc;->z:Landroid/widget/ImageView;

    .line 33946
    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_6

    .line 46245
    :cond_e
    iget-object v2, p1, Lboc;->w:Landroid/widget/ImageView;

    .line 33953
    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_7

    .line 20733
    :cond_f
    invoke-virtual {v3}, Laow;->e()Z

    move-result v2

    if-eqz v2, :cond_10

    .line 50256
    iget-object v2, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 20734
    sget-object v0, Lbnw;->e:Lbnw;

    .line 20737
    :goto_10
    invoke-virtual {v2, v0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Lbnw;)V

    .line 50263
    iget-object v0, p1, Lboc;->p:Landroid/view/View;

    .line 20738
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_8

    .line 50258
    :cond_10
    iget-object v2, p1, Lboc;->n:Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;

    .line 50259
    if-eqz v0, :cond_12

    .line 50260
    if-eqz v1, :cond_11

    sget-object v0, Lbnw;->a:Lbnw;

    goto :goto_10

    :cond_11
    sget-object v0, Lbnw;->b:Lbnw;

    goto :goto_10

    .line 50262
    :cond_12
    if-eqz v1, :cond_13

    sget-object v0, Lbnw;->c:Lbnw;

    goto :goto_10

    :cond_13
    sget-object v0, Lbnw;->d:Lbnw;

    goto :goto_10

    .line 50271
    :cond_14
    iget-object v2, p1, Lboc;->o:Landroid/view/View;

    .line 20749
    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 50272
    iget-object v2, p1, Lboc;->o:Landroid/view/View;

    .line 20750
    new-instance v6, Lbnn;

    invoke-direct {v6, p0, v0, v4}, Lbnn;-><init>(Lbmu;Ljava/lang/String;Latu;)V

    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_9

    .line 20770
    :cond_15
    invoke-virtual {v3}, Laow;->e()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 20771
    sget v0, Lb;->ax:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_a

    .line 50274
    :cond_16
    iget-object v0, v3, Laow;->p:Ljava/lang/String;

    goto/16 :goto_a

    .line 20787
    :cond_17
    iget-object v0, p0, Lbmu;->f:Lbbn;

    .line 50281
    iget-object v0, v0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    goto/16 :goto_b

    .line 50288
    :cond_18
    iget-object v0, p1, Lboc;->B:Landroid/view/View;

    .line 20802
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_c

    .line 20822
    :cond_19
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 50293
    iget v1, v2, Latv;->a:I

    const/4 v4, 0x1

    if-ne v1, v4, :cond_1a

    const/4 v1, 0x1

    .line 20823
    :goto_11
    if-eqz v1, :cond_1b

    .line 20824
    sget v1, La;->eH:I

    .line 20823
    :goto_12
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 20825
    new-instance v1, Lbnq;

    invoke-direct {v1, p0, v3}, Lbnq;-><init>(Lbmu;Laow;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_d

    .line 50293
    :cond_1a
    const/4 v1, 0x0

    goto :goto_11

    .line 20824
    :cond_1b
    sget v1, La;->eJ:I

    goto :goto_12

    .line 20843
    :cond_1c
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_e

    .line 50295
    :cond_1d
    iget-object v0, p1, Lboc;->C:Landroid/view/View;

    .line 20846
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_e

    .line 20854
    :cond_1e
    iget-object v2, p0, Lbmu;->h:Landroid/content/Context;

    sget v3, Lb;->ch:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 50299
    iget-object v2, p1, Lboc;->l:Landroid/widget/TextView;

    .line 20855
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50300
    iget-object v2, p1, Lboc;->l:Landroid/widget/TextView;

    .line 20856
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20858
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_f

    .line 642
    :cond_1f
    instance-of v0, p1, Lbnt;

    if-eqz v0, :cond_24

    .line 643
    check-cast p1, Lbnt;

    .line 50352
    iget-object v0, p1, Lbnt;->o:Landroid/widget/TextView;

    .line 50302
    iget-object v1, p0, Lbmu;->l:Ldal;

    iget-object v1, v1, Ldal;->k:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 50353
    iget-object v0, p1, Lbnt;->k:Landroid/widget/TextView;

    .line 50303
    iget-object v1, p0, Lbmu;->l:Ldal;

    iget-object v1, v1, Ldal;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50305
    iget-object v0, p1, Lbnt;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 50306
    iget-object v1, p0, Lbmu;->l:Ldal;

    iget v1, v1, Ldal;->j:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_21

    .line 50354
    iget-object v1, p1, Lbnt;->p:Landroid/view/ViewGroup;

    .line 50307
    sget v2, La;->dr:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 50356
    :goto_13
    iget-object v1, p1, Lbnt;->m:Landroid/widget/TextView;

    .line 50313
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 50357
    iget-object v1, p1, Lbnt;->n:Landroid/widget/TextView;

    .line 50314
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 50316
    iget-object v1, p0, Lbmu;->l:Ldal;

    iget-object v1, v1, Ldal;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_23

    .line 50358
    iget-object v1, p1, Lbnt;->l:Landroid/widget/ImageView;

    .line 50317
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 50359
    iget v1, p1, Lzr;->e:I

    .line 50320
    const/4 v2, 0x3

    if-ne v1, v2, :cond_22

    .line 50321
    iget v0, p0, Lbmu;->j:I

    const/4 v1, 0x0

    iget-object v2, p0, Lbmu;->l:Ldal;

    iget-object v2, v2, Ldal;->f:Ljava/lang/String;

    .line 50322
    invoke-static {v0, v1, v2}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50360
    :goto_14
    new-instance v1, Lbnj;

    invoke-direct {v1, p0, p1}, Lbnj;-><init>(Lbmu;Lbnt;)V

    .line 50373
    iget-object v2, p0, Lbmu;->b:Latf;

    invoke-virtual {v2, v0, v1}, Latf;->a(Ljava/lang/String;Lats;)V

    .line 50334
    :goto_15
    iget-object v0, p0, Lbmu;->l:Ldal;

    iget-object v0, v0, Ldal;->h:Ldak;

    if-eqz v0, :cond_20

    .line 50335
    iget-object v0, p0, Lbmu;->l:Ldal;

    iget-object v0, v0, Ldal;->h:Ldak;

    iget-object v1, p0, Lbmu;->l:Ldal;

    iget-object v1, v1, Ldal;->a:Ljava/lang/Long;

    invoke-direct {p0, v0, v1}, Lbmu;->a(Ldak;Ljava/lang/Long;)Landroid/view/View$OnClickListener;

    move-result-object v0

    .line 50336
    if-eqz v0, :cond_20

    .line 50376
    iget-object v1, p1, Lbnt;->m:Landroid/widget/TextView;

    .line 50337
    iget-object v2, p0, Lbmu;->l:Ldal;

    iget-object v2, v2, Ldal;->h:Ldak;

    iget-object v2, v2, Ldak;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 50377
    iget-object v1, p1, Lbnt;->m:Landroid/widget/TextView;

    .line 50338
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50378
    iget-object v0, p1, Lbnt;->m:Landroid/widget/TextView;

    .line 50339
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 50343
    :cond_20
    iget-object v0, p0, Lbmu;->l:Ldal;

    iget-object v0, v0, Ldal;->i:Ldak;

    if-eqz v0, :cond_0

    .line 50344
    iget-object v0, p0, Lbmu;->l:Ldal;

    iget-object v0, v0, Ldal;->i:Ldak;

    iget-object v1, p0, Lbmu;->l:Ldal;

    iget-object v1, v1, Ldal;->a:Ljava/lang/Long;

    invoke-direct {p0, v0, v1}, Lbmu;->a(Ldak;Ljava/lang/Long;)Landroid/view/View$OnClickListener;

    move-result-object v0

    .line 50345
    if-eqz v0, :cond_0

    .line 50379
    iget-object v1, p1, Lbnt;->n:Landroid/widget/TextView;

    .line 50346
    iget-object v2, p0, Lbmu;->l:Ldal;

    iget-object v2, v2, Ldal;->i:Ldak;

    iget-object v2, v2, Ldak;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 50380
    iget-object v1, p1, Lbnt;->n:Landroid/widget/TextView;

    .line 50347
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50381
    iget-object v0, p1, Lbnt;->n:Landroid/widget/TextView;

    .line 50348
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 50355
    :cond_21
    iget-object v1, p1, Lbnt;->p:Landroid/view/ViewGroup;

    .line 50309
    sget v2, La;->do:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    goto/16 :goto_13

    .line 50324
    :cond_22
    sget v1, La;->dP:I

    .line 50325
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, La;->dO:I

    .line 50326
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iget-object v2, p0, Lbmu;->l:Ldal;

    iget-object v2, v2, Ldal;->f:Ljava/lang/String;

    .line 50324
    invoke-static {v1, v0, v2}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_14

    .line 50375
    :cond_23
    iget-object v0, p1, Lbnt;->l:Landroid/widget/ImageView;

    .line 50331
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_15

    .line 644
    :cond_24
    instance-of v0, p1, Lbny;

    if-eqz v0, :cond_26

    move-object v5, p1

    .line 645
    check-cast v5, Lbny;

    .line 50416
    iget-object v0, v5, Lbny;->k:Landroid/widget/TextView;

    .line 50382
    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    sget v2, Lb;->bC:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v6, p0, Lbmu;->c:Ljava/util/List;

    .line 50383
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 50382
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50387
    iget-boolean v0, v5, Lbny;->n:Z

    if-eqz v0, :cond_25

    .line 50388
    iget-object v0, p0, Lbmu;->h:Landroid/content/Context;

    .line 50389
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dU:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 50390
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lbmu;->j:I

    iget-object v3, p0, Lbmu;->c:Ljava/util/List;

    .line 50391
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    mul-int/2addr v0, v3

    invoke-direct {v1, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 50417
    iget-object v0, v5, Lbny;->l:Landroid/widget/ListView;

    .line 50392
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50395
    :cond_25
    new-instance v0, Lbnb;

    iget-object v2, p0, Lbmu;->h:Landroid/content/Context;

    sget v3, La;->gc:I

    iget-object v4, p0, Lbmu;->c:Ljava/util/List;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lbnb;-><init>(Lbmu;Landroid/content/Context;ILjava/util/List;Lbny;)V

    .line 50418
    iget-object v1, v5, Lbny;->l:Landroid/widget/ListView;

    .line 50414
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto/16 :goto_1

    .line 646
    :cond_26
    instance-of v0, p1, Lbnu;

    if-eqz v0, :cond_28

    .line 647
    check-cast p1, Lbnu;

    .line 50462
    iget-object v0, p1, Lbnu;->k:Landroid/widget/TextView;

    .line 50419
    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    sget v2, Lb;->de:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lbmu;->d:Ljava/util/List;

    .line 50420
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 50419
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50463
    iget-boolean v0, p1, Lbnu;->n:Z

    .line 50424
    if-eqz v0, :cond_27

    .line 50425
    iget-object v0, p0, Lbmu;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dC:I

    .line 50426
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 50427
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lbmu;->j:I

    iget-object v3, p0, Lbmu;->d:Ljava/util/List;

    .line 50428
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    mul-int/2addr v0, v3

    invoke-direct {v1, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 50464
    iget-object v0, p1, Lbnu;->l:Landroid/widget/ListView;

    .line 50429
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50432
    :cond_27
    new-instance v0, Lbnd;

    iget-object v1, p0, Lbmu;->h:Landroid/content/Context;

    sget v2, La;->fx:I

    iget-object v3, p0, Lbmu;->d:Ljava/util/List;

    invoke-direct {v0, p0, v1, v2, v3}, Lbnd;-><init>(Lbmu;Landroid/content/Context;ILjava/util/List;)V

    .line 50465
    iget-object v1, p1, Lbnu;->l:Landroid/widget/ListView;

    .line 50460
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto/16 :goto_1

    .line 649
    :cond_28
    iget-object v0, p0, Lbmu;->n:Lblp;

    const-string v1, "Unknown view holder: %s, at position: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 13657
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 488
    if-eqz p1, :cond_0

    .line 489
    new-array v0, v0, [Ljava/lang/Object;

    .line 8596
    invoke-virtual {p0}, Lbmu;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 490
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 9596
    invoke-virtual {p0}, Lbmu;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 491
    invoke-virtual {p0, v0}, Lbmu;->d(I)V

    .line 497
    :goto_0
    return-void

    .line 493
    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 10596
    invoke-virtual {p0}, Lbmu;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 494
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 11596
    invoke-virtual {p0}, Lbmu;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 495
    invoke-virtual {p0, v0}, Lbmu;->b(I)V

    goto :goto_0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 600
    iget-object v0, p0, Lbmu;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 601
    invoke-virtual {p0}, Lbmu;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 603
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lbmu;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    goto :goto_0
.end method

.method public final e(I)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 432
    iget-object v2, p0, Lbmu;->l:Ldal;

    if-eqz v2, :cond_0

    .line 433
    add-int/lit8 p1, p1, 0x1

    .line 435
    :cond_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    iget-object v3, p0, Lbmu;->l:Ldal;

    if-eqz v3, :cond_1

    move v0, v1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v2, v1

    .line 436
    invoke-super {p0, p1}, Lyz;->b(I)V

    .line 437
    return-void
.end method

.method public final f(I)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 440
    iget-object v2, p0, Lbmu;->l:Ldal;

    if-eqz v2, :cond_0

    .line 441
    add-int/lit8 p1, p1, 0x1

    .line 443
    :cond_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    iget-object v3, p0, Lbmu;->l:Ldal;

    if-eqz v3, :cond_1

    move v0, v1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v2, v1

    .line 444
    invoke-super {p0, p1}, Lyz;->c(I)V

    .line 445
    return-void
.end method

.method public final g(I)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 448
    iget-object v2, p0, Lbmu;->l:Ldal;

    if-eqz v2, :cond_0

    .line 449
    add-int/lit8 p1, p1, 0x1

    .line 451
    :cond_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    iget-object v3, p0, Lbmu;->l:Ldal;

    if-eqz v3, :cond_1

    move v0, v1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v2, v1

    .line 452
    invoke-super {p0, p1}, Lyz;->d(I)V

    .line 453
    return-void
.end method
