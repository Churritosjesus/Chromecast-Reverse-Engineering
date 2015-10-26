.class public final Laaz;
.super Landroid/widget/Filter;
.source "PG"


# instance fields
.field private final a:Labb;

.field private b:I

.field private synthetic c:Laav;


# direct methods
.method public constructor <init>(Laav;Labb;)V
    .locals 0

    .prologue
    .line 398
    iput-object p1, p0, Laaz;->c:Laav;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    .line 399
    iput-object p2, p0, Laaz;->a:Labb;

    .line 400
    return-void
.end method

.method private declared-synchronized a()I
    .locals 1

    .prologue
    .line 407
    monitor-enter p0

    :try_start_0
    iget v0, p0, Laaz;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(I)V
    .locals 1

    .prologue
    .line 403
    monitor-enter p0

    :try_start_0
    iput p1, p0, Laaz;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 404
    monitor-exit p0

    return-void

    .line 403
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 416
    new-instance v0, Landroid/widget/Filter$FilterResults;

    invoke-direct {v0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 417
    iput-object v1, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 418
    const/4 v2, 0x0

    iput v2, v0, Landroid/widget/Filter$FilterResults;->count:I

    .line 420
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 421
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 428
    :try_start_0
    iget-object v3, p0, Laaz;->c:Laav;

    invoke-direct {p0}, Laaz;->a()I

    move-result v4

    iget-object v5, p0, Laaz;->a:Labb;

    iget-wide v6, v5, Labb;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v3, p1, v4, v5}, Laav;->a(Laav;Ljava/lang/CharSequence;ILjava/lang/Long;)Landroid/database/Cursor;

    move-result-object v1

    .line 430
    if-eqz v1, :cond_1

    .line 431
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 432
    new-instance v3, Labd;

    iget-object v4, p0, Laaz;->a:Labb;

    iget-wide v4, v4, Labb;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Labd;-><init>(Landroid/database/Cursor;Ljava/lang/Long;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 436
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_0

    .line 437
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    throw v0

    .line 436
    :cond_1
    if-eqz v1, :cond_2

    .line 437
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 440
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 441
    iput-object v2, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 442
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, v0, Landroid/widget/Filter$FilterResults;->count:I

    .line 451
    :cond_3
    return-object v0
.end method

.method protected final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 10

    .prologue
    const/4 v2, 0x1

    .line 460
    iget-object v0, p0, Laaz;->c:Laav;

    invoke-static {v0}, Laav;->c(Laav;)Laay;

    move-result-object v0

    .line 1568
    invoke-virtual {v0, v2}, Laay;->removeMessages(I)V

    .line 465
    iget-object v0, p0, Laaz;->c:Laav;

    iget-object v0, v0, Laav;->j:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 466
    iget v0, p2, Landroid/widget/Filter$FilterResults;->count:I

    if-lez v0, :cond_1

    .line 468
    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    .line 471
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Labd;

    .line 472
    iget-object v4, p0, Laaz;->c:Laav;

    iget-object v1, p0, Laaz;->a:Labb;

    iget-wide v6, v1, Labb;->a:J

    const-wide/16 v8, 0x0

    cmp-long v1, v6, v8

    if-nez v1, :cond_0

    move v1, v2

    .line 1798
    :goto_1
    iget-object v5, v4, Laav;->e:Ljava/util/LinkedHashMap;

    iget-object v6, v4, Laav;->f:Ljava/util/List;

    iget-object v4, v4, Laav;->g:Ljava/util/Set;

    invoke-static {v0, v1, v5, v6, v4}, Laav;->a(Labd;ZLjava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;)V

    goto :goto_0

    .line 472
    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    .line 477
    :cond_1
    iget-object v0, p0, Laaz;->c:Laav;

    invoke-static {v0}, Laav;->d(Laav;)I

    .line 478
    iget-object v0, p0, Laaz;->c:Laav;

    invoke-static {v0}, Laav;->e(Laav;)I

    move-result v0

    if-lez v0, :cond_2

    .line 483
    iget-object v0, p0, Laaz;->c:Laav;

    invoke-static {v0}, Laav;->c(Laav;)Laay;

    move-result-object v0

    invoke-virtual {v0}, Laay;->a()V

    .line 488
    :cond_2
    iget v0, p2, Landroid/widget/Filter$FilterResults;->count:I

    if-gtz v0, :cond_3

    iget-object v0, p0, Laaz;->c:Laav;

    invoke-static {v0}, Laav;->e(Laav;)I

    move-result v0

    if-nez v0, :cond_4

    .line 490
    :cond_3
    iget-object v0, p0, Laaz;->c:Laav;

    .line 1920
    const/4 v1, 0x0

    iput-object v1, v0, Laav;->h:Ljava/util/List;

    .line 495
    :cond_4
    iget-object v0, p0, Laaz;->c:Laav;

    iget-object v1, p0, Laaz;->c:Laav;

    invoke-virtual {v1}, Laav;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Laav;->a(Ljava/util/List;)V

    .line 496
    return-void
.end method
