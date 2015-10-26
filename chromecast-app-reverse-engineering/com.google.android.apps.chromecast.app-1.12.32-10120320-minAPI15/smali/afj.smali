.class final Lafj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lagn;


# instance fields
.field private synthetic a:Lafb;

.field private synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private synthetic c:Lafk;

.field private synthetic d:Ljava/util/Set;

.field private synthetic e:Ljava/util/Set;

.field private synthetic f:Laff;


# direct methods
.method constructor <init>(Laff;Lafb;Ljava/util/concurrent/atomic/AtomicBoolean;Lafk;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 276
    iput-object p1, p0, Lafj;->f:Laff;

    iput-object p2, p0, Lafj;->a:Lafb;

    iput-object p3, p0, Lafj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Lafj;->c:Lafk;

    iput-object p5, p0, Lafj;->d:Ljava/util/Set;

    iput-object p6, p0, Lafj;->e:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .prologue
    const/4 v12, 0x0

    .line 279
    invoke-static {}, Laff;->a()Laff;

    move-result-object v0

    .line 1098
    iget-object v0, v0, Laff;->b:Lafb;

    .line 279
    if-eqz v0, :cond_0

    .line 280
    invoke-static {}, Laff;->a()Laff;

    move-result-object v0

    .line 2098
    iget-object v0, v0, Laff;->b:Lafb;

    .line 2245
    iget-object v0, v0, Lafb;->h:Ljava/lang/String;

    .line 280
    iget-object v1, p0, Lafj;->a:Lafb;

    .line 3245
    iget-object v1, v1, Lafb;->h:Ljava/lang/String;

    .line 281
    if-eq v0, v1, :cond_1

    .line 308
    :cond_0
    :goto_0
    return-void

    .line 285
    :cond_1
    :try_start_0
    iget-object v0, p0, Lafj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lafj;->c:Lafk;

    iget-object v0, v0, Lafk;->a:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lafj;->c:Lafk;

    iget v0, v0, Lafk;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    .line 307
    iget-object v0, p0, Lafj;->f:Laff;

    invoke-static {v0}, Laff;->b(Laff;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 290
    :cond_2
    :try_start_1
    new-instance v0, Lafb;

    iget-object v1, p0, Lafj;->c:Lafk;

    iget-object v1, v1, Lafk;->a:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 291
    iget-object v1, p0, Lafj;->c:Lafk;

    iget-object v1, v1, Lafk;->a:Ljava/lang/String;

    .line 292
    :goto_1
    iget-object v2, p0, Lafj;->a:Lafb;

    .line 4236
    iget-object v2, v2, Lafb;->g:Ljava/lang/String;

    .line 293
    iget-object v3, p0, Lafj;->a:Lafb;

    .line 4245
    iget-object v3, v3, Lafb;->h:Ljava/lang/String;

    .line 294
    iget-object v4, p0, Lafj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 295
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 296
    iget-object v4, p0, Lafj;->d:Ljava/util/Set;

    :goto_2
    iget-object v5, p0, Lafj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 297
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 298
    iget-object v5, p0, Lafj;->e:Ljava/util/Set;

    :goto_3
    iget-object v6, p0, Lafj;->a:Lafb;

    .line 5217
    iget-object v6, v6, Lafb;->e:Lafl;

    .line 299
    iget-object v7, p0, Lafj;->c:Lafk;

    iget v7, v7, Lafk;->b:I

    if-eqz v7, :cond_6

    .line 301
    new-instance v7, Ljava/util/Date;

    iget-object v8, p0, Lafj;->c:Lafk;

    iget v8, v8, Lafk;->b:I

    int-to-long v8, v8

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 302
    :goto_4
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-direct/range {v0 .. v8}, Lafb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lafl;Ljava/util/Date;Ljava/util/Date;)V

    .line 305
    invoke-static {}, Laff;->a()Laff;

    move-result-object v1

    .line 7113
    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Laff;->a(Lafb;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 307
    iget-object v0, p0, Lafj;->f:Laff;

    invoke-static {v0}, Laff;->b(Laff;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 292
    :cond_3
    :try_start_2
    iget-object v1, p0, Lafj;->a:Lafb;

    .line 4172
    iget-object v1, v1, Lafb;->d:Ljava/lang/String;

    goto :goto_1

    .line 296
    :cond_4
    iget-object v4, p0, Lafj;->a:Lafb;

    .line 5195
    iget-object v4, v4, Lafb;->b:Ljava/util/Set;

    goto :goto_2

    .line 298
    :cond_5
    iget-object v5, p0, Lafj;->a:Lafb;

    .line 5208
    iget-object v5, v5, Lafb;->c:Ljava/util/Set;

    goto :goto_3

    .line 302
    :cond_6
    iget-object v7, p0, Lafj;->a:Lafb;

    .line 6181
    iget-object v7, v7, Lafb;->a:Ljava/util/Date;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    .line 307
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lafj;->f:Laff;

    invoke-static {v1}, Laff;->b(Laff;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v0
.end method
