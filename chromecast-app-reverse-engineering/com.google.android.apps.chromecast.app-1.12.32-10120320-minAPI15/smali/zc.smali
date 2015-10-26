.class public abstract Lzc;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field private a:Ljava/util/ArrayList;

.field public h:Lzd;

.field i:J

.field j:J

.field k:J

.field l:J

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0xfa

    const-wide/16 v2, 0x78

    .line 9362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9364
    const/4 v0, 0x0

    iput-object v0, p0, Lzc;->h:Lzd;

    .line 9365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzc;->a:Ljava/util/ArrayList;

    .line 9368
    iput-wide v2, p0, Lzc;->i:J

    .line 9369
    iput-wide v2, p0, Lzc;->j:J

    .line 9370
    iput-wide v4, p0, Lzc;->k:J

    .line 9371
    iput-wide v4, p0, Lzc;->l:J

    .line 9373
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->m:Z

    .line 9787
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final a(Lzr;Z)V
    .locals 1

    .prologue
    .line 9648
    iget-object v0, p0, Lzc;->h:Lzd;

    if-eqz v0, :cond_0

    .line 9649
    iget-object v0, p0, Lzc;->h:Lzd;

    invoke-interface {v0, p1}, Lzd;->d(Lzr;)V

    .line 9651
    :cond_0
    return-void
.end method

.method public abstract a(Lzr;)Z
.end method

.method public abstract a(Lzr;IIII)Z
.end method

.method public abstract a(Lzr;Lzr;IIII)Z
.end method

.method public abstract b()Z
.end method

.method public abstract b(Lzr;)Z
.end method

.method public abstract c(Lzr;)V
.end method

.method public abstract d()V
.end method

.method public final d(Lzr;)V
    .locals 1

    .prologue
    .line 9607
    iget-object v0, p0, Lzc;->h:Lzd;

    if-eqz v0, :cond_0

    .line 9608
    iget-object v0, p0, Lzc;->h:Lzd;

    invoke-interface {v0, p1}, Lzd;->a(Lzr;)V

    .line 9610
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    .prologue
    .line 9773
    iget-object v0, p0, Lzc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 9774
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 9775
    iget-object v2, p0, Lzc;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9774
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9777
    :cond_0
    iget-object v0, p0, Lzc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9778
    return-void
.end method

.method public final e(Lzr;)V
    .locals 1

    .prologue
    .line 9619
    iget-object v0, p0, Lzc;->h:Lzd;

    if-eqz v0, :cond_0

    .line 9620
    iget-object v0, p0, Lzc;->h:Lzd;

    invoke-interface {v0, p1}, Lzd;->c(Lzr;)V

    .line 9622
    :cond_0
    return-void
.end method

.method public final f(Lzr;)V
    .locals 1

    .prologue
    .line 9631
    iget-object v0, p0, Lzc;->h:Lzd;

    if-eqz v0, :cond_0

    .line 9632
    iget-object v0, p0, Lzc;->h:Lzd;

    invoke-interface {v0, p1}, Lzd;->b(Lzr;)V

    .line 9634
    :cond_0
    return-void
.end method
