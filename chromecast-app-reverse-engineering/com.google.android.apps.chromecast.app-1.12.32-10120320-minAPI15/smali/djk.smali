.class final Ldjk;
.super Ldgj;
.source "PG"

# interfaces
.implements Ldic;


# instance fields
.field final synthetic a:Ldjb;

.field private b:Ldib;


# direct methods
.method constructor <init>(Ldjb;)V
    .locals 4

    .prologue
    .line 567
    iput-object p1, p0, Ldjk;->a:Ldjb;

    .line 568
    const-string v0, "OkHttp %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ldjb;->a(Ldjb;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    .prologue
    .line 572
    sget-object v0, Ldia;->e:Ldia;

    .line 573
    sget-object v2, Ldia;->e:Ldia;

    .line 575
    :try_start_0
    iget-object v1, p0, Ldjk;->a:Ldjb;

    iget-object v1, v1, Ldjb;->g:Ldjr;

    iget-object v3, p0, Ldjk;->a:Ldjb;

    iget-object v3, v3, Ldjb;->h:Ljava/net/Socket;

    invoke-static {v3}, Ldkk;->b(Ljava/net/Socket;)Ldkv;

    move-result-object v3

    invoke-static {v3}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v3

    iget-object v4, p0, Ldjk;->a:Ldjb;

    iget-boolean v4, v4, Ldjb;->b:Z

    invoke-interface {v1, v3, v4}, Ldjr;->a(Ldkd;Z)Ldib;

    move-result-object v1

    iput-object v1, p0, Ldjk;->b:Ldib;

    .line 576
    iget-object v1, p0, Ldjk;->a:Ldjb;

    iget-boolean v1, v1, Ldjb;->b:Z

    if-nez v1, :cond_0

    .line 577
    iget-object v1, p0, Ldjk;->b:Ldib;

    invoke-interface {v1}, Ldib;->a()V

    .line 579
    :cond_0
    iget-object v1, p0, Ldjk;->b:Ldib;

    invoke-interface {v1, p0}, Ldib;->a(Ldic;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 581
    sget-object v0, Ldia;->a:Ldia;

    .line 582
    sget-object v1, Ldia;->h:Ldia;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 588
    :try_start_1
    iget-object v2, p0, Ldjk;->a:Ldjb;

    invoke-static {v2, v0, v1}, Ldjb;->a(Ldjb;Ldia;Ldia;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 591
    :goto_0
    iget-object v0, p0, Ldjk;->b:Ldib;

    invoke-static {v0}, Ldgs;->a(Ljava/io/Closeable;)V

    .line 592
    :goto_1
    return-void

    .line 584
    :catch_0
    move-exception v1

    :try_start_2
    sget-object v1, Ldia;->b:Ldia;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 585
    :try_start_3
    sget-object v0, Ldia;->b:Ldia;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 588
    :try_start_4
    iget-object v2, p0, Ldjk;->a:Ldjb;

    invoke-static {v2, v1, v0}, Ldjb;->a(Ldjb;Ldia;Ldia;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 591
    :goto_2
    iget-object v0, p0, Ldjk;->b:Ldib;

    invoke-static {v0}, Ldgs;->a(Ljava/io/Closeable;)V

    goto :goto_1

    .line 587
    :catchall_0
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    .line 588
    :goto_3
    :try_start_5
    iget-object v3, p0, Ldjk;->a:Ldjb;

    invoke-static {v3, v1, v2}, Ldjb;->a(Ldjb;Ldia;Ldia;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 591
    :goto_4
    iget-object v1, p0, Ldjk;->b:Ldib;

    invoke-static {v1}, Ldgs;->a(Ljava/io/Closeable;)V

    throw v0

    :catch_1
    move-exception v1

    goto :goto_4

    .line 587
    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_0
.end method

.method public final a(IJ)V
    .locals 4

    .prologue
    .line 763
    if-nez p1, :cond_1

    .line 764
    iget-object v1, p0, Ldjk;->a:Ldjb;

    monitor-enter v1

    .line 765
    :try_start_0
    iget-object v0, p0, Ldjk;->a:Ldjb;

    iget-wide v2, v0, Ldjb;->d:J

    add-long/2addr v2, p2

    iput-wide v2, v0, Ldjb;->d:J

    .line 766
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 767
    monitor-exit v1

    .line 776
    :cond_0
    :goto_0
    return-void

    .line 767
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 769
    :cond_1
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-virtual {v0, p1}, Ldjb;->a(I)Ldjn;

    move-result-object v1

    .line 770
    if-eqz v1, :cond_0

    .line 771
    monitor-enter v1

    .line 772
    :try_start_1
    invoke-virtual {v1, p2, p3}, Ldjn;->a(J)V

    .line 773
    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0
.end method

.method public final a(ILdia;)V
    .locals 1

    .prologue
    .line 674
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0, p1}, Ldjb;->a(Ldjb;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 675
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0, p1, p2}, Ldjb;->a(Ldjb;ILdia;)V

    .line 682
    :cond_0
    :goto_0
    return-void

    .line 678
    :cond_1
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-virtual {v0, p1}, Ldjb;->b(I)Ldjn;

    move-result-object v0

    .line 679
    if-eqz v0, :cond_0

    .line 680
    invoke-virtual {v0, p2}, Ldjn;->c(Ldia;)V

    goto :goto_0
.end method

.method public final a(ILdke;)V
    .locals 5

    .prologue
    .line 743
    .line 6281
    iget-object v0, p2, Ldke;->b:[B

    array-length v0, v0

    .line 748
    iget-object v1, p0, Ldjk;->a:Ldjb;

    monitor-enter v1

    .line 749
    :try_start_0
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0}, Ldjb;->e(Ldjb;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v2, p0, Ldjk;->a:Ldjb;

    invoke-static {v2}, Ldjb;->e(Ldjb;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    new-array v2, v2, [Ldjn;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldjn;

    .line 750
    iget-object v2, p0, Ldjk;->a:Ldjb;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ldjb;->b(Ldjb;Z)Z

    .line 751
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 754
    array-length v2, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 7092
    iget v4, v3, Ldjn;->c:I

    .line 755
    if-le v4, p1, :cond_0

    invoke-virtual {v3}, Ldjn;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 756
    sget-object v4, Ldia;->g:Ldia;

    invoke-virtual {v3, v4}, Ldjn;->c(Ldia;)V

    .line 757
    iget-object v4, p0, Ldjk;->a:Ldjb;

    .line 8092
    iget v3, v3, Ldjn;->c:I

    .line 757
    invoke-virtual {v4, v3}, Ldjb;->b(I)Ldjn;

    .line 754
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 751
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 760
    :cond_1
    return-void
.end method

.method public final a(ILjava/util/List;)V
    .locals 1

    .prologue
    .line 785
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0, p1, p2}, Ldjb;->a(Ldjb;ILjava/util/List;)V

    .line 786
    return-void
.end method

.method public final a(ZII)V
    .locals 3

    .prologue
    .line 731
    if-eqz p1, :cond_1

    .line 732
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0, p2}, Ldjb;->c(Ldjb;I)Ldh;

    move-result-object v0

    .line 733
    if-eqz v0, :cond_0

    .line 734
    invoke-virtual {v0}, Ldh;->h()V

    .line 740
    :cond_0
    :goto_0
    return-void

    .line 738
    :cond_1
    iget-object v0, p0, Ldjk;->a:Ldjb;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, p3, v2}, Ldjb;->b(Ldjb;ZIILdh;)V

    goto :goto_0
.end method

.method public final a(ZILdkd;I)V
    .locals 4

    .prologue
    .line 597
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0, p2}, Ldjb;->a(Ldjb;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 598
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0, p2, p3, p4, p1}, Ldjb;->a(Ldjb;ILdkd;IZ)V

    .line 611
    :cond_0
    :goto_0
    return-void

    .line 601
    :cond_1
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-virtual {v0, p2}, Ldjb;->a(I)Ldjn;

    move-result-object v0

    .line 602
    if-nez v0, :cond_2

    .line 603
    iget-object v0, p0, Ldjk;->a:Ldjb;

    sget-object v1, Ldia;->c:Ldia;

    invoke-virtual {v0, p2, v1}, Ldjb;->a(ILdia;)V

    .line 604
    int-to-long v0, p4

    invoke-interface {p3, v0, v1}, Ldkd;->f(J)V

    goto :goto_0

    .line 1285
    :cond_2
    iget-object v1, v0, Ldjn;->f:Ldjp;

    int-to-long v2, p4

    invoke-virtual {v1, p3, v2, v3}, Ldjp;->a(Ldkd;J)V

    .line 608
    if-eqz p1, :cond_0

    .line 609
    invoke-virtual {v0}, Ldjn;->e()V

    goto :goto_0
.end method

.method public final a(ZLdix;)V
    .locals 12

    .prologue
    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    .line 685
    .line 686
    const/4 v0, 0x0

    .line 687
    iget-object v8, p0, Ldjk;->a:Ldjb;

    monitor-enter v8

    .line 688
    :try_start_0
    iget-object v2, p0, Ldjk;->a:Ldjb;

    iget-object v2, v2, Ldjb;->f:Ldix;

    const/high16 v3, 0x10000

    invoke-virtual {v2, v3}, Ldix;->c(I)I

    move-result v3

    .line 689
    if-eqz p1, :cond_0

    iget-object v2, p0, Ldjk;->a:Ldjb;

    iget-object v2, v2, Ldjb;->f:Ldix;

    .line 3085
    const/4 v4, 0x0

    iput v4, v2, Ldix;->c:I

    iput v4, v2, Ldix;->b:I

    iput v4, v2, Ldix;->a:I

    .line 3086
    iget-object v2, v2, Ldix;->d:[I

    const/4 v4, 0x0

    invoke-static {v2, v4}, Ljava/util/Arrays;->fill([II)V

    .line 690
    :cond_0
    iget-object v2, p0, Ldjk;->a:Ldjb;

    iget-object v4, v2, Ldjb;->f:Ldix;

    move v2, v1

    .line 3234
    :goto_0
    const/16 v5, 0xa

    if-ge v2, v5, :cond_2

    .line 3235
    invoke-virtual {p2, v2}, Ldix;->a(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 3236
    invoke-virtual {p2, v2}, Ldix;->b(I)I

    move-result v5

    .line 4119
    iget-object v9, p2, Ldix;->d:[I

    aget v9, v9, v2

    .line 3236
    invoke-virtual {v4, v2, v5, v9}, Ldix;->a(III)Ldix;

    .line 3234
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 691
    :cond_2
    iget-object v2, p0, Ldjk;->a:Ldjb;

    .line 4179
    iget-object v2, v2, Ldjb;->a:Ldfx;

    .line 691
    sget-object v4, Ldfx;->d:Ldfx;

    if-ne v2, v4, :cond_3

    .line 4716
    invoke-static {}, Ldjb;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v4, Ldjm;

    const-string v5, "OkHttp %s ACK Settings"

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    iget-object v11, p0, Ldjk;->a:Ldjb;

    invoke-static {v11}, Ldjb;->a(Ldjb;)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-direct {v4, p0, v5, v9, p2}, Ldjm;-><init>(Ldjk;Ljava/lang/String;[Ljava/lang/Object;Ldix;)V

    invoke-interface {v2, v4}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 694
    :cond_3
    iget-object v2, p0, Ldjk;->a:Ldjb;

    iget-object v2, v2, Ldjb;->f:Ldix;

    const/high16 v4, 0x10000

    invoke-virtual {v2, v4}, Ldix;->c(I)I

    move-result v2

    .line 695
    const/4 v4, -0x1

    if-eq v2, v4, :cond_8

    if-eq v2, v3, :cond_8

    .line 696
    sub-int/2addr v2, v3

    int-to-long v2, v2

    .line 697
    iget-object v4, p0, Ldjk;->a:Ldjb;

    invoke-static {v4}, Ldjb;->g(Ldjb;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 698
    iget-object v4, p0, Ldjk;->a:Ldjb;

    .line 5340
    iget-wide v10, v4, Ldjb;->d:J

    add-long/2addr v10, v2

    iput-wide v10, v4, Ldjb;->d:J

    .line 5341
    cmp-long v5, v2, v6

    if-lez v5, :cond_4

    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V

    .line 699
    :cond_4
    iget-object v4, p0, Ldjk;->a:Ldjb;

    const/4 v5, 0x1

    invoke-static {v4, v5}, Ldjb;->a(Ldjb;Z)Z

    .line 701
    :cond_5
    iget-object v4, p0, Ldjk;->a:Ldjb;

    invoke-static {v4}, Ldjb;->e(Ldjb;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    .line 702
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0}, Ldjb;->e(Ldjb;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v4, p0, Ldjk;->a:Ldjb;

    invoke-static {v4}, Ldjb;->e(Ldjb;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    new-array v4, v4, [Ldjn;

    invoke-interface {v0, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldjn;

    move-wide v4, v2

    move-object v2, v0

    .line 705
    :goto_1
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 706
    if-eqz v2, :cond_6

    cmp-long v0, v4, v6

    if-eqz v0, :cond_6

    .line 707
    array-length v3, v2

    move v0, v1

    :goto_2
    if-ge v0, v3, :cond_6

    aget-object v1, v2, v0

    .line 708
    monitor-enter v1

    .line 709
    :try_start_1
    invoke-virtual {v1, v4, v5}, Ldjn;->a(J)V

    .line 710
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 707
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 705
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 710
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 713
    :cond_6
    return-void

    :cond_7
    move-wide v4, v2

    move-object v2, v0

    goto :goto_1

    :cond_8
    move-object v2, v0

    move-wide v4, v6

    goto :goto_1
.end method

.method public final a(ZZILjava/util/List;Ldif;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    .line 615
    iget-object v1, p0, Ldjk;->a:Ldjb;

    invoke-static {v1, p3}, Ldjb;->a(Ldjb;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 616
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0, p3, p4, p2}, Ldjb;->a(Ldjb;ILjava/util/List;Z)V

    .line 671
    :cond_0
    :goto_0
    return-void

    .line 620
    :cond_1
    iget-object v6, p0, Ldjk;->a:Ldjb;

    monitor-enter v6

    .line 622
    :try_start_0
    iget-object v1, p0, Ldjk;->a:Ldjb;

    invoke-static {v1}, Ldjb;->b(Ldjb;)Z

    move-result v1

    if-eqz v1, :cond_2

    monitor-exit v6

    goto :goto_0

    .line 659
    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 624
    :cond_2
    :try_start_1
    iget-object v1, p0, Ldjk;->a:Ldjb;

    invoke-virtual {v1, p3}, Ldjb;->a(I)Ldjn;

    move-result-object v3

    .line 626
    if-nez v3, :cond_8

    .line 2026
    sget-object v1, Ldif;->b:Ldif;

    if-eq p5, v1, :cond_3

    sget-object v1, Ldif;->c:Ldif;

    if-ne p5, v1, :cond_4

    :cond_3
    move v2, v0

    .line 628
    :cond_4
    if-eqz v2, :cond_5

    .line 629
    iget-object v0, p0, Ldjk;->a:Ldjb;

    sget-object v1, Ldia;->c:Ldia;

    invoke-virtual {v0, p3, v1}, Ldjb;->a(ILdia;)V

    .line 630
    monitor-exit v6

    goto :goto_0

    .line 634
    :cond_5
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-static {v0}, Ldjb;->c(Ldjb;)I

    move-result v0

    if-gt p3, v0, :cond_6

    monitor-exit v6

    goto :goto_0

    .line 637
    :cond_6
    rem-int/lit8 v0, p3, 0x2

    iget-object v1, p0, Ldjk;->a:Ldjb;

    invoke-static {v1}, Ldjb;->d(Ldjb;)I

    move-result v1

    rem-int/lit8 v1, v1, 0x2

    if-ne v0, v1, :cond_7

    monitor-exit v6

    goto :goto_0

    .line 640
    :cond_7
    new-instance v0, Ldjn;

    iget-object v2, p0, Ldjk;->a:Ldjb;

    move v1, p3

    move v3, p1

    move v4, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ldjn;-><init>(ILdjb;ZZLjava/util/List;)V

    .line 642
    iget-object v1, p0, Ldjk;->a:Ldjb;

    invoke-static {v1, p3}, Ldjb;->b(Ldjb;I)I

    .line 643
    iget-object v1, p0, Ldjk;->a:Ldjb;

    invoke-static {v1}, Ldjb;->e(Ldjb;)Ljava/util/Map;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    invoke-static {}, Ldjb;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Ldjl;

    const-string v3, "OkHttp %s stream %d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v7, p0, Ldjk;->a:Ldjb;

    invoke-static {v7}, Ldjb;->a(Ldjb;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    const/4 v5, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v4, v5

    invoke-direct {v2, p0, v3, v4, v0}, Ldjl;-><init>(Ldjk;Ljava/lang/String;[Ljava/lang/Object;Ldjn;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 657
    monitor-exit v6

    goto/16 :goto_0

    .line 659
    :cond_8
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2031
    sget-object v1, Ldif;->a:Ldif;

    if-ne p5, v1, :cond_9

    move v1, v0

    .line 662
    :goto_1
    if-eqz v1, :cond_a

    .line 663
    sget-object v0, Ldia;->b:Ldia;

    invoke-virtual {v3, v0}, Ldjn;->b(Ldia;)V

    .line 664
    iget-object v0, p0, Ldjk;->a:Ldjb;

    invoke-virtual {v0, p3}, Ldjb;->b(I)Ldjn;

    goto/16 :goto_0

    :cond_9
    move v1, v2

    .line 2031
    goto :goto_1

    .line 2254
    :cond_a
    const/4 v1, 0x0

    .line 2256
    monitor-enter v3

    .line 2257
    :try_start_2
    iget-object v4, v3, Ldjn;->e:Ljava/util/List;

    if-nez v4, :cond_e

    .line 3039
    sget-object v4, Ldif;->c:Ldif;

    if-ne p5, v4, :cond_b

    move v2, v0

    .line 2258
    :cond_b
    if-eqz v2, :cond_d

    .line 2259
    sget-object v1, Ldia;->b:Ldia;

    .line 2275
    :goto_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2276
    if-eqz v1, :cond_11

    .line 2277
    invoke-virtual {v3, v1}, Ldjn;->b(Ldia;)V

    .line 670
    :cond_c
    :goto_3
    if-eqz p2, :cond_0

    invoke-virtual {v3}, Ldjn;->e()V

    goto/16 :goto_0

    .line 2261
    :cond_d
    :try_start_3
    iput-object p4, v3, Ldjn;->e:Ljava/util/List;

    .line 2262
    invoke-virtual {v3}, Ldjn;->a()Z

    move-result v0

    .line 2263
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    goto :goto_2

    .line 2275
    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 3047
    :cond_e
    :try_start_4
    sget-object v4, Ldif;->b:Ldif;

    if-ne p5, v4, :cond_f

    move v2, v0

    .line 2266
    :cond_f
    if-eqz v2, :cond_10

    .line 2267
    sget-object v1, Ldia;->d:Ldia;

    goto :goto_2

    .line 2269
    :cond_10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2270
    iget-object v4, v3, Ldjn;->e:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2271
    invoke-interface {v2, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2272
    iput-object v2, v3, Ldjn;->e:Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    .line 2278
    :cond_11
    if-nez v0, :cond_c

    .line 2279
    iget-object v0, v3, Ldjn;->d:Ldjb;

    iget v1, v3, Ldjn;->c:I

    invoke-virtual {v0, v1}, Ldjb;->b(I)Ldjn;

    goto :goto_3
.end method
