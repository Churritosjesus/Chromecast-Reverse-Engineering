.class final Lc;
.super Laf;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static n:Z


# instance fields
.field a:Lb;

.field b:I

.field c:I

.field d:I

.field e:Z

.field f:Ljava/lang/String;

.field g:I

.field h:I

.field i:Ljava/lang/CharSequence;

.field j:I

.field k:Ljava/lang/CharSequence;

.field l:Ljava/util/ArrayList;

.field m:Ljava/util/ArrayList;

.field private o:Lt;

.field private p:Lb;

.field private q:Z

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 194
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lc;->n:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lt;)V
    .locals 1

    .prologue
    .line 356
    invoke-direct {p0}, Laf;-><init>()V

    .line 229
    const/4 v0, 0x1

    iput-boolean v0, p0, Lc;->q:Z

    .line 232
    const/4 v0, -0x1

    iput v0, p0, Lc;->g:I

    .line 357
    iput-object p1, p0, Lc;->o:Lt;

    .line 358
    return-void
.end method

.method private a(Z)I
    .locals 2

    .prologue
    .line 624
    iget-boolean v0, p0, Lc;->r:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "commit already called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 625
    :cond_0
    sget-boolean v0, Lt;->a:Z

    .line 631
    const/4 v0, 0x1

    iput-boolean v0, p0, Lc;->r:Z

    .line 632
    iget-boolean v0, p0, Lc;->e:Z

    if-eqz v0, :cond_1

    .line 633
    iget-object v0, p0, Lc;->o:Lt;

    invoke-virtual {v0, p0}, Lt;->a(Lc;)I

    move-result v0

    iput v0, p0, Lc;->g:I

    .line 637
    :goto_0
    iget-object v0, p0, Lc;->o:Lt;

    invoke-virtual {v0, p0, p1}, Lt;->a(Ljava/lang/Runnable;Z)V

    .line 638
    iget v0, p0, Lc;->g:I

    return v0

    .line 635
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lc;->g:I

    goto :goto_0
.end method

.method static synthetic a(Lc;Lf;ZLj;)Led;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 191
    .line 20343
    new-instance v0, Led;

    invoke-direct {v0}, Led;-><init>()V

    .line 21065
    iget-object v1, p3, Lj;->N:Landroid/view/View;

    .line 20345
    if-eqz v1, :cond_0

    .line 20346
    iget-object v2, p0, Lc;->l:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    .line 20347
    invoke-static {v0, v1}, La;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 20348
    if-eqz p2, :cond_1

    .line 20349
    iget-object v1, p0, Lc;->l:Ljava/util/ArrayList;

    iget-object v2, p0, Lc;->m:Ljava/util/ArrayList;

    invoke-static {v1, v2, v0}, Lc;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Led;)Led;

    move-result-object v0

    .line 20292
    :cond_0
    :goto_0
    if-eqz p2, :cond_2

    .line 20293
    iget-object v1, p3, Lj;->Y:Lax;

    .line 20297
    invoke-direct {p0, p1, v0, v3}, Lc;->a(Lf;Led;Z)V

    .line 191
    :goto_1
    return-object v0

    .line 20352
    :cond_1
    iget-object v1, p0, Lc;->m:Ljava/util/ArrayList;

    .line 21161
    invoke-static {v0, v1}, Lei;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    goto :goto_0

    .line 20299
    :cond_2
    iget-object v1, p3, Lj;->X:Lax;

    .line 20303
    invoke-static {p1, v0, v3}, Lc;->b(Lf;Led;Z)V

    goto :goto_1
.end method

.method private a(Lf;Lj;Z)Led;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1092
    new-instance v0, Led;

    invoke-direct {v0}, Led;-><init>()V

    .line 1093
    iget-object v1, p0, Lc;->l:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 6065
    iget-object v1, p2, Lj;->N:Landroid/view/View;

    .line 1094
    invoke-static {v0, v1}, La;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 1095
    if-eqz p3, :cond_1

    .line 1096
    iget-object v1, p0, Lc;->m:Ljava/util/ArrayList;

    .line 6161
    invoke-static {v0, v1}, Lei;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 1103
    :cond_0
    :goto_0
    if-eqz p3, :cond_2

    .line 1104
    iget-object v1, p2, Lj;->X:Lax;

    .line 1108
    invoke-direct {p0, p1, v0, v3}, Lc;->a(Lf;Led;Z)V

    .line 1117
    :goto_1
    return-object v0

    .line 1098
    :cond_1
    iget-object v1, p0, Lc;->l:Ljava/util/ArrayList;

    iget-object v2, p0, Lc;->m:Ljava/util/ArrayList;

    invoke-static {v1, v2, v0}, Lc;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Led;)Led;

    move-result-object v0

    goto :goto_0

    .line 1110
    :cond_2
    iget-object v1, p2, Lj;->Y:Lax;

    .line 1114
    invoke-static {p1, v0, v3}, Lc;->b(Lf;Led;Z)V

    goto :goto_1
.end method

.method private static a(Ljava/util/ArrayList;Ljava/util/ArrayList;Led;)Led;
    .locals 5

    .prologue
    .line 1318
    invoke-virtual {p2}, Led;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1329
    :goto_0
    return-object p2

    .line 1321
    :cond_0
    new-instance v1, Led;

    invoke-direct {v1}, Led;-><init>()V

    .line 1322
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 1323
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-ge v2, v3, :cond_2

    .line 1324
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1325
    if-eqz v0, :cond_1

    .line 1326
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4, v0}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1323
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_2
    move-object p2, v1

    .line 1329
    goto :goto_0
.end method

.method private a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Lf;
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v7, 0x0

    .line 1021
    new-instance v2, Lf;

    invoke-direct {v2, p0}, Lf;-><init>(Lc;)V

    .line 1026
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lc;->o:Lt;

    iget-object v1, v1, Lt;->h:Lm;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, v2, Lf;->d:Landroid/view/View;

    move v6, v7

    move v8, v7

    .line 1030
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 1031
    invoke-virtual {p1, v6}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    move-object v0, p0

    move v3, p3

    move-object v4, p1

    move-object v5, p2

    .line 1032
    invoke-direct/range {v0 .. v5}, Lc;->a(ILf;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v9

    .line 1030
    :goto_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    move v8, v1

    goto :goto_0

    .line 1039
    :cond_0
    :goto_2
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 1040
    invoke-virtual {p2, v7}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    .line 1041
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, p0

    move v3, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lc;->a(ILf;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v8, v9

    .line 1039
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 1048
    :cond_2
    if-nez v8, :cond_3

    .line 1049
    const/4 v2, 0x0

    .line 1052
    :cond_3
    return-object v2

    :cond_4
    move v1, v8

    goto :goto_1
.end method

.method private static a(Ljava/lang/Object;Lj;Ljava/util/ArrayList;Led;Landroid/view/View;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1083
    if-eqz p0, :cond_1

    .line 5065
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    .line 6049
    if-eqz p0, :cond_1

    .line 6050
    invoke-static {p2, v0}, La;->a(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 6051
    if-eqz p3, :cond_0

    .line 6052
    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 6054
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6055
    const/4 p0, 0x0

    .line 1087
    :cond_1
    :goto_0
    return-object p0

    .line 6057
    :cond_2
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, p0

    .line 6058
    check-cast v0, Landroid/transition/Transition;

    invoke-static {v0, p2}, La;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    goto :goto_0
.end method

.method private a(ILj;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 417
    iget-object v0, p0, Lc;->o:Lt;

    iput-object v0, p2, Lj;->x:Lt;

    .line 419
    if-eqz p3, :cond_1

    .line 420
    iget-object v0, p2, Lj;->D:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lj;->D:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change tag of fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p2, Lj;->D:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " now "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 425
    :cond_0
    iput-object p3, p2, Lj;->D:Ljava/lang/String;

    .line 428
    :cond_1
    if-eqz p1, :cond_3

    .line 429
    iget v0, p2, Lj;->B:I

    if-eqz v0, :cond_2

    iget v0, p2, Lj;->B:I

    if-eq v0, p1, :cond_2

    .line 430
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t change container ID of fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lj;->B:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " now "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 434
    :cond_2
    iput p1, p2, Lj;->B:I

    iput p1, p2, Lj;->C:I

    .line 437
    :cond_3
    new-instance v0, Lb;

    invoke-direct {v0}, Lb;-><init>()V

    .line 438
    iput p4, v0, Lb;->c:I

    .line 439
    iput-object p2, v0, Lb;->d:Lj;

    .line 440
    invoke-virtual {p0, v0}, Lc;->a(Lb;)V

    .line 441
    return-void
.end method

.method private static a(Landroid/util/SparseArray;Lj;)V
    .locals 2

    .prologue
    .line 748
    if-eqz p1, :cond_0

    .line 749
    iget v0, p1, Lj;->C:I

    .line 750
    if-eqz v0, :cond_0

    .line 3762
    iget-boolean v1, p1, Lj;->E:Z

    .line 750
    if-nez v1, :cond_0

    invoke-virtual {p1}, Lj;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4065
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    .line 750
    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 752
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 755
    :cond_0
    return-void
.end method

.method static synthetic a(Lc;Led;Lf;)V
    .locals 2

    .prologue
    .line 191
    .line 21275
    iget-object v0, p0, Lc;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Led;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 21277
    iget-object v0, p0, Lc;->m:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 21279
    if-eqz v0, :cond_0

    .line 21280
    iget-object v1, p2, Lf;->c:Lak;

    iput-object v0, v1, Lak;->a:Landroid/view/View;

    .line 191
    :cond_0
    return-void
.end method

.method static synthetic a(Lc;Lf;ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 191
    invoke-direct {p0, p1, p2, p3}, Lc;->a(Lf;ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lc;Lf;Lj;Lj;ZLed;)V
    .locals 1

    .prologue
    .line 191
    .line 22264
    if-eqz p4, :cond_0

    iget-object v0, p3, Lj;->X:Lax;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p2, Lj;->X:Lax;

    goto :goto_0
.end method

.method private static a(Led;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1395
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1396
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Led;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1397
    invoke-virtual {p0, v0}, Led;->c(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1398
    invoke-virtual {p0, v0, p2}, Led;->a(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1404
    :cond_0
    :goto_1
    return-void

    .line 1396
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1402
    :cond_2
    invoke-virtual {p0, p1, p2}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method private a(Lf;ILjava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 1372
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    move v1, v2

    .line 1373
    :goto_0
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1374
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1375
    iget-object v3, v0, Lj;->N:Landroid/view/View;

    if-eqz v3, :cond_0

    iget-object v3, v0, Lj;->M:Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    iget v3, v0, Lj;->C:I

    if-ne v3, p2, :cond_0

    .line 1377
    iget-boolean v3, v0, Lj;->E:Z

    if-eqz v3, :cond_1

    .line 1378
    iget-object v3, p1, Lf;->b:Ljava/util/ArrayList;

    iget-object v4, v0, Lj;->N:Landroid/view/View;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1379
    iget-object v3, v0, Lj;->N:Landroid/view/View;

    const/4 v4, 0x1

    invoke-static {p3, v3, v4}, La;->a(Ljava/lang/Object;Landroid/view/View;Z)V

    .line 1381
    iget-object v3, p1, Lf;->b:Ljava/util/ArrayList;

    iget-object v0, v0, Lj;->N:Landroid/view/View;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1373
    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1384
    :cond_1
    iget-object v3, v0, Lj;->N:Landroid/view/View;

    invoke-static {p3, v3, v2}, La;->a(Ljava/lang/Object;Landroid/view/View;Z)V

    .line 1386
    iget-object v3, p1, Lf;->b:Ljava/util/ArrayList;

    iget-object v0, v0, Lj;->N:Landroid/view/View;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1391
    :cond_2
    return-void
.end method

.method private a(Lf;Led;Z)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1419
    iget-object v1, p0, Lc;->m:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    move v2, v0

    :goto_0
    move v3, v0

    .line 1420
    :goto_1
    if-ge v3, v2, :cond_3

    .line 1421
    iget-object v0, p0, Lc;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1422
    iget-object v1, p0, Lc;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1423
    invoke-virtual {p2, v1}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 1424
    if-eqz v1, :cond_0

    .line 19037
    invoke-virtual {v1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object v1

    .line 1426
    if-eqz p3, :cond_2

    .line 1427
    iget-object v4, p1, Lf;->a:Led;

    invoke-static {v4, v0, v1}, Lc;->a(Led;Ljava/lang/String;Ljava/lang/String;)V

    .line 1420
    :cond_0
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 1419
    :cond_1
    iget-object v1, p0, Lc;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, v1

    goto :goto_0

    .line 1429
    :cond_2
    iget-object v4, p1, Lf;->a:Led;

    invoke-static {v4, v1, v0}, Lc;->a(Led;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 1433
    :cond_3
    return-void
.end method

.method private a(ILf;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
    .locals 29

    .prologue
    .line 1134
    move-object/from16 v0, p0

    iget-object v3, v0, Lc;->o:Lt;

    iget-object v3, v3, Lt;->i:Lq;

    move/from16 v0, p1

    invoke-interface {v3, v0}, Lq;->a(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    .line 1135
    if-nez v5, :cond_0

    .line 1136
    const/4 v3, 0x0

    .line 1226
    :goto_0
    return v3

    .line 1138
    :cond_0
    move-object/from16 v0, p5

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lj;

    .line 1139
    move-object/from16 v0, p4

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lj;

    .line 7056
    if-nez v10, :cond_2

    .line 7057
    const/16 v18, 0x0

    .line 10073
    :goto_1
    if-eqz v10, :cond_1

    if-nez v11, :cond_5

    .line 10074
    :cond_1
    const/4 v6, 0x0

    .line 13064
    :goto_2
    if-nez v11, :cond_8

    .line 13065
    const/4 v3, 0x0

    move-object v4, v3

    .line 1145
    :goto_3
    if-nez v18, :cond_b

    if-nez v6, :cond_b

    if-nez v4, :cond_b

    .line 1147
    const/4 v3, 0x0

    goto :goto_0

    .line 7059
    :cond_2
    if-eqz p3, :cond_4

    .line 7535
    iget-object v3, v10, Lj;->V:Ljava/lang/Object;

    sget-object v4, Lj;->e:Ljava/lang/Object;

    if-ne v3, v4, :cond_3

    .line 8502
    const/4 v3, 0x0

    .line 7059
    :goto_4
    invoke-static {v3}, La;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    goto :goto_1

    .line 7535
    :cond_3
    iget-object v3, v10, Lj;->V:Ljava/lang/Object;

    goto :goto_4

    .line 9434
    :cond_4
    const/4 v3, 0x0

    goto :goto_4

    .line 10076
    :cond_5
    if-eqz p3, :cond_7

    .line 10594
    iget-object v3, v11, Lj;->W:Ljava/lang/Object;

    sget-object v4, Lj;->e:Ljava/lang/Object;

    if-ne v3, v4, :cond_6

    .line 11562
    const/4 v3, 0x0

    .line 10076
    :goto_5
    invoke-static {v3}, La;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    .line 10594
    :cond_6
    iget-object v3, v11, Lj;->W:Ljava/lang/Object;

    goto :goto_5

    .line 12562
    :cond_7
    const/4 v3, 0x0

    goto :goto_5

    .line 13067
    :cond_8
    if-eqz p3, :cond_a

    .line 13468
    iget-object v3, v11, Lj;->U:Ljava/lang/Object;

    sget-object v4, Lj;->e:Ljava/lang/Object;

    if-ne v3, v4, :cond_9

    .line 14434
    const/4 v3, 0x0

    .line 13067
    :goto_6
    invoke-static {v3}, La;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    goto :goto_3

    .line 13468
    :cond_9
    iget-object v3, v11, Lj;->U:Ljava/lang/Object;

    goto :goto_6

    .line 14502
    :cond_a
    const/4 v3, 0x0

    goto :goto_6

    .line 1149
    :cond_b
    const/4 v3, 0x0

    .line 1150
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1151
    if-eqz v6, :cond_c

    .line 1152
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-direct {v0, v1, v11, v2}, Lc;->a(Lf;Lj;Z)Led;

    move-result-object v3

    .line 1153
    move-object/from16 v0, p2

    iget-object v8, v0, Lf;->d:Landroid/view/View;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1154
    invoke-virtual {v3}, Led;->values()Ljava/util/Collection;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1157
    if-eqz p3, :cond_15

    iget-object v8, v11, Lj;->X:Lax;

    .line 1167
    :cond_c
    :goto_7
    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    .line 1168
    move-object/from16 v0, p2

    iget-object v8, v0, Lf;->d:Landroid/view/View;

    move-object/from16 v0, v23

    invoke-static {v4, v11, v0, v3, v8}, Lc;->a(Ljava/lang/Object;Lj;Ljava/util/ArrayList;Led;Landroid/view/View;)Ljava/lang/Object;

    move-result-object v21

    .line 1172
    move-object/from16 v0, p0

    iget-object v4, v0, Lc;->m:Ljava/util/ArrayList;

    if-eqz v4, :cond_e

    if-eqz v3, :cond_e

    .line 1173
    move-object/from16 v0, p0

    iget-object v4, v0, Lc;->m:Ljava/util/ArrayList;

    const/4 v8, 0x0

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 1174
    if-eqz v3, :cond_e

    .line 1175
    if-eqz v21, :cond_d

    .line 1176
    move-object/from16 v0, v21

    invoke-static {v0, v3}, La;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 1178
    :cond_d
    if-eqz v6, :cond_e

    .line 1179
    invoke-static {v6, v3}, La;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 1185
    :cond_e
    new-instance v17, La;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v10}, La;-><init>(Lc;Lj;)V

    .line 1193
    if-eqz v6, :cond_f

    .line 15233
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v12

    new-instance v3, Ld;

    move-object/from16 v4, p0

    move-object/from16 v8, p2

    move/from16 v9, p3

    invoke-direct/range {v3 .. v11}, Ld;-><init>(Lc;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Lf;ZLj;Lj;)V

    invoke-virtual {v12, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1198
    :cond_f
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1199
    new-instance v16, Led;

    invoke-direct/range {v16 .. v16}, Led;-><init>()V

    move-object/from16 v3, v18

    .line 17152
    check-cast v3, Landroid/transition/Transition;

    move-object/from16 v4, v21

    .line 17153
    check-cast v4, Landroid/transition/Transition;

    move-object v8, v6

    .line 17154
    check-cast v8, Landroid/transition/Transition;

    .line 17156
    if-eqz v3, :cond_10

    if-eqz v4, :cond_10

    .line 17167
    :cond_10
    new-instance v9, Landroid/transition/TransitionSet;

    invoke-direct {v9}, Landroid/transition/TransitionSet;-><init>()V

    .line 17168
    if-eqz v3, :cond_11

    .line 17169
    invoke-virtual {v9, v3}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;

    .line 17171
    :cond_11
    if-eqz v4, :cond_12

    .line 17172
    invoke-virtual {v9, v4}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;

    .line 17174
    :cond_12
    if-eqz v8, :cond_13

    .line 17175
    invoke-virtual {v9, v8}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;

    :cond_13
    move-object v4, v9

    .line 1206
    if-eqz v4, :cond_14

    .line 1207
    move-object/from16 v0, p2

    iget-object v12, v0, Lf;->d:Landroid/view/View;

    move-object/from16 v0, p2

    iget-object v13, v0, Lf;->c:Lak;

    move-object/from16 v0, p2

    iget-object v14, v0, Lf;->a:Led;

    move-object/from16 v8, v18

    move-object v9, v6

    move-object v10, v5

    move-object/from16 v11, v17

    move-object/from16 v17, v7

    invoke-static/range {v8 .. v17}, La;->a(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Lal;Landroid/view/View;Lak;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;)V

    .line 17361
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    new-instance v8, Le;

    move-object/from16 v9, p0

    move-object v10, v5

    move-object/from16 v11, p2

    move/from16 v12, p1

    move-object v13, v4

    invoke-direct/range {v8 .. v13}, Le;-><init>(Lc;Landroid/view/View;Lf;ILjava/lang/Object;)V

    invoke-virtual {v3, v8}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1215
    move-object/from16 v0, p2

    iget-object v3, v0, Lf;->d:Landroid/view/View;

    const/4 v8, 0x1

    invoke-static {v4, v3, v8}, La;->a(Ljava/lang/Object;Landroid/view/View;Z)V

    .line 1217
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p1

    invoke-direct {v0, v1, v2, v4}, Lc;->a(Lf;ILjava/lang/Object;)V

    move-object v3, v4

    .line 18070
    check-cast v3, Landroid/transition/Transition;

    .line 18071
    invoke-static {v5, v3}, Landroid/transition/TransitionManager;->beginDelayedTransition(Landroid/view/ViewGroup;Landroid/transition/Transition;)V

    .line 1221
    move-object/from16 v0, p2

    iget-object v0, v0, Lf;->d:Landroid/view/View;

    move-object/from16 v20, v0

    move-object/from16 v0, p2

    iget-object v0, v0, Lf;->b:Ljava/util/ArrayList;

    move-object/from16 v27, v0

    move-object/from16 v19, v18

    .line 18276
    check-cast v19, Landroid/transition/Transition;

    move-object/from16 v22, v21

    .line 18277
    check-cast v22, Landroid/transition/Transition;

    move-object/from16 v24, v6

    .line 18278
    check-cast v24, Landroid/transition/Transition;

    move-object/from16 v28, v4

    .line 18279
    check-cast v28, Landroid/transition/Transition;

    .line 18280
    if-eqz v28, :cond_14

    .line 18281
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    new-instance v17, Laj;

    move-object/from16 v18, v5

    move-object/from16 v21, v15

    move-object/from16 v25, v7

    move-object/from16 v26, v16

    invoke-direct/range {v17 .. v28}, Laj;-><init>(Landroid/view/View;Landroid/transition/Transition;Landroid/view/View;Ljava/util/ArrayList;Landroid/transition/Transition;Ljava/util/ArrayList;Landroid/transition/Transition;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;Landroid/transition/Transition;)V

    move-object/from16 v0, v17

    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1226
    :cond_14
    if-eqz v4, :cond_16

    const/4 v3, 0x1

    goto/16 :goto_0

    .line 1157
    :cond_15
    iget-object v8, v10, Lj;->X:Lax;

    goto/16 :goto_7

    .line 1226
    :cond_16
    const/4 v3, 0x0

    goto/16 :goto_0
.end method

.method private b(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 6

    .prologue
    .line 777
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->i:Lq;

    invoke-interface {v0}, Lq;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 822
    :cond_0
    return-void

    .line 780
    :cond_1
    iget-object v0, p0, Lc;->a:Lb;

    move-object v3, v0

    .line 781
    :goto_0
    if-eqz v3, :cond_0

    .line 782
    iget v0, v3, Lb;->c:I

    packed-switch v0, :pswitch_data_0

    .line 820
    :goto_1
    iget-object v0, v3, Lb;->a:Lb;

    move-object v3, v0

    goto :goto_0

    .line 784
    :pswitch_0
    iget-object v0, v3, Lb;->d:Lj;

    invoke-static {p2, v0}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 787
    :pswitch_1
    iget-object v1, v3, Lb;->d:Lj;

    .line 788
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 789
    const/4 v0, 0x0

    move-object v2, v1

    move v1, v0

    :goto_2
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 790
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 791
    if-eqz v2, :cond_2

    iget v4, v0, Lj;->C:I

    iget v5, v2, Lj;->C:I

    if-ne v4, v5, :cond_3

    .line 792
    :cond_2
    if-ne v0, v2, :cond_4

    .line 793
    const/4 v2, 0x0

    .line 789
    :cond_3
    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 795
    :cond_4
    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_3

    :cond_5
    move-object v2, v1

    .line 800
    :cond_6
    invoke-static {p2, v2}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 804
    :pswitch_2
    iget-object v0, v3, Lb;->d:Lj;

    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 807
    :pswitch_3
    iget-object v0, v3, Lb;->d:Lj;

    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 810
    :pswitch_4
    iget-object v0, v3, Lb;->d:Lj;

    invoke-static {p2, v0}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 813
    :pswitch_5
    iget-object v0, v3, Lb;->d:Lj;

    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 816
    :pswitch_6
    iget-object v0, v3, Lb;->d:Lj;

    invoke-static {p2, v0}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 782
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private static b(Landroid/util/SparseArray;Lj;)V
    .locals 1

    .prologue
    .line 758
    if-eqz p1, :cond_0

    .line 759
    iget v0, p1, Lj;->C:I

    .line 760
    if-eqz v0, :cond_0

    .line 761
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 764
    :cond_0
    return-void
.end method

.method private static b(Lf;Led;Z)V
    .locals 5

    .prologue
    .line 1437
    invoke-virtual {p1}, Led;->size()I

    move-result v3

    .line 1438
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v3, :cond_1

    .line 1439
    invoke-virtual {p1, v2}, Led;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1440
    invoke-virtual {p1, v2}, Led;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 20037
    invoke-virtual {v1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object v1

    .line 1441
    if-eqz p2, :cond_0

    .line 1442
    iget-object v4, p0, Lf;->a:Led;

    invoke-static {v4, v0, v1}, Lc;->a(Led;Ljava/lang/String;Ljava/lang/String;)V

    .line 1438
    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 1444
    :cond_0
    iget-object v4, p0, Lf;->a:Led;

    invoke-static {v4, v1, v0}, Lc;->a(Led;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 1447
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Laf;
    .locals 2

    .prologue
    .line 558
    iget-boolean v0, p0, Lc;->e:Z

    if-eqz v0, :cond_0

    .line 559
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 562
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lc;->q:Z

    .line 563
    return-object p0
.end method

.method public final a(I)Laf;
    .locals 1

    .prologue
    .line 515
    const/16 v0, 0x1001

    iput v0, p0, Lc;->c:I

    .line 516
    return-object p0
.end method

.method public final a(ILj;)Laf;
    .locals 1

    .prologue
    .line 444
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lc;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    return-object v0
.end method

.method public final a(ILj;Ljava/lang/String;)Laf;
    .locals 1

    .prologue
    .line 412
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lc;->a(ILj;Ljava/lang/String;I)V

    .line 413
    return-object p0
.end method

.method public final a(Lj;)Laf;
    .locals 2

    .prologue
    .line 457
    new-instance v0, Lb;

    invoke-direct {v0}, Lb;-><init>()V

    .line 458
    const/4 v1, 0x3

    iput v1, v0, Lb;->c:I

    .line 459
    iput-object p1, v0, Lb;->d:Lj;

    .line 460
    invoke-virtual {p0, v0}, Lc;->a(Lb;)V

    .line 462
    return-object p0
.end method

.method public final a(Lj;Ljava/lang/String;)Laf;
    .locals 2

    .prologue
    .line 402
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, p2, v1}, Lc;->a(ILj;Ljava/lang/String;I)V

    .line 403
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Laf;
    .locals 2

    .prologue
    .line 544
    iget-boolean v0, p0, Lc;->q:Z

    if-nez v0, :cond_0

    .line 545
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This FragmentTransaction is not allowed to be added to the back stack."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 548
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lc;->e:Z

    .line 549
    iput-object p1, p0, Lc;->f:Ljava/lang/String;

    .line 550
    return-object p0
.end method

.method public final a(ZLf;Landroid/util/SparseArray;Landroid/util/SparseArray;)Lf;
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/4 v10, 0x1

    const/4 v9, -0x1

    const/4 v3, 0x0

    .line 875
    sget-boolean v0, Lt;->a:Z

    .line 882
    sget-boolean v0, Lc;->n:Z

    if-eqz v0, :cond_1

    .line 883
    if-nez p2, :cond_2

    .line 884
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 885
    :cond_0
    invoke-direct {p0, p3, p4, v10}, Lc;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Lf;

    move-result-object p2

    .line 892
    :cond_1
    invoke-virtual {p0, v9}, Lc;->b(I)V

    .line 894
    if-eqz p2, :cond_3

    move v7, v3

    .line 895
    :goto_0
    if-eqz p2, :cond_4

    move v1, v3

    .line 896
    :goto_1
    iget-object v0, p0, Lc;->p:Lb;

    move-object v6, v0

    .line 897
    :goto_2
    if-eqz v6, :cond_9

    .line 898
    if-eqz p2, :cond_5

    move v5, v3

    .line 899
    :goto_3
    if-eqz p2, :cond_6

    move v0, v3

    .line 900
    :goto_4
    iget v2, v6, Lb;->c:I

    packed-switch v2, :pswitch_data_0

    .line 952
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown cmd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v6, Lb;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 887
    :cond_2
    if-nez p1, :cond_1

    .line 888
    iget-object v5, p0, Lc;->m:Ljava/util/ArrayList;

    iget-object v6, p0, Lc;->l:Ljava/util/ArrayList;

    .line 4408
    if-eqz v5, :cond_1

    move v2, v3

    .line 4409
    :goto_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 4410
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4411
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4412
    iget-object v7, p2, Lf;->a:Led;

    invoke-static {v7, v0, v1}, Lc;->a(Led;Ljava/lang/String;Ljava/lang/String;)V

    .line 4409
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    .line 894
    :cond_3
    iget v0, p0, Lc;->d:I

    move v7, v0

    goto :goto_0

    .line 895
    :cond_4
    iget v0, p0, Lc;->c:I

    move v1, v0

    goto :goto_1

    .line 898
    :cond_5
    iget v0, v6, Lb;->g:I

    move v5, v0

    goto :goto_3

    .line 899
    :cond_6
    iget v0, v6, Lb;->h:I

    goto :goto_4

    .line 902
    :pswitch_0
    iget-object v2, v6, Lb;->d:Lj;

    .line 903
    iput v0, v2, Lj;->L:I

    .line 904
    iget-object v0, p0, Lc;->o:Lt;

    invoke-static {v1}, Lt;->b(I)I

    move-result v5

    invoke-virtual {v0, v2, v5, v7}, Lt;->a(Lj;II)V

    .line 956
    :cond_7
    :goto_6
    iget-object v0, v6, Lb;->b:Lb;

    move-object v6, v0

    .line 957
    goto :goto_2

    .line 908
    :pswitch_1
    iget-object v2, v6, Lb;->d:Lj;

    .line 909
    if-eqz v2, :cond_8

    .line 910
    iput v0, v2, Lj;->L:I

    .line 911
    iget-object v0, p0, Lc;->o:Lt;

    invoke-static {v1}, Lt;->b(I)I

    move-result v8

    invoke-virtual {v0, v2, v8, v7}, Lt;->a(Lj;II)V

    .line 914
    :cond_8
    iget-object v0, v6, Lb;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    move v2, v3

    .line 915
    :goto_7
    iget-object v0, v6, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    .line 916
    iget-object v0, v6, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 917
    iput v5, v0, Lj;->L:I

    .line 918
    iget-object v8, p0, Lc;->o:Lt;

    invoke-virtual {v8, v0, v3}, Lt;->a(Lj;Z)V

    .line 915
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_7

    .line 923
    :pswitch_2
    iget-object v0, v6, Lb;->d:Lj;

    .line 924
    iput v5, v0, Lj;->L:I

    .line 925
    iget-object v2, p0, Lc;->o:Lt;

    invoke-virtual {v2, v0, v3}, Lt;->a(Lj;Z)V

    goto :goto_6

    .line 928
    :pswitch_3
    iget-object v0, v6, Lb;->d:Lj;

    .line 929
    iput v5, v0, Lj;->L:I

    .line 930
    iget-object v2, p0, Lc;->o:Lt;

    invoke-static {v1}, Lt;->b(I)I

    move-result v5

    invoke-virtual {v2, v0, v5, v7}, Lt;->c(Lj;II)V

    goto :goto_6

    .line 934
    :pswitch_4
    iget-object v2, v6, Lb;->d:Lj;

    .line 935
    iput v0, v2, Lj;->L:I

    .line 936
    iget-object v0, p0, Lc;->o:Lt;

    invoke-static {v1}, Lt;->b(I)I

    move-result v5

    invoke-virtual {v0, v2, v5, v7}, Lt;->b(Lj;II)V

    goto :goto_6

    .line 940
    :pswitch_5
    iget-object v0, v6, Lb;->d:Lj;

    .line 941
    iput v5, v0, Lj;->L:I

    .line 942
    iget-object v2, p0, Lc;->o:Lt;

    invoke-static {v1}, Lt;->b(I)I

    move-result v5

    invoke-virtual {v2, v0, v5, v7}, Lt;->e(Lj;II)V

    goto :goto_6

    .line 946
    :pswitch_6
    iget-object v0, v6, Lb;->d:Lj;

    .line 947
    iput v5, v0, Lj;->L:I

    .line 948
    iget-object v2, p0, Lc;->o:Lt;

    invoke-static {v1}, Lt;->b(I)I

    move-result v5

    invoke-virtual {v2, v0, v5, v7}, Lt;->d(Lj;II)V

    goto :goto_6

    .line 959
    :cond_9
    if-eqz p1, :cond_a

    .line 960
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v2, p0, Lc;->o:Lt;

    iget v2, v2, Lt;->g:I

    invoke-static {v1}, Lt;->b(I)I

    move-result v1

    invoke-virtual {v0, v2, v1, v7, v10}, Lt;->a(IIIZ)V

    move-object p2, v4

    .line 965
    :cond_a
    iget v0, p0, Lc;->g:I

    if-ltz v0, :cond_c

    .line 966
    iget-object v1, p0, Lc;->o:Lt;

    iget v0, p0, Lc;->g:I

    .line 4458
    monitor-enter v1

    .line 4459
    :try_start_0
    iget-object v2, v1, Lt;->e:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4460
    iget-object v2, v1, Lt;->f:Ljava/util/ArrayList;

    if-nez v2, :cond_b

    .line 4461
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lt;->f:Ljava/util/ArrayList;

    .line 4464
    :cond_b
    iget-object v2, v1, Lt;->f:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4465
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 967
    iput v9, p0, Lc;->g:I

    .line 969
    :cond_c
    return-object p2

    .line 4465
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 900
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public final a(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 3

    .prologue
    .line 835
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->i:Lq;

    invoke-interface {v0}, Lq;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 871
    :cond_0
    return-void

    .line 838
    :cond_1
    iget-object v0, p0, Lc;->a:Lb;

    move-object v2, v0

    .line 839
    :goto_0
    if-eqz v2, :cond_0

    .line 840
    iget v0, v2, Lb;->c:I

    packed-switch v0, :pswitch_data_0

    .line 869
    :goto_1
    iget-object v0, v2, Lb;->a:Lb;

    move-object v2, v0

    goto :goto_0

    .line 842
    :pswitch_0
    iget-object v0, v2, Lb;->d:Lj;

    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 845
    :pswitch_1
    iget-object v0, v2, Lb;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 846
    iget-object v0, v2, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_2

    .line 847
    iget-object v0, v2, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    invoke-static {p2, v0}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    .line 846
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 850
    :cond_2
    iget-object v0, v2, Lb;->d:Lj;

    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 853
    :pswitch_2
    iget-object v0, v2, Lb;->d:Lj;

    invoke-static {p2, v0}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 856
    :pswitch_3
    iget-object v0, v2, Lb;->d:Lj;

    invoke-static {p2, v0}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 859
    :pswitch_4
    iget-object v0, v2, Lb;->d:Lj;

    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 862
    :pswitch_5
    iget-object v0, v2, Lb;->d:Lj;

    invoke-static {p2, v0}, Lc;->b(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 865
    :pswitch_6
    iget-object v0, v2, Lb;->d:Lj;

    invoke-static {p1, v0}, Lc;->a(Landroid/util/SparseArray;Lj;)V

    goto :goto_1

    .line 840
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method final a(Lb;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 387
    iget-object v0, p0, Lc;->a:Lb;

    if-nez v0, :cond_0

    .line 388
    iput-object p1, p0, Lc;->p:Lb;

    iput-object p1, p0, Lc;->a:Lb;

    .line 394
    :goto_0
    iput v1, p1, Lb;->e:I

    .line 395
    iput v1, p1, Lb;->f:I

    .line 396
    iput v1, p1, Lb;->g:I

    .line 397
    iput v1, p1, Lb;->h:I

    .line 398
    iget v0, p0, Lc;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc;->b:I

    .line 399
    return-void

    .line 390
    :cond_0
    iget-object v0, p0, Lc;->p:Lb;

    iput-object v0, p1, Lb;->b:Lb;

    .line 391
    iget-object v0, p0, Lc;->p:Lb;

    iput-object p1, v0, Lb;->a:Lb;

    .line 392
    iput-object p1, p0, Lc;->p:Lb;

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 260
    .line 2265
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mName="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lc;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2266
    const-string v0, " mIndex="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lc;->g:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 2267
    const-string v0, " mCommitted="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lc;->r:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 2268
    iget v0, p0, Lc;->c:I

    if-eqz v0, :cond_0

    .line 2269
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTransition=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2270
    iget v0, p0, Lc;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2271
    const-string v0, " mTransitionStyle=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2272
    iget v0, p0, Lc;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2286
    :cond_0
    iget v0, p0, Lc;->h:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lc;->i:Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    .line 2287
    :cond_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2288
    iget v0, p0, Lc;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2289
    const-string v0, " mBreadCrumbTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2290
    iget-object v0, p0, Lc;->i:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2292
    :cond_2
    iget v0, p0, Lc;->j:I

    if-nez v0, :cond_3

    iget-object v0, p0, Lc;->k:Ljava/lang/CharSequence;

    if-eqz v0, :cond_4

    .line 2293
    :cond_3
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbShortTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2294
    iget v0, p0, Lc;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2295
    const-string v0, " mBreadCrumbShortTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2296
    iget-object v0, p0, Lc;->k:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2300
    :cond_4
    iget-object v0, p0, Lc;->a:Lb;

    if-eqz v0, :cond_c

    .line 2301
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Operations:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2302
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "    "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 2303
    iget-object v0, p0, Lc;->a:Lb;

    move v2, v1

    move-object v3, v0

    .line 2305
    :goto_0
    if-eqz v3, :cond_c

    .line 2307
    iget v0, v3, Lb;->c:I

    packed-switch v0, :pswitch_data_0

    .line 2316
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "cmd="

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v3, Lb;->c:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2318
    :goto_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  Op #"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 2319
    const-string v5, ": "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2320
    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v3, Lb;->d:Lj;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2322
    iget v0, v3, Lb;->e:I

    if-nez v0, :cond_5

    iget v0, v3, Lb;->f:I

    if-eqz v0, :cond_6

    .line 2323
    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "enterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2324
    iget v0, v3, Lb;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2325
    const-string v0, " exitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2326
    iget v0, v3, Lb;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2328
    :cond_6
    iget v0, v3, Lb;->g:I

    if-nez v0, :cond_7

    iget v0, v3, Lb;->h:I

    if-eqz v0, :cond_8

    .line 2329
    :cond_7
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "popEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2330
    iget v0, v3, Lb;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2331
    const-string v0, " popExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2332
    iget v0, v3, Lb;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2335
    :cond_8
    iget-object v0, v3, Lb;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    iget-object v0, v3, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    move v0, v1

    .line 2336
    :goto_2
    iget-object v5, v3, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_b

    .line 2337
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2338
    iget-object v5, v3, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_9

    .line 2339
    const-string v5, "Removed: "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2347
    :goto_3
    iget-object v5, v3, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2336
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2308
    :pswitch_0
    const-string v0, "NULL"

    goto/16 :goto_1

    .line 2309
    :pswitch_1
    const-string v0, "ADD"

    goto/16 :goto_1

    .line 2310
    :pswitch_2
    const-string v0, "REPLACE"

    goto/16 :goto_1

    .line 2311
    :pswitch_3
    const-string v0, "REMOVE"

    goto/16 :goto_1

    .line 2312
    :pswitch_4
    const-string v0, "HIDE"

    goto/16 :goto_1

    .line 2313
    :pswitch_5
    const-string v0, "SHOW"

    goto/16 :goto_1

    .line 2314
    :pswitch_6
    const-string v0, "DETACH"

    goto/16 :goto_1

    .line 2315
    :pswitch_7
    const-string v0, "ATTACH"

    goto/16 :goto_1

    .line 2341
    :cond_9
    if-nez v0, :cond_a

    .line 2342
    const-string v5, "Removed:"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2344
    :cond_a
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 2345
    const-string v5, ": "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_3

    .line 2350
    :cond_b
    iget-object v3, v3, Lb;->a:Lb;

    .line 2351
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 2352
    goto/16 :goto_0

    .line 261
    :cond_c
    return-void

    .line 2307
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 616
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lc;->a(Z)I

    move-result v0

    return v0
.end method

.method public final b(ILj;Ljava/lang/String;)Laf;
    .locals 2

    .prologue
    .line 448
    if-nez p1, :cond_0

    .line 449
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must use non-zero containerViewId"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 452
    :cond_0
    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, p3, v0}, Lc;->a(ILj;Ljava/lang/String;I)V

    .line 453
    return-object p0
.end method

.method public final b(Lj;)Laf;
    .locals 2

    .prologue
    .line 484
    new-instance v0, Lb;

    invoke-direct {v0}, Lb;-><init>()V

    .line 485
    const/4 v1, 0x6

    iput v1, v0, Lb;->c:I

    .line 486
    iput-object p1, v0, Lb;->d:Lj;

    .line 487
    invoke-virtual {p0, v0}, Lc;->a(Lb;)V

    .line 489
    return-object p0
.end method

.method final b(I)V
    .locals 4

    .prologue
    .line 591
    iget-boolean v0, p0, Lc;->e:Z

    if-nez v0, :cond_1

    .line 613
    :cond_0
    return-void

    .line 594
    :cond_1
    sget-boolean v0, Lt;->a:Z

    .line 596
    iget-object v0, p0, Lc;->a:Lb;

    move-object v2, v0

    .line 597
    :goto_0
    if-eqz v2, :cond_0

    .line 598
    iget-object v0, v2, Lb;->d:Lj;

    if-eqz v0, :cond_2

    .line 599
    iget-object v0, v2, Lb;->d:Lj;

    iget v1, v0, Lj;->w:I

    add-int/2addr v1, p1

    iput v1, v0, Lj;->w:I

    .line 600
    sget-boolean v0, Lt;->a:Z

    .line 603
    :cond_2
    iget-object v0, v2, Lb;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 604
    iget-object v0, v2, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_3

    .line 605
    iget-object v0, v2, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 606
    iget v3, v0, Lj;->w:I

    add-int/2addr v3, p1

    iput v3, v0, Lj;->w:I

    .line 607
    sget-boolean v0, Lt;->a:Z

    .line 604
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 611
    :cond_3
    iget-object v0, v2, Lb;->a:Lb;

    move-object v2, v0

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 620
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lc;->a(Z)I

    move-result v0

    return v0
.end method

.method public final c(Lj;)Laf;
    .locals 2

    .prologue
    .line 493
    new-instance v0, Lb;

    invoke-direct {v0}, Lb;-><init>()V

    .line 494
    const/4 v1, 0x7

    iput v1, v0, Lb;->c:I

    .line 495
    iput-object p1, v0, Lb;->d:Lj;

    .line 496
    invoke-virtual {p0, v0}, Lc;->a(Lb;)V

    .line 498
    return-object p0
.end method

.method public final run()V
    .locals 14

    .prologue
    const/4 v6, 0x0

    const/4 v13, 0x1

    const/4 v2, 0x0

    .line 642
    sget-boolean v0, Lt;->a:Z

    .line 644
    iget-boolean v0, p0, Lc;->e:Z

    if-eqz v0, :cond_0

    .line 645
    iget v0, p0, Lc;->g:I

    if-gez v0, :cond_0

    .line 646
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "addToBackStack() called after commit()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 650
    :cond_0
    invoke-virtual {p0, v13}, Lc;->b(I)V

    .line 655
    sget-boolean v0, Lc;->n:Z

    if-eqz v0, :cond_10

    .line 656
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 657
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 659
    invoke-direct {p0, v0, v1}, Lc;->b(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 661
    invoke-direct {p0, v0, v1, v2}, Lc;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Lf;

    move-result-object v0

    move-object v10, v0

    .line 664
    :goto_0
    if-eqz v10, :cond_1

    move v9, v2

    .line 665
    :goto_1
    if-eqz v10, :cond_2

    move v1, v2

    .line 666
    :goto_2
    iget-object v0, p0, Lc;->a:Lb;

    move-object v8, v0

    .line 667
    :goto_3
    if-eqz v8, :cond_d

    .line 668
    if-eqz v10, :cond_3

    move v7, v2

    .line 669
    :goto_4
    if-eqz v10, :cond_4

    move v3, v2

    .line 670
    :goto_5
    iget v0, v8, Lb;->c:I

    packed-switch v0, :pswitch_data_0

    .line 733
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown cmd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v8, Lb;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 664
    :cond_1
    iget v0, p0, Lc;->d:I

    move v9, v0

    goto :goto_1

    .line 665
    :cond_2
    iget v0, p0, Lc;->c:I

    move v1, v0

    goto :goto_2

    .line 668
    :cond_3
    iget v0, v8, Lb;->e:I

    move v7, v0

    goto :goto_4

    .line 669
    :cond_4
    iget v0, v8, Lb;->f:I

    move v3, v0

    goto :goto_5

    .line 672
    :pswitch_0
    iget-object v0, v8, Lb;->d:Lj;

    .line 673
    iput v7, v0, Lj;->L:I

    .line 674
    iget-object v3, p0, Lc;->o:Lt;

    invoke-virtual {v3, v0, v2}, Lt;->a(Lj;Z)V

    .line 737
    :cond_5
    :goto_6
    iget-object v0, v8, Lb;->a:Lb;

    move-object v8, v0

    .line 738
    goto :goto_3

    .line 677
    :pswitch_1
    iget-object v0, v8, Lb;->d:Lj;

    .line 678
    iget-object v4, p0, Lc;->o:Lt;

    iget-object v4, v4, Lt;->c:Ljava/util/ArrayList;

    if-eqz v4, :cond_b

    move v4, v2

    move-object v5, v0

    .line 679
    :goto_7
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_c

    .line 680
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v0, v0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 681
    sget-boolean v11, Lt;->a:Z

    .line 683
    if-eqz v5, :cond_6

    iget v11, v0, Lj;->C:I

    iget v12, v5, Lj;->C:I

    if-ne v11, v12, :cond_7

    .line 684
    :cond_6
    if-ne v0, v5, :cond_8

    .line 685
    iput-object v6, v8, Lb;->d:Lj;

    move-object v5, v6

    .line 679
    :cond_7
    :goto_8
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_7

    .line 687
    :cond_8
    iget-object v11, v8, Lb;->i:Ljava/util/ArrayList;

    if-nez v11, :cond_9

    .line 688
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v8, Lb;->i:Ljava/util/ArrayList;

    .line 690
    :cond_9
    iget-object v11, v8, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    iput v3, v0, Lj;->L:I

    .line 692
    iget-boolean v11, p0, Lc;->e:Z

    if-eqz v11, :cond_a

    .line 693
    iget v11, v0, Lj;->w:I

    add-int/lit8 v11, v11, 0x1

    iput v11, v0, Lj;->w:I

    .line 694
    sget-boolean v11, Lt;->a:Z

    .line 697
    :cond_a
    iget-object v11, p0, Lc;->o:Lt;

    invoke-virtual {v11, v0, v1, v9}, Lt;->a(Lj;II)V

    goto :goto_8

    :cond_b
    move-object v5, v0

    .line 702
    :cond_c
    if-eqz v5, :cond_5

    .line 703
    iput v7, v5, Lj;->L:I

    .line 704
    iget-object v0, p0, Lc;->o:Lt;

    invoke-virtual {v0, v5, v2}, Lt;->a(Lj;Z)V

    goto :goto_6

    .line 708
    :pswitch_2
    iget-object v0, v8, Lb;->d:Lj;

    .line 709
    iput v3, v0, Lj;->L:I

    .line 710
    iget-object v3, p0, Lc;->o:Lt;

    invoke-virtual {v3, v0, v1, v9}, Lt;->a(Lj;II)V

    goto :goto_6

    .line 713
    :pswitch_3
    iget-object v0, v8, Lb;->d:Lj;

    .line 714
    iput v3, v0, Lj;->L:I

    .line 715
    iget-object v3, p0, Lc;->o:Lt;

    invoke-virtual {v3, v0, v1, v9}, Lt;->b(Lj;II)V

    goto :goto_6

    .line 718
    :pswitch_4
    iget-object v0, v8, Lb;->d:Lj;

    .line 719
    iput v7, v0, Lj;->L:I

    .line 720
    iget-object v3, p0, Lc;->o:Lt;

    invoke-virtual {v3, v0, v1, v9}, Lt;->c(Lj;II)V

    goto/16 :goto_6

    .line 723
    :pswitch_5
    iget-object v0, v8, Lb;->d:Lj;

    .line 724
    iput v3, v0, Lj;->L:I

    .line 725
    iget-object v3, p0, Lc;->o:Lt;

    invoke-virtual {v3, v0, v1, v9}, Lt;->d(Lj;II)V

    goto/16 :goto_6

    .line 728
    :pswitch_6
    iget-object v0, v8, Lb;->d:Lj;

    .line 729
    iput v7, v0, Lj;->L:I

    .line 730
    iget-object v3, p0, Lc;->o:Lt;

    invoke-virtual {v3, v0, v1, v9}, Lt;->e(Lj;II)V

    goto/16 :goto_6

    .line 740
    :cond_d
    iget-object v0, p0, Lc;->o:Lt;

    iget-object v2, p0, Lc;->o:Lt;

    iget v2, v2, Lt;->g:I

    invoke-virtual {v0, v2, v1, v9, v13}, Lt;->a(IIIZ)V

    .line 742
    iget-boolean v0, p0, Lc;->e:Z

    if-eqz v0, :cond_f

    .line 743
    iget-object v0, p0, Lc;->o:Lt;

    .line 2533
    iget-object v1, v0, Lt;->d:Ljava/util/ArrayList;

    if-nez v1, :cond_e

    .line 2534
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lt;->d:Ljava/util/ArrayList;

    .line 2536
    :cond_e
    iget-object v0, v0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 745
    :cond_f
    return-void

    :cond_10
    move-object v10, v6

    goto/16 :goto_0

    .line 670
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 245
    const-string v1, "BackStackEntry{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    iget v1, p0, Lc;->g:I

    if-ltz v1, :cond_0

    .line 248
    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    iget v1, p0, Lc;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    :cond_0
    iget-object v1, p0, Lc;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 252
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    iget-object v1, p0, Lc;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
