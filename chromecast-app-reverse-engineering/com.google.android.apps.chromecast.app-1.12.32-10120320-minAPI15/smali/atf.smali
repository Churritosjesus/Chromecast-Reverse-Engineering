.class public final Latf;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static n:Latf;


# instance fields
.field public final a:Landroid/content/Context;

.field final b:Landroid/content/SharedPreferences;

.field public c:Lj;

.field public d:Lblq;

.field e:Lbkm;

.field public f:Ldax;

.field public g:Ldaz;

.field h:Z

.field i:Ljava/util/List;

.field j:Ljava/util/List;

.field public final k:Ljava/util/ArrayList;

.field public l:Ladv;

.field public m:Laer;

.field private final o:Ljava/lang/String;

.field private final p:Lblp;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Latf;->i:Ljava/util/List;

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Latf;->j:Ljava/util/List;

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Latf;->k:Ljava/util/ArrayList;

    .line 124
    new-instance v0, Lblp;

    const-string v1, "BackdropServer"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Latf;->p:Lblp;

    .line 126
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Latf;->a:Landroid/content/Context;

    .line 127
    iget-object v0, p0, Latf;->a:Landroid/content/Context;

    invoke-static {v0}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Latf;->o:Ljava/lang/String;

    .line 128
    iget-object v0, p0, Latf;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Latf;->b:Landroid/content/SharedPreferences;

    .line 131
    new-instance v0, Laej;

    new-instance v1, Lbgl;

    invoke-direct {v1}, Lbgl;-><init>()V

    invoke-direct {v0, v1}, Laej;-><init>(Laep;)V

    .line 132
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Latf;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "volley"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 133
    new-instance v2, Ladv;

    new-instance v3, Laem;

    invoke-direct {v3, v1}, Laem;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3, v0}, Ladv;-><init>(Ladg;Ladm;)V

    iput-object v2, p0, Latf;->l:Ladv;

    .line 134
    iget-object v0, p0, Latf;->l:Ladv;

    invoke-virtual {v0}, Ladv;->a()V

    .line 136
    new-instance v0, Lblq;

    iget-object v1, p0, Latf;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lblq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Latf;->d:Lblq;

    .line 137
    new-instance v0, Laer;

    iget-object v1, p0, Latf;->l:Ladv;

    iget-object v2, p0, Latf;->d:Lblq;

    invoke-direct {v0, v1, v2}, Laer;-><init>(Ladv;Laew;)V

    iput-object v0, p0, Latf;->m:Laer;

    .line 139
    new-instance v0, Lbkm;

    invoke-direct {v0}, Lbkm;-><init>()V

    iput-object v0, p0, Latf;->e:Lbkm;

    .line 140
    return-void
.end method

.method private a(Ljava/lang/String;Laey;)Laex;
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Latf;->m:Laer;

    invoke-virtual {v0, p1, p2}, Laer;->a(Ljava/lang/String;Laey;)Laex;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Latf;
    .locals 1

    .prologue
    .line 171
    sget-object v0, Latf;->n:Latf;

    if-nez v0, :cond_0

    .line 172
    new-instance v0, Latf;

    invoke-direct {v0, p0}, Latf;-><init>(Landroid/content/Context;)V

    sput-object v0, Latf;->n:Latf;

    .line 174
    :cond_0
    sget-object v0, Latf;->n:Latf;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/widget/ImageView;Z)Laex;
    .locals 2

    .prologue
    .line 211
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 212
    new-instance v0, Lati;

    invoke-direct {v0, p0, p1, p3, p2}, Lati;-><init>(Latf;Ljava/lang/String;ZLandroid/widget/ImageView;)V

    invoke-direct {p0, p1, v0}, Latf;->a(Ljava/lang/String;Laey;)Laex;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Laow;)Laui;
    .locals 4

    .prologue
    .line 353
    new-instance v0, Laui;

    iget-object v1, p0, Latf;->o:Ljava/lang/String;

    .line 2474
    iget-object v2, p2, Laow;->j:Ljava/lang/String;

    .line 355
    new-instance v3, Latm;

    invoke-direct {v3, p0, p2}, Latm;-><init>(Latf;Laow;)V

    invoke-direct {v0, v1, v2, p1, v3}, Laui;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laea;)V

    .line 365
    return-object v0
.end method

.method a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 459
    :try_start_0
    invoke-static {p1, p2, p3}, Lbsn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lbso; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lbsp; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v1

    .line 489
    :cond_0
    :goto_0
    return-object v1

    .line 460
    :catch_0
    move-exception v2

    .line 463
    new-array v0, v4, [Ljava/lang/Object;

    aput-object v2, v0, v3

    .line 2516
    iget-object v0, p0, Latf;->c:Lj;

    if-nez v0, :cond_1

    move-object v0, v1

    .line 465
    :goto_1
    if-eqz v0, :cond_0

    .line 3000
    iget v2, v2, Lbso;->a:I

    .line 469
    new-instance v3, Latp;

    invoke-direct {v3, p0, v0, v2}, Latp;-><init>(Latf;Lm;I)V

    invoke-virtual {v0, v3}, Lm;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 2519
    :cond_1
    iget-object v0, p0, Latf;->c:Lj;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    goto :goto_1

    .line 475
    :catch_1
    move-exception v2

    .line 478
    new-array v0, v4, [Ljava/lang/Object;

    aput-object v2, v0, v3

    .line 479
    iget-object v0, p0, Latf;->c:Lj;

    if-eqz v0, :cond_0

    .line 480
    iget-object v3, p0, Latf;->c:Lj;

    .line 4000
    iget-object v0, v2, Lbsp;->b:Landroid/content/Intent;

    if-nez v0, :cond_2

    move-object v0, v1

    .line 480
    :goto_2
    const/16 v2, 0x3e8

    invoke-virtual {v3, v0, v2}, Lj;->a(Landroid/content/Intent;I)V

    goto :goto_0

    .line 4000
    :cond_2
    new-instance v0, Landroid/content/Intent;

    iget-object v2, v2, Lbsp;->b:Landroid/content/Intent;

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    goto :goto_2

    .line 483
    :catch_2
    move-exception v0

    .line 487
    new-array v2, v4, [Ljava/lang/Object;

    aput-object v0, v2, v3

    goto :goto_0
.end method

.method public a()V
    .locals 4

    .prologue
    .line 373
    iget-object v1, p0, Latf;->k:Ljava/util/ArrayList;

    monitor-enter v1

    .line 374
    :try_start_0
    iget-object v0, p0, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 375
    monitor-exit v1

    .line 386
    :goto_0
    return-void

    .line 377
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 378
    new-instance v0, Latn;

    invoke-direct {v0, p0}, Latn;-><init>(Latf;)V

    .line 385
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Void;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 377
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Lads;)V
    .locals 3

    .prologue
    .line 314
    instance-of v0, p1, Latb;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Latb;

    .line 315
    invoke-virtual {v0}, Latb;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 316
    :cond_0
    iget-object v0, p0, Latf;->l:Ladv;

    invoke-virtual {v0, p1}, Ladv;->a(Lads;)Lads;

    .line 329
    :goto_0
    return-void

    .line 319
    :cond_1
    check-cast p1, Latb;

    .line 320
    iget-object v1, p0, Latf;->k:Ljava/util/ArrayList;

    monitor-enter v1

    .line 321
    :try_start_0
    iget-object v0, p0, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    iget-object v0, p0, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_2

    .line 325
    monitor-exit v1

    goto :goto_0

    .line 327
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 328
    invoke-virtual {p0}, Latf;->a()V

    goto :goto_0
.end method

.method public final a(Latb;)V
    .locals 4

    .prologue
    .line 337
    .line 1163
    iget-object v2, p1, Lads;->k:Ljava/lang/Object;

    .line 338
    iget-object v0, p0, Latf;->l:Ladv;

    .line 1211
    if-nez v2, :cond_0

    .line 1212
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot cancelAll with a null tag"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1214
    :cond_0
    new-instance v1, Ladw;

    invoke-direct {v1, v0, v2}, Ladw;-><init>(Ladv;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ladv;->a(Ladx;)V

    .line 339
    iget-object v3, p0, Latf;->k:Ljava/util/ArrayList;

    monitor-enter v3

    .line 343
    :try_start_0
    iget-object v0, p0, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-lez v1, :cond_2

    .line 344
    iget-object v0, p0, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Latb;

    .line 2163
    iget-object v0, v0, Lads;->k:Ljava/lang/Object;

    .line 344
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 345
    iget-object v0, p0, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 343
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 348
    :cond_2
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    invoke-virtual {p0, p1}, Latf;->a(Lads;)V

    .line 350
    return-void

    .line 348
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Latr;Ladz;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 535
    iget-object v0, p0, Latf;->f:Ldax;

    if-eqz v0, :cond_1

    .line 538
    iget-object v0, p0, Latf;->f:Ldax;

    invoke-interface {p1, v0}, Latr;->a(Ldax;)V

    .line 605
    :cond_0
    :goto_0
    return-void

    .line 544
    :cond_1
    iget-object v0, p0, Latf;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 546
    if-eqz p2, :cond_2

    .line 547
    iget-object v0, p0, Latf;->j:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 549
    :cond_2
    iget-boolean v0, p0, Latf;->h:Z

    if-nez v0, :cond_0

    .line 554
    new-instance v0, Lday;

    invoke-direct {v0}, Lday;-><init>()V

    .line 555
    const/4 v1, 0x0

    invoke-static {v1}, Lblx;->a([Ljava/lang/String;)Ldax;

    move-result-object v1

    iput-object v1, v0, Lday;->a:Ldax;

    .line 556
    new-array v1, v4, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 557
    new-instance v1, Lawl;

    new-instance v2, Latq;

    invoke-direct {v2, p0}, Latq;-><init>(Latf;)V

    new-instance v3, Lath;

    invoke-direct {v3, p0}, Lath;-><init>(Latf;)V

    invoke-direct {v1, v0, v2, v3}, Lawl;-><init>(Lday;Laea;Ladz;)V

    .line 603
    iput-boolean v4, p0, Latf;->h:Z

    .line 604
    invoke-virtual {p0, v1}, Latf;->a(Lads;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Laea;Z)V
    .locals 2

    .prologue
    .line 284
    new-instance v0, Latk;

    invoke-direct {v0, p0, p1, p2, p3}, Latk;-><init>(Latf;Ljava/lang/String;Laea;Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Latf;->a(Latr;Ladz;)V

    .line 306
    return-void
.end method

.method public final a(Ljava/lang/String;Lats;)V
    .locals 1

    .prologue
    .line 239
    new-instance v0, Latj;

    invoke-direct {v0, p0, p1, p2}, Latj;-><init>(Latf;Ljava/lang/String;Lats;)V

    .line 254
    invoke-direct {p0, p1, v0}, Latf;->a(Ljava/lang/String;Laey;)Laex;

    .line 255
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 634
    const-string v0, ","

    iget-object v1, p0, Latf;->f:Ldax;

    iget-object v1, v1, Ldax;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 635
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 636
    const/16 v1, 0x9c

    invoke-static {v1}, Lapg;->a(I)Lapg;

    move-result-object v1

    .line 4084
    iput-object v0, v1, Lapg;->b:Ljava/lang/String;

    .line 638
    invoke-virtual {v1}, Lapg;->b()V

    .line 639
    return-void
.end method
