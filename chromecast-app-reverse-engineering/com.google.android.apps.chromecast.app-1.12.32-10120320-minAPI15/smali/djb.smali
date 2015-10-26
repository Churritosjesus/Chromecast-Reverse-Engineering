.class public final Ldjb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final j:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final a:Ldfx;

.field final b:Z

.field c:J

.field d:J

.field public final e:Ldix;

.field final f:Ldix;

.field final g:Ldjr;

.field final h:Ljava/net/Socket;

.field public final i:Ldid;

.field private final k:Ldiq;

.field private final l:Ljava/util/Map;

.field private final m:Ljava/lang/String;

.field private n:I

.field private o:I

.field private p:Z

.field private q:J

.field private final r:Ljava/util/concurrent/ExecutorService;

.field private final s:Ldiv;

.field private t:Z

.field private u:Ldjk;

.field private final v:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    .line 68
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v0, "OkHttp SpdyConnection"

    const/4 v8, 0x1

    .line 70
    invoke-static {v0, v8}, Ldgs;->a(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Ldjb;->j:Ljava/util/concurrent/ExecutorService;

    .line 68
    return-void
.end method

.method public constructor <init>(Ldjj;)V
    .locals 11

    .prologue
    const/4 v10, 0x7

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ldjb;->l:Ljava/util/Map;

    .line 88
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ldjb;->q:J

    .line 104
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ldjb;->c:J

    .line 115
    new-instance v0, Ldix;

    invoke-direct {v0}, Ldix;-><init>()V

    iput-object v0, p0, Ldjb;->e:Ldix;

    .line 121
    new-instance v0, Ldix;

    invoke-direct {v0}, Ldix;-><init>()V

    iput-object v0, p0, Ldjb;->f:Ldix;

    .line 123
    iput-boolean v2, p0, Ldjb;->t:Z

    .line 800
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ldjb;->v:Ljava/util/Set;

    .line 1518
    iget-object v0, p1, Ldjj;->d:Ldfx;

    .line 132
    iput-object v0, p0, Ldjb;->a:Ldfx;

    .line 2518
    iget-object v0, p1, Ldjj;->e:Ldiv;

    .line 133
    iput-object v0, p0, Ldjb;->s:Ldiv;

    .line 3518
    iget-boolean v0, p1, Ldjj;->f:Z

    .line 134
    iput-boolean v0, p0, Ldjb;->b:Z

    .line 4518
    iget-object v0, p1, Ldjj;->c:Ldiq;

    .line 135
    iput-object v0, p0, Ldjb;->k:Ldiq;

    .line 5518
    iget-boolean v0, p1, Ldjj;->f:Z

    .line 137
    if-eqz v0, :cond_2

    move v0, v3

    :goto_0
    iput v0, p0, Ldjb;->o:I

    .line 6518
    iget-boolean v0, p1, Ldjj;->f:Z

    .line 138
    if-eqz v0, :cond_0

    iget-object v0, p0, Ldjb;->a:Ldfx;

    sget-object v1, Ldfx;->d:Ldfx;

    if-ne v0, v1, :cond_0

    .line 139
    iget v0, p0, Ldjb;->o:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldjb;->o:I

    .line 7518
    :cond_0
    iget-boolean v0, p1, Ldjj;->f:Z

    .line 148
    if-eqz v0, :cond_1

    .line 149
    iget-object v0, p0, Ldjb;->e:Ldix;

    const/high16 v1, 0x1000000

    invoke-virtual {v0, v10, v2, v1}, Ldix;->a(III)Ldix;

    .line 8518
    :cond_1
    iget-object v0, p1, Ldjj;->a:Ljava/lang/String;

    .line 152
    iput-object v0, p0, Ldjb;->m:Ljava/lang/String;

    .line 154
    iget-object v0, p0, Ldjb;->a:Ldfx;

    sget-object v1, Ldfx;->d:Ldfx;

    if-ne v0, v1, :cond_3

    .line 155
    new-instance v0, Ldij;

    invoke-direct {v0}, Ldij;-><init>()V

    iput-object v0, p0, Ldjb;->g:Ldjr;

    .line 157
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-string v0, "OkHttp %s Push Observer"

    new-array v8, v3, [Ljava/lang/Object;

    iget-object v9, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v9, v8, v2

    .line 159
    invoke-static {v0, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Ldgs;->a(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Ldjb;->r:Ljava/util/concurrent/ExecutorService;

    .line 161
    iget-object v0, p0, Ldjb;->f:Ldix;

    const v1, 0xffff

    invoke-virtual {v0, v10, v2, v1}, Ldix;->a(III)Ldix;

    .line 162
    iget-object v0, p0, Ldjb;->f:Ldix;

    const/4 v1, 0x5

    const/16 v3, 0x4000

    invoke-virtual {v0, v1, v2, v3}, Ldix;->a(III)Ldix;

    .line 169
    :goto_1
    iget-object v0, p0, Ldjb;->f:Ldix;

    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Ldix;->c(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Ldjb;->d:J

    .line 9518
    iget-object v0, p1, Ldjj;->b:Ljava/net/Socket;

    .line 170
    iput-object v0, p0, Ldjb;->h:Ljava/net/Socket;

    .line 171
    iget-object v0, p0, Ldjb;->g:Ldjr;

    .line 10518
    iget-object v1, p1, Ldjj;->b:Ljava/net/Socket;

    .line 171
    invoke-static {v1}, Ldkk;->a(Ljava/net/Socket;)Ldku;

    move-result-object v1

    invoke-static {v1}, Ldkk;->a(Ldku;)Ldkc;

    move-result-object v1

    iget-boolean v2, p0, Ldjb;->b:Z

    invoke-interface {v0, v1, v2}, Ldjr;->a(Ldkc;Z)Ldid;

    move-result-object v0

    iput-object v0, p0, Ldjb;->i:Ldid;

    .line 173
    new-instance v0, Ldjk;

    .line 10564
    invoke-direct {v0, p0}, Ldjk;-><init>(Ldjb;)V

    .line 173
    iput-object v0, p0, Ldjb;->u:Ldjk;

    .line 174
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Ldjb;->u:Ldjk;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 175
    return-void

    .line 137
    :cond_2
    const/4 v0, 0x2

    goto/16 :goto_0

    .line 163
    :cond_3
    iget-object v0, p0, Ldjb;->a:Ldfx;

    sget-object v1, Ldfx;->c:Ldfx;

    if-ne v0, v1, :cond_4

    .line 164
    new-instance v0, Ldiy;

    invoke-direct {v0}, Ldiy;-><init>()V

    iput-object v0, p0, Ldjb;->g:Ldjr;

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Ldjb;->r:Ljava/util/concurrent/ExecutorService;

    goto :goto_1

    .line 167
    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    iget-object v1, p0, Ldjb;->a:Ldfx;

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method static synthetic a(Ldjb;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Ldjb;->m:Ljava/lang/String;

    return-object v0
.end method

.method private a(Ldia;Ldia;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 451
    .line 11426
    :try_start_0
    iget-object v3, p0, Ldjb;->i:Ldid;

    monitor-enter v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11428
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11429
    :try_start_2
    iget-boolean v1, p0, Ldjb;->p:Z

    if-eqz v1, :cond_1

    .line 11430
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v1, v0

    .line 460
    :goto_0
    monitor-enter p0

    .line 461
    :try_start_4
    iget-object v3, p0, Ldjb;->l:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    .line 462
    iget-object v0, p0, Ldjb;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v3, p0, Ldjb;->l:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    new-array v3, v3, [Ldjn;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldjn;

    .line 463
    iget-object v3, p0, Ldjb;->l:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 464
    const/4 v3, 0x0

    invoke-direct {p0, v3}, Ldjb;->a(Z)V

    move-object v3, v0

    .line 470
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 472
    if-eqz v3, :cond_3

    .line 473
    array-length v4, v3

    move-object v0, v1

    :goto_2
    if-ge v2, v4, :cond_2

    aget-object v1, v3, v2

    .line 475
    :try_start_5
    invoke-virtual {v1, p2}, Ldjn;->a(Ldia;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 473
    :cond_0
    :goto_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    .line 11432
    :cond_1
    const/4 v1, 0x1

    :try_start_6
    iput-boolean v1, p0, Ldjb;->p:Z

    .line 11433
    iget v1, p0, Ldjb;->n:I

    .line 11434
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 11436
    :try_start_7
    iget-object v4, p0, Ldjb;->i:Ldid;

    sget-object v5, Ldgs;->a:[B

    invoke-interface {v4, v1, p1, v5}, Ldid;->a(ILdia;[B)V

    .line 11437
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-object v1, v0

    goto :goto_0

    .line 11434
    :catchall_0
    move-exception v1

    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    throw v1

    .line 11437
    :catchall_1
    move-exception v1

    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 454
    :catch_0
    move-exception v1

    goto :goto_0

    .line 470
    :catchall_2
    move-exception v0

    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    throw v0

    .line 476
    :catch_1
    move-exception v1

    .line 477
    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_3

    :cond_2
    move-object v1, v0

    .line 490
    :cond_3
    :try_start_c
    iget-object v0, p0, Ldjb;->i:Ldid;

    invoke-interface {v0}, Ldid;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2

    move-object v0, v1

    .line 497
    :cond_4
    :goto_4
    :try_start_d
    iget-object v1, p0, Ldjb;->h:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3

    .line 502
    :goto_5
    if-eqz v0, :cond_5

    throw v0

    .line 491
    :catch_2
    move-exception v0

    .line 492
    if-eqz v1, :cond_4

    move-object v0, v1

    goto :goto_4

    .line 503
    :cond_5
    return-void

    .line 498
    :catch_3
    move-exception v0

    goto :goto_5

    :cond_6
    move-object v3, v0

    goto :goto_1
.end method

.method static synthetic a(Ldjb;ILdia;)V
    .locals 7

    .prologue
    .line 54
    .line 14871
    iget-object v6, p0, Ldjb;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ldji;

    const-string v2, "OkHttp %s Push Reset[%s]"

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v4, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v4, v3, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ldji;-><init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILdia;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 54
    return-void
.end method

.method static synthetic a(Ldjb;ILdkd;IZ)V
    .locals 9

    .prologue
    .line 54
    .line 12850
    new-instance v5, Ldjz;

    invoke-direct {v5}, Ldjz;-><init>()V

    .line 12851
    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, Ldkd;->a(J)V

    .line 12852
    int-to-long v0, p3

    invoke-interface {p2, v5, v0, v1}, Ldkd;->a(Ldjz;J)J

    .line 13060
    iget-wide v0, v5, Ldjz;->b:J

    .line 12853
    int-to-long v2, p3

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14060
    iget-wide v2, v5, Ldjz;->b:J

    .line 12853
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " != "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12854
    :cond_0
    iget-object v8, p0, Ldjb;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ldjh;

    const-string v2, "OkHttp %s Push Data[%s]"

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v4, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v4, v3, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    move-object v1, p0

    move v4, p1

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Ldjh;-><init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILdjz;IZ)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 54
    return-void
.end method

.method static synthetic a(Ldjb;ILjava/util/List;)V
    .locals 7

    .prologue
    .line 54
    .line 15803
    monitor-enter p0

    .line 15804
    :try_start_0
    iget-object v0, p0, Ldjb;->v:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15805
    sget-object v0, Ldia;->b:Ldia;

    invoke-virtual {p0, p1, v0}, Ldjb;->a(ILdia;)V

    .line 15806
    monitor-exit p0

    :goto_0
    return-void

    .line 15808
    :cond_0
    iget-object v0, p0, Ldjb;->v:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15809
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15810
    iget-object v6, p0, Ldjb;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ldjf;

    const-string v2, "OkHttp %s Push Request[%s]"

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v4, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v4, v3, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ldjf;-><init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 15809
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Ldjb;ILjava/util/List;Z)V
    .locals 8

    .prologue
    .line 54
    .line 14828
    iget-object v7, p0, Ldjb;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ldjg;

    const-string v2, "OkHttp %s Push Headers[%s]"

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v4, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v4, v3, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Ldjg;-><init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    invoke-interface {v7, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 54
    return-void
.end method

.method static synthetic a(Ldjb;Ldia;Ldia;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Ldjb;->a(Ldia;Ldia;)V

    return-void
.end method

.method static synthetic a(Ldjb;ZIILdh;)V
    .locals 2

    .prologue
    .line 54
    .line 12404
    iget-object v1, p0, Ldjb;->i:Ldid;

    monitor-enter v1

    .line 12406
    if-eqz p4, :cond_0

    :try_start_0
    invoke-virtual {p4}, Ldh;->g()V

    .line 12407
    :cond_0
    iget-object v0, p0, Ldjb;->i:Ldid;

    invoke-interface {v0, p1, p2, p3}, Ldid;->a(ZII)V

    .line 12408
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private declared-synchronized a(Z)V
    .locals 2

    .prologue
    .line 204
    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Ldjb;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    monitor-exit p0

    return-void

    .line 204
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Ldjb;I)Z
    .locals 2

    .prologue
    .line 54
    .line 12796
    iget-object v0, p0, Ldjb;->a:Ldfx;

    sget-object v1, Ldfx;->d:Ldfx;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 54
    goto :goto_0
.end method

.method static synthetic a(Ldjb;Z)Z
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldjb;->t:Z

    return v0
.end method

.method static synthetic b(Ldjb;I)I
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Ldjb;->n:I

    return p1
.end method

.method static synthetic b(Ldjb;ZIILdh;)V
    .locals 9

    .prologue
    const/4 v4, 0x1

    .line 54
    const/4 v7, 0x0

    .line 15392
    sget-object v8, Ldjb;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ldje;

    const-string v2, "OkHttp %s ping %08x%08x"

    const/4 v1, 0x3

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v5, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v5, v3, v1

    .line 15393
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v4

    const/4 v1, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v1

    move-object v1, p0

    move v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v7}, Ldje;-><init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ZIILdh;)V

    .line 15392
    invoke-interface {v8, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 54
    return-void
.end method

.method static synthetic b(Ldjb;)Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Ldjb;->p:Z

    return v0
.end method

.method static synthetic b(Ldjb;Z)Z
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldjb;->p:Z

    return v0
.end method

.method static synthetic c(Ldjb;)I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Ldjb;->n:I

    return v0
.end method

.method private declared-synchronized c(I)Ldh;
    .locals 1

    .prologue
    .line 412
    monitor-enter p0

    const/4 v0, 0x0

    monitor-exit p0

    return-object v0
.end method

.method static synthetic c(Ldjb;I)Ldh;
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0, p1}, Ldjb;->c(I)Ldh;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Ldjb;)I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Ldjb;->o:I

    return v0
.end method

.method static synthetic d()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 54
    sget-object v0, Ldjb;->j:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic e(Ldjb;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Ldjb;->l:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Ldjb;)Ldiq;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Ldjb;->k:Ldiq;

    return-object v0
.end method

.method static synthetic g(Ldjb;)Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Ldjb;->t:Z

    return v0
.end method

.method static synthetic h(Ldjb;)Ldiv;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Ldjb;->s:Ldiv;

    return-object v0
.end method

.method static synthetic i(Ldjb;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Ldjb;->v:Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method final declared-synchronized a(I)Ldjn;
    .locals 2

    .prologue
    .line 191
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ldjb;->l:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldjn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(ILjava/util/List;ZZ)Ldjn;
    .locals 9

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    .line 250
    if-nez p3, :cond_0

    move v3, v4

    .line 251
    :goto_0
    if-nez p4, :cond_1

    .line 255
    :goto_1
    iget-object v8, p0, Ldjb;->i:Ldid;

    monitor-enter v8

    .line 256
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 257
    :try_start_1
    iget-boolean v0, p0, Ldjb;->p:Z

    if-eqz v0, :cond_2

    .line 258
    new-instance v0, Ljava/io/IOException;

    const-string v1, "shutdown"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0

    .line 276
    :catchall_1
    move-exception v0

    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_0
    move v3, v0

    .line 250
    goto :goto_0

    :cond_1
    move v4, v0

    .line 251
    goto :goto_1

    .line 260
    :cond_2
    :try_start_3
    iget v1, p0, Ldjb;->o:I

    .line 261
    iget v0, p0, Ldjb;->o:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldjb;->o:I

    .line 262
    new-instance v0, Ldjn;

    move-object v2, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ldjn;-><init>(ILdjb;ZZLjava/util/List;)V

    .line 263
    invoke-virtual {v0}, Ldjn;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 264
    iget-object v2, p0, Ldjb;->l:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    const/4 v2, 0x0

    invoke-direct {p0, v2}, Ldjb;->a(Z)V

    .line 267
    :cond_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 269
    :try_start_4
    iget-object v2, p0, Ldjb;->i:Ldid;

    const/4 v6, 0x0

    move v5, v1

    move-object v7, p2

    invoke-interface/range {v2 .. v7}, Ldid;->a(ZZIILjava/util/List;)V

    .line 276
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 278
    if-nez p3, :cond_4

    .line 279
    iget-object v1, p0, Ldjb;->i:Ldid;

    invoke-interface {v1}, Ldid;->b()V

    .line 282
    :cond_4
    return-object v0
.end method

.method final a(IJ)V
    .locals 8

    .prologue
    .line 360
    sget-object v0, Ldjb;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ldjd;

    const-string v3, "OkHttp Window Update %s stream %d"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v5, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v5, v4, v2

    const/4 v2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    move-object v2, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Ldjd;-><init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;IJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 368
    return-void
.end method

.method final a(ILdia;)V
    .locals 7

    .prologue
    .line 345
    sget-object v6, Ldjb;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ldjc;

    const-string v2, "OkHttp %s stream %d"

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v4, p0, Ldjb;->m:Ljava/lang/String;

    aput-object v4, v3, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ldjc;-><init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILdia;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 353
    return-void
.end method

.method public final a(IZLdjz;J)V
    .locals 10

    .prologue
    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    .line 304
    cmp-long v0, p4, v8

    if-nez v0, :cond_2

    .line 305
    iget-object v0, p0, Ldjb;->i:Ldid;

    invoke-interface {v0, p2, p1, p3, v1}, Ldid;->a(ZILdjz;I)V

    .line 333
    :cond_0
    return-void

    .line 325
    :cond_1
    :try_start_0
    iget-wide v2, p0, Ldjb;->d:J

    invoke-static {p4, p5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    .line 326
    iget-object v2, p0, Ldjb;->i:Ldid;

    invoke-interface {v2}, Ldid;->c()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 327
    iget-wide v4, p0, Ldjb;->d:J

    int-to-long v6, v2

    sub-long/2addr v4, v6

    iput-wide v4, p0, Ldjb;->d:J

    .line 328
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    int-to-long v4, v2

    sub-long/2addr p4, v4

    .line 331
    iget-object v3, p0, Ldjb;->i:Ldid;

    if-eqz p2, :cond_4

    cmp-long v0, p4, v8

    if-nez v0, :cond_4

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v3, v0, p1, p3, v2}, Ldid;->a(ZILdjz;I)V

    .line 309
    :cond_2
    cmp-long v0, p4, v8

    if-lez v0, :cond_0

    .line 311
    monitor-enter p0

    .line 313
    :goto_1
    :try_start_1
    iget-wide v2, p0, Ldjb;->d:J

    cmp-long v0, v2, v8

    if-gtz v0, :cond_1

    .line 316
    iget-object v0, p0, Ldjb;->l:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 317
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 322
    :catch_0
    move-exception v0

    :try_start_2
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    .line 328
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 319
    :cond_3
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :cond_4
    move v0, v1

    .line 331
    goto :goto_0
.end method

.method public final declared-synchronized a()Z
    .locals 4

    .prologue
    .line 209
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Ldjb;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()J
    .locals 2

    .prologue
    .line 217
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Ldjb;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized b(I)Ldjn;
    .locals 2

    .prologue
    .line 195
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ldjb;->l:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldjn;

    .line 196
    if-eqz v0, :cond_0

    iget-object v1, p0, Ldjb;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 197
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Ldjb;->a(Z)V

    .line 199
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    monitor-exit p0

    return-object v0

    .line 195
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final b(ILdia;)V
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Ldjb;->i:Ldid;

    invoke-interface {v0, p1, p2}, Ldid;->a(ILdia;)V

    .line 357
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 416
    iget-object v0, p0, Ldjb;->i:Ldid;

    invoke-interface {v0}, Ldid;->b()V

    .line 417
    return-void
.end method

.method public final close()V
    .locals 2

    .prologue
    .line 446
    sget-object v0, Ldia;->a:Ldia;

    sget-object v1, Ldia;->h:Ldia;

    invoke-direct {p0, v0, v1}, Ldjb;->a(Ldia;Ldia;)V

    .line 447
    return-void
.end method
