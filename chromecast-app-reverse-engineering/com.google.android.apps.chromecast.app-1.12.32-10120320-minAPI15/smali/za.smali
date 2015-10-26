.class public final Lza;
.super Landroid/database/Observable;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 8936
    invoke-direct {p0}, Landroid/database/Observable;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 8946
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8947
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb;

    invoke-virtual {v0}, Lzb;->a()V

    .line 8946
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8949
    :cond_0
    return-void
.end method

.method public final a(II)V
    .locals 3

    .prologue
    .line 8956
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8957
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Lzb;->a(II)V

    .line 8956
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8959
    :cond_0
    return-void
.end method

.method public final b(II)V
    .locals 3

    .prologue
    .line 8966
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8967
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Lzb;->b(II)V

    .line 8966
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8969
    :cond_0
    return-void
.end method

.method public final c(II)V
    .locals 3

    .prologue
    .line 8976
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8977
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Lzb;->c(II)V

    .line 8976
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8979
    :cond_0
    return-void
.end method

.method public final d(II)V
    .locals 3

    .prologue
    .line 8982
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8983
    iget-object v0, p0, Lza;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, p2, v2}, Lzb;->a(III)V

    .line 8982
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8985
    :cond_0
    return-void
.end method
